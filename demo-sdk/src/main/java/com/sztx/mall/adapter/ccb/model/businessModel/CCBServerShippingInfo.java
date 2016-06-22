package com.sztx.mall.adapter.ccb.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/5/16
 * Time : 11:54
 */


@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerShippingInfo {

    //收货人	varchar/60	非空
    @XmlElement(name = "consignee_name")
    private String consigneeName;

    //收货地址省份	Varcahr/200	非空	示例值：广东省
    @XmlElement(name = "consignee_province")
    private String consigneeProvince;

    //收货地址城市	varchar/200	非空	示例值：广州市
    @XmlElement(name = "consignee_city")
    private String consigneeCity;

    //收货地址区县	varchar/200	非空	示例值：天河区
    @XmlElement(name = "consignee_county")
    private String consigneeCounty;

    //收货地址中用户输入的地址，一般是区以下的详细地址	varchar/255	非空	示例值：华景路xx号
    @XmlElement(name = "consignee_address")
    private String consigneeAddress;

    //收货地址中的邮编	varchar/6	非空
    @XmlElement(name = "consignee_zip")
    private String consigneeZip;

    //收货人手机	varchar/15
    @XmlElement(name = "consignee_mobile")
    private String consigneeMobile;

    //收货人固定电话	varchar/20
    @XmlElement(name = "consignee_phone")
    private String consigneePhone;

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

    public String getConsigneeCity() {
        return consigneeCity;
    }

    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity;
    }

    public String getConsigneeCounty() {
        return consigneeCounty;
    }

    public void setConsigneeCounty(String consigneeCounty) {
        this.consigneeCounty = consigneeCounty;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getConsigneeZip() {
        return consigneeZip;
    }

    public void setConsigneeZip(String consigneeZip) {
        this.consigneeZip = consigneeZip;
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
}
