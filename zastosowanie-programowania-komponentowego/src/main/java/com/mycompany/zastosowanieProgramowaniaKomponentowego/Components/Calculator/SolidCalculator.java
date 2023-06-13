/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.zastosowanieProgramowaniaKomponentowego.Components.Calculator;

import com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic.CalculatorTypesEnum;
import com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic.CubeOperations;
import com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic.CylinderOperations;
import com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic.OperationTypesEnum;
import com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic.SolidOfRevolutionOperations;
import com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic.SphereOperations;
import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.JTextField;

/**
 *
 * @author Julia
 */
public class SolidCalculator extends javax.swing.JPanel implements Calculator {

    private Double height, radius;
    private Double result;
    private String titleText = "Walec";
    private String calculatorType = "Walec";
    private SolidOfRevolutionOperations cylinderOperations = new CylinderOperations();

    private String firstTFPlaceholder = "H";
//        private String heightTFPlaceholder = "H";
    private String secondTFPlaceholder = "r";
    private String resultPlaceholder = "Wynik";
    
    private Boolean isHeightPlaceholderVisible = true, isRadiusPlaceholderVisible = true, isResultPlaceholderVisible = true;

    private final Color PLACEHOLDER_COLOR = Color.GRAY;

    private JTextField lastTF;
    
    private Integer numberOfDecimals=5;
    
    private DecimalFormat decimalFormat = new DecimalFormat("#####");
    
    private final Icon sphereIcon = new javax.swing.ImageIcon(getClass().getResource("/sphere-image.png"));
    private final Icon cylinderIcon = new javax.swing.ImageIcon(getClass().getResource("/cylinder-image.png"));
//    private final Icon coneIcon = new javax.swing.ImageIcon(getClass().getResource("/cone-image.png"));
    private final Icon cubeIcon = new javax.swing.ImageIcon(getClass().getResource("/cube-image.png"));


    private Icon currentIcon = cylinderIcon;
    
    private Font titleFont = new Font("Baskerville Old Face", 0, 24);
    
    private Color titleColor = Color.BLACK;

        
    public Integer getNumberOfDecimals() {
        return numberOfDecimals;
    }
    
    public void setCalculatorType(String calculatorType){
        this.calculatorType = calculatorType;
        
        if(calculatorType.equals(CalculatorTypesEnum.CYLINDER.toString())){
            firstTFPlaceholder = "H";
            firstValueTF.setText(firstTFPlaceholder);

            firstValueTF.setVisible(true);
            secondValueTF.setVisible(true);
            titleText = CalculatorTypesEnum.CYLINDER.toString();
            currentIcon = cylinderIcon;
            cylinderOperations = new CylinderOperations();
        }else if(calculatorType.equals(CalculatorTypesEnum.SPHERE.toString())){
            firstTFPlaceholder = "H";
            firstValueTF.setText(firstTFPlaceholder);

            firstValueTF.setVisible(true);
            titleText = CalculatorTypesEnum.SPHERE.toString();
            currentIcon = sphereIcon;
            firstValueTF.setVisible(false);
            secondValueTF.setVisible(true);
            cylinderOperations = new SphereOperations();
            
        }else if(calculatorType.equals(CalculatorTypesEnum.CUBE.toString())){
            firstTFPlaceholder = "a";
            firstValueTF.setText(firstTFPlaceholder);
            firstValueTF.setVisible(true);
            secondValueTF.setVisible(false);
            
            titleText = CalculatorTypesEnum.CUBE.toString();
            currentIcon = cubeIcon;
            cylinderOperations = new CubeOperations();
        }
        titleLabel.setText(titleText);
        imageLabel.setIcon(currentIcon);

//        titleLabel.repaint();
        repaint();
    }

    public void setNumberOfDecimals(Integer numberOfDecimals) {
        if(numberOfDecimals>=5){
            this.numberOfDecimals=5;
            System.out.println("Maksymalna obsługiwana liczba przecinków w wyniku to 5. Ustawiono maksymalną wartość");
        }else if(numberOfDecimals<0){
            this.numberOfDecimals=0;
            System.out.println("Wyłączono znaki po przecinku");
        }else
            this.numberOfDecimals = numberOfDecimals;
        
        setDecimalFormat(this.numberOfDecimals);
    }

    private void setDecimalFormat(Integer numberOfDecimals){
          switch (numberOfDecimals){
            case 0: 
                decimalFormat = new DecimalFormat("#."); break;
            case 1:
                decimalFormat = new DecimalFormat("#.#"); break;
            case 2:
                decimalFormat = new DecimalFormat("#.##"); break;
            case 3:
                decimalFormat = new DecimalFormat("#.###"); break;
            case 4:
                decimalFormat = new DecimalFormat("#.####"); break;
            default:
                decimalFormat = new DecimalFormat("#.#####"); break;
        }
    }
    
    

    @Override
    public void switchLastTF() {
        if (lastTF.equals(secondValueTF)) {
            lastTF = firstValueTF;
        } else if (lastTF.equals(firstValueTF)) {
            lastTF = secondValueTF;
        }
    }

