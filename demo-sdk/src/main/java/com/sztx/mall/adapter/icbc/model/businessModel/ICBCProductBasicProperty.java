package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/4/29
 * Time : 17:17
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCProductBasicProperty {

    @XmlElement(name="basic_prop_id")
    private String basicPropId;
    @XmlElement(name="basic_prop_name")
    private String basicPropName;
    @XmlElement(name="basic_prop_value")
    private String basicPropValue;
    @XmlElement(name="is_custom")
    private String isCustom;

    public String getBasicPropId() {
        return basicPropId;
    }

    public void setBasicPropId(String basicPropId) {
        this.basicPropId = basicPropId;
    }

    public String getBasicPropName() {
        return basicPropName;
    }

    public void setBasicPropName(String basicPropName) {
        this.basicPropName = basicPropName;
    }

    public String getBasicPropValue() {
        return basicPropValue;
    }

    public void setBasicPropValue(String basicPropValue) {
        this.basicPropValue = basicPropValue;
    }

    public String getIsCustom() {
        return isCustom;
    }

    public void setIsCustom(String isCustom) {
        this.isCustom = isCustom;
    }
}
