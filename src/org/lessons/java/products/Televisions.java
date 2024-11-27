package org.lessons.java.products;

import org.lessons.java.shop.Product;

public class Televisions extends Product{
    private int size;
    private boolean smartTv;

    public Televisions(int code, String name, String brand, double price, int vat, int size, boolean smartTv){
        super(code, name, brand, price, vat);
        this.size = size;
        this.smartTv = smartTv;
    }

    public int getSize(){
        return size;
    }
    public boolean getSmartTv(){
        return smartTv;
    }

    public void setSize(int size){
        this.size = size;
    }
    public void setSmartTv(boolean smartTv){
        this.smartTv = smartTv;
    }
}
