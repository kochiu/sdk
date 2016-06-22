package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.xmlModel.ICBCProductCMDResponseBody;
import com.sztx.mall.adapter.icbc.model.xmlModel.base.ICBCResponseHead;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/5/3
 * Time : 11:24
 */

@XmlRootElement(name="response")
public class ICBCProductCreateResponse {

    private ICBCResponseHead head;
    private ICBCProductCMDResponseBody body;

    public ICBCResponseHead getHead() {
        return head;
    }

    public void setHead(ICBCResponseHead head) {
        this.head = head;
    }

    public ICBCProductCMDResponseBody getBody() {
        return body;
    }

    public void setBody(ICBCProductCMDResponseBody body) {
        this.body = body;
    }
}
