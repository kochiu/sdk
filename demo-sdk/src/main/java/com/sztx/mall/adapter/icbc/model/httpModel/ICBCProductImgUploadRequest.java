package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.httpModel.base.ICBCRequest;

/**
 * User : LiuKe
 * Date : 2016/4/27
 * Time : 16:40
 */
public class ICBCProductImgUploadRequest extends ICBCRequest{

    private String imgFile;
    private String imgCategoryId;

    public String getImgFile() {
        return imgFile;
    }

    public void setImgFile(String imgFile) {
        this.imgFile = imgFile;
    }

    public String getImgCategoryId() {
        return imgCategoryId;
    }

    public void setImgCategoryId(String imgCategoryId) {
        this.imgCategoryId = imgCategoryId;
    }
}
