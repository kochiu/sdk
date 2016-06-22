package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.xmlModel.ICBCProductBrandQueryResponseBody;
import com.sztx.mall.adapter.icbc.model.xmlModel.base.ICBCResponseHead;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/5/4
 * Time : 15:56
 */
@XmlRootElement(name="response")
public class ICBCProductBrandQueryResponse {

    private ICBCResponseHead head;

    private ICBCProductBrandQueryResponseBody body;

    public ICBCResponseHead getHead() {
        return head;
    }

    public void setHead(ICBCResponseHead head) {
        this.head = head;
    }

    public ICBCProductBrandQueryResponseBody getBody() {
        return body;
    }

    public void setBody(ICBCProductBrandQueryResponseBody body) {
        this.body = body;
    }
}
