package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.xmlModel.ICBCCategoryAttrQueryResponseBody;
import com.sztx.mall.adapter.icbc.model.xmlModel.base.ICBCResponseHead;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/5/4
 * Time : 16:49
 */

@XmlRootElement(name="response")
public class ICBCCategoryAttrQueryResponse {

    private ICBCResponseHead head;

    private ICBCCategoryAttrQueryResponseBody body;

    public ICBCResponseHead getHead() {
        return head;
    }

    public void setHead(ICBCResponseHead head) {
        this.head = head;
    }

    public ICBCCategoryAttrQueryResponseBody getBody() {
        return body;
    }

    public void setBody(ICBCCategoryAttrQueryResponseBody body) {
        this.body = body;
    }
}
