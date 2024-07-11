package com.enlighten.mint.xbuserapp.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Xbg_APIType")
public class XbgAPIType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer apiTypeID;

    @Column(nullable = false)
    private Short languageID;

    @Column(length = 30,nullable = false)
    private String apiTypeName;


    //Default Constructor
    public XbgAPIType(){

    }

    //AllArgs Constructor

    public XbgAPIType(Integer apiTypeID, String apiTypeName, Short languageID) {
        this.apiTypeID = apiTypeID;
        this.apiTypeName = apiTypeName;
        this.languageID = languageID;
    }


    // Getters and Setters

    public Integer getApiTypeID() {
        return apiTypeID;
    }

    public void setApiTypeID(Integer apiTypeID) {
        this.apiTypeID = apiTypeID;
    }

    public Short getLanguageID() {
        return languageID;
    }

    public void setLanguageID(Short languageID) {
        this.languageID = languageID;
    }

    public String getApiTypeName() {
        return apiTypeName;
    }

    public void setApiTypeName(String apiTypeName) {
        this.apiTypeName = apiTypeName;
    }

    @Override
    public String toString() {
        return "XbgAPIType{" +
                "apiTypeID=" + apiTypeID +
                ", languageID=" + languageID +
                ", apiTypeName='" + apiTypeName + '\'' +
                '}';
    }
}

