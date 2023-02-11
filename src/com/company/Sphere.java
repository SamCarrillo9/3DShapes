/**
 * This  class is a child of CircularShapes and implements methods for desired information on provided radial
 * measurements of a sphere.
 *
 * @authors Sam Carrillo, Ryan Fernandez, Rosemary McManus
 * @version 1.0
 * @since 2/11/23
 */

package com.company;

public class Sphere extends CircularShapes {

    /**
     * This constructor initializes the field of radius based on specified data from a parameter
     * passed to the constructor and initializes name to Sphere.
     *
     * @param radius numerical value provided by the user of the radius of the Sphere.
     */
    public Sphere(double radius) {
        super("Sphere", radius);
    }

    /**
     * This method calculates the volume of a sphere based on its measurements.
     *
     * @return the volume of the sphere.
     */
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * This method calculates the surface area of a sphere based on its measurements.
     *
     * @return the surface area of the sphere.
     */
    public double getSurfaceArea() {
        return 4.0 * getArea();
    }
}
