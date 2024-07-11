package com.enlighten.mint.xbuserapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Xbm_AdminGroupPermission")
public class XbmAdminGroupPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AdminGroupID", nullable = false)
    private int adminGroupID;

    @Column(name = "ModuleID", nullable = false)
    private int moduleID;

    @Column(name = "ModuleFunctionIDs", nullable = true)
    private String moduleFunctionIDs;

    //Default Constructor

    public XbmAdminGroupPermission(){

    }

    //AllArgs Constructor

    public XbmAdminGroupPermission(int adminGroupID, int moduleID, String moduleFunctionIDs) {
        this.adminGroupID = adminGroupID;
        this.moduleID = moduleID;
        this.moduleFunctionIDs = moduleFunctionIDs;
    }

    // Getters and Setters


    public int getAdminGroupID() {
        return adminGroupID;
    }

    public void setAdminGroupID(int adminGroupID) {
        this.adminGroupID = adminGroupID;
    }

    public int getModuleID() {
        return moduleID;
    }

    public void setModuleID(int moduleID) {
        this.moduleID = moduleID;
    }

    public String getModuleFunctionIDs() {
        return moduleFunctionIDs;
    }

    public void setModuleFunctionIDs(String moduleFunctionIDs) {
        this.moduleFunctionIDs = moduleFunctionIDs;
    }

    @Override
    public String toString() {
        return "XbmAdminGroupPermission{" +
                "adminGroupID=" + adminGroupID +
                ", moduleID=" + moduleID +
                ", moduleFunctionIDs='" + moduleFunctionIDs + '\'' +
                '}';
    }
}
