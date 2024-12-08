package org.lessons.java.compositions;

public class Screen {
    private String name;
    private int hz;

    public Screen(String name, int hz){
        this.name = name;
        this.hz = hz;
    }

    public String getName(){
        return name;
    }

    public int getHz(){
        return hz;
    }
}
