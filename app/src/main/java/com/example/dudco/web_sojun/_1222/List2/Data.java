package com.example.dudco.web_sojun._1222.List2;

/**
 * Created by dudco on 2016. 12. 22..
 */

public class Data {
    private String name, kind;
    private int age;

    public Data(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
