package com.sztx.mall.adapter.icbc.model.xmlModel;

import com.sztx.mall.adapter.icbc.model.businessModel.ICBCCategory;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/4
 * Time : 17:18
 */

@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)

public class ICBCCategoryAttrQueryResponseBody {
    @XmlElementWrapper(name="cats")
    @XmlElement(name = "cat")
    private List<ICBCCategory> categoryList;

    public List<ICBCCategory> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<ICBCCategory> categoryList) {
        this.categoryList = categoryList;
    }
}
