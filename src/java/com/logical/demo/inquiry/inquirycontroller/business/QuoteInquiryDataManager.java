package com.logical.demo.inquiry.inquirycontroller.business;

import com.logical.connection.MySQLUtility;
import com.logical.demo.inquiry.inquiryoffer.module.InquiryOffer;
import com.notedown.utility.Logger;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.support.rowset.SqlRowSet;

/**
 *
 * @author Akshay
 */
public class QuoteInquiryDataManager {

    MySQLUtility sqlUtility = new MySQLUtility();

    final String FILE_NAME = "C:\\Users\\Akshay\\Documents\\NetBeansProjects\\SpringQuote\\web\\log\\log.txt";
    Logger logger = new Logger(FILE_NAME);

    // ! Get List Of State of INDIA
    public List getState() throws ClassNotFoundException, SQLException {
        String sqlQuery = "SELECT state.id, state.name FROM countries country "
                + "join states state on country.id = state.country_id "
                + "where country.name like 'INDIA' order by state.name;";

        logger.logData("DataManager | SQL Query (Get States): " + sqlQuery);

        return sqlUtility.getList(sqlQuery);
    }

    // ! Get Cities List according to State Id Passed
    public List getCities(int stateID) throws ClassNotFoundException, SQLException {
        String sqlQuery = "select city.id, city.name from states state "
                + "join cities city on state.id = city.state_id "
                + "where state.id = " + stateID + " order by city.name;";

        logger.logData("DataManager | SQL Query (Get Cities) : " + sqlQuery);

        return sqlUtility.getList(sqlQuery);
    }

    // ! Insert Quote Inquiry
    public int createQuoteInquiry(InquiryEntityBean inquiryEntityBean, InquiryOffer offer) throws ClassNotFoundException, SQLException {

// ! User can only Increase or decrease MAX_AND_MIN of baseCoverage
        final double MAX_AND_MIN = 0.2;
        int baseCoverage = offer.getCoverage();
        int basePremium = offer.getPremium();
        int maxCoverage = baseCoverage;
        int minCoverage = baseCoverage;

        maxCoverage += (baseCoverage * MAX_AND_MIN);
        minCoverage -= (baseCoverage * MAX_AND_MIN);

        /*final String sqlQuery = "insert into inquiry (inquiryid, firstname, lastname, dob, address, state, city, "
                + "pincode, carpetarea, roof, floor, firesafety, year) "
                + "values(:inquiryid, :firstname, :lastname, :dob, :address, :state, :city, "
                + ":pincode, :carpetarea, :roof, :floor, :fire, :year);";*/
        String sqlQuery = "insert into INQUIRY (inquiryid, firstname, lastname, dob, address, state, city, "
                + "pincode, carpetarea, year, roof, floor, firesafety, basecoverage, basepremium, maxcoverage, mincoverage) "
                + "values('"
                + inquiryEntityBean.getInquiryid() + "','"
                + inquiryEntityBean.getFirstname() + "','"
                + inquiryEntityBean.getLastname() + "','"
                + inquiryEntityBean.getDob() + "','"
                + inquiryEntityBean.getAddress() + "',"
                // ! FNX_GET_GEO_NAME() is function to load the GEO_NAME
                + "FNX_GET_STATE_NAME(" + inquiryEntityBean.getState() + "),"
                + "FNX_GET_CITY_NAME(" + inquiryEntityBean.getCity() + "),"
                + inquiryEntityBean.getPincode() + ","
                + inquiryEntityBean.getCarpetarea() + ","
                + inquiryEntityBean.getYear() + ",'"
                + inquiryEntityBean.getRoof() + "','"
                + inquiryEntityBean.getFloor() + "',"
                + inquiryEntityBean.getFire() + ","
                // ! Offer Object
                + baseCoverage + ","
                + basePremium + ","
                + maxCoverage + ","
                + minCoverage + ");";

        logger.logData("DataManager | SQL Query (Insert Quote Inquiry) : " + sqlQuery);

        return sqlUtility.persist(sqlQuery);
    }

    public List getAllOffers() throws ClassNotFoundException, SQLException {
        String sqlQuery = "select inquiryid, firstname, lastname, dob, address,state, city, "
                + "pincode, carpetarea, year, roof, floor, firesafety, offerid from INQUIRY;";

        logger.logData("DataManager | SQL Query (Get All Offer From Inquiry) : " + sqlQuery);

        return sqlUtility.getList(sqlQuery);
    }

    public SqlRowSet getInquiry(String inquiryID) throws ClassNotFoundException, SQLException {
        String sqlQuery = "select inquiryid, firstname, lastname, dob, address,state, city, "
                + "pincode, carpetarea, year, roof, floor, firesafety from INQUIRY where inquiryid = '" + inquiryID + "';";

        logger.logData("DataManager | SQL Query (Getting Inquiry of OfferID : " + inquiryID + ") : " + sqlQuery);

//        return sqlUtility.getResultSet(sqlQuery);
        return sqlUtility.getRowSet(sqlQuery);
//        return null;

    }

