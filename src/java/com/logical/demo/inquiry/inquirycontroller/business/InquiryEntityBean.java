
package com.logical.demo.inquiry.inquirycontroller.business;

import com.logical.demo.inquiry.inquirycontroller.constants.FloorType;
import com.logical.demo.inquiry.inquirycontroller.constants.RoofType;

/**
 *
 * @author Akshay
 */
public class InquiryEntityBean {

    String inquiryid;
    String firstname;
    String lastname;
    String dob;
    String address;
    String state;
    String city;
    String pincode;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
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

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

}
