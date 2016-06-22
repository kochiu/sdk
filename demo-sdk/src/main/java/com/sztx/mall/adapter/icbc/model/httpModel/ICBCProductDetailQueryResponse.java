package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.xmlModel.ICBCProductDetailQueryResponseBody;
import com.sztx.mall.adapter.icbc.model.xmlModel.base.ICBCResponseHead;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 17:50
 */
@XmlRootElement(name="response")
public class ICBCProductDetailQueryResponse {
    private ICBCResponseHead head;
    private ICBCProductDetailQueryResponseBody body;

    public ICBCResponseHead getHead() {
        return head;
    }

    public void setHead(ICBCResponseHead head) {
        this.head = head;
    }

    public ICBCProductDetailQueryResponseBody getBody() {
        return body;
    }

    public void setBody(ICBCProductDetailQueryResponseBody body) {
        this.body = body;
    }
}
