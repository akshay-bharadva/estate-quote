
package com.logical.demo.inquiry.inquirycontroller.business;

/**
 *
 * @author Akshay
 */
public class UpdateCoverageEntityBean {

    String inquiryid;
    String offerid;
    int coverage;
    int premium;

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

    public int getCoverage() {
        return coverage;
    }

    public void setCoverage(int coverage) {
        this.coverage = coverage;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

}
