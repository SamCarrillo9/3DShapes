package com.company;

public class PrismShapes implements Shapes3D {
    private String name;
    private double height;
    private double baseArea;

    public PrismShapes(String name, double baseArea, double height){
        this.name = name;
        this.baseArea = baseArea;
        this.height = height;
    }
    public String getName(){
        return name;
    }
    public double getVolume(){
        return baseArea * height;
    }
    public double getSurfaceArea(){
        return 0;
    }
}
