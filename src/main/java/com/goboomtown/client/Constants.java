package com.goboomtown.client;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * Created by jd on 3/15/2016.
 */
public class Constants {
    static final String TOKEN = "__API_TOKEN__";
    static final String KEY = "__API_SECRET_KEY__";

    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
    public static final DateFormat DATE_FORMAT_API = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final DateFormat DATE_FORMAT_DISPLAY = new SimpleDateFormat("M/d/yyyy h:mm:ss a");

    static {
        DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
        DATE_FORMAT_API.setTimeZone(TimeZone.getDefault());
    }
}
