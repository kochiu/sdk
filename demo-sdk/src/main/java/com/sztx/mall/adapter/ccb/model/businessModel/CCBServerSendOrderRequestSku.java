package com.sztx.mall.adapter.ccb.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/5/12
 * Time : 12:03
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerSendOrderRequestSku {

    //第三方平台商品sku编号	char / 50	可空
    @XmlElement(name = "sku_id")
    private String skuId;
    //第三方平台商品编号	char / 50	可空
    @XmlElement(name = "pro_id")
    private String proId;
    //购买数量	char / 10	非空
    @XmlElement(name = "amt")
    private String amt;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }
}
