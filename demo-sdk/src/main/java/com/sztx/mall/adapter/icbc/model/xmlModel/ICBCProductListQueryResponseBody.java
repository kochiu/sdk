package com.sztx.mall.adapter.icbc.model.xmlModel;

import com.sztx.mall.adapter.icbc.model.businessModel.ICBCProduct;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 16:29
 */

@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCProductListQueryResponseBody {

    @XmlElementWrapper(name="products")
    @XmlElement(name = "product")
    private List<ICBCProduct> productList;

    public List<ICBCProduct> getProductList() {
        return productList;
    }

    public void setProductList(List<ICBCProduct> productList) {
        this.productList = productList;
    }
}
