/**
 * This  class is a child of PrismShapes and implements methods for desired information on Triangular Prisms
 * depending on their provided width, length and height.
 *
 * @authors Sam Carrillo, Ryan Fernandez, Rosemary McManus
 * @version 1.0
 * @since 2/11/23
 */

package com.company;

public class TriangularPrism extends PrismShapes {

    private String name;

    /**
     * This constructor initializes the fields of width, length and height based on specified data from parameters
     * passed to the constructor and initializes name to Triangular Prism.
     *
     * @param width numerical value provided by the user of the width of the triangular prism.
     * @param length numerical value provided by the user of the length of the triangular prism.
     * @param height numerical value provided by the user of the height of the triangular prism.
     */
    public TriangularPrism(double width, double length, double height) {
        super(width, length, height);
        name = "Triangular Prism";
    }

    /**
     * This method is used to calculate the volume of the triangular prism.
     *
     * @return the volume of the triangular prism.
     */
    public double getVolume() {
        return super.getVolume()/2;
    }

    /**
     * This method is used to calculate the surface area of the triangular prism.
     *
     * @return the surface area of the triangular prism.
     */
    public double getSurfaceArea() {
        return super.getSurfaceArea()/2;
    }

}
