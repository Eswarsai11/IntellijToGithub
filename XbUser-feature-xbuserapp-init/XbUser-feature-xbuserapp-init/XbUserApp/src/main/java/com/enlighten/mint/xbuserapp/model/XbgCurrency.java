package com.enlighten.mint.xbuserapp.model;

import jakarta.persistence.*;


@Entity
@Table(name="Xbg_Currency")
public class XbgCurrency {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
       // @Column(name = "currencyID")
        private Integer currencyID;

        @Column(name = "languageID", nullable = false)
        private Integer languageID;

        @Column(name = "currencyName", length = 50, nullable = false)
        private String currencyName;

        @Column(name = "currencyCode2", length = 4, nullable = false)
        private String currencyCode2;

        @Column(name = "currencyCode3", length = 6, nullable = false)
        private String currencyCode3;



        // Default constructor
        public XbgCurrency() {}

//        // Constructor
        public XbgCurrency(Integer currencyID, Integer languageID, String currencyName, String currencyCode2, String currencyCode3) {
            this.currencyID = currencyID;
            this.languageID = languageID;
            this.currencyName = currencyName;
            this.currencyCode2 = currencyCode2;
            this.currencyCode3 = currencyCode3;
        }

        // Getters and setters

        public Integer getCurrencyID() {
                return currencyID;
        }

        public void setCurrencyID(Integer currencyID) {
                this.currencyID = currencyID;
        }

        public Integer getLanguageID() {
                return languageID;
        }

        public void setLanguageID(Integer languageID) {
                this.languageID = languageID;
        }

        public String getCurrencyName() {
                return currencyName;
        }

        public void setCurrencyName(String currencyName) {
                this.currencyName = currencyName;
        }

        public String getCurrencyCode2() {
                return currencyCode2;
        }

        public void setCurrencyCode2(String currencyCode2) {
                this.currencyCode2 = currencyCode2;
        }

        public String getCurrencyCode3() {
                return currencyCode3;
        }

        public void setCurrencyCode3(String currencyCode3) {
                this.currencyCode3 = currencyCode3;
        }


//

        @Override
        public String toString() {
                return "XbgCurrency{" +
                        "currencyID=" + currencyID +
                        ", languageID=" + languageID +
                        ", currencyName='" + currencyName + '\'' +
                        ", currencyCode2='" + currencyCode2 + '\'' +
                        ", currencyCode3='" + currencyCode3 + '\'' +

                        '}';
        }
}






