
package com.logical.demo.inquiry.inquirycontroller.apps;

import com.logical.demo.inquiry.inquirycontroller.business.InquiryBaseOfferBean;
import com.logical.demo.inquiry.inquirycontroller.business.InquiryEntityBean;
import com.logical.demo.inquiry.inquirycontroller.business.QuoteInquiryDataManager;
import com.logical.demo.inquiry.inquirycontroller.business.UpdateCoverageEntityBean;
import com.logical.demo.inquiry.inquirycontroller.business.UpdateQuoteEntityBean;
import com.logical.demo.inquiry.inquirycontroller.constants.FloorType;
import com.logical.demo.inquiry.inquirycontroller.constants.RoofType;
import com.logical.demo.inquiry.inquiryoffer.module.InquiryOffer;
import com.logical.demo.inquiry.inquiryoffer.utils.InquiryOfferBuilder;
import com.notedown.utility.Logger;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.support.rowset.SqlRowSet;

/**
 *
 * @author Akshay
 */
public class QuoteInquiryService {

    QuoteInquiryDataManager quoteInquiryDataManager = new QuoteInquiryDataManager();
    final String FILE_NAME = "C:\\Users\\Akshay\\Documents\\NetBeansProjects\\SpringQuote\\web\\log\\log.txt";
    Logger logger = new Logger(FILE_NAME);

    // ! Returns List Of State from DataManager
    public List getState() throws ClassNotFoundException, SQLException {

        logger.logData("ServiceManager | In Quote Inquiry Service : Get State");

        return quoteInquiryDataManager.getState();
    }

    // ! Returns List Of City of Given State from DataManager
    public List getCities(int state) throws ClassNotFoundException, SQLException {

        logger.logData("ServiceManager | In Quote Inquiry Service : Get Cities");

        return quoteInquiryDataManager.getCities(state);
    }

    // ! Creating Quote Inquiry (Insert Form Data into Inquiry Table)
    public int createQuoteInquiry(InquiryFormBean inquiryFormBean) throws ClassNotFoundException, SQLException, ParseException {
        // ! Have to Insert of offer generation
        logger.logData("ServiceManager | In Quote Inquiry Service : Creaing Inquiry");

        // ! Create Offer Builder Object
        InquiryOfferBuilder inquiryOfferBuilder = new InquiryOfferBuilder();
        // Mapping Form Bean to Entity Bean
        InquiryEntityBean inquiryEntityBean = mapFormBeanToInquiryBean(inquiryFormBean);
        // ! Creating InquiryOffer Object
        InquiryOffer inquiryOffer = new InquiryOffer();

        inquiryOffer = inquiryOfferBuilder.generateOffer(inquiryEntityBean);

        return quoteInquiryDataManager.createQuoteInquiry(inquiryEntityBean, inquiryOffer);
    }

    // ! This Method Will Map the Data Of FormEntityBean to InquiryEntityBean
    private InquiryEntityBean mapFormBeanToInquiryBean(InquiryFormBean inquiryFormBean) throws ParseException {

        logger.logData("ServiceManager | In Quote Inquiry Service : Mapping Data Of FormEntityBean to InquiryEntityBean");

        InquiryEntityBean inquiryEntityBean = new InquiryEntityBean();
        // ! UUID
        inquiryEntityBean.setInquiryid(UUID.randomUUID().toString());
        // ! First-Last Name
        inquiryEntityBean.setFirstname(inquiryFormBean.getFirstname());
        inquiryEntityBean.setLastname(inquiryFormBean.getLastname());
        // ! DOB
        inquiryEntityBean.setDob(inquiryFormBean.getDob());
        // ! Addrees
        inquiryEntityBean.setAddress(inquiryFormBean.getAddress());
        // ! STATE & CITY & Pincode
        inquiryEntityBean.setState(inquiryFormBean.getState());
        inquiryEntityBean.setCity(inquiryFormBean.getCity());
        inquiryEntityBean.setPincode(inquiryFormBean.getPincode());
        // ! Carpet Area & Build Year
        inquiryEntityBean.setCarpetarea(Integer.parseInt(inquiryFormBean.getCarpetarea()));
        inquiryEntityBean.setYear(Integer.parseInt(inquiryFormBean.getYear()));
        // Floor, Roof
        inquiryEntityBean.setRoof(inquiryFormBean.getRoof().equals("WOODEN") ? RoofType.WOODEN : RoofType.RCC);
        inquiryEntityBean.setFloor(inquiryFormBean.getFloor().equals("WOODEN") ? FloorType.WOODEN : FloorType.TILE);
        // ! Fire
        inquiryEntityBean.setFire(Integer.parseInt(inquiryFormBean.getFire()));

        return inquiryEntityBean;
    }

    // ! This Method will Give list of all Record from the inquiry_demo table
    public List getAllOffers() throws ClassNotFoundException, SQLException {

        logger.logData("ServiceManager | In Quote Inquiry Service : Getting All Data Of Inquiry");

        return quoteInquiryDataManager.getAllOffers();
    }

