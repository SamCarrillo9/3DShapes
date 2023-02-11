/**
 * This  class is a child of CircularShapes and implements methods for desired information on provided cone
 * depending on its height and radius.
 *
 * @authors Sam Carrillo, Ryan Fernandez, Rosemary McManus
 * @version 1.0
 * @since 2/11/23
 */

package com.company;

public class Cone extends CircularShapes {
    double height;

    /**
     * This constructor initializes the fields of radius and height based on specified data passed to
     * the constructor and initializes name to cone.
     *
     * @param radius numerical value provided by the user of the radius of the cone.
     * @param height numerical value provided by the user of the height of the cone.
     */
    public Cone(double radius, double height) {
        super("Cone", radius);
        this.height = height;
    }

    /**
     * This method calculates the volume of a cone based on its measurements.
     *
     * @return the volume of the cone.
     */
    public double getVolume() {
        return (height / 3.0) * getArea();
    }

    /**
     * This method calculates the surface area of a cone based on its measurements.
     *
     * @return the surface area of the cone.
     */
    public double getSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }
}
