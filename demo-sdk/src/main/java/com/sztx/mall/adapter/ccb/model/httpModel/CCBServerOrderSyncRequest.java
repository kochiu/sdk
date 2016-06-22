package com.sztx.mall.adapter.ccb.model.httpModel;

import com.sztx.mall.adapter.ccb.model.httpModel.base.CCBServerRequestHead;
import com.sztx.mall.adapter.ccb.model.xmlModel.CCBServerOrderSyncRequestBody;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/5/16
 * Time : 11:17
 */
@XmlRootElement(name="request")
public class CCBServerOrderSyncRequest {
    private CCBServerRequestHead head;

    private CCBServerOrderSyncRequestBody body;

    public CCBServerRequestHead getHead() {
        return head;
    }

    public void setHead(CCBServerRequestHead head) {
        this.head = head;
    }

    public CCBServerOrderSyncRequestBody getBody() {
        return body;
    }

    public void setBody(CCBServerOrderSyncRequestBody body) {
        this.body = body;
    }
}
