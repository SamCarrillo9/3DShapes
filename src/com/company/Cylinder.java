package com.company;

public class Cylinder extends CircularShapes {
    double height;
    public Cylinder(double radius, double height){
        super("Cylinder",radius);
        this.height = height;
    }
    public double getVolume(){
        return height * Math.PI * Math.pow(radius,2);
    }
    public double getSurfaceArea(){
        return 2 * Math.PI * radius * height + getArea();
    }
}
