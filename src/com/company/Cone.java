package com.company;

public class Cone extends CircularShapes{
    double height;
    public Cone(double radius, double height){
        super("Cone",radius);
        this.height = height;
    }
    public double getVolume(){
        return (height / 3.0) * getArea();
    }
    public double getSurfaceArea(){
        return Math.PI * radius * (radius + Math.sqrt( Math.pow(height,2) + Math.pow(radius,2) ) );
    }
}
