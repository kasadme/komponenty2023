/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zastosowanieProgramowaniaKomponentowego.Components.Calculator;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

/**
 *
 * @author Julia
 */
public interface Calculator {
    public void switchLastTF();
    public void resetParametersTF();
    public String getFirstTFPlaceholder();
    public String getSecondTFPlaceholder();
    public JTextField getLastTF();
    public void setCalculatorType(String type);
    
    public void showHeightAndRadiusPlaceHolders(Boolean showPlaceHolders);
    public void setTitleColor(Color color);
    public void setNumberOfDecimals(Integer numberOfDecimals);
    public void setTitleFont(Font font);
    public void setResultAlignement(int alignement);

    public void showResultPlaceHolder(boolean showResult);

    
}
