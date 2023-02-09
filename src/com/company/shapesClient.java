package com.company;



import com.company.CircularShapes.Cone;
import com.company.CircularShapes.Cylinder;
import com.company.CircularShapes.Sphere;
import com.company.PrismShapes.TriangularPrism;

import java.awt.*;

public class shapesClient {
    public static void main(String[] args) {
        Shapes3D cone = new Cone(5,10);
        Shapes3D cylinder = new Cylinder(5,10);
        Shapes3D sphere = new Sphere(5);

        Shapes3D triangularPrism = new TriangularPrism();

        Shapes3D[] shapes = new Shapes3D[4];
        shapes[0] = cone;
        shapes[1] = cylinder;
        shapes[2] = sphere;
        shapes[3] = triangularPrism;


    }
}
