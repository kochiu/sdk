package com.sztx.mall.adapter.icbc.model.businessModel;

import com.sztx.mall.adapter.common.JaxbTimeAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/4/28
 * Time : 17:18
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCOrderDetail {

    @XmlElement(name = "order_id")
    private String orderId;
    @XmlElement(name = "order_modify_time")
    @XmlJavaTypeAdapter(JaxbTimeAdapter.class)
    private Date orderModifyTime;
    @XmlElement(name = "order_status")
    private String orderStatus;
    @XmlElement(name = "order_buyer_remark")
    private String orderBuyerRemark;
    @XmlElement(name = "order_seller_remark")
    private String orderSellerRemark;
    @XmlElement(name = "order_buyer_id")
    private String orderBuyerId;
    @XmlElement(name = "order_buyer_username")
    private String orderBuyerUsername;
    @XmlElement(name = "order_buyer_name")
    private String orderBuyerName;
    @XmlElement(name = "order_create_time")
    @XmlJavaTypeAdapter(JaxbTimeAdapter.class)
    private Date orderCreateTime;
    @XmlElement(name = "order_amount")
    private String orderAmount;
    @XmlElement(name = "order_credit_amount")
    private String orderCreditAmount;
    @XmlElement(name = "credit_liquid_amount")
    private String creditLiquidAmount;
    @XmlElement(name = "order_channel")
    private String orderChannel;
    @XmlElement(name = "order_coupon_amount")
    private String orderCouponAmount;
    @XmlElement(name = "order_ins_num")
    private String orderInsNum;
    @XmlElement(name = "ins_fee_mer")
    private String insFeeMer;
    @XmlElement(name = "order_flag_color")
    private String orderFlagColor;
    @XmlElementWrapper(name="discounts")
    @XmlElement(name = "discount")
    private List<ICBCDiscount> discountList;
    @XmlElementWrapper(name="products")
    @XmlElement(name = "product")
    private List<ICBCOrderProduct> productList;

    private ICBCInvoice invoice;
    private ICBCPayment payment;
    private ICBCConsignee consignee;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderModifyTime() {
        return orderModifyTime;
    }

    public void setOrderModifyTime(Date orderModifyTime) {
        this.orderModifyTime = orderModifyTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderBuyerRemark() {
        return orderBuyerRemark;
    }

    public void setOrderBuyerRemark(String orderBuyerRemark) {
        this.orderBuyerRemark = orderBuyerRemark;
    }

    public String getOrderSellerRemark() {
        return orderSellerRemark;
    }

    public void setOrderSellerRemark(String orderSellerRemark) {
        this.orderSellerRemark = orderSellerRemark;
    }

    public String getOrderBuyerId() {
        return orderBuyerId;
    }

    public void setOrderBuyerId(String orderBuyerId) {
        this.orderBuyerId = orderBuyerId;
    }

    public String getOrderBuyerUsername() {
        return orderBuyerUsername;
    }

    public void setOrderBuyerUsername(String orderBuyerUsername) {
        this.orderBuyerUsername = orderBuyerUsername;
    }

    public String getOrderBuyerName() {
        return orderBuyerName;
    }

    public void setOrderBuyerName(String orderBuyerName) {
        this.orderBuyerName = orderBuyerName;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderCreditAmount() {
        return orderCreditAmount;
    }

    public void setOrderCreditAmount(String orderCreditAmount) {
        this.orderCreditAmount = orderCreditAmount;
    }

    public String getCreditLiquidAmount() {
        return creditLiquidAmount;
    }

    public void setCreditLiquidAmount(String creditLiquidAmount) {
        this.creditLiquidAmount = creditLiquidAmount;
    }

    public String getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
    }

    public String getOrderCouponAmount() {
        return orderCouponAmount;
    }

    public void setOrderCouponAmount(String orderCouponAmount) {
        this.orderCouponAmount = orderCouponAmount;
    }

    public String getOrderInsNum() {
        return orderInsNum;
    }

    public void setOrderInsNum(String orderInsNum) {
        this.orderInsNum = orderInsNum;
    }

    public String getInsFeeMer() {
        return insFeeMer;
    }

    public void setInsFeeMer(String insFeeMer) {
        this.insFeeMer = insFeeMer;
    }

    public String getOrderFlagColor() {
        return orderFlagColor;
    }

    public void setOrderFlagColor(String orderFlagColor) {
        this.orderFlagColor = orderFlagColor;
    }

    public List<ICBCDiscount> getDiscountList() {
        return discountList;
    }

    public void setDiscountList(List<ICBCDiscount> discountList) {
        this.discountList = discountList;
    }

    public List<ICBCOrderProduct> getProductList() {
        return productList;
    }

    public void setProductList(List<ICBCOrderProduct> productList) {
        this.productList = productList;
    }

    public ICBCInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(ICBCInvoice invoice) {
        this.invoice = invoice;
    }

    public ICBCPayment getPayment() {
        return payment;
    }

    public void setPayment(ICBCPayment payment) {
        this.payment = payment;
    }

    public ICBCConsignee getConsignee() {
        return consignee;
    }

    public void setConsignee(ICBCConsignee consignee) {
        this.consignee = consignee;
    }
}
