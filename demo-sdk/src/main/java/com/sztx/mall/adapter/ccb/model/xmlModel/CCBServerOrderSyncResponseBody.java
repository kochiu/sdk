package com.sztx.mall.adapter.ccb.model.xmlModel;

import com.sztx.mall.adapter.ccb.model.businessModel.CCBServerSkuStock;
import com.sztx.mall.adapter.common.JaxbTimeAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/17
 * Time : 9:10
 */


@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerOrderSyncResponseBody {
    //订单编号	char / 20	非空
    @XmlElement(name = "order_id")
    private String orderId;

    //订单失效时间	Date	非空
    @XmlElement(name = "order_timeout")
    @XmlJavaTypeAdapter(JaxbTimeAdapter.class)
    private Date orderTimeout;

    //商品库存信息sku可重复（失败报文是返回库存信息）
    @XmlElement(name = "sku")
    private List<CCBServerSkuStock> skuList;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTimeout() {
        return orderTimeout;
    }

    public void setOrderTimeout(Date orderTimeout) {
        this.orderTimeout = orderTimeout;
    }

    public List<CCBServerSkuStock> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<CCBServerSkuStock> skuList) {
        this.skuList = skuList;
    }
}
