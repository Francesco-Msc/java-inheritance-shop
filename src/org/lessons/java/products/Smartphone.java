package org.lessons.java.products;

import org.lessons.java.shop.Product;

public class Smartphone extends Product {
    private int imei;
    private int memory;

    public Smartphone(int code, String name, String brand, double price, int vat, int imei, int memory){
        super(code, name, brand, price, vat);
        this.imei = imei;
        this.memory = memory;
    }

    public int getImei(){
        return imei;
    }
    public int getMemory(){
        return memory;
    }

    public void setImei(int imei){
        this.imei = imei;
    }
    public void setMemory(int memory){
        this.memory = memory;
    }
}
