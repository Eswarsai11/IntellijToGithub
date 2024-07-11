package com.enlighten.mint.xbuserapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Xbm_Admin")
public class XbmAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AdminID", nullable = false)
    private int adminID;

    @Column(name = "AdminGroupID", nullable = false)
    private int adminGroupID;

    @Column(name = "UserTypeID", nullable = false)
    private Short userTypeID;

    @Column(name = "AdminName", length = 50, nullable = false)
    private String adminName;

    @Column(name = "AdminLoginCode", length = 50, nullable = false)
    private String adminLoginCode;

    @Column(name = "AdminPassword", length = 64, nullable = false)
    private String adminPassword;

    @Column(name = "AdminEmail", length = 50, nullable = false)
    private String adminEmail;

    @Column(name = "StatusID", nullable = false)
    private Short statusID;

    @Column(name = "Remarks", length = 255, nullable = false)
    private String remarks;

    @Column(name = "LastSessionID", length = 64, nullable = false)
    private String lastSessionID;

    @Column(name = "LastLoginDateTime", nullable = false)
    private LocalDateTime lastLoginDateTime;

    @Column(name = "LastLoginIP", length = 50, nullable = false)
    private String lastLoginIP;

    @Column(name = "IsMultipleLoginEnabled", nullable = false)
    private Byte isMultipleLoginEnabled;

    @Column(name = "CreatedByID", nullable = false)
    private Integer createdByID;

    @Column(name = "CreatedDateTime", nullable = false)
    private LocalDateTime createdDateTime;

    @Column(name = "ModifiedByID", nullable = false)
    private Integer modifiedByID;

    @Column(name = "ModifiedDateTime", nullable = false)
    private LocalDateTime modifiedDateTime;


    //Default Constructor

    public XbmAdmin(){}

    //AllArgs Constructor

    public XbmAdmin(int adminID, int adminGroupID, Short userTypeID, String adminLoginCode, String adminName, String adminEmail, String adminPassword, Short statusID, String remarks, String lastSessionID, String lastLoginIP, LocalDateTime lastLoginDateTime, Byte isMultipleLoginEnabled, Integer createdByID, LocalDateTime createdDateTime, Integer modifiedByID, LocalDateTime modifiedDateTime) {
        this.adminID = adminID;
        this.adminGroupID = adminGroupID;
        this.userTypeID = userTypeID;
        this.adminLoginCode = adminLoginCode;
        this.adminName = adminName;
        this.adminEmail = adminEmail;
        this.adminPassword = adminPassword;
        this.statusID = statusID;
        this.remarks = remarks;
        this.lastSessionID = lastSessionID;
        this.lastLoginIP = lastLoginIP;
        this.lastLoginDateTime = lastLoginDateTime;
        this.isMultipleLoginEnabled = isMultipleLoginEnabled;
        this.createdByID = createdByID;
        this.createdDateTime = createdDateTime;
        this.modifiedByID = modifiedByID;
        this.modifiedDateTime = modifiedDateTime;
    }


    // Getters and Setters

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public int getAdminGroupID() {
        return adminGroupID;
    }

    public void setAdminGroupID(int adminGroupID) {
        this.adminGroupID = adminGroupID;
    }

    public Short getUserTypeID() {
        return userTypeID;
    }

    public void setUserTypeID(Short userTypeID) {
        this.userTypeID = userTypeID;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminLoginCode() {
        return adminLoginCode;
    }

    public void setAdminLoginCode(String adminLoginCode) {
        this.adminLoginCode = adminLoginCode;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public Short getStatusID() {
        return statusID;
    }

    public void setStatusID(Short statusID) {
        this.statusID = statusID;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLastSessionID() {
        return lastSessionID;
    }

    public void setLastSessionID(String lastSessionID) {
        this.lastSessionID = lastSessionID;
    }

    public LocalDateTime getLastLoginDateTime() {
        return lastLoginDateTime;
    }

    public void setLastLoginDateTime(LocalDateTime lastLoginDateTime) {
        this.lastLoginDateTime = lastLoginDateTime;
    }

    public String getLastLoginIP() {
        return lastLoginIP;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP;
    }

    public Byte getMultipleLoginEnabled() {
        return isMultipleLoginEnabled;
    }

    public void setMultipleLoginEnabled(Byte multipleLoginEnabled) {
        isMultipleLoginEnabled = multipleLoginEnabled;
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
        return "XbmAdmin{" +
                "adminID=" + adminID +
                ", adminGroupID=" + adminGroupID +
                ", userTypeID=" + userTypeID +
                ", adminName='" + adminName + '\'' +
                ", adminLoginCode='" + adminLoginCode + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                ", statusID=" + statusID +
                ", remarks='" + remarks + '\'' +
                ", lastSessionID='" + lastSessionID + '\'' +
                ", lastLoginDateTime=" + lastLoginDateTime +
                ", lastLoginIP='" + lastLoginIP + '\'' +
                ", isMultipleLoginEnabled=" + isMultipleLoginEnabled +
                ", createdByID=" + createdByID +
                ", createdDateTime=" + createdDateTime +
                ", modifiedByID=" + modifiedByID +
                ", modifiedDateTime=" + modifiedDateTime +
                '}';
    }
}
