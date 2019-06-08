package com.example.android.roomdbsample.utils;

import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Converters {

    @TypeConverter
    public static ArrayList<String> fromString(String value) {
        Type listType = new TypeToken<ArrayList<String>>() {}.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static String fromArrayList(ArrayList<String> list) {
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return json;
    }

    @TypeConverter
    public String fromDoctorList(List<DoctorList> doctorList) {
        if (doctorList == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<DoctorList>>() {}.getType();
        String json = gson.toJson(doctorList, type);
        return json;
    }

    @TypeConverter
    public List<DoctorList> toDoctorList(String doctorListString) {
        if (doctorListString == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<DoctorList>>() {}.getType();
        List<DoctorList> doctorList = gson.fromJson(doctorListString, type);
        return doctorList;
    }

    @TypeConverter
    public static BookingInfo fromBookingInfoString(String value) {
        Type bookingInfoType = new TypeToken<BookingInfo>(){}.getType();
        return new Gson().fromJson(value, bookingInfoType);
    }

    @TypeConverter
    public static String fromBookingInfo(BookingInfo bookingInfo) {
        Gson gson = new Gson();
        String json = gson.toJson(bookingInfo);
        return json;
    }
}
