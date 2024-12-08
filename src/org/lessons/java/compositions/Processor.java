package org.lessons.java.compositions;

public class Processor {
    private String name;
    private int cores;

    public Processor(String name, int cores){
        this.name = name;
        this.cores = cores;
    }

    public String getName(){
        return name;
    }

    public int getCores(){
        return cores;
    }
}
