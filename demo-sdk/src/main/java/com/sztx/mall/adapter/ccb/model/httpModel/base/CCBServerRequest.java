package com.sztx.mall.adapter.ccb.model.httpModel.base;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/5/12
 * Time : 11:26
 */
@XmlRootElement(name="request")
public class CCBServerRequest {

    private CCBServerRequestHead head;

    public CCBServerRequestHead getHead() {
        return head;
    }

    public void setHead(CCBServerRequestHead head) {
        this.head = head;
    }
}
