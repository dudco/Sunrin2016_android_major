package com.example.dudco.web_sojun._1226;

import io.realm.RealmObject;
import io.realm.annotations.Index;

/**
 * Created by dudco on 2016. 12. 26..
 */

public class Food extends RealmObject {
    @Index
    private long id;

    private String name, price, image;

    public Food() {

    }

    public Food(String name, String price, String image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
