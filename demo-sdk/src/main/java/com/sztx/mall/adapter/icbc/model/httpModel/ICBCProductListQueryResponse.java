package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.xmlModel.ICBCProductListQueryResponseBody;
import com.sztx.mall.adapter.icbc.model.xmlModel.base.ICBCResponseHead;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 16:17
 */

@XmlRootElement(name="response")
public class ICBCProductListQueryResponse {

    private ICBCResponseHead head;
    private ICBCProductListQueryResponseBody body;

    public ICBCResponseHead getHead() {
        return head;
    }

    public void setHead(ICBCResponseHead head) {
        this.head = head;
    }

    public ICBCProductListQueryResponseBody getBody() {
        return body;
    }

    public void setBody(ICBCProductListQueryResponseBody body) {
        this.body = body;
    }
}
