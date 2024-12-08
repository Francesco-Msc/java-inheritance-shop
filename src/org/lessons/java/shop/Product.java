package org.lessons.java.shop;

public class Product {
    private int code;
    private String name;
    private String brand;
    private double price;
    private int vat;
    
    //Constructor
    public Product(int code, String name, String brand, double price, int vat){
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;
    }

    //Getters
    public int getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public String getBrand(){
        return brand;
    }
    public double getPrice(){
        return price;
    }
    public int getVat(){
        return vat;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setVat(int vat){
        this.vat = vat;
    }

    //Price foramtted method
    public double formattedPrice() {
        return this.price + (this.price * this.vat / 100.0);
    }

    public String showDetails(){
        return "Nome: " + name + " , Marchio: " + brand + ", Prezzo: " + price + ", IVA: " + vat;
    }
}
