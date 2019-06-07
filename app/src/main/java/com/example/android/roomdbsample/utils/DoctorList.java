package com.example.android.roomdbsample.utils;

import java.io.Serializable;
import java.util.List;

public class DoctorList implements Serializable {

    public String doctorId;
    public String profileImg;
    public String doctorName;
    public String vertical;
    public String experience;
    public String orgName;
    public String orgImg;
    public String distance;
    public String feeLabel;
    public int baseFee;
    public int finalFee;
    public float ratings;
    public String latitude;
    public String longitude;
    public String summary;
    public List<String> qualification;
    public String specializations;
    public String brandLogo;
    public boolean profile;
    public String address;

    public boolean isAssistant;
    public String responseTime;

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getVertical() {
        return vertical;
    }

    public void setVertical(String vertical) {
        this.vertical = vertical;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgImg() {
        return orgImg;
    }

    public void setOrgImg(String orgImg) {
        this.orgImg = orgImg;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getFeeLabel() {
        return feeLabel;
    }

    public void setFeeLabel(String feeLabel) {
        this.feeLabel = feeLabel;
    }

    public int getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(int baseFee) {
        this.baseFee = baseFee;
    }

    public int getFinalFee() {
        return finalFee;
    }

    public void setFinalFee(int finalFee) {
        this.finalFee = finalFee;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getQualification() {
        return qualification;
    }

    public void setQualification(List<String> qualification) {
        this.qualification = qualification;
    }

    public String getSpecializations() {
        return specializations;
    }

    public void setSpecializations(String specializations) {
        this.specializations = specializations;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public boolean isProfile() {
        return profile;
    }

    public void setProfile(boolean profile) {
        this.profile = profile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isAssistant() {
        return isAssistant;
    }

    public void setAssistant(boolean assistant) {
        isAssistant = assistant;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }
}
