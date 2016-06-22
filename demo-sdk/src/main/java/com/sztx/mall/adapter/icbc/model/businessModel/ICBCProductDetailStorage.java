package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 17:01
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCProductDetailStorage {

    @XmlElement(name = "logstor_id")
    private String logstorId;
    @XmlElement(name = "product_sku_id")
    private String productSkuId;
    @XmlElement(name = "prod_sku_log_sto")
    private String prodSkuLogSto;

    public String getLogstorId() {
        return logstorId;
    }

    public void setLogstorId(String logstorId) {
        this.logstorId = logstorId;
    }

    public String getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(String productSkuId) {
        this.productSkuId = productSkuId;
    }

    public String getProdSkuLogSto() {
        return prodSkuLogSto;
    }

    public void setProdSkuLogSto(String prodSkuLogSto) {
        this.prodSkuLogSto = prodSkuLogSto;
    }
}
