package com.example.dudco.web_sojun._1222.List1;

/**
 * Created by dudco on 2016. 12. 22..
 */

public class Data {
    private String name, p_num;
    private int image;

    public Data(String name, String p_num, int image) {
        this.name = name;
        this.p_num = p_num;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getP_num() {
        return p_num;
    }

    public void setP_num(String p_num) {
        this.p_num = p_num;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
