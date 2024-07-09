package com.enlighten.mint.xbuserapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name="Xbm_whiteLable")
public class XbmwhiteLabel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="whitelableID",insertable = false, updatable=false)
    private Integer whiteLabelID;

    @Column(length = 20,nullable = false)

    private String whiteLabelCode;

    @Column(nullable = false)

    private Integer currencyID;

    @Column(nullable = false)
    private Integer countryID;


    @Column(nullable = false)
    private Integer timeZoneID;


    @Column(length = 50,nullable = false)
    private String whiteLabelName;


    @Column(length = 20,nullable = false)
    private String contactNumber1;


    @Column(length = 20,nullable = false)
    private String contactNumber2;


    @Column(length = 50,nullable = false)
    private String contactEmail;


    @Column(length = 250,nullable = false)
    private String officialAddress;


    @Column(length = 50,nullable = false)
    private String officialWebsite;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(nullable = false)
    private Date registrationDate;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(nullable = false)
    private Date expirationDate;

    @Column(nullable = false)
    private Integer isDeactivated;


    @Column(nullable = false)
    private Integer isPTEntabled;


    @Column(nullable = false)
    private Float providerPT;


    @Column(nullable = false)
    private Float whiteLabelPT;


    @Column(nullable = false)
    private Float providerCom;

    @Column(nullable = false)
    private Float whiteLabelCom;


    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdDateTime;


    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modifiedDateTime;

    @ManyToOne
    @JoinColumn(name = "Currency_white")
    private XbgCurrency xbgCurrency;







