package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/4/29
 * Time : 9:12
 */


@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCConsignee {

    @XmlElement(name="consignee_name")
    private String consigneeName;
    @XmlElement(name="consignee_province")
    private String consigneeProvince;
    @XmlElement(name="consignee_province_id")
    private String consigneeProvinceId;
    @XmlElement(name="consignee_city")
    private String consigneeCity;
    @XmlElement(name="consignee_city_id")
    private String consigneeCityId;
    @XmlElement(name="consignee_district")
    private String consigneeDistrict;
    @XmlElement(name="consignee_district_id")
    private String consigneeDistrictId;
    @XmlElement(name="consignee_address")
    private String consigneeAddress;
    @XmlElement(name="consignee_zipcode")
    private String consigneeZipCode;
    @XmlElement(name="consignee_total_address")
    private String consigneeTotalAddress;
    @XmlElement(name="consignee_mobile")
    private String consigneeMobile;
    @XmlElement(name="consignee_phone")
    private String consigneePhone;
    @XmlElement(name="consignee_time")
    private String consigneeTime;
    @XmlElement(name="consignee_idcardnum")
    private String consigneeIdcardNum;
    @XmlElement(name="consignee_email")
    private String consigneeEmail;
    private String merDefined1;
    private String merDefined2;
    private String merDefined3;

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeProvince() {
        return consigneeProvince;
    }

    public void setConsigneeProvince(String consigneeProvince) {
        this.consigneeProvince = consigneeProvince;
    }

    public String getConsigneeProvinceId() {
        return consigneeProvinceId;
    }

    public void setConsigneeProvinceId(String consigneeProvinceId) {
        this.consigneeProvinceId = consigneeProvinceId;
    }

    public String getConsigneeCity() {
        return consigneeCity;
    }

    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity;
    }

    public String getConsigneeCityId() {
        return consigneeCityId;
    }

    public void setConsigneeCityId(String consigneeCityId) {
        this.consigneeCityId = consigneeCityId;
    }

    public String getConsigneeDistrict() {
        return consigneeDistrict;
    }

    public void setConsigneeDistrict(String consigneeDistrict) {
        this.consigneeDistrict = consigneeDistrict;
    }

    public String getConsigneeDistrictId() {
        return consigneeDistrictId;
    }

    public void setConsigneeDistrictId(String consigneeDistrictId) {
        this.consigneeDistrictId = consigneeDistrictId;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getConsigneeZipCode() {
        return consigneeZipCode;
    }

    public void setConsigneeZipCode(String consigneeZipCode) {
        this.consigneeZipCode = consigneeZipCode;
    }

    public String getConsigneeTotalAddress() {
        return consigneeTotalAddress;
    }

    public void setConsigneeTotalAddress(String consigneeTotalAddress) {
        this.consigneeTotalAddress = consigneeTotalAddress;
    }

    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public String getConsigneeTime() {
        return consigneeTime;
    }

    public void setConsigneeTime(String consigneeTime) {
        this.consigneeTime = consigneeTime;
    }

    public String getConsigneeIdcardNum() {
        return consigneeIdcardNum;
    }

    public void setConsigneeIdcardNum(String consigneeIdcardNum) {
        this.consigneeIdcardNum = consigneeIdcardNum;
    }

    public String getConsigneeEmail() {
        return consigneeEmail;
    }

    public void setConsigneeEmail(String consigneeEmail) {
        this.consigneeEmail = consigneeEmail;
    }

    public String getMerDefined1() {
        return merDefined1;
    }

    public void setMerDefined1(String merDefined1) {
        this.merDefined1 = merDefined1;
    }

    public String getMerDefined2() {
        return merDefined2;
    }

    public void setMerDefined2(String merDefined2) {
        this.merDefined2 = merDefined2;
    }

    public String getMerDefined3() {
        return merDefined3;
    }

    public void setMerDefined3(String merDefined3) {
        this.merDefined3 = merDefined3;
    }
}
