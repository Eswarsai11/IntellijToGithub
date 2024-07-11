package com.enlighten.mint.xbuserapp.model;



import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "XbmAPIDetail")
public class XbmAPIDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer apiDetailID;

    @Column(nullable = false)
    private Integer whiteLabelID;

    @Column(nullable = false)
    private Short apiTypeID;

    @Column(length = 20,nullable = false)
    private String apiName;

    @Column(length = 32,nullable = false)
    private String apiUserName;

    @Column(length = 32,nullable = false)
    private String apiPassword;

    @Column(length = 64,nullable = false)
    private String apiKey;

    @Column(length = 64,nullable = false)
    private String apiSessionToken;

    @Column(length = 254,nullable = false)
    private String apiDescription;

    @Column(nullable = false)
    private Integer createdByID;

    @Column(nullable = false)
    private LocalDateTime createdDateTime;

    @Column(nullable = false)
    private Integer modifiedByID;

    @Column(nullable = false)
    private LocalDateTime modifiedDateTime;

    //Mapping

  //  private XbmwhiteLabel label;

  //  private XbgAPIType xbgAPIType;

    //Default Constructor

    public XbmAPIDetail(){}

    //AllArgs Constructor

    public XbmAPIDetail(LocalDateTime modifiedDateTime, Integer modifiedByID, LocalDateTime createdDateTime, Integer createdByID, String apiDescription, String apiSessionToken, String apiKey, Integer whiteLabelID, Integer apiDetailID, Short apiTypeID, String apiName, String apiPassword, String apiUserName) {
        this.modifiedDateTime = modifiedDateTime;
        this.modifiedByID = modifiedByID;
        this.createdDateTime = createdDateTime;
        this.createdByID = createdByID;
        this.apiDescription = apiDescription;
        this.apiSessionToken = apiSessionToken;
        this.apiKey = apiKey;
        this.whiteLabelID = whiteLabelID;
        this.apiDetailID = apiDetailID;
        this.apiTypeID = apiTypeID;
        this.apiName = apiName;
        this.apiPassword = apiPassword;
        this.apiUserName = apiUserName;
    }


    // Getters and Setters

    public Integer getApiDetailID() {
        return apiDetailID;
    }

    public void setApiDetailID(Integer apiDetailID) {
        this.apiDetailID = apiDetailID;
    }

    public Integer getWhiteLabelID() {
        return whiteLabelID;
    }

    public void setWhiteLabelID(Integer whiteLabelID) {
        this.whiteLabelID = whiteLabelID;
    }

    public Short getApiTypeID() {
        return apiTypeID;
    }

    public void setApiTypeID(Short apiTypeID) {
        this.apiTypeID = apiTypeID;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiUserName() {
        return apiUserName;
    }

    public void setApiUserName(String apiUserName) {
        this.apiUserName = apiUserName;
    }

    public String getApiPassword() {
        return apiPassword;
    }

    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiSessionToken() {
        return apiSessionToken;
    }

    public void setApiSessionToken(String apiSessionToken) {
        this.apiSessionToken = apiSessionToken;
    }

    public String getApiDescription() {
        return apiDescription;
    }

    public void setApiDescription(String apiDescription) {
        this.apiDescription = apiDescription;
    }

    public Integer getCreatedByID() {
        return createdByID;
    }

    public void setCreatedByID(Integer createdByID) {
        this.createdByID = createdByID;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Integer getModifiedByID() {
        return modifiedByID;
    }

    public void setModifiedByID(Integer modifiedByID) {
        this.modifiedByID = modifiedByID;
    }

    public LocalDateTime getModifiedDateTime() {
        return modifiedDateTime;
    }

    public void setModifiedDateTime(LocalDateTime modifiedDateTime) {
        this.modifiedDateTime = modifiedDateTime;
    }

    @Override
    public String toString() {
        return "XbmAPIDetail{" +
                "apiDetailID=" + apiDetailID +
                ", whiteLabelID=" + whiteLabelID +
                ", apiTypeID=" + apiTypeID +
                ", apiName='" + apiName + '\'' +
                ", apiUserName='" + apiUserName + '\'' +
                ", apiPassword='" + apiPassword + '\'' +
                ", apiKey='" + apiKey + '\'' +
                ", apiSessionToken='" + apiSessionToken + '\'' +
                ", apiDescription='" + apiDescription + '\'' +
                ", createdByID=" + createdByID +
                ", createdDateTime=" + createdDateTime +
                ", modifiedByID=" + modifiedByID +
                ", modifiedDateTime=" + modifiedDateTime +
                '}';
    }
}

