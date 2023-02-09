package com.company;

public class TriangularPrism extends PrismShapes {
    public TriangularPrism(double base, double baseHeight, double height){
        super("Triangular Prism",base * baseHeight / 2, height);
    }
}