    // ! This Method will Generate Offer According to Condition
    public InquiryOffer generateOffer(String inquiryid) throws ClassNotFoundException, SQLException {

        logger.logData("ServiceManager | In Quote Inquiry Service : Genrating Offer Of Inquiry (" + inquiryid + ")");

        InquiryOfferBuilder inquiryOfferBuilder = new InquiryOfferBuilder();

        InquiryEntityBean inquiry = getInquiryDetails(inquiryid);

        logger.logData("ServiceManager | SqlRowSet Mapped (" + inquiryid + ")");

        InquiryOffer inquiryOffer = inquiryOfferBuilder.generateOffer(inquiry);

        if (inquiryOffer != null) {
            // ! Inserting Data into Offer Table
            int statusOfInsertInOffer = quoteInquiryDataManager.insertGeneratedOfferIntoOffer(inquiryOffer);
            logger.logData("ServiceManager | Status Of Generation Offer Insertion (" + statusOfInsertInOffer + ")");

            return inquiryOffer;
        }
        return null;
    }

    private InquiryEntityBean mapSqlRowSetToInquiryEntiryBean(SqlRowSet set) throws SQLException {

        logger.logData("ServiceManager | Mapping SqlRowSet to InquiryEntityBean");

        InquiryEntityBean inquiryEntityBean = new InquiryEntityBean();

        while (set.next()) {
            // ! UUID
            inquiryEntityBean.setInquiryid(set.getString("inquiryid"));
            // ! FIRST-LAST NAME
            inquiryEntityBean.setFirstname(set.getString("firstname"));
            inquiryEntityBean.setLastname(set.getString("lastname"));
            // ! DOB
            inquiryEntityBean.setDob(set.getString("dob"));
            // ! Addrees
            inquiryEntityBean.setAddress(set.getString("address"));
            // ! STATE & CITY & Pincode
            inquiryEntityBean.setState(set.getString("state"));
            inquiryEntityBean.setCity(set.getString("city"));
            inquiryEntityBean.setPincode(set.getString("pincode"));
            // ! Carpet Area & Build Year
            inquiryEntityBean.setCarpetarea(set.getInt("carpetarea"));
            inquiryEntityBean.setYear(set.getInt("year"));
            // Floor, Roof
            inquiryEntityBean.setRoof(set.getString("roof").equals("WOODEN") ? RoofType.WOODEN : RoofType.RCC);
            inquiryEntityBean.setFloor(set.getString("floor").equals("WOODEN") ? FloorType.WOODEN : FloorType.TILE);
            // ! Fire
            inquiryEntityBean.setFire(set.getInt("firesafety"));
        }

        return inquiryEntityBean;
    }

    // ! This Method will give the Offer Object of given Inquiry ID
    public InquiryOffer viewOffer(String inquiryid) throws ClassNotFoundException, SQLException {
        return mapOfferSetToOfferObj(quoteInquiryDataManager.getOffer(inquiryid));
    }

    // ! Method to Map SqlRowSet to Offer Class
    private InquiryOffer mapOfferSetToOfferObj(SqlRowSet set) throws SQLException {

        InquiryOffer offer = new InquiryOffer();

        while (set.next()) {
            offer.setCoverage(set.getInt("coverage"));
            offer.setPremium(set.getInt("premium"));
            offer.setOfferid(set.getString("offerid"));
            offer.setInquiryid(set.getString("inquiryid"));
        }
        return offer;
    }

    public InquiryEntityBean getInquiryDetails(String inquiryid) throws ClassNotFoundException, SQLException {

        logger.logData("ServiceManager | Getting inquiry Details Of Inquiry ID (" + inquiryid + ")");

        return mapSqlRowSetToInquiryEntiryBean(quoteInquiryDataManager.getInquiry(inquiryid));
    }

    public InquiryBaseOfferBean getBaseOffer(String inquiryid) throws ClassNotFoundException, SQLException {

        logger.logData("ServiceManager | Getting Base Offer Details Of Inquiry ID (" + inquiryid + ")");

        SqlRowSet baseOfferSet = quoteInquiryDataManager.getBaseOffer(inquiryid);

        return mapBaseOfferToInquiryBaseOfferBean(baseOfferSet);
    }

    private InquiryBaseOfferBean mapBaseOfferToInquiryBaseOfferBean(SqlRowSet set) throws SQLException {

        InquiryBaseOfferBean baseOffer = new InquiryBaseOfferBean();

        while (set.next()) {
            baseOffer.setMaxCoverage(set.getInt("maxcoverage"));
            baseOffer.setMinCoverage(set.getInt("mincoverage"));
            baseOffer.setOfferid(set.getString("offerid"));
            baseOffer.setInquiryid(set.getString("inquiryid"));
        }
        return baseOffer;
    }

