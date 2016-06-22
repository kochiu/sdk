package com.sztx.mall.adapter.ccb.model.xmlModel;

import com.sztx.mall.adapter.ccb.model.businessModel.CCBServerSendOrderRequestSku;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/12
 * Time : 11:02
 */

@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerSendOrderRequestBody {
    //订单编号	char / 20	非空
    @XmlElement(name = "order_id")
    private String orderId;
    //订单失效时间	Date	非空	订单失效时间，由中国建设银行善融商务个人商城提供订单失效时间
    @XmlElement(name = "order_timeout")
    private String orderTimeout;
    //收货人地区编码	char / 8	非空	精确到区一级地区代码
    @XmlElement(name = "area_id")
    private String areaId;

    //订购商品信息
    @XmlElement(name = "sku")
    private List<CCBServerSendOrderRequestSku> skuList;

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

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public List<CCBServerSendOrderRequestSku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<CCBServerSendOrderRequestSku> skuList) {
        this.skuList = skuList;
    }
}
