package com.sztx.mall.adapter.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User : LiuKe
 * Date : 2016/4/28
 * Time : 15:59
 */
public class JaxbTimeAdapter extends XmlAdapter<String, Date> {
    static final String STANDARM_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    @Override
    public Date unmarshal(String v) throws Exception {
        if (v == null) {
            return null;
        }
        DateFormat format = new SimpleDateFormat(STANDARM_DATE_FORMAT);
        return format.parse(v);
    }

    @Override
    public String marshal(Date v) throws Exception {
        DateFormat format = new SimpleDateFormat(STANDARM_DATE_FORMAT);
        return format.format(v);
    }
}
