package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.httpModel.base.ICBCRequest;

import java.util.Date;
/**
 * User : LiuKe
 * Date : 2016/4/19
 * Time : 15:17
 */
public class ICBCOrderListQueryRequest extends ICBCRequest {

    private Date createStartTime;
    private Date createEndTime;
    private Date modifyTimeFrom;
    private Date modifyTimeTo;
    private String orderStatus;

    public Date getCreateStartTime() {
        return createStartTime;
    }

    public void setCreateStartTime(Date createStartTime) {
        this.createStartTime = createStartTime;
    }

    public Date getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(Date createEndTime) {
        this.createEndTime = createEndTime;
    }

    public Date getModifyTimeFrom() {
        return modifyTimeFrom;
    }

    public void setModifyTimeFrom(Date modifyTimeFrom) {
        this.modifyTimeFrom = modifyTimeFrom;
    }

    public Date getModifyTimeTo() {
        return modifyTimeTo;
    }

    public void setModifyTimeTo(Date modifyTimeTo) {
        this.modifyTimeTo = modifyTimeTo;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
