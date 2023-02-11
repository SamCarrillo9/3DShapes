/**
 * This interface sets requirements for the necessary methods to implement for any 3D shape.
 *
 * @authors Sam Carrillo, Ryan Fernandez, Rosemary McManus
 * @version 1.0
 * @since 2/11/23
 */

package com.company;

public interface Shapes3D {
    /**
     * This method's purpose is to provide the name of the 3D shape to the user.
     *
     * @return the name of the 3D shape.
     */
    public String getName();

    /**
     * This method's purpose is to calculate the volume of the 3D shape.
     *
     * @return the volume of the 3D shape.
     */
    public double getVolume();

    /**
     * This method's purpose is to calculate the surface area of the 3D shape.
     *
     * @return the surface area of the 3D shape.
     */
    public double getSurfaceArea();

}
