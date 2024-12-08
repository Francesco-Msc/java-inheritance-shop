package org.lessons.java.products;

import org.lessons.java.compositions.Processor;
import org.lessons.java.shop.Product;

public class Smartphone extends Product {
    private int imei;
    private int memory;
    private Processor processor;

    public Smartphone(int code, String name, String brand, double price, int vat, int imei, int memory, Processor processor){
        super(code, name, brand, price, vat);
        this.imei = imei;
        this.memory = memory;
        this.processor = processor;
    }

    public Processor getProcessor(){
        return processor;
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

    public void phoneDetails(){
        System.out.println("Nome: " + getName() + ", Marchio: " + getBrand() + ", Prezzo: " + getPrice() + ", IVA: " + getVat() + ", IMEI: " + imei + ", Memoria: " + memory);
        System.out.println("Processore: " + processor.getName() + ", Core: " + processor.getCores());
    }
}