    @Override
    public void resetParametersTF() {
        if (isHeightPlaceholderVisible) {
            firstValueTF.setText(firstTFPlaceholder);
            firstValueTF.setForeground(PLACEHOLDER_COLOR);
        } else {
            firstValueTF.setText("");
        }

        if (isRadiusPlaceholderVisible) {
            secondValueTF.setText(secondTFPlaceholder);
            secondValueTF.setForeground(PLACEHOLDER_COLOR);
        } else {
            secondValueTF.setText("");
        }
    }

    public String getFirstTFPlaceholder() {
        return firstTFPlaceholder;
    }

    public String getSecondTFPlaceholder() {
        return secondTFPlaceholder;
    }

    /**
     * Creates new form CylinderCalculator
     */
    public SolidCalculator() {
        initComponents();
    }

    public JTextField getLastTF() {
        return lastTF;
    }

    private boolean areTFPlaceholdersVisible() {
        return isHeightPlaceholderVisible && isRadiusPlaceholderVisible;
    }

    public void setFirstTFPlaceholder(String text) {
        firstTFPlaceholder = text;
        firstValueTF.setText(firstTFPlaceholder);
        firstValueTF.repaint();
    }

    public void setSecondTFPlaceholder(String text) {
        secondTFPlaceholder = text;
        secondValueTF.setText(secondTFPlaceholder);
        secondValueTF.repaint();
    }

