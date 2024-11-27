package org.lessons.java.products;

import org.lessons.java.shop.Product;

public class Headphones extends Product {
    private String color;
    private boolean cabled;

    public Headphones(int code, String name, String brand, double price, int vat, String color, boolean cabled){
        super(code, name, brand, price, vat);
        this.color = color;
        this.cabled = cabled;
    }

    public String getColor(){
        return color;
    }
    public boolean getCabled(){
        return cabled;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setCabled(boolean cabled){
        this.cabled = cabled;
    }
}
