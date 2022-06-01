package com.example.proiect;

public class Item {
    String name;
    int imageDrawable;
    String price;

    public Item(String name,String price,int imageDrawable) {
        this.name = name;

        this.price=price;
        this.imageDrawable = imageDrawable;
    }

    public String getName() {
        return name;
    }

    public int getImageDrawable() {
        return imageDrawable;
    }

    public void setImageDrawable(int imageDrawable) {
        this.imageDrawable = imageDrawable;
    }

    public String getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setPrice(String price) {
        this.price = price;
    }
}
