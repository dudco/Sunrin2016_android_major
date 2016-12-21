package com.example.dudco.web_sojun._1221;

/**
 * Created by dudco on 2016. 12. 21..
 */

public class StuData {
    private String name;
    private long id;

    public StuData(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
