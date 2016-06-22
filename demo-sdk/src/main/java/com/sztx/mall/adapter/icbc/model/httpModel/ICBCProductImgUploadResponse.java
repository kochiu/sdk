package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.xmlModel.ICBCProductImgUploadResponseBody;
import com.sztx.mall.adapter.icbc.model.xmlModel.base.ICBCResponseHead;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/4/27
 * Time : 16:41
 */

@XmlRootElement(name="response")
public class ICBCProductImgUploadResponse {

    private ICBCResponseHead head;
    private ICBCProductImgUploadResponseBody body;

    public ICBCResponseHead getHead() {
        return head;
    }

    public void setHead(ICBCResponseHead head) {
        this.head = head;
    }

    public ICBCProductImgUploadResponseBody getBody() {
        return body;
    }

    public void setBody(ICBCProductImgUploadResponseBody body) {
        this.body = body;
    }
}



