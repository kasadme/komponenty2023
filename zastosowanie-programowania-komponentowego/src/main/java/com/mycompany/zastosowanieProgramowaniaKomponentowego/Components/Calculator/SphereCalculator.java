/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.zastosowanieProgramowaniaKomponentowego.Components.Calculator;

import com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic.CylinderOperations;
import com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic.OperationTypesEnum;
import com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic.SolidOfRevolutionOperations;
import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Julia
 */
public class SphereCalculator extends javax.swing.JPanel /*implements Calculator */{

    private Double height, radius;
    private Double result;
    private String titleText = "Walec";
    
    private String heightTFPlaceholder = "H";
    private String radiusTFPlaceholder = "r";
    
    private Boolean isHeightPlaceholderVisible = true ,isRadiusPlaceholderVisible = true;
    
    private final Color PLACEHOLDER_COLOR = Color.GRAY;
   
    private JTextField lastTF;
    
    private SolidOfRevolutionOperations cylinderOperations = new CylinderOperations();


    
    public SphereCalculator() {
        initComponents();
    }

     public void switchLastTF(){
        if(lastTF.equals(secondValueTF)) lastTF=firstValueTF;
        else if(lastTF.equals(firstValueTF)) lastTF=secondValueTF;
    }
    public void resetParametersTF(){
        if(isHeightPlaceholderVisible){
            firstValueTF.setText(heightTFPlaceholder);
            firstValueTF.setForeground(PLACEHOLDER_COLOR);
        }else
            firstValueTF.setText("");

        if(isRadiusPlaceholderVisible){
            secondValueTF.setText(radiusTFPlaceholder);
            secondValueTF.setForeground(PLACEHOLDER_COLOR);
        }else
            secondValueTF.setText("");
    }
    public String getHeightTFPlaceholder() {
        return heightTFPlaceholder;
    }

    public String getRadiusTFPlaceholder() {
        return radiusTFPlaceholder;
    }

    
    public JTextField getLastTF(){
        return lastTF;
    }

    private boolean areTFPlaceholdersVisible(){
        return isHeightPlaceholderVisible && isRadiusPlaceholderVisible;
    }
    public void setHeightTFPlaceholder(String text){
        heightTFPlaceholder = text;
        firstValueTF.setText(heightTFPlaceholder);
        firstValueTF.repaint();
    }
    
    public void setRadiusTFPlaceholder(String text){
        radiusTFPlaceholder = text;
        secondValueTF.setText(radiusTFPlaceholder);
        secondValueTF.repaint();
    }

    public void showHeightAndRadiusPlaceHolders(Boolean showPlaceHolders){
       isHeightPlaceholderVisible = showPlaceHolders;
       isRadiusPlaceholderVisible = showPlaceHolders;
       
       if(!isHeightPlaceholderVisible){
           firstValueTF.setText("");
           firstValueTF.setForeground(Color.BLACK);
       }
       else {
           firstValueTF.setText(heightTFPlaceholder);
           firstValueTF.setForeground(PLACEHOLDER_COLOR);
       }
       
       
       if(!isRadiusPlaceholderVisible){
           secondValueTF.setText("");
           secondValueTF.setForeground(Color.BLACK);

       }
       else {
           secondValueTF.setText(radiusTFPlaceholder);
           secondValueTF.setForeground(PLACEHOLDER_COLOR);

       }
       
       firstValueTF.repaint();
       secondValueTF.repaint();
 
    }
    
    
      private void showBadValueMessage(String msg){
        resultLabel.setForeground(Color.red);
        resultLabel.setText(msg);
        resultLabel.repaint();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        firstValueTF = new javax.swing.JTextField();
        operationsCB = new javax.swing.JComboBox<>();
        secondValueTF = new javax.swing.JTextField();
        resultLabel = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(350, 270));

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sphere-image.png"))); // NOI18N

        titleLabel.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        titleLabel.setText("KULA");

