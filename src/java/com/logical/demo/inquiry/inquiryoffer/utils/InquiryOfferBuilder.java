
package com.logical.demo.inquiry.inquiryoffer.utils;

import com.logical.demo.inquiry.inquirycontroller.business.InquiryEntityBean;
import static com.logical.demo.inquiry.inquirycontroller.constants.FloorType.TILE;
import static com.logical.demo.inquiry.inquirycontroller.constants.FloorType.WOODEN;
import static com.logical.demo.inquiry.inquirycontroller.constants.RoofType.RCC;
import com.logical.demo.inquiry.inquiryoffer.module.InquiryOffer;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

/**
 *
 * @author Akshay
 */
public class InquiryOfferBuilder {

    // ! Base Premium And Coverage
    private int basePremium;
    private int baseCoverage;
    //Constants
    // ! If Fire Safty is Yes then than premium will decrease by 10% else increase by 20%
    private final double FIRE_SAFTEY_YES = 0.1;
    private final double FIRE_SAFTEY_NO = 0.2;
    // ! If Build Year is more than 10 year than premium will decrease by 10% else increase by 20%
    private final double BUILDYEAR_LTE_10 = 0.1;
    private final double BUILDYEAR_GT_10 = 0.2;
    // ! If Floor is Wooden then coverage will decrease by 5% and if Tile then increase by 5%
    private final double FLOOR_WOODEN = 0.05;
    private final double FLOOR_TILE = 0.05;
    // ! If ROOF is Wooden then coverage will decrease by 5% and if RCC then increase by 5%
    private final double ROOF_WOODEN = 0.05;
    private final double ROOF_RCC = 0.05;

    public InquiryOffer generateOffer(InquiryEntityBean inquiry) {

        InquiryOffer inquiryOffer = new InquiryOffer();

        HashMap<String, Integer> offer = offerOnCarpetArea(inquiry.getCarpetarea());

        if (offer.size() > 0) {

            baseCoverage = offer.get("coverage");
            basePremium = offer.get("premium");

            // ! Inquiry ID
            inquiryOffer.setOfferid(UUID.randomUUID().toString());
            // ! Coverage With Floor And Roof Type
            inquiryOffer.setCoverage(offerOnCoverage(baseCoverage, inquiry));
            // ! Premium With Fire And Year
            inquiryOffer.setPremium(offerOnPremium(basePremium, inquiry));
            // ! Setting Inquiry ID of offer
            inquiryOffer.setInquiryid(inquiry.getInquiryid());

            return inquiryOffer;
        } else {
            return null;
        }
    }

    private HashMap offerOnCarpetArea(int carpetArea) {

        HashMap<String, Integer> offer = new HashMap<>();

        if (carpetArea >= 30 && carpetArea <= 80) {
            offer.put("coverage", 70000);
            offer.put("premium", 1000);
            return offer;
        } else if (carpetArea >= 81 && carpetArea <= 200) {
            offer.put("coverage", 80000);
            offer.put("premium", 1200);
            return offer;
        } else if (carpetArea >= 201 && carpetArea <= 1000) {
            offer.put("coverage", 95000);
            offer.put("premium", 1800);
            return offer;
        } else if (carpetArea >= 1001) {
            offer.put("coverage", 125000);
            offer.put("premium", 2800);
            return offer;
        }
        return offer;
    }

    private int offerOnPremium(int premium, InquiryEntityBean inquiry) {

        int updatePremium = premium;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        int currentYear = calendar.get(Calendar.YEAR);
        int buildYear = inquiry.getYear();
        int fireSaftey = inquiry.getFire();

        // ! BUILD YEAR
        if (currentYear - buildYear > 0 && currentYear - buildYear <= 10) {
            updatePremium -= (updatePremium * BUILDYEAR_LTE_10);
        } else if (currentYear - buildYear > 10) {
            updatePremium += (updatePremium * BUILDYEAR_GT_10);
        }
        // ! FIRE SAFTEY
        if (fireSaftey == 0) {
            updatePremium += (updatePremium * FIRE_SAFTEY_NO);
        } else if (fireSaftey == 1) {
            updatePremium -= (updatePremium * FIRE_SAFTEY_YES);
        }
        return updatePremium;
    }

    private int offerOnCoverage(int coverage, InquiryEntityBean inquiry) {

        int updateCoverage = coverage;

        switch (inquiry.getFloor()) {
            case WOODEN:
                updateCoverage -= (updateCoverage * FLOOR_WOODEN);
                break;
            case TILE:
                updateCoverage += (updateCoverage * FLOOR_TILE);
                break;
        }
        switch (inquiry.getRoof()) {
            case WOODEN:
                updateCoverage -= (updateCoverage * ROOF_WOODEN);
                break;
            case RCC:
                updateCoverage += (updateCoverage * ROOF_RCC);
                break;
        }
        return updateCoverage;
    }

    public int getBasePremium() {
        return basePremium;
    }

    public int getBaseCoverage() {
        return baseCoverage;
    }

}
