/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic;

/**
 *
 * @author Julia
 */
public enum OperationTypesEnum {
    
   SURFACE_AREA_CALCULATION,
   VOLUME_CALCULATION;
    
    @Override
    public String toString() {
        switch (this) {
            case SURFACE_AREA_CALCULATION:
                return "Pole";
            case VOLUME_CALCULATION:
                return "Objętość";
            default:
                return null;
        }
    }
}