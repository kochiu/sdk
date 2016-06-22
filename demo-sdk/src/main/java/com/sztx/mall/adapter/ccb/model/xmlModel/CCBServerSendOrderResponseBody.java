package com.sztx.mall.adapter.ccb.model.xmlModel;

import com.sztx.mall.adapter.ccb.model.businessModel.CCBServerSkuStock;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/12
 * Time : 15:50
 */

@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerSendOrderResponseBody {

    //订单编号	char / 20	非空
    @XmlElement(name = "order_id")
    private String orderId;
    //订单失效时间	Date	非空
    @XmlElement(name = "order_timeout")
    private String orderTimeout;

    //商品库存信息sku可重复
    @XmlElement(name = "sku")
    private List<CCBServerSkuStock> skuList;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderTimeout() {
        return orderTimeout;
    }

    public void setOrderTimeout(String orderTimeout) {
        this.orderTimeout = orderTimeout;
    }

    public List<CCBServerSkuStock> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<CCBServerSkuStock> skuList) {
        this.skuList = skuList;
    }
}
