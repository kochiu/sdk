package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/4/28
 * Time : 18:05
 */


@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCActivity {

    @XmlElement(name="activity_id")
    private String activityId;
    @XmlElement(name="activity_type")
    private String activityType;
    @XmlElement(name="activity_name")
    private String activityName;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
}