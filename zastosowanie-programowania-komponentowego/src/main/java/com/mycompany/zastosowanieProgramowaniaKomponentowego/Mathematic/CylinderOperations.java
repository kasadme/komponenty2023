/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic;

/**
 *
 * @author Julia
 */
public class CylinderOperations{

    public static Double calculateSurfaceArea(Double height, Double radius) {
        return calculateCircleArea(radius) + calculateCircleLength(radius) * height;
    }

    public static Double calculateVolume(Double height, Double radius) {
        return calculateCircleArea(radius) * height;
    }

  
    private static Double calculateCircleArea(Double radius){
        return 2 * Math.PI * Math.pow(radius,2);
    }
    
    private static Double calculateCircleLength(Double radius){
        return 2 * Math.PI * radius;
    }
}