    public int insertGeneratedOfferIntoOffer(InquiryOffer inquiryOffer) throws ClassNotFoundException, SQLException {
        String sqlQuery = "insert into OFFER (offerid, coverage, premium, inquiryid) values('"
                + inquiryOffer.getOfferid() + "',"
                + inquiryOffer.getCoverage() + ","
                + inquiryOffer.getPremium() + ",'"
                + inquiryOffer.getInquiryid() + "');";

        logger.logData("DataManager | SQL Query (Inserting Offer into OFFER of "
                + "OfferID : " + inquiryOffer.getOfferid() + ","
                + "And InquiryID : " + inquiryOffer.getInquiryid() + ") : " + sqlQuery);

        return sqlUtility.persist(sqlQuery);
    }

    public SqlRowSet getOffer(String inquiryID) throws ClassNotFoundException, SQLException {
        String sqlQuery = "select o.offerid, o.coverage, o.premium, o.inquiryid from INQUIRY i "
                + "join OFFER o on i.offerid = o.offerid "
                + "where i.inquiryid = '" + inquiryID + "';";

        logger.logData("DataManager | SQL Query (Getting Offer of InquiryID : " + inquiryID + ") : " + sqlQuery);

//        return sqlUtility.getResultSet(sqlQuery);
        return sqlUtility.getRowSet(sqlQuery);
//        return null;
    }

    public SqlRowSet getBaseOffer(String inquiryID) throws ClassNotFoundException, SQLException {
        String sqlQuery = "select inquiryid, offerid, maxcoverage,mincoverage from INQUIRY "
                + "where inquiryid = '" + inquiryID + "';";

        logger.logData("DataManager | SQL Query (Getting Base Offer of InquiryID : " + inquiryID + ") : " + sqlQuery);

//        return sqlUtility.getResultSet(sqlQuery);
        return sqlUtility.getRowSet(sqlQuery);
//        return null;
    }

    public int updateNewCoverage(UpdateCoverageEntityBean updateCoverageEntityBean) throws ClassNotFoundException, SQLException {
        String sqlQuery = "update OFFER set "
                + "coverage = " + updateCoverageEntityBean.getCoverage() + ", "
                + "premium = " + updateCoverageEntityBean.getPremium() + " "
                + "where offerid = '" + updateCoverageEntityBean.getOfferid() + "';";

        logger.logData("DataManager | SQL Query (Updating New Coverage And Premium of Offer id : " + updateCoverageEntityBean.getOfferid() + ") : " + sqlQuery);

        return sqlUtility.persist(sqlQuery);
    }

    public int updateNewQuote(UpdateQuoteEntityBean updateQuoteEntityBean, InquiryOffer offer) throws ClassNotFoundException, SQLException {

        final double MAX_AND_MIN = 0.2;
        int baseCoverage = offer.getCoverage();
        int basePremium = offer.getPremium();
        int maxCoverage = baseCoverage;
        int minCoverage = baseCoverage;

        maxCoverage += (baseCoverage * MAX_AND_MIN);
        minCoverage -= (baseCoverage * MAX_AND_MIN);

        String sqlQuery = "update INQUIRY set "
                + "offerid = null, "
                + "carpetarea = " + updateQuoteEntityBean.getCarpetarea() + ", "
                + "year = " + updateQuoteEntityBean.getYear() + ", "
                + "roof = '" + updateQuoteEntityBean.getRoof() + "', "
                + "floor = '" + updateQuoteEntityBean.getFloor() + "', "
                + "firesafety = " + updateQuoteEntityBean.getFire() + ","
                + " basecoverage = " + baseCoverage + ", "
                + "basepremium = " + basePremium + ", "
                + "maxcoverage = " + maxCoverage + ", "
                + "mincoverage = " + minCoverage + " "
                + "where inquiryid = '" + updateQuoteEntityBean.getInquiryid() + "';";

        logger.logData("DataManager | SQL Query (Updating New Quote of Inquiry id : " + updateQuoteEntityBean.getInquiryid() + ") : " + sqlQuery);
        

        return sqlUtility.persist(sqlQuery);
    }

    public List getOfferList(String inquiryid) throws ClassNotFoundException, SQLException {
        String sqlQuery = "select offerid, coverage, premium "
                + "from OFFER "
                + "where inquiryid = '" + inquiryid + "';";

        logger.logData("DataManager | SQL Query (Getting All Offer Of Inquiry (" + inquiryid + ") : " + sqlQuery);
        

        return sqlUtility.getList(sqlQuery);
    }

    public List getQuoteList(String inquiryid) throws ClassNotFoundException, SQLException {
        String sqlQuery = "select offerid, carpetarea, roof, floor, firesafety, year "
                + "from QUOTE_LOG "
                + "where inquiryid = '" + inquiryid + "';";

        logger.logData("DataManager | SQL Query (Getting Quote Information of (" + inquiryid + ") : " + sqlQuery);
        

        return sqlUtility.getList(sqlQuery);
    }

}
