package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/4
 * Time : 16:05
 */
@XmlAccessorType(XmlAccessType.FIELD)

public class ICBCCategory {

    @XmlElement(name="cat_id")
    private String catId;
    @XmlElement(name="cat_name")
    private String catName;
    @XmlElement(name="parent_cat_id")
    private String parentCatId;
    @XmlElement(name="parent_cat_name")
    private String parentCatName;
    @XmlElement(name="super_cat_id")
    private String superCatId;
    @XmlElement(name="super_cat_name")
    private String superCatName;
    @XmlElementWrapper(name="brands")
    @XmlElement(name="brand")
    private List<ICBCBrand> brandList;
    @XmlElementWrapper(name="properties")
    @XmlElement(name="property")
    private List<ICBCCategoryProperty> categoryPropertyList;
    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getParentCatId() {
        return parentCatId;
    }

    public void setParentCatId(String parentCatId) {
        this.parentCatId = parentCatId;
    }

    public String getParentCatName() {
        return parentCatName;
    }

    public void setParentCatName(String parentCatName) {
        this.parentCatName = parentCatName;
    }

    public String getSuperCatId() {
        return superCatId;
    }

    public void setSuperCatId(String superCatId) {
        this.superCatId = superCatId;
    }

    public String getSuperCatName() {
        return superCatName;
    }

    public void setSuperCatName(String superCatName) {
        this.superCatName = superCatName;
    }

    public List<ICBCBrand> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<ICBCBrand> brandList) {
        this.brandList = brandList;
    }

    public List<ICBCCategoryProperty> getCategoryPropertyList() {
        return categoryPropertyList;
    }

    public void setCategoryPropertyList(List<ICBCCategoryProperty> categoryPropertyList) {
        this.categoryPropertyList = categoryPropertyList;
    }
}
