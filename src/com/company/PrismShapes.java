package com.company;

public class PrismShapes implements Shapes3D{
    private String name;
    private double height;
    private double area;
    private int baseSides;

    public String getName(){
        return name;
    }
    public double getVolume(){
        return area * height;
    }
    public double getSurfaceArea(){
        return 0;
    }
}
