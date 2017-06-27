package com.folkcat.learnspringboot.bean;

/**
 * Created by Tamas on 2017/6/27.
 */
public class GlobalError {
    private String url;
    private String exception;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
}
