package com.sztx.mall.adapter.ccb.model.xmlModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 11:20
 */

@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerSkuStoreQueryResponseBody{

    @XmlElement(name = "stock")
    private String stock;

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
