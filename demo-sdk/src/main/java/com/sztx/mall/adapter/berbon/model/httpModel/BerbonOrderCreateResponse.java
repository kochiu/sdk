package com.sztx.mall.adapter.berbon.model.httpModel;

import com.alibaba.fastjson.annotation.JSONField;
import com.sztx.mall.adapter.berbon.model.resultModel.BerbonOrderCreateResult;

/**
 * User : LiuKe
 * Date : 2016/5/17
 * Time : 16:06
 */
public class BerbonOrderCreateResponse {
    private String code;
    private String description;
    private String success;
    private Integer iTotalDisplayRecords;
    @JSONField(name="resultMap")
    private BerbonOrderCreateResult result;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Integer getiTotalDisplayRecords() {
        return iTotalDisplayRecords;
    }

    public void setiTotalDisplayRecords(Integer iTotalDisplayRecords) {
        this.iTotalDisplayRecords = iTotalDisplayRecords;
    }

    public BerbonOrderCreateResult getResult() {
        return result;
    }

    public void setResult(BerbonOrderCreateResult result) {
        this.result = result;
    }
}
