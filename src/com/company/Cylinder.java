/**
 * This class is a child of CircularShapes and implements methods for desired information on provided cylinder
 * depending on their height and radius.
 *
 * @authors Sam Carrillo, Ryan Fernandez, Rosemary McManus
 * @version 1.0
 * @since 2/11/23
 */

package com.company;

public class Cylinder extends CircularShapes {
    double height;

    /**
     * This constructor initializes the fields of radius and height based on specified data from the
     * parameters passed to the constructor and initializes name to cylinder.
     *
     * @param radius numerical value provided by the user of the radius of the Cylinder.
     * @param height numerical value provided by the user of the height of the Cylinder.
     */
    public Cylinder(double radius, double height) {
        super("Cylinder", radius);
        this.height = height;
    }

    /**
     * This method calculates the volume of a cylinder based on its measurements.
     *
     * @return the volume of the cylinder.
     */
    public double getVolume() {
        return height * Math.PI * Math.pow(radius, 2);
    }

    /**
     * This method calculates the surface area of a cylinder based on its measurements.
     *
     * @return the surface area of the cylinder.
     */
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * height + getArea();
    }
}
