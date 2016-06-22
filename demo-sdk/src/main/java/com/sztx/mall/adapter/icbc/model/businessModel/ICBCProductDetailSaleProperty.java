package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/5/11
 * Time : 9:04
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCProductDetailSaleProperty {
    @XmlElement(name = "sale_prop_name_id")
    private String salePropNameId;
    @XmlElement(name = "sale_prop_name")
    private String salePropName;
    @XmlElement(name = "sale_prop_value_id")
    private String salePropValueId;
    @XmlElement(name = "sale_prop_value")
    private String salePropValue;

    public String getSalePropNameId() {
        return salePropNameId;
    }

    public void setSalePropNameId(String salePropNameId) {
        this.salePropNameId = salePropNameId;
    }

    public String getSalePropName() {
        return salePropName;
    }

    public void setSalePropName(String salePropName) {
        this.salePropName = salePropName;
    }

    public String getSalePropValueId() {
        return salePropValueId;
    }

    public void setSalePropValueId(String salePropValueId) {
        this.salePropValueId = salePropValueId;
    }

    public String getSalePropValue() {
        return salePropValue;
    }

    public void setSalePropValue(String salePropValue) {
        this.salePropValue = salePropValue;
    }
}
