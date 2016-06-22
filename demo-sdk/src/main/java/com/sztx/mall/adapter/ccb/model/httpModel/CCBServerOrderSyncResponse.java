package com.sztx.mall.adapter.ccb.model.httpModel;

import com.sztx.mall.adapter.ccb.model.httpModel.base.CCBServerResponseHead;
import com.sztx.mall.adapter.ccb.model.xmlModel.CCBServerOrderSyncResponseBody;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/5/17
 * Time : 9:10
 */

@XmlRootElement(name="response")
@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerOrderSyncResponse {
    private CCBServerResponseHead head;

    public CCBServerResponseHead getHead() {
        return head;
    }

    public void setHead(CCBServerResponseHead head) {
        this.head = head;
    }

}
