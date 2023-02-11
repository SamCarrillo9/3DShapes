/**
 * This abstract class is a child of Shapes3D and implements methods for desired information on Circular Shapes
 * depending on their specified radius and name.
 *
 * @authors Sam Carrillo, Ryan Fernandez, Rosemary McManus
 * @version 1.0
 * @since 2/11/23
 */
package com.company;

public abstract class CircularShapes implements Shapes3D {
    protected String name;
    protected double radius;

    /**
     * This constructor initializes the fields of name and radius based on specified data from the passed
     * parameters.
     * @param name contains an assortment of characters representing circular shapes name.
     * @param radius numerical value provided by the user of the radius of the circular shape.
     */
    public CircularShapes(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    /**
     * This method is used to provide the name of the circular shape to the user.
     * @return the name of the circular shape.
     */
    public String getName() {
        return name;
    }

    /**
     * This method is used to provide the volume of the circular shape to the user, however, the volume can only be
     * calculated based on a specified circular shaped and will not be fully calculated in this class.
     * @return returns void.
     */
    public double getVolume() {
        return -1;
    }

    /**
     * This method is used to provide the surface area of the circular shape to the user, however,
     * the surface area can only be calculated based on a specified circular shaped and will not
     * be fully calculated in this class.
     * @return returns void.
     */
    public double getSurfaceArea() {
        return -1;
    }

    /**
     * This method is used to provide the area of the circular shape to the user.
     * @return the area of the provided circular shape.
     */
    protected double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
