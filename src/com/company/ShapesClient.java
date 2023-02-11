/**
 * This class is the client of the program which is responsible for creating objects to test
 * the uses provided by the various classes.
 *
 * @authors Sam Carrillo, Ryan Fernandez, Rosemary McManus
 * @version 1.0
 * @since 2/11/23
 */

package com.company;

public class ShapesClient {
    public static void main(String[] args) {
        Shapes3D cone = new Cone(5, 10);
        Shapes3D cylinder = new Cylinder(5, 10);
        Shapes3D sphere = new Sphere(5);
        Shapes3D cube = new PrismShapes(10, 10, 10);
        Shapes3D rectangularPrism = new PrismShapes(10, 20, 10);
        Shapes3D triangularPrism = new TriangularPrism(10, 20, 10);

        Shapes3D[] shapes = {cone, cylinder, sphere, cube, rectangularPrism, triangularPrism};

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("name: " + shapes[i].getName()
                    + "\nvolume: " + Math.round(shapes[i].getVolume())
                    + "\nsurface area: " + Math.round(shapes[i].getSurfaceArea()));
            System.out.println();
        }

    }
}
