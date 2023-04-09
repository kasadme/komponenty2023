/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package com.mycompany.components;
import com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic.CylinderOperations;
import com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic.OperationTypesEnum;
import com.mycompany.zastosowanieProgramowaniaKomponentowego.Mathematic.SolidOfRevolutionOperations;
import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Julia
 */
public class CylinderCalculator extends javax.swing.JPanel {

    private Double height, radius;
    private Double result;
    
    private String titleText = "Walec";
    private String heightTFPlaceholder = "H";
    private String radiusTFPlaceholder = "r";
    
    private Boolean isHeightPlaceholderVisible = true ,isRadiusPlaceholderVisible = true;
    private final Color PLACEHOLDER_COLOR = Color.GRAY;
    private JTextField lastTF;

    private SolidOfRevolutionOperations cylinderOperations = new CylinderOperations();
    
    /** Creates new form CylinderCalculator */
    public CylinderCalculator() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        heightTF = new javax.swing.JTextField();
        operationsCB = new javax.swing.JComboBox<>();
        radiusTF = new javax.swing.JTextField();
        resultLabel = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        titleLabel.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        titleLabel.setText("WALEC");

        heightTF.setForeground(new java.awt.Color(153, 153, 153));
        heightTF.setText("H");
        heightTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                heightTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                heightTFFocusLost(evt);
            }
        });
        heightTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTFActionPerformed(evt);
            }
        });

        operationsCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pole", "Objętość" }));
        operationsCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationsCBActionPerformed(evt);
            }
        });

        radiusTF.setForeground(new java.awt.Color(153, 153, 153));
        radiusTF.setText("r");
        radiusTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radiusTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                radiusTFFocusLost(evt);
            }
        });
        radiusTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiusTFActionPerformed(evt);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cylinder-image.png"))); // NOI18N

        jLabel2.setText("Wysokość");

        jLabel3.setText("Promień");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(imageLabel))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(heightTF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radiusTF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(operationsCB, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(titleLabel)
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(operationsCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radiusTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heightTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(imageLabel)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void arePlaceholdersVisible(Boolean placeholdersVisible){
        isHeightPlaceholderVisible = placeholdersVisible;
        isRadiusPlaceholderVisible = placeholdersVisible;
    }
    
    public void switchLastTF(){
        if(lastTF.equals(radiusTF)) lastTF=heightTF;
        else if(lastTF.equals(heightTF)) lastTF=radiusTF;
    }
    
    public void resetParametersTF(){
        if(isHeightPlaceholderVisible){
            heightTF.setText(heightTFPlaceholder);
            heightTF.setForeground(PLACEHOLDER_COLOR);
        }else
            heightTF.setText("");

        if(isRadiusPlaceholderVisible){
            radiusTF.setText(radiusTFPlaceholder);
            radiusTF.setForeground(PLACEHOLDER_COLOR);
        }else
            radiusTF.setText("");
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
    
    private void showBadValueMessage(String msg){
        resultLabel.setForeground(Color.red);
        resultLabel.setText(msg);
        resultLabel.repaint();
    }
    
    
    private void heightTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_heightTFFocusGained
        lastTF = heightTF;
        if(heightTF.getText().equals(heightTFPlaceholder)){
            heightTF.setText("");
            heightTF.setForeground(Color.black);
        }
    }//GEN-LAST:event_heightTFFocusGained

    private void heightTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_heightTFFocusLost
        if(isHeightPlaceholderVisible){
            if(heightTF.getText().isEmpty()){
                heightTF.setText(heightTFPlaceholder);
                heightTF.setForeground(PLACEHOLDER_COLOR);
            }
        }
        try{
            height = Double.parseDouble(heightTF.getText());
            System.out.println("Wysokość: "+height);
        }catch (NumberFormatException nfe){}
    }//GEN-LAST:event_heightTFFocusLost

    private void heightTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTFActionPerformed

    private void operationsCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationsCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operationsCBActionPerformed

    private void radiusTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radiusTFFocusGained
        lastTF = radiusTF;
        if(radiusTF.getText().equals(radiusTFPlaceholder)){
            radiusTF.setText("");
            radiusTF.setForeground(Color.black);
        }
    }//GEN-LAST:event_radiusTFFocusGained

    private void radiusTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radiusTFFocusLost
        if(isRadiusPlaceholderVisible){
            if(radiusTF.getText().isEmpty()){
                radiusTF.setText(radiusTFPlaceholder);
                radiusTF.setForeground(PLACEHOLDER_COLOR);
            }
        }
        try{
            radius = Double.parseDouble(radiusTF.getText());
            System.out.println("Promień: "+radius);
        }catch (NumberFormatException nfe){}

    }//GEN-LAST:event_radiusTFFocusLost

    private void radiusTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiusTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiusTFActionPerformed

    
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        Double height, radius;

        if(!heightTF.getText().isEmpty() && !radiusTF.getText().isEmpty()){
            try{
                height = Double.valueOf(heightTF.getText());
                radius = Double.valueOf(radiusTF.getText());
                

                System.out.println(operationsCB.getSelectedItem().toString());
                if(height<=0 || radius<=0){
                    showBadValueMessage("Wartości muszą być większe od 0.");
                }else{
                       resultLabel.setForeground(Color.black);
                            
                    if( operationsCB.getSelectedItem().toString().equals(OperationTypesEnum.SURFACE_AREA_CALCULATION.toString())){
                        resultLabel.setText(String.valueOf(cylinderOperations.calculateSurfaceArea(height, radius)));
                    }else if( operationsCB.getSelectedItem().toString().equals(OperationTypesEnum.VOLUME_CALCULATION.toString() ) ){
                        resultLabel.setText(String.valueOf(cylinderOperations.calculateVolume(height, radius)));
                    }
                }
               

            }catch(NumberFormatException ex){
                showBadValueMessage("Wartości muszą być liczbami.");
            }

        }else{
            showBadValueMessage("Podaj wysokość i średnicę.");
        }
    }//GEN-LAST:event_calculateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField heightTF;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> operationsCB;
    private javax.swing.JTextField radiusTF;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}