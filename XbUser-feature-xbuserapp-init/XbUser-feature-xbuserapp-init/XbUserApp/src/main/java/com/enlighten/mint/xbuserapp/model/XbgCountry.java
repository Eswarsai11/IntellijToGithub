package com.enlighten.mint.xbuserapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
