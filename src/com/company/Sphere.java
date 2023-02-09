package com.company;

public class Sphere extends CircularShapes {
    public Sphere(double radius){
        super("Sphere", radius);
    }
    public double getVolume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius,3);
    }
    public double getSurfaceArea(){
        return 4.0 * getArea();
    }
}
