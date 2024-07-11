package com.enlighten.mint.xbuserapp.model;

import jakarta.persistence.*;



@Entity
@Table(name="Xbg_TimeZone")
public class XbgTimeZone {


        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Integer timeZoneID;

        @Column(nullable = false)
        private Short languageID;

        @Column(length = 100,nullable = false)
        private String timeZoneName;

        @Column(length = 10,nullable = false)
        private String zoneOffset;

        @Column(nullable = false)
        private Short gmtPlusOrMinus;


        //Default Constructor
    public  XbgTimeZone()
    {

    }

    //AllArgs Constructor


    public XbgTimeZone(Integer timeZoneID, Short languageID, String timeZoneName, String zoneOffset, Short gmtPlusOrMinus) {
        this.timeZoneID = timeZoneID;
        this.languageID = languageID;
        this.timeZoneName = timeZoneName;
        this.zoneOffset = zoneOffset;
        this.gmtPlusOrMinus = gmtPlusOrMinus;
    }

    // Getters and Setters
        public Integer getTimeZoneID() {
            return timeZoneID;
        }

        public void setTimeZoneID(Integer timeZoneID) {
            this.timeZoneID = timeZoneID;
        }

        public Short getLanguageID() {
            return languageID;
        }

        public void setLanguageID(Short languageID) {
            this.languageID = languageID;
        }

        public String getTimeZoneName() {
            return timeZoneName;
        }

        public void setTimeZoneName(String timeZoneName) {
            this.timeZoneName = timeZoneName;
        }

        public String getZoneOffset() {
            return zoneOffset;
        }

        public void setZoneOffset(String zoneOffset) {
            this.zoneOffset = zoneOffset;
        }

        public Short getGmtPlusOrMinus() {
            return gmtPlusOrMinus;
        }

        public void setGmtPlusOrMinus(Short gmtPlusOrMinus) {
            this.gmtPlusOrMinus = gmtPlusOrMinus;
        }

    @Override
    public String toString() {
        return "XbgTimeZone{" +
                "timeZoneID=" + timeZoneID +
                ", languageID=" + languageID +
                ", timeZoneName='" + timeZoneName + '\'' +
                ", zoneOffset='" + zoneOffset + '\'' +
                ", gmtPlusOrMinus=" + gmtPlusOrMinus +
                '}';
    }
}


