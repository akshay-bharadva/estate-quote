
package com.logical.demo.inquiry.inquirycontroller.business;

/**
 *
 * @author Akshay
 */
public class InquiryBaseOfferBean {

    String inquiryid;
    String offerid;
    int basePremium;
    int basrCoverage;
    int maxCoverage;
    int minCoverage;

    public String getInquiryid() {
        return inquiryid;
    }

    public void setInquiryid(String inquiryid) {
        this.inquiryid = inquiryid;
    }

    public String getOfferid() {
        return offerid;
    }

    public void setOfferid(String offerid) {
        this.offerid = offerid;
    }

    public int getBasePremium() {
        return basePremium;
    }

    public void setBasePremium(int basePremium) {
        this.basePremium = basePremium;
    }

    public int getBasrCoverage() {
        return basrCoverage;
    }

    public void setBasrCoverage(int basrCoverage) {
        this.basrCoverage = basrCoverage;
    }

    public int getMaxCoverage() {
        return maxCoverage;
    }

    public void setMaxCoverage(int maxCoverage) {
        this.maxCoverage = maxCoverage;
    }

    public int getMinCoverage() {
        return minCoverage;
    }

    public void setMinCoverage(int minCoverage) {
        this.minCoverage = minCoverage;
    }

}
