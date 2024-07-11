package com.enlighten.mint.xbuserapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
public class XbgCountry {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "CountryID")
        private Integer countryId;

        @Column(name = "LanguageID")
        private Integer languageId;

        @Column(name = "CountryName",length = 50,nullable = false)
        private String countryName;

        @Column(name = "CountryCode2",length = 4,nullable = false)
        private String countryCode2;

        @Column(name = "CountryCode3",length = 6,nullable = false)
        private String countryCode3;


        //Default Constructor
    public XbgCountry()
    {

    }

    //ALl Args Constructor


    public XbgCountry(Integer countryId, String countryCode3, String countryCode2, String countryName, Integer languageId) {
        this.countryId = countryId;
        this.countryCode3 = countryCode3;
        this.countryCode2 = countryCode2;
        this.countryName = countryName;
        this.languageId = languageId;
    }


    //Getters and Setters


    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode2() {
        return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public String getCountryCode3() {
        return countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

    @Override
    public String toString() {
        return "XbgCountry{" +
                "countryId=" + countryId +
                ", languageId=" + languageId +
                ", countryName='" + countryName + '\'' +
                ", countryCode2='" + countryCode2 + '\'' +
                ", countryCode3='" + countryCode3 + '\'' +
                '}';
    }
}
