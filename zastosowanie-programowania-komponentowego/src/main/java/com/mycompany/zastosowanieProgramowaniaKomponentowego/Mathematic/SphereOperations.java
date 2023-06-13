/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic;

/**
 *
 * @author Julia
 */
public class SphereOperations implements SolidOfRevolutionOperations{
    
    
    @Override
    public Double calculateSurfaceArea(Double radius, Double height) {
        return 4*calculateCircleArea(radius);
    }

    @Override
    public Double calculateVolume(Double radius, Double height) {
        return 4.0/3.0 * Math.PI * Math.pow(radius,3);
    }
  
    private Double calculateCircleArea(Double radius){
        return Math.PI * Math.pow(radius,2);
    }

}