    @Override
    public void showHeightAndRadiusPlaceHolders(Boolean showPlaceHolders) {
        isHeightPlaceholderVisible = showPlaceHolders;
        isRadiusPlaceholderVisible = showPlaceHolders;

        if (!isHeightPlaceholderVisible) {
            firstValueTF.setText("");
            firstValueTF.setForeground(Color.BLACK);
        } else {
            firstValueTF.setText(firstTFPlaceholder);
            firstValueTF.setForeground(PLACEHOLDER_COLOR);
        }

        if (!isRadiusPlaceholderVisible) {
            secondValueTF.setText("");
            secondValueTF.setForeground(Color.BLACK);

        } else {
            secondValueTF.setText(secondTFPlaceholder);
            secondValueTF.setForeground(PLACEHOLDER_COLOR);

        }

        firstValueTF.repaint();
        secondValueTF.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    private void showBadValueMessage(String msg) {
        resultLabel.setForeground(Color.red);
        resultLabel.setText(msg);
        resultLabel.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        firstValueTF = new javax.swing.JTextField();
        operationsCB = new javax.swing.JComboBox<>();
        secondValueTF = new javax.swing.JTextField();
        resultLabel = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();

        imageLabel.setIcon(currentIcon);

        titleLabel.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        titleLabel.setText("Walec");

        firstValueTF.setForeground(new java.awt.Color(153, 153, 153));
        firstValueTF.setText("H");
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
        resultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultLabel.setText("Wynik");

        calculateButton.setText("OBLICZ");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstValueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(secondValueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(operationsCB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titleLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(operationsCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstValueTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secondValueTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        titleLabel.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void firstValueTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstValueTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstValueTFActionPerformed

    private void secondValueTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondValueTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondValueTFActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        Double height, radius, lenght;

       if(calculatorType.equals(CalculatorTypesEnum.CYLINDER.toString())){

            if (!firstValueTF.getText().isEmpty() && !secondValueTF.getText().isEmpty()) {

                    try {
                        height = Double.valueOf(firstValueTF.getText());
                        radius = Double.valueOf(secondValueTF.getText());
                        Double result;

                        if(calculatorType.equals(CalculatorTypesEnum.CYLINDER.toString())){
                            if (height <= 0 || radius <= 0) {
                            showBadValueMessage("Wartości muszą być większe od 0!");
                        } else {

                            System.out.println(operationsCB.getSelectedItem().toString());
                            if (operationsCB.getSelectedItem().toString().equals(OperationTypesEnum.SURFACE_AREA_CALCULATION.toString())) {
        //                        Double result = cylinderOperations.calculateSurfaceArea(height, radius);
                                result = cylinderOperations.calculateSurfaceArea(height, radius);
                                resultLabel.setText(decimalFormat.format(result));

                            } else if (operationsCB.getSelectedItem().toString().equals(OperationTypesEnum.VOLUME_CALCULATION.toString())) {
                                 result = cylinderOperations.calculateVolume(height, radius);
                                resultLabel.setText(String.valueOf(decimalFormat.format(result)));
                            }
                        }
                        }

                    } catch (NumberFormatException ex) {
                        showBadValueMessage("Wprowadzone wartości muszą być liczbami.");
                    }
                } else {
                    showBadValueMessage("Podaj wysokość i średnicę.");
                }
            }else if(calculatorType.equals(CalculatorTypesEnum.SPHERE.toString())){
                 if (!firstValueTF.getText().isEmpty() && !secondValueTF.getText().isEmpty()) {

                    try {
                        radius = Double.valueOf(secondValueTF.getText());
                        Double result;

                        if(calculatorType.equals(CalculatorTypesEnum.SPHERE.toString())){
                            if (radius <= 0) {
                            showBadValueMessage("Wartości muszą być większe od 0!");
                        } else {

                            System.out.println(operationsCB.getSelectedItem().toString());
                            if (operationsCB.getSelectedItem().toString().equals(OperationTypesEnum.SURFACE_AREA_CALCULATION.toString())) {
        //                        Double result = cylinderOperations.calculateSurfaceArea(height, radius);
                                result = cylinderOperations.calculateSurfaceArea(radius, 1.0);
                                resultLabel.setText(decimalFormat.format(result));

                            } else if (operationsCB.getSelectedItem().toString().equals(OperationTypesEnum.VOLUME_CALCULATION.toString())) {
                                 result = cylinderOperations.calculateVolume(radius, 1.0);
                                resultLabel.setText(String.valueOf(decimalFormat.format(result)));
                            }
                        }
                        }

                    } catch (NumberFormatException ex) {
                        showBadValueMessage("Wprowadzone wartości muszą być liczbami.");
                    }
                } else {
                    showBadValueMessage("Podaj wysokość i średnicę.");
                }
                
                
            }else if(calculatorType.equals(CalculatorTypesEnum.CUBE.toString())){
                
                
                if (!firstValueTF.getText().isEmpty()) {

                        try {
                            double a = Double.valueOf(firstValueTF.getText());
                            
                            Double result;

                            if(calculatorType.equals(CalculatorTypesEnum.CUBE.toString())){
                                if (a <= 0) {
                                showBadValueMessage("Wartość musi być większa od 0!");
                            } else {

                                System.out.println(operationsCB.getSelectedItem().toString());
                                if (operationsCB.getSelectedItem().toString().equals(OperationTypesEnum.SURFACE_AREA_CALCULATION.toString())) {
            //                        Double result = cylinderOperations.calculateSurfaceArea(height, radius);
                                    result = cylinderOperations.calculateSurfaceArea(a, 1.0);
                                    resultLabel.setText(decimalFormat.format(result));

                                } else if (operationsCB.getSelectedItem().toString().equals(OperationTypesEnum.VOLUME_CALCULATION.toString())) {
                                     result = cylinderOperations.calculateVolume(a, 1.0);
                                    resultLabel.setText(String.valueOf(decimalFormat.format(result)));
                                }
                            }
                            }

                        } catch (NumberFormatException ex) {
                            showBadValueMessage("Wprowadzone wartości muszą być liczbami.");
                        }
                    } else {
                        showBadValueMessage("Podaj średnicę.");
                    }
            }
            

        
    }//GEN-LAST:event_calculateButtonActionPerformed


    private void operationsCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationsCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operationsCBActionPerformed

    private void firstValueTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstValueTFFocusGained
        lastTF = firstValueTF;
        if (firstValueTF.getText().equals(firstTFPlaceholder)) {
            firstValueTF.setText("");
            firstValueTF.setForeground(Color.black);
        }
    }//GEN-LAST:event_firstValueTFFocusGained

    private void secondValueTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secondValueTFFocusGained
        lastTF = secondValueTF;
        if (secondValueTF.getText().equals(secondTFPlaceholder)) {
            secondValueTF.setText("");
            secondValueTF.setForeground(Color.black);
        }
    }//GEN-LAST:event_secondValueTFFocusGained

    private void firstValueTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstValueTFFocusLost
        if (isHeightPlaceholderVisible) {
            if (firstValueTF.getText().isEmpty()) {
                firstValueTF.setText(firstTFPlaceholder);
                firstValueTF.setForeground(PLACEHOLDER_COLOR);
            }
        }
        try {
            height = Double.parseDouble(firstValueTF.getText());
            System.out.println("Wysokość: " + height);
        } catch (NumberFormatException nfe) {
        }
    }//GEN-LAST:event_firstValueTFFocusLost

    private void secondValueTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secondValueTFFocusLost
        if (isRadiusPlaceholderVisible) {
            if (secondValueTF.getText().isEmpty()) {
                secondValueTF.setText(firstTFPlaceholder);
                secondValueTF.setForeground(PLACEHOLDER_COLOR);
            }
        }
        try {
            radius = Double.parseDouble(secondValueTF.getText());
            System.out.println("Promień: " + radius);
        } catch (NumberFormatException nfe) {
        }


    }//GEN-LAST:event_secondValueTFFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField firstValueTF;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JComboBox<String> operationsCB;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JTextField secondValueTF;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables



    @Override
    public void setTitleColor(Color color) {
        titleLabel.setForeground(color);
        titleColor = color;
        titleLabel.repaint();
    }
    
    @Override
    public void setTitleFont(Font font){ 
        titleLabel.setFont(font);
        titleFont = font;
        titleLabel.repaint();
        repaint();
    }

    @Override
    public void setResultAlignement(int alignement){
        resultLabel.setHorizontalAlignment(alignement);
        resultLabel.repaint();
    }
  
    public void showResultPlaceHolder(boolean showResult) {
        isResultPlaceholderVisible = showResult;
        
        if(isResultPlaceholderVisible){
            resultLabel.setText(resultPlaceholder);
        }else{
            resultLabel.setText("");
        }
    }

    @Override
    public String getHeightTFPlaceholder() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getRadiusTFPlaceholder() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
