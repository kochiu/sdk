package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/5/4
 * Time : 17:00
 */
@XmlAccessorType(XmlAccessType.FIELD)


public class ICBCPropValueEnum {

    @XmlElement(name="enum_id")
    private String enumId;
    @XmlElement(name="enum_name")
    private String enumName;

    public String getEnumId() {
        return enumId;
    }

    public void setEnumId(String enumId) {
        this.enumId = enumId;
    }

    public String getEnumName() {
        return enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }
}
