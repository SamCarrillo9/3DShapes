/**
 * This  class is a child of Shapes3D and implements methods for desired information on provided prism shapes
 * depending on their height, length and width.
 *
 * @authors Sam Carrillo, Ryan Fernandez, Rosemary McManus
 * @version 1.0
 * @since 2/11/23
 */

package com.company;

public class PrismShapes implements Shapes3D {
    private String name;
    private double height;
    private double length;
    private double width;

    /**
     * This constructor initializes the fields of width, length and height based on specified data from
     * the parameters passed to the constructor.
     *
     * @param width  numerical value of the width of triangular prism.
     * @param length numerical value of the length of triangular prism.
     * @param height numerical value of the height of triangular prism.
     */
    public PrismShapes(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
        if(width == length && height == length){
            name = "Cube";
        } else {
            name = "Rectangular Prism";
        }
    }

    /**
     * This method is used to provide the name of the prism to the user.
     *
     * @return the name of the prism shape.
     */
    public String getName() {
        return name;
    }

    /**
     * This method is used to calculate the volume of the prism.
     *
     * @return the volume of the prism.
     */
    public double getVolume() {
        return length * width * height;
    }

    /**
     * This method is used to calculate the surface area of the prism
     *
     * @return the surface area of the prism.
     */
    public double getSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
}
