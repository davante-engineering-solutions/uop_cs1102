/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravitycalculator;

import java.io.*;

/**
 *
 * @author strongdan
 */
public class GravityCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] arguments) {
        double  gravity =-9.81; // Earth's gravity in m/s^2

		double  initialVelocity = 0.0; // starting velocity of the object

		double  fallingTime = 10.0; // time in seconds that the object falls

		double  initialPosition = 1000.0; // Starting position in meters, the calculation will 		determine the ending position in meters
                    
		double  finalPosition = 0.5 * ((gravity) * (Math.pow(fallingTime, 2))) + initialVelocity + initialPosition;
                /* x(t) = 0.5at^2 + vit + xi --> indicates the position in meters of an object after falling for 10 seconds in Earths gravity */
		System.out.println("The object's position after " + fallingTime +" seconds is 			"+finalPosition + " m.");

	}
}