    public int updateNewCoverage(UpdateCoverageFormBean updateCoverageFormBean) throws ClassNotFoundException, SQLException {

        UpdateCoverageEntityBean updateCoverageEntityBean = mapUpdateCoverageFormBeanToEntityBean(updateCoverageFormBean);

        SqlRowSet baseOfferSet = quoteInquiryDataManager.getBaseOffer(updateCoverageEntityBean.getInquiryid());

        InquiryBaseOfferBean inquiryBaseOfferBean = mapBaseOfferToInquiryBaseOfferBean(baseOfferSet);

        int newCoverage = updateCoverageEntityBean.getCoverage();

        if (newCoverage <= inquiryBaseOfferBean.getMaxCoverage() && newCoverage >= inquiryBaseOfferBean.getMinCoverage()) {
            return quoteInquiryDataManager.updateNewCoverage(updateCoverageEntityBean);
        } else {
            return 0;
        }
    }

    private UpdateCoverageEntityBean mapUpdateCoverageFormBeanToEntityBean(UpdateCoverageFormBean updateCoverageFormBean) {

        UpdateCoverageEntityBean updateCoverageEntityBean = new UpdateCoverageEntityBean();

        logger.logData("ServiceManager | In Quote Inquiry Service : Mapping Data Of UpdateCoverageFormBean to UpdateCoverageInquiryEntityBean");

        updateCoverageEntityBean.setInquiryid(updateCoverageFormBean.getInquiryid());
        updateCoverageEntityBean.setOfferid(updateCoverageFormBean.getOfferid());
        updateCoverageEntityBean.setPremium(Integer.parseInt(updateCoverageFormBean.getPremium()));
        updateCoverageEntityBean.setCoverage(Integer.parseInt(updateCoverageFormBean.getCoverage()));

        return updateCoverageEntityBean;
    }

// -----------------
    public int updateNewQuote(UpdateQuoteFormBean updateQuoteFormBean) throws ClassNotFoundException, SQLException {

        UpdateQuoteEntityBean updateQuoteEntityBean = mapUpdateQuoteFormBeanToUpdateQuoteEntityBean(updateQuoteFormBean);

        // ! Create Offer Builder Object
        InquiryOfferBuilder inquiryOfferBuilder = new InquiryOfferBuilder();
        InquiryOffer inquiryOffer = inquiryOfferBuilder.generateOffer(mapUpdateQuoteBeanToInquiryEntityBean(updateQuoteEntityBean));

        return quoteInquiryDataManager.updateNewQuote(updateQuoteEntityBean, inquiryOffer);
    }

    private InquiryEntityBean mapUpdateQuoteBeanToInquiryEntityBean(UpdateQuoteEntityBean updateQuoteEntityBean) {
        InquiryEntityBean inquiryEntityBean = new InquiryEntityBean();

        logger.logData("ServiceManager | In Quote Inquiry Service : Mapping Data Of UpdateQuoteEntity to InquiryEntityBean");

        inquiryEntityBean.setCarpetarea(updateQuoteEntityBean.getCarpetarea());
        inquiryEntityBean.setYear(updateQuoteEntityBean.getYear());
        inquiryEntityBean.setFloor(updateQuoteEntityBean.getFloor());
        inquiryEntityBean.setRoof(updateQuoteEntityBean.getRoof());
        inquiryEntityBean.setFire(updateQuoteEntityBean.getFire());

        return inquiryEntityBean;
    }

    private UpdateQuoteEntityBean mapUpdateQuoteFormBeanToUpdateQuoteEntityBean(UpdateQuoteFormBean updateQuoteFormBean) {
        UpdateQuoteEntityBean updateQuoteEntityBean = new UpdateQuoteEntityBean();

        updateQuoteEntityBean.setInquiryid(updateQuoteFormBean.getInquiryid());
        updateQuoteEntityBean.setCarpetarea(Integer.parseInt(updateQuoteFormBean.getCarpetarea()));
        updateQuoteEntityBean.setYear(Integer.parseInt(updateQuoteFormBean.getYear()));
        updateQuoteEntityBean.setRoof(updateQuoteFormBean.getRoof().equals("WOODEN") ? RoofType.WOODEN : RoofType.RCC);
        updateQuoteEntityBean.setFloor(updateQuoteFormBean.getFloor().equals("WOODEN") ? FloorType.WOODEN : FloorType.TILE);
        updateQuoteEntityBean.setFire(Integer.parseInt(updateQuoteFormBean.getFire()));

        return updateQuoteEntityBean;
    }

    public List getOfferList(String inquiryid) throws ClassNotFoundException, SQLException {

        logger.logData("ServiceManager | Getting All Offer Of Inquiry (" + inquiryid + ") ");

        return quoteInquiryDataManager.getOfferList(inquiryid);
    }

    public List getQuoteList(String inquiryid) throws ClassNotFoundException, SQLException {

        logger.logData("ServiceManager | Getting Quote Information of (" + inquiryid + ")");

        return quoteInquiryDataManager.getQuoteList(inquiryid);
    }

}
