package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.httpModel.base.ICBCRequest;

import java.util.Date;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 16:17
 */
public class ICBCProductListQueryRequest extends ICBCRequest{

    private Date createStartTime;
    private Date createEndTime;
    private Date modifyTimeFrom;
    private Date modifyTimeTo;
    private Date putTimeFrom;
    private Date putTimeTo;
    private String productStatus;

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

    public Date getPutTimeFrom() {
        return putTimeFrom;
    }

    public void setPutTimeFrom(Date putTimeFrom) {
        this.putTimeFrom = putTimeFrom;
    }

    public Date getPutTimeTo() {
        return putTimeTo;
    }

    public void setPutTimeTo(Date putTimeTo) {
        this.putTimeTo = putTimeTo;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }
}
