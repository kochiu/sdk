package com.sztx.mall.adapter.ccb.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 10:50
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerSkuStoreQuerySku {
    //商户商品SKU编号	varchar / 50	可空
    @XmlElement(name = "sku_id")
    private String skuId;
    //商户商品编号	varchar / 50	可空
    @XmlElement(name = "pro_id")
    private String proId;
    //地区编码	varchar / 8	可空
    @XmlElement(name = "area_id")
    private String areaId;

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

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }
}
