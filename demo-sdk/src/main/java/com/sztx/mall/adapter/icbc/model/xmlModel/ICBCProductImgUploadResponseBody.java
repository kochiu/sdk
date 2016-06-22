package com.sztx.mall.adapter.icbc.model.xmlModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/5/3
 * Time : 17:45
 */
@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCProductImgUploadResponseBody {

    @XmlElement(name = "img_id")
    private String imgId;

    @XmlElement(name = "img_name")
    private String imgName;

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
}
