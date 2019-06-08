package com.example.android.roomdbsample.utils;

import java.io.Serializable;
import java.util.List;

public class Online implements Serializable {

    public String next;
    public List<DoctorList> list;
    public BookingInfo bookingInfo;

    //for chat screen
    public String opdLabel;
    public String bookingLabel;

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public List<DoctorList> getList() {
        return list;
    }

    public void setList(List<DoctorList> list) {
        this.list = list;
    }

    public BookingInfo getBookingInfo() {
        return bookingInfo;
    }

    public void setBookingInfo(BookingInfo bookingInfo) {
        this.bookingInfo = bookingInfo;
    }

    public String getOpdLabel() {
        return opdLabel;
    }

    public void setOpdLabel(String opdLabel) {
        this.opdLabel = opdLabel;
    }

    public String getBookingLabel() {
        return bookingLabel;
    }

    public void setBookingLabel(String bookingLabel) {
        this.bookingLabel = bookingLabel;
    }
}