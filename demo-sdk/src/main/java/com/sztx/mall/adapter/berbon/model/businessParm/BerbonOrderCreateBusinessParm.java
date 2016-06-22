package com.sztx.mall.adapter.berbon.model.businessParm;

import com.sztx.mall.adapter.berbon.model.businessModel.BerbonAddrInfo;
import com.sztx.mall.adapter.berbon.model.businessModel.BerbonProduct;

import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/17
 * Time : 17:14
 */
public class BerbonOrderCreateBusinessParm {

    private Integer channelId;
    private String relateOrderId;
    private Integer orderState;
    private String callBackUrl;
    private String srcIp;
    private String srcChannel;
    private String goodsName;
    private String goodsDetail;
    private Integer amount;
    private Integer carriage;
    private Integer payAmount;
    private Integer discount;
    private String customer;
    private String customerRealName;
    private String customerNickName;
    private String deliveryType;
    private String leaveMsg;
    private BerbonAddrInfo addrInfo;

    private List<BerbonProduct> products;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getRelateOrderId() {
        return relateOrderId;
    }

    public void setRelateOrderId(String relateOrderId) {
        this.relateOrderId = relateOrderId;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }

    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public String getSrcChannel() {
        return srcChannel;
    }

    public void setSrcChannel(String srcChannel) {
        this.srcChannel = srcChannel;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getCarriage() {
        return carriage;
    }

    public void setCarriage(Integer carriage) {
        this.carriage = carriage;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomerRealName() {
        return customerRealName;
    }

    public void setCustomerRealName(String customerRealName) {
        this.customerRealName = customerRealName;
    }

    public String getCustomerNickName() {
        return customerNickName;
    }

    public void setCustomerNickName(String customerNickName) {
        this.customerNickName = customerNickName;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getLeaveMsg() {
        return leaveMsg;
    }

    public void setLeaveMsg(String leaveMsg) {
        this.leaveMsg = leaveMsg;
    }

    public BerbonAddrInfo getAddrInfo() {
        return addrInfo;
    }

    public void setAddrInfo(BerbonAddrInfo addrInfo) {
        this.addrInfo = addrInfo;
    }

    public List<BerbonProduct> getProducts() {
        return products;
    }

    public void setProducts(List<BerbonProduct> products) {
        this.products = products;
    }
}
