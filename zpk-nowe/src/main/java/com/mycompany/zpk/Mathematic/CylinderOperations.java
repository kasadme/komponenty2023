/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic;

/**
 *
 * @author Julia
 */
public class CylinderOperations implements SolidOfRevolutionOperations{

    @Override
    public Double calculateSurfaceArea(Double height, Double radius) {
        return calculateCircleArea(radius) + calculateCircleLength(radius) * height;
    }

    @Override
    public Double calculateVolume(Double height, Double radius) {
        return calculateCircleArea(radius) * height;
    }

  
    private Double calculateCircleArea(Double radius){
        return 2 * Math.PI * Math.pow(radius,2);
    }
    
    private Double calculateCircleLength(Double radius){
        return 2 * Math.PI * radius;
    }
}
