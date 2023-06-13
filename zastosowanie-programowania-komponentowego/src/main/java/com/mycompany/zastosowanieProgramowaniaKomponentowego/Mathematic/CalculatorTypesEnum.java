/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic;

import org.jcp.xml.dsig.internal.dom.Utils;

/**
 *
 * @author Julia
 */
public enum CalculatorTypesEnum {
    
   SPHERE,
   CYLINDER,
   CUBE;
   
    @Override
    public String toString() {
        switch (this) {
            case SPHERE:
                return "Kula";
            case CYLINDER:
                return "Walec";
            case CUBE:
                return "Szescian";
            default:
                return null;
        }
    }
    
}