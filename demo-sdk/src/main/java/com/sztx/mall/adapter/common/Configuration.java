package com.sztx.mall.adapter.common;

import java.util.ResourceBundle;

/**
 * User : LiuKe
 * Date : 2016/1/18
 * Time : 19:01
 */
public class Configuration {
    private static Object lock = new Object();
    private static Configuration config = null;
    private static ResourceBundle rb = null;
    private static final String CONFIG_FILE = "merchantConfig";

    private Configuration() {
        rb = ResourceBundle.getBundle(CONFIG_FILE);
    }
    public static Configuration getInstance() {
        synchronized(lock) {
            if(null == config) {
                config = new Configuration();
            }
        }
        return (config);
    }
    public String getValue(String key) {
        return (rb.getString(key));
    }
}
