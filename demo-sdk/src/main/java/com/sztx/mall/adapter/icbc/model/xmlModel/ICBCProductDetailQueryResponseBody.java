package com.sztx.mall.adapter.icbc.model.xmlModel;

import com.sztx.mall.adapter.icbc.model.businessModel.ICBCOrderDetail;
import com.sztx.mall.adapter.icbc.model.businessModel.ICBCProductDetail;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 17:52
 */

@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCProductDetailQueryResponseBody {

    @XmlElementWrapper(name="products")
    @XmlElement(name = "product")
    private List<ICBCProductDetail> productDetailList;

    public List<ICBCProductDetail> getProductDetailList() {
        return productDetailList;
    }

    public void setProductDetailList(List<ICBCProductDetail> productDetailList) {
        this.productDetailList = productDetailList;
    }
}
