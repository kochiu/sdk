package com.sztx.mall.adapter.ccb.model.businessModel;

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
 * Date : 2016/5/16
 * Time : 11:57
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerOrderInfo {
    //订单编号	char / 20	非空
    @XmlElement(name = "order_id")
    private String orderId;

    //订单备注	varchar / 255	可空
    @XmlElement(name = "order_memo")
    private String orderMemo;

    //订单状态	String/30	非空	WAIT_BUYER_PAY(等待买家付款) WAIT_SELLER_SEND_GOODS(等待卖家发货,即:买家已付款) WAIT_BUYER_CONFIRM_GOODS(等待买家确认收货,即:卖家已发货) TRADE_FINISHED(交易成功) TRADE_CLOSED(交易关闭)TRADE_CANCELLED (交易取消)ORDER_DELETED(订单删除)
    @XmlElement(name = "status")
    private String status;

    //购买者邮箱	varchar/120	非空
    @XmlElement(name = "buyer_email")
    private String buyerEmail;

    //购买者姓名	varchar/60	非空
    @XmlElement(name = "buyer_name")
    private String buyerName;

    //购买者用户名	Varchar/20	非空
    @XmlElement(name = "buyer_id")
    private String buyerId;

    //下单时间	date	非空	示例值：2012-07-30 12:23:34
    @XmlElement(name = "order_time")
    @XmlJavaTypeAdapter(JaxbTimeAdapter.class)
    private Date orderTime;

    //在线付款时间	date	非空	示例值：2012-07-30 12:23:34
    @XmlElement(name = "payment_time")
    @XmlJavaTypeAdapter(JaxbTimeAdapter.class)
    private Date paymentTime;

    //商品金额，等于订单中所有的商品的单价乘以数量之和	decimal/(10,2)	非空	（订单下所有商品的prod_price×prod_buy_amt值之和） + 订单运费delivery_fee
    //（订单下所有商品的(prod_price – prod_discount)×prod_buy_amt值之和）+ 订单运费delivery_fee-使用电子券的金额order_coupon-商户优惠merchant_discount，最后结果需大于等于0。小于0则结果计为0。
    @XmlElement(name = "order_prod_amt")
    private String orderProdAmt;

    //实际已付款金额	decimal/(10,2)	非空	用户实际付款的总金额。
    @XmlElement(name = "order_pay_amt")
    private String orderPayAmt;

    //电子券金额	decimal/(10,2)	非空	使用电子券的金额
    @XmlElement(name = "order_coupon")
    private String orderCoupon;

    //商户优惠金额	decimal/(10,2)	非空	商户优惠金额
    @XmlElement(name = "merchant_discount")
    private String merchantDiscount;

    //运费	decimal/(10,2)	非空	订单运费
    @XmlElement(name = "delivery_fee")
    private String deliveryFee;

    //收货人信息
    @XmlElement(name = "shipping_info")
    private CCBServerShippingInfo shippingInfo;

    //订单商品信息
    @XmlElementWrapper(name = "product_items")
    @XmlElement(name = "item")
    private List<CCBServerProductItem> productItemList;

    //发票信息
    @XmlElement(name = "invoice_info")
    private CCBServerInvoiceInfo invoiceInfo;




    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderMemo() {
        return orderMemo;
    }

    public void setOrderMemo(String orderMemo) {
        this.orderMemo = orderMemo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getOrderProdAmt() {
        return orderProdAmt;
    }

    public void setOrderProdAmt(String orderProdAmt) {
        this.orderProdAmt = orderProdAmt;
    }

    public String getOrderPayAmt() {
        return orderPayAmt;
    }

    public void setOrderPayAmt(String orderPayAmt) {
        this.orderPayAmt = orderPayAmt;
    }

    public String getOrderCoupon() {
        return orderCoupon;
    }

    public void setOrderCoupon(String orderCoupon) {
        this.orderCoupon = orderCoupon;
    }

    public String getMerchantDiscount() {
        return merchantDiscount;
    }

    public void setMerchantDiscount(String merchantDiscount) {
        this.merchantDiscount = merchantDiscount;
    }

    public String getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(String deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public CCBServerShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(CCBServerShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public List<CCBServerProductItem> getProductItemList() {
        return productItemList;
    }

    public void setProductItemList(List<CCBServerProductItem> productItemList) {
        this.productItemList = productItemList;
    }

    public CCBServerInvoiceInfo getInvoiceInfo() {
        return invoiceInfo;
    }

    public void setInvoiceInfo(CCBServerInvoiceInfo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }
}
