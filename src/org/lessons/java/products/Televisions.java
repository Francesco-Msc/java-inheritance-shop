package org.lessons.java.products;

import org.lessons.java.compositions.Screen;
import org.lessons.java.shop.Product;

public class Televisions extends Product{
    private int size;
    private boolean smartTv;
    private Screen screen;

    public Televisions(int code, String name, String brand, double price, int vat, int size, boolean smartTv, Screen screen){
        super(code, name, brand, price, vat);
        this.size = size;
        this.smartTv = smartTv;
        this.screen = screen;
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

    @Override
    public String showDetails(){
        return super.showDetails() + ", Dimensioni: " + size + ", Smart TV: " + smartTv + ", Schermo: " + screen.getName() + ", Refresh rate: " + screen.getHz() + " hz";
    }
}