        firstValueTF.setForeground(new java.awt.Color(153, 153, 153));
        firstValueTF.setText("V");
        firstValueTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstValueTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstValueTFFocusLost(evt);
            }
        });
        firstValueTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstValueTFActionPerformed(evt);
            }
        });

        operationsCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pole", "Objętość" }));
        operationsCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationsCBActionPerformed(evt);
            }
        });

        secondValueTF.setForeground(new java.awt.Color(153, 153, 153));
        secondValueTF.setText("r");
        secondValueTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                secondValueTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                secondValueTFFocusLost(evt);
            }
        });
        secondValueTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondValueTFActionPerformed(evt);
            }
        });

        resultLabel.setForeground(new java.awt.Color(102, 102, 102));
        resultLabel.setText("Wynik");

        calculateButton.setText("OBLICZ");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(firstValueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(secondValueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(operationsCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(resultLabel)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titleLabel)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(operationsCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstValueTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secondValueTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(resultLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstValueTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstValueTFFocusGained
        lastTF = firstValueTF;
        if(firstValueTF.getText().equals(heightTFPlaceholder)){
            firstValueTF.setText("");
            firstValueTF.setForeground(Color.black);
        }
    }//GEN-LAST:event_firstValueTFFocusGained

    private void firstValueTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstValueTFFocusLost
        if(isHeightPlaceholderVisible){
            if(firstValueTF.getText().isEmpty()){
                firstValueTF.setText(heightTFPlaceholder);
                firstValueTF.setForeground(PLACEHOLDER_COLOR);
            }
        }
        try{
            height = Double.parseDouble(firstValueTF.getText());
            System.out.println("Wysokość: "+height);
        }catch (NumberFormatException nfe){}
    }//GEN-LAST:event_firstValueTFFocusLost

    private void firstValueTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstValueTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstValueTFActionPerformed

    private void operationsCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationsCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operationsCBActionPerformed

    private void secondValueTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secondValueTFFocusGained
        lastTF = secondValueTF;
        if(secondValueTF.getText().equals(radiusTFPlaceholder)){
            secondValueTF.setText("");
            secondValueTF.setForeground(Color.black);
        }
    }//GEN-LAST:event_secondValueTFFocusGained

    private void secondValueTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secondValueTFFocusLost
        if(isRadiusPlaceholderVisible){
            if(secondValueTF.getText().isEmpty()){
                secondValueTF.setText(heightTFPlaceholder);
                secondValueTF.setForeground(PLACEHOLDER_COLOR);
            }
        }
        try{
            radius = Double.parseDouble(secondValueTF.getText());
            System.out.println("Promień: "+radius);
        }catch (NumberFormatException nfe){}

    }//GEN-LAST:event_secondValueTFFocusLost

    private void secondValueTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondValueTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondValueTFActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        Double height, radius;

        if(!firstValueTF.getText().isEmpty() && !secondValueTF.getText().isEmpty()){
            
            try{
                
                height = Double.valueOf(firstValueTF.getText());
                radius = Double.valueOf(secondValueTF.getText());
                
                if(height<=0 || radius<=0){
                    showBadValueMessage("Wysokość i promień muszą być większe od 0!");
                }else{
                     System.out.println(operationsCB.getSelectedItem().toString());
                    if( operationsCB.getSelectedItem().toString().equals(OperationTypesEnum.SURFACE_AREA_CALCULATION.toString())){
                        resultLabel.setText(String.valueOf(cylinderOperations.calculateSurfaceArea(height, radius)));

                    }else if( operationsCB.getSelectedItem().toString().equals(OperationTypesEnum.VOLUME_CALCULATION.toString() ) ){
                        resultLabel.setText(String.valueOf(cylinderOperations.calculateVolume(height, radius)));

                    }
                
                }

            }catch(NumberFormatException ex){
                showBadValueMessage("Wprowadzone wartości muszą być liczbami.");
            }

        }else{
            showBadValueMessage("Podaj wysokość i średnicę.");
        }
        
    }//GEN-LAST:event_calculateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField firstValueTF;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> operationsCB;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JTextField secondValueTF;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
