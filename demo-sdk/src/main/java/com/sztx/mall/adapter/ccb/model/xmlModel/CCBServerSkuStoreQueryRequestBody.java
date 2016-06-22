package com.sztx.mall.adapter.ccb.model.xmlModel;

import com.sztx.mall.adapter.ccb.model.businessModel.CCBServerSkuStoreQuerySku;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 10:37
 */

@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerSkuStoreQueryRequestBody {

    @XmlElement(name = "sku")
    private List<CCBServerSkuStoreQuerySku> skuList;

    public List<CCBServerSkuStoreQuerySku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<CCBServerSkuStoreQuerySku> skuList) {
        this.skuList = skuList;
    }
}