//    //NoArgConstructor
//    public XbmwhiteLabel() {
//    }
//
//
//    public XbmwhiteLabel(Set<XbgCurrency> xbgCurrency) {
//        this.xbgCurrency = xbgCurrency;
//    }
//
//    public XbmwhiteLabel(Integer whiteLabelID, String whiteLabelCode, Integer currencyID, Integer countryID, Integer timeZoneID, String whiteLabelName, String contactNumber1, String contactNumber2, String contactEmail, String officialAddress, String officialWebsite, Date registrationDate, Date expirationDate, Integer isDeactivated, Integer isPTEntabled, Float providerPT, LocalDateTime createdDateTime, Float whiteLabelPT, Float providerCom, LocalDateTime modifiedDateTime, Float whiteLabelCom) {
//        this.whiteLabelID = whiteLabelID;
//        this.whiteLabelCode = whiteLabelCode;
//        this.currencyID = currencyID;
//        this.countryID = countryID;
//        this.timeZoneID = timeZoneID;
//        this.whiteLabelName = whiteLabelName;
//        this.contactNumber1 = contactNumber1;
//        this.contactNumber2 = contactNumber2;
//        this.contactEmail = contactEmail;
//        this.officialAddress = officialAddress;
//        this.officialWebsite = officialWebsite;
//        this.registrationDate = registrationDate;
//        this.expirationDate = expirationDate;
//        this.isDeactivated = isDeactivated;
//        this.isPTEntabled = isPTEntabled;
//        this.providerPT = providerPT;
//        this.createdDateTime = createdDateTime;
//        this.whiteLabelPT = whiteLabelPT;
//        this.providerCom = providerCom;
//        this.modifiedDateTime = modifiedDateTime;
//        this.whiteLabelCom = whiteLabelCom;
//    }
//
//    public Integer getWhiteLabelID() {
//        return whiteLabelID;
//    }
//
//    public void setWhiteLabelID(Integer whiteLabelID) {
//        this.whiteLabelID = whiteLabelID;
//    }
//
//    public String getWhiteLabelCode() {
//        return whiteLabelCode;
//    }
//
//    public void setWhiteLabelCode(String whiteLabelCode) {
//        this.whiteLabelCode = whiteLabelCode;
//    }
//
//    public Integer getCurrencyID() {
//        return currencyID;
//    }
//
//    public void setCurrencyID(Integer currencyID) {
//        this.currencyID = currencyID;
//    }
//
//    public Integer getCountryID() {
//        return countryID;
//    }
//
//    public void setCountryID(Integer countryID) {
//        this.countryID = countryID;
//    }
//
//    public Integer getTimeZoneID() {
//        return timeZoneID;
//    }
//
//    public void setTimeZoneID(Integer timeZoneID) {
//        this.timeZoneID = timeZoneID;
//    }
//
//    public String getWhiteLabelName() {
//        return whiteLabelName;
//    }
//
//    public void setWhiteLabelName(String whiteLabelName) {
//        this.whiteLabelName = whiteLabelName;
//    }
//
//    public String getContactNumber1() {
//        return contactNumber1;
//    }
//
//    public void setContactNumber1(String contactNumber1) {
//        this.contactNumber1 = contactNumber1;
//    }
//
//    public String getContactNumber2() {
//        return contactNumber2;
//    }
//
//    public void setContactNumber2(String contactNumber2) {
//        this.contactNumber2 = contactNumber2;
//    }
//
//    public String getContactEmail() {
//        return contactEmail;
//    }
//
//    public void setContactEmail(String contactEmail) {
//        this.contactEmail = contactEmail;
//    }
//
//    public String getOfficialAddress() {
//        return officialAddress;
//    }
//
//    public void setOfficialAddress(String officialAddress) {
//        this.officialAddress = officialAddress;
//    }
//
//    public String getOfficialWebsite() {
//        return officialWebsite;
//    }
//
//    public void setOfficialWebsite(String officialWebsite) {
//        this.officialWebsite = officialWebsite;
//    }
//
//    public Date getRegistrationDate() {
//        return registrationDate;
//    }
//
//    public void setRegistrationDate(Date registrationDate) {
//        this.registrationDate = registrationDate;
//    }
//
//    public Date getExpirationDate() {
//        return expirationDate;
//    }
//
//    public void setExpirationDate(Date expirationDate) {
//        this.expirationDate = expirationDate;
//    }
//
//    public XbmwhiteLabel(Integer isDeactivated, Integer isPTEntabled) {
//        this.isDeactivated = isDeactivated;
//        this.isPTEntabled = isPTEntabled;
//    }
//
//    public LocalDateTime getModifiedDateTime() {
//        return modifiedDateTime;
//    }
//
//    public void setModifiedDateTime(LocalDateTime modifiedDateTime) {
//        this.modifiedDateTime = modifiedDateTime;
//    }
//
//    public LocalDateTime getCreatedDateTime() {
//        return createdDateTime;
//    }
//
//    public void setCreatedDateTime(LocalDateTime createdDateTime) {
//        this.createdDateTime = createdDateTime;
//    }
//
//    public Float getWhiteLabelCom() {
//        return whiteLabelCom;
//    }
//
//    public void setWhiteLabelCom(Float whiteLabelCom) {
//        this.whiteLabelCom = whiteLabelCom;
//    }
//
//    public Float getProviderCom() {
//        return providerCom;
//    }
//
//    public void setProviderCom(Float providerCom) {
//        this.providerCom = providerCom;
//    }
//
//    public Float getWhiteLabelPT() {
//        return whiteLabelPT;
//    }
//
//    public void setWhiteLabelPT(Float whiteLabelPT) {
//        this.whiteLabelPT = whiteLabelPT;
//    }
//
//    public Float getProviderPT() {
//        return providerPT;
//    }
//
//    public void setProviderPT(Float providerPT) {
//        this.providerPT = providerPT;
//    }
//
//    public Integer getIsDeactivated() {
//        return isDeactivated;
//    }
//
//    public void setIsDeactivated(Integer isDeactivated) {
//        this.isDeactivated = isDeactivated;
//    }
//
//    public Integer getIsPTEntabled() {
//        return isPTEntabled;
//    }
//
//    public void setIsPTEntabled(Integer isPTEntabled) {
//        this.isPTEntabled = isPTEntabled;
//    }
//
//    public Set<XbgCurrency> getXbgCurrency() {
//        return xbgCurrency;
//    }
//
//    public void setXbgCurrency(Set<XbgCurrency> xbgCurrency) {
//        this.xbgCurrency = xbgCurrency;
//    }
//

    @Override
    public String toString() {
        return "XbmwhiteLabel{" +
                "whiteLabelID=" + whiteLabelID +
                ", whiteLabelCode='" + whiteLabelCode + '\'' +
                ", currencyID=" + currencyID +
                ", countryID=" + countryID +
                ", timeZoneID=" + timeZoneID +
                ", whiteLabelName='" + whiteLabelName + '\'' +
                ", contactNumber1='" + contactNumber1 + '\'' +
                ", contactNumber2='" + contactNumber2 + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", officialAddress='" + officialAddress + '\'' +
                ", officialWebsite='" + officialWebsite + '\'' +
                ", registrationDate=" + registrationDate +
                ", expirationDate=" + expirationDate +
                ", isDeactivated=" + isDeactivated +
                ", isPTEntabled=" + isPTEntabled +
                ", providerPT=" + providerPT +
                ", whiteLabelPT=" + whiteLabelPT +
                ", providerCom=" + providerCom +
                ", whiteLabelCom=" + whiteLabelCom +
                ", createdDateTime=" + createdDateTime +
                ", modifiedDateTime=" + modifiedDateTime +

                '}';
    }
}
