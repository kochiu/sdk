package com.sztx.mall.adapter.icbc.model.xmlModel;

import com.sztx.mall.adapter.icbc.model.businessModel.ICBCLogsTemplate;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/4
 * Time : 15:28
 */
@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCProductLogisticsResponseBody {

    @XmlElementWrapper(name="logs_templates")
    @XmlElement(name = "logs_template")
    private List<ICBCLogsTemplate> logsTemplateList;

    public List<ICBCLogsTemplate> getLogsTemplateList() {
        return logsTemplateList;
    }

    public void setLogsTemplateList(List<ICBCLogsTemplate> logsTemplateList) {
        this.logsTemplateList = logsTemplateList;
    }
}
