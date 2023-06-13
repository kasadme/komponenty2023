/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.zastosowanieProgramowaniaKomponentowego.Components.Calculator;

import com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic.CalculatorTypesEnum;
import java.awt.Color;
import java.awt.Font;


/**
 *
 * @author Julia
 */
public class CalculatorPanel extends javax.swing.JPanel{

    Calculator calculator;
    
    public CalculatorPanel() {
        initComponents();
        calculator = solidCalculator1;
    }

    public Calculator getCurrentCalculator(){
        return calculator;
    }
    
    public void showResultPlaceHolder(boolean showResult) {
        calculator.showResultPlaceHolder(showResult);
    }

    
    public void showHeightAndRadiusPlaceHolders(Boolean showPlaceHolders){
        calculator.showHeightAndRadiusPlaceHolders(showPlaceHolders);
    }
    
    public void setTitleColor(Color color){
        calculator.setTitleColor(color);
    }
    
    public void setNumberOfDecimals(Integer numberOfDecimals){
        calculator.setNumberOfDecimals(numberOfDecimals);
    };
    
    public void setTitleFont(Font font){
        calculator.setTitleFont(font);
        repaint();
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calcType = new javax.swing.JComboBox<>();
        solidCalculator1 = new com.mycompany.zastosowanieProgramowaniaKomponentowego.Components.Calculator.SolidCalculator();

        calcType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Walec", "Kula", "Szescian" }));
        calcType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(solidCalculator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(calcType, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calcType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(solidCalculator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void calcTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcTypeActionPerformed
        if(calcType.getSelectedItem().equals(CalculatorTypesEnum.CYLINDER.toString())){
            calculator = solidCalculator1;
            calculator.setCalculatorType(CalculatorTypesEnum.CYLINDER.toString());

            this.repaint();

        }else if(calcType.getSelectedItem().equals(CalculatorTypesEnum.SPHERE.toString())){
            calculator.setCalculatorType(CalculatorTypesEnum.SPHERE.toString());
            this.repaint();
            
        }else if(calcType.getSelectedItem().equals(CalculatorTypesEnum.CUBE.toString())){
            calculator.setCalculatorType(CalculatorTypesEnum.CUBE.toString());
            this.repaint();
        }

//        else if(calcType.getSelectedItem().equals(CalculatorTypesEnum.SPHERE.toString())){
//            calculator = sphereCalculator;
//            sphereCalculator.setVisible(true);
//            cylinderCalculator.setVisible(false);
//
////            this.add(sphereCalculator);
////            this.remove(cylinderCalculator);
//            this.repaint();
//        }
    }//GEN-LAST:event_calcTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> calcType;
    private com.mycompany.zastosowanieProgramowaniaKomponentowego.Components.Calculator.SolidCalculator solidCalculator1;
    // End of variables declaration//GEN-END:variables

    public void setResultAlignement(Integer alignement) {
        calculator.setResultAlignement(alignement);
    }

 

}
