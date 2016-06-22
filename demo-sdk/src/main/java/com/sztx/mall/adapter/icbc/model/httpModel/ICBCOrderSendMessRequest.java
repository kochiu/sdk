package com.sztx.mall.adapter.icbc.model.httpModel;

import java.util.Date;
import java.util.List;

import com.sztx.mall.adapter.icbc.model.businessModel.ICBCSendMessageProduct;
import com.sztx.mall.adapter.icbc.model.httpModel.base.ICBCRequest;

/**
 * User : LiuKe
 * Date : 2016/4/23
 * Time : 17:42
 */
public class ICBCOrderSendMessRequest extends ICBCRequest{

    private String orderId;
    private Date shippingTime;
    private String logisticsCompany;
    private String shippingCode;
    private String shippingNum;
    private String notes;
    private List<ICBCSendMessageProduct> productList;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Date shippingTime) {
        this.shippingTime = shippingTime;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public String getShippingNum() {
        return shippingNum;
    }

    public void setShippingNum(String shippingNum) {
        this.shippingNum = shippingNum;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<ICBCSendMessageProduct> getProductList() {
        return productList;
    }

    public void setProductList(List<ICBCSendMessageProduct> productList) {
        this.productList = productList;
    }
}
