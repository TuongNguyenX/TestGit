package com.example.githubtest.Model;

import android.media.Image;

public class Category {
    private int Image;
    private String Name;
    private String Price;


    public Category() {
    }

    public Category(int image, String name, String price) {
        Image = image;
        Name = name;
        Price = price;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
