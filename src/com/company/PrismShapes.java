package com.company;

public class PrismShapes implements Shapes3D{
    String name;
    double height;
    double area;
    int baseSides;

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
