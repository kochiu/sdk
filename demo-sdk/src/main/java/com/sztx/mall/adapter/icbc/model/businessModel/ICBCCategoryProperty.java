package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/4
 * Time : 16:55
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCCategoryProperty {

    @XmlElement(name="prop_id")
    private String propId;
    @XmlElement(name="prop_name")
    private String propName;
    @XmlElement(name="prop_value_id")
    private String propValueId;
    @XmlElement(name="prop_value_name")
    private String propValueName;
    @XmlElement(name="is_sale")
    private String isSale;
    @XmlElement(name="is_edit")
    private String isEdit;
    @XmlElement(name="is_must")
    private String isMust;
    @XmlElement(name="is_color")
    private String isColor;
    @XmlElementWrapper(name="prop_value_enums")
    @XmlElement(name="prop_value_enum")
    private List<ICBCPropValueEnum> propValueEnumList;

    public String getPropId() {
        return propId;
    }

    public void setPropId(String propId) {
        this.propId = propId;
    }

    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    public String getPropValueId() {
        return propValueId;
    }

    public void setPropValueId(String propValueId) {
        this.propValueId = propValueId;
    }

    public String getPropValueName() {
        return propValueName;
    }

    public void setPropValueName(String propValueName) {
        this.propValueName = propValueName;
    }

    public String getIsSale() {
        return isSale;
    }

    public void setIsSale(String isSale) {
        this.isSale = isSale;
    }

    public String getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(String isEdit) {
        this.isEdit = isEdit;
    }

    public String getIsMust() {
        return isMust;
    }

    public void setIsMust(String isMust) {
        this.isMust = isMust;
    }

    public String getIsColor() {
        return isColor;
    }

    public void setIsColor(String isColor) {
        this.isColor = isColor;
    }

    public List<ICBCPropValueEnum> getPropValueEnumList() {
        return propValueEnumList;
    }

    public void setPropValueEnumList(List<ICBCPropValueEnum> propValueEnumList) {
        this.propValueEnumList = propValueEnumList;
    }
}
