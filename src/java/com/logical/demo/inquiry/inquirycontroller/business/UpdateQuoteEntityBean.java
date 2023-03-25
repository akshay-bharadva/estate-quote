
package com.logical.demo.inquiry.inquirycontroller.business;

import com.logical.demo.inquiry.inquirycontroller.constants.FloorType;
import com.logical.demo.inquiry.inquirycontroller.constants.RoofType;

/**
 *
 * @author Akshay
 */
public class UpdateQuoteEntityBean {

    String inquiryid;
    int carpetarea;
    int year;
    RoofType roof;
    FloorType floor;
    int fire;

    public String getInquiryid() {
        return inquiryid;
    }

    public void setInquiryid(String inquiryid) {
        this.inquiryid = inquiryid;
    }

    public int getCarpetarea() {
        return carpetarea;
    }

    public void setCarpetarea(int carpetarea) {
        this.carpetarea = carpetarea;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public RoofType getRoof() {
        return roof;
    }

    public void setRoof(RoofType roof) {
        this.roof = roof;
    }

    public FloorType getFloor() {
        return floor;
    }

    public void setFloor(FloorType floor) {
        this.floor = floor;
    }

}
