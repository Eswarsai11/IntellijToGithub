package com.enlighten.mint.xbuserapp.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Xbm_AdminGroup")
public class XbmAdminGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AdminGroupID", nullable = false)
    private int adminGroupID;

    @Column(name = "WhiteLabelID", nullable = true)
    private int whiteLabelID;

    @Column(name = "AdminGroupName", length = 50, nullable = true)
    private String adminGroupName;

    @Column(name = "StatusID", nullable = true)
    private Short statusID;

    @Column(name = "Remarks", length = 255, nullable = true)
    private String remarks;

    @Column(name = "CreatedByID", nullable = true)
    private int createdByID;

    @Column(name = "CreatedDateTime", nullable = true)
    private LocalDateTime createdDateTime;

    @Column(name = "ModifiedByID", nullable = true)
    private int modifiedByID;

    @Column(name = "ModifiedDateTime", nullable = true)
    private LocalDateTime modifiedDateTime;

    //Default Constructor

    public XbmAdminGroup(){

    }

    //AllArgs Constructor

    public XbmAdminGroup(int adminGroupID, int whiteLabelID, String adminGroupName, Short statusID, String remarks, int createdByID, LocalDateTime createdDateTime, int modifiedByID, LocalDateTime modifiedDateTime) {
        this.adminGroupID = adminGroupID;
        this.whiteLabelID = whiteLabelID;
        this.adminGroupName = adminGroupName;
        this.statusID = statusID;
        this.remarks = remarks;
        this.createdByID = createdByID;
        this.createdDateTime = createdDateTime;
        this.modifiedByID = modifiedByID;
        this.modifiedDateTime = modifiedDateTime;
    }


    // Getters and Setters

    public int getAdminGroupID() {
        return adminGroupID;
    }

    public void setAdminGroupID(int adminGroupID) {
        this.adminGroupID = adminGroupID;
    }

    public int getWhiteLabelID() {
        return whiteLabelID;
    }

    public void setWhiteLabelID(int whiteLabelID) {
        this.whiteLabelID = whiteLabelID;
    }

    public String getAdminGroupName() {
        return adminGroupName;
    }

    public void setAdminGroupName(String adminGroupName) {
        this.adminGroupName = adminGroupName;
    }

    public Short getStatusID() {
        return statusID;
    }

    public void setStatusID(Short statusID) {
        this.statusID = statusID;
    }

    public int getCreatedByID() {
        return createdByID;
    }

    public void setCreatedByID(int createdByID) {
        this.createdByID = createdByID;
    }

    public int getModifiedByID() {
        return modifiedByID;
    }

    public void setModifiedByID(int modifiedByID) {
        this.modifiedByID = modifiedByID;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public LocalDateTime getModifiedDateTime() {
        return modifiedDateTime;
    }

    public void setModifiedDateTime(LocalDateTime modifiedDateTime) {
        this.modifiedDateTime = modifiedDateTime;
    }

    @Override
    public String toString() {
        return "XbmAdminGroup{" +
                "adminGroupID=" + adminGroupID +
                ", whiteLabelID=" + whiteLabelID +
                ", adminGroupName='" + adminGroupName + '\'' +
                ", statusID=" + statusID +
                ", remarks='" + remarks + '\'' +
                ", createdByID=" + createdByID +
                ", createdDateTime=" + createdDateTime +
                ", modifiedByID=" + modifiedByID +
                ", modifiedDateTime=" + modifiedDateTime +
                '}';
    }
}

