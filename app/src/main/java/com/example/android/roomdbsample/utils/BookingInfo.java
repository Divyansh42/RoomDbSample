package com.example.android.roomdbsample.utils;

import java.io.Serializable;

public class BookingInfo implements Serializable {

    public String opdLabel;
    public String bookingLabel;

    // chat screen
    public Online online;
    public Online offline;

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

    public Online getOnline() {
        return online;
    }

    public void setOnline(Online online) {
        this.online = online;
    }

    public Online getOffline() {
        return offline;
    }

    public void setOffline(Online offline) {
        this.offline = offline;
    }
}
