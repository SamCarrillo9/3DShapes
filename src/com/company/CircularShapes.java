package com.company;


public abstract class CircularShapes implements Shapes3D {
    protected String name;
    protected double radius;

    public CircularShapes(String name, double radius){
        this.name = name;
        this.radius = radius;
    }

    public String getName(){
        return name;
    }
    public double getVolume(){
        return -1;
    }
    public double getSurfaceArea(){
        return -1;
    }
    protected double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
}
