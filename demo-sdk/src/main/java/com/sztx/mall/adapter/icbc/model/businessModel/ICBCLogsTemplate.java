package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/4
 * Time : 15:06
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCLogsTemplate {

    @XmlElement(name="template_id")
    private String templateId;
    @XmlElement(name="template_name")
    private String templateName;
    @XmlElement(name="template_desc")
    private String templateDesc;
    @XmlElement(name="is_default")
    private String isDefault;
    @XmlElementWrapper(name="logs_rules")
    @XmlElement(name="logs_rule")
    private List<ICBCLogsRule> logsRuleList;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateDesc() {
        return templateDesc;
    }

    public void setTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public List<ICBCLogsRule> getLogsRuleList() {
        return logsRuleList;
    }

    public void setLogsRuleList(List<ICBCLogsRule> logsRuleList) {
        this.logsRuleList = logsRuleList;
    }
}
