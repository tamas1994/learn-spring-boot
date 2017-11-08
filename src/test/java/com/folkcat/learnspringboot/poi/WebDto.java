package com.folkcat.learnspringboot.poi;

/**
 * Created by Tamas on 2017/11/8.
 */
public class WebDto {

    //网站名称
    private String name;

    //网址
    private String url;

    //日均访问量
    private Integer readCount;

    public WebDto(String name, String url, Integer readCount) {
        this.name = name;
        this.url = url;
        this.readCount = readCount;
    }

    @Override
    public String toString() {
        return "WebDto{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", readCount=" + readCount +
                '}';
    }
}