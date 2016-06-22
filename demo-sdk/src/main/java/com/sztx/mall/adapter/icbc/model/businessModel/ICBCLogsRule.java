package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/5/4
 * Time : 15:11
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCLogsRule {

    @XmlElement(name="rule_mode")
    private String ruleMode;
    @XmlElement(name="rule_type")
    private String ruleType;
    @XmlElement(name="basic_unit")
    private String basicUnit;
    @XmlElement(name="basic_fee")
    private String basicFee;
    @XmlElement(name="add_unit")
    private String addUnit;
    @XmlElement(name="add_fee")
    private String addFee;
    @XmlElement(name="is_default")
    private String isDefault;

    public String getRuleMode() {
        return ruleMode;
    }

    public void setRuleMode(String ruleMode) {
        this.ruleMode = ruleMode;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public String getBasicUnit() {
        return basicUnit;
    }

    public void setBasicUnit(String basicUnit) {
        this.basicUnit = basicUnit;
    }

    public String getBasicFee() {
        return basicFee;
    }

    public void setBasicFee(String basicFee) {
        this.basicFee = basicFee;
    }

    public String getAddUnit() {
        return addUnit;
    }

    public void setAddUnit(String addUnit) {
        this.addUnit = addUnit;
    }

    public String getAddFee() {
        return addFee;
    }

    public void setAddFee(String addFee) {
        this.addFee = addFee;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
}
