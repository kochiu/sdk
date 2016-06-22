package com.sztx.mall.adapter.icbc.model.httpModel;


import com.sztx.mall.adapter.icbc.model.xmlModel.ICBCOrderListResponseBody;
import com.sztx.mall.adapter.icbc.model.xmlModel.base.ICBCResponseHead;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/4/19
 * Time : 15:06
 */

@XmlRootElement(name="response")
public class ICBCOrderListQueryResponse {

    private ICBCResponseHead head;
    private ICBCOrderListResponseBody body;

    public ICBCResponseHead getHead() {
        return head;
    }

    public void setHead(ICBCResponseHead head) {
        this.head = head;
    }

    public ICBCOrderListResponseBody getBody() {
        return body;
    }

    public void setBody(ICBCOrderListResponseBody body) {
        this.body = body;
    }
}
