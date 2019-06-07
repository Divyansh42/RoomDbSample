package com.example.android.roomdbsample.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;

import com.example.android.roomdbsample.utils.Converters;
import com.example.android.roomdbsample.utils.DoctorList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "message")
public class Message implements Serializable {
    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "user_type")
    public String userType;

    @ColumnInfo(name = "sender_id")
    public String senderId;

    @ColumnInfo(name = "receiver_id")
    public String receiverId;

    @ColumnInfo(name = "vertical_id")
    public int verticalId;

    @ColumnInfo(name = "consultation_id")
    public int consultationId;

    @PrimaryKey
    @NonNull
    public String messageId;

    @ColumnInfo(name = "hidden")
    public boolean hidden;

    @ColumnInfo(name = "text")
    public String text;

    @ColumnInfo(name = "type")
    public String type;

    @ColumnInfo(name = "card_type")
    public String cardType;

    @ColumnInfo(name = "notification_type")
    public String notificationType;

    @ColumnInfo(name = "time")
    public String time;

    //public BookingInfo bookingInfo;

    @ColumnInfo(name = "doctor_list")
    @TypeConverters(Converters.class)
    public List<DoctorList> topCard;
   // public BottomCard bottomCard;
    //public List<Symptom> caseDetails;
    @ColumnInfo(name = "labs")
    @TypeConverters(Converters.class)
    public ArrayList<String> labs;

    //public List<Drug> medicines;
    @ColumnInfo(name = "prescription_link")
    public String prescriptionLink;

    @ColumnInfo(name = "search_type")
    public String searchType;

    @ColumnInfo(name = "document_url")
    public String documentUrl;

    @ColumnInfo(name = "document_file_name")
    public String documentFileName;

    @ColumnInfo(name = "file_preview_url")
    public String filePreviewUrl;

    @ColumnInfo(name = "url")
    public String url;
/*

    @ColumnInfo(name = "bitmap")
    public Bitmap bitmap;
*/

   // public ConsultationInfo consultationInfo;
    @ColumnInfo(name = "treatment_plan_PDF_link" )
    public String treatmentPlanPDFLink;

    @ColumnInfo(name = "doctor_profile_url")
    public String doctorProfileUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public int getVerticalId() {
        return verticalId;
    }

    public void setVerticalId(int verticalId) {
        this.verticalId = verticalId;
    }

    public int getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(int consultationId) {
        this.consultationId = consultationId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<DoctorList> getTopCard() {
        return topCard;
    }

    public void setTopCard(List<DoctorList> topCard) {
        this.topCard = topCard;
    }

    public List<String> getLabs() {
        return labs;
    }

    public void setLabs(ArrayList<String> labs) {
        this.labs = labs;
    }

    public String getPrescriptionLink() {
        return prescriptionLink;
    }

    public void setPrescriptionLink(String prescriptionLink) {
        this.prescriptionLink = prescriptionLink;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    public String getDocumentFileName() {
        return documentFileName;
    }

    public void setDocumentFileName(String documentFileName) {
        this.documentFileName = documentFileName;
    }

    public String getFilePreviewUrl() {
        return filePreviewUrl;
    }

    public void setFilePreviewUrl(String filePreviewUrl) {
        this.filePreviewUrl = filePreviewUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /*public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
*/
    public String getTreatmentPlanPDFLink() {
        return treatmentPlanPDFLink;
    }

    public void setTreatmentPlanPDFLink(String treatmentPlanPDFLink) {
        this.treatmentPlanPDFLink = treatmentPlanPDFLink;
    }

    public String getDoctorProfileUrl() {
        return doctorProfileUrl;
    }

    public void setDoctorProfileUrl(String doctorProfileUrl) {
        this.doctorProfileUrl = doctorProfileUrl;
    }
}
