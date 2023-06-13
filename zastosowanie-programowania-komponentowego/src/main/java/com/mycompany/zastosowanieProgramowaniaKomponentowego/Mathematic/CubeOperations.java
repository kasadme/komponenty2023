/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic;

/**
 *
 * @author Julia
 */
public class CubeOperations implements SolidOfRevolutionOperations {

    @Override
    public Double calculateSurfaceArea(Double firstVal, Double secondVal) {
       return 6*Math.pow(firstVal,2);
    }

    @Override
    public Double calculateVolume(Double firstVal, Double secondVal) {
        return Math.pow(firstVal,3);
    }
    
}
