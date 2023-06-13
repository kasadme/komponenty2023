/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.zastosowanieProgramowaniaKomponentowego.Components.Keyboard;

import com.mycompany.zastosowanieProgramowaniaKomponentowego.Components.Calculator.Calculator;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import static java.awt.font.TextAttribute.FONT;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JTextField;

/**
 *
 * @author Julia
 */
public class NumericKeyboard extends javax.swing.JPanel {

    JTextField lastTF;
    
    Calculator connectedCalculator;
    
    private Color titleColor = Color.BLACK;
    
    private String titleTxt = "KLAWIATURA";
    
    private Font titleFont;
    
    private List keyboardButtons = new ArrayList<Button>();
    
    private Font keyboardButtonsFont;
        
    public NumericKeyboard() {       
        initComponents();
        
        keyboardButtonsFont = nr1Button.getFont();
        
    }
    
    public Font getKeyboardButtonsFont(){
        return keyboardButtonsFont;
    }
    
    public void setButtonsTextSize(int size) {
        Font font = new Font(keyboardButtonsFont.getFontName(), Font.PLAIN, size);

        for(int i=0; i<keyboardButtons.size()-1; i++){
            
            Button btn = (Button) keyboardButtons.get(i);
            btn.setFont(font);
//            System.out.println("-------------ZMIANA ROZMIARU");
            btn.repaint();
//            System.out.println(btn.getFont());

        }
        
        
        repaint();
    }
    
    public void setTitleFont(Font font){
        titleFont = font;
        title.setFont(font);
    }
    
    public void setTitleColor(Color color){
        title.setForeground(color);
        titleColor = color;
    }
    
    public void setConnectedCalculator(Calculator calc){
        connectedCalculator = calc;
    }
    
    public void setTitle(String title){
        this.title.setText(titleTxt);
        titleTxt = title;
    }
    
    public String getTitle(){
        return titleTxt;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        nr1Button = new java.awt.Button();
        nr2Button = new java.awt.Button();
        nr3Button = new java.awt.Button();
        nr4Button = new java.awt.Button();
        nr5Button = new java.awt.Button();
        nr6Button = new java.awt.Button();
        nr7Button = new java.awt.Button();
        nr8Button = new java.awt.Button();
        nr9Button = new java.awt.Button();
        resetButton = new java.awt.Button();
        nr0Button = new java.awt.Button();
        switchEditedTFButton = new java.awt.Button();
        title = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout(100, 0));

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setMinimumSize(new java.awt.Dimension(200, 250));
        jPanel2.setLayout(new java.awt.GridLayout(0, 3));

        nr1Button.setLabel("1");
        nr1Button.setMinimumSize(new java.awt.Dimension(50, 50));
        nr1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr1ButtonnrButtonActionPerformed(evt);
            }
        });
        jPanel2.add(nr1Button);

        nr2Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nr2Button.setLabel("2");
        nr2Button.setMinimumSize(new java.awt.Dimension(50, 50));
        nr2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr2ButtonnrButtonActionPerformed(evt);
            }
        });
        nr2Button.setFocusable(false);
        jPanel2.add(nr2Button);

        nr3Button.setLabel("3");
        nr3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr3ButtonnrButtonActionPerformed(evt);
            }
        });
        jPanel2.add(nr3Button);

        nr4Button.setLabel("4");
        nr4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr4ButtonnrButtonActionPerformed(evt);
            }
        });
        jPanel2.add(nr4Button);

        nr5Button.setLabel("5");
        nr5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr5ButtonnrButtonActionPerformed(evt);
            }
        });
        jPanel2.add(nr5Button);

        nr6Button.setLabel("6");
        nr6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr6ButtonnrButtonActionPerformed(evt);
            }
        });
        jPanel2.add(nr6Button);

        nr7Button.setLabel("7");
        nr7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr7ButtonnrButtonActionPerformed(evt);
            }
        });
        jPanel2.add(nr7Button);

        nr8Button.setLabel("8");
        nr8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr8ButtonnrButtonActionPerformed(evt);
            }
        });
        jPanel2.add(nr8Button);

        nr9Button.setLabel("9");
        nr9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr9ButtonnrButtonActionPerformed(evt);
            }
        });
        jPanel2.add(nr9Button);

        resetButton.setLabel("reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel2.add(resetButton);

        nr0Button.setLabel("0");
        nr0Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr0ButtonnrButtonActionPerformed(evt);
            }
        });
        jPanel2.add(nr0Button);

        switchEditedTFButton.setLabel("-->");
        switchEditedTFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchEditedTFButtonActionPerformed(evt);
            }
        });
        jPanel2.add(switchEditedTFButton);

        keyboardButtons.add(nr1Button);
        keyboardButtons.add(nr2Button);
        keyboardButtons.add(nr3Button);
        keyboardButtons.add(nr4Button);
        keyboardButtons.add(nr5Button);
        keyboardButtons.add(nr6Button);
        keyboardButtons.add(nr7Button);
        keyboardButtons.add(nr8Button);
        keyboardButtons.add(nr9Button);
        keyboardButtons.add(nr0Button);
        keyboardButtons.add(resetButton);
        keyboardButtons.add(switchEditedTFButton);

        add(jPanel2, java.awt.BorderLayout.CENTER);

        title.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("KLAWIATURA");
        title.setToolTipText("");
        add(title, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void nr1ButtonnrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr1ButtonnrButtonActionPerformed
        lastTF = connectedCalculator.getLastTF();
        if(!Objects.isNull(lastTF)){
            String tfNewText = lastTF.getText();
            lastTF.setText(evt.getActionCommand());

            if(tfNewText.equals(connectedCalculator.getHeightTFPlaceholder()) || tfNewText.equals(connectedCalculator.getRadiusTFPlaceholder()) ){
                tfNewText = evt.getActionCommand();
            }
            else {
                tfNewText = tfNewText+evt.getActionCommand();
            }
            lastTF.setText(tfNewText);
            lastTF.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nr1ButtonnrButtonActionPerformed

    private void nr2ButtonnrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr2ButtonnrButtonActionPerformed
        lastTF = connectedCalculator.getLastTF();
        if(!Objects.isNull(lastTF)){
            String tfNewText = lastTF.getText();
            lastTF.setText(evt.getActionCommand());

            if(tfNewText.equals(connectedCalculator.getHeightTFPlaceholder()) || tfNewText.equals(connectedCalculator.getRadiusTFPlaceholder()) ){
                tfNewText = evt.getActionCommand();
            }
            else {
                tfNewText = tfNewText+evt.getActionCommand();
            }
            lastTF.setText(tfNewText);
            lastTF.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nr2ButtonnrButtonActionPerformed

    private void nr3ButtonnrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr3ButtonnrButtonActionPerformed
        lastTF = connectedCalculator.getLastTF();
        if(!Objects.isNull(lastTF)){
            String tfNewText = lastTF.getText();
            lastTF.setText(evt.getActionCommand());

            if(tfNewText.equals(connectedCalculator.getHeightTFPlaceholder()) || tfNewText.equals(connectedCalculator.getRadiusTFPlaceholder()) ){
                tfNewText = evt.getActionCommand();
            }
            else {
                tfNewText = tfNewText+evt.getActionCommand();
            }
            lastTF.setText(tfNewText);
            lastTF.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nr3ButtonnrButtonActionPerformed

    private void nr4ButtonnrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr4ButtonnrButtonActionPerformed
        lastTF = connectedCalculator.getLastTF();
        if(!Objects.isNull(lastTF)){
            String tfNewText = lastTF.getText();
            lastTF.setText(evt.getActionCommand());

            if(tfNewText.equals(connectedCalculator.getHeightTFPlaceholder()) || tfNewText.equals(connectedCalculator.getRadiusTFPlaceholder()) ){
                tfNewText = evt.getActionCommand();
            }
            else {
                tfNewText = tfNewText+evt.getActionCommand();
            }
            lastTF.setText(tfNewText);
            lastTF.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nr4ButtonnrButtonActionPerformed

    private void nr5ButtonnrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr5ButtonnrButtonActionPerformed
        lastTF = connectedCalculator.getLastTF();
        if(!Objects.isNull(lastTF)){
            String tfNewText = lastTF.getText();
            lastTF.setText(evt.getActionCommand());

            if(tfNewText.equals(connectedCalculator.getHeightTFPlaceholder()) || tfNewText.equals(connectedCalculator.getRadiusTFPlaceholder()) ){
                tfNewText = evt.getActionCommand();
            }
            else {
                tfNewText = tfNewText+evt.getActionCommand();
            }
            lastTF.setText(tfNewText);
            lastTF.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nr5ButtonnrButtonActionPerformed

    private void nr6ButtonnrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr6ButtonnrButtonActionPerformed
        lastTF = connectedCalculator.getLastTF();
        if(!Objects.isNull(lastTF)){
            String tfNewText = lastTF.getText();
            lastTF.setText(evt.getActionCommand());

            if(tfNewText.equals(connectedCalculator.getHeightTFPlaceholder()) || tfNewText.equals(connectedCalculator.getRadiusTFPlaceholder()) ){
                tfNewText = evt.getActionCommand();
            }
            else {
                tfNewText = tfNewText+evt.getActionCommand();
            }
            lastTF.setText(tfNewText);
            lastTF.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nr6ButtonnrButtonActionPerformed

    private void nr7ButtonnrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr7ButtonnrButtonActionPerformed
        lastTF = connectedCalculator.getLastTF();
        if(!Objects.isNull(lastTF)){
            String tfNewText = lastTF.getText();
            lastTF.setText(evt.getActionCommand());

            if(tfNewText.equals(connectedCalculator.getHeightTFPlaceholder()) || tfNewText.equals(connectedCalculator.getRadiusTFPlaceholder()) ){
                tfNewText = evt.getActionCommand();
            }
            else {
                tfNewText = tfNewText+evt.getActionCommand();
            }
            lastTF.setText(tfNewText);
            lastTF.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nr7ButtonnrButtonActionPerformed

    private void nr8ButtonnrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr8ButtonnrButtonActionPerformed
        lastTF = connectedCalculator.getLastTF();
        if(!Objects.isNull(lastTF)){
            String tfNewText = lastTF.getText();
            lastTF.setText(evt.getActionCommand());

            if(tfNewText.equals(connectedCalculator.getHeightTFPlaceholder()) || tfNewText.equals(connectedCalculator.getRadiusTFPlaceholder()) ){
                tfNewText = evt.getActionCommand();
            }
            else {
                tfNewText = tfNewText+evt.getActionCommand();
            }
            lastTF.setText(tfNewText);
            lastTF.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nr8ButtonnrButtonActionPerformed

    private void nr9ButtonnrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr9ButtonnrButtonActionPerformed
        lastTF = connectedCalculator.getLastTF();
        if(!Objects.isNull(lastTF)){
            String tfNewText = lastTF.getText();
            lastTF.setText(evt.getActionCommand());

            if(tfNewText.equals(connectedCalculator.getHeightTFPlaceholder()) || tfNewText.equals(connectedCalculator.getRadiusTFPlaceholder()) ){
                tfNewText = evt.getActionCommand();
            }
            else {
                tfNewText = tfNewText+evt.getActionCommand();
            }
            lastTF.setText(tfNewText);
            lastTF.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nr9ButtonnrButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        connectedCalculator.resetParametersTF();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void nr0ButtonnrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr0ButtonnrButtonActionPerformed
        lastTF = connectedCalculator.getLastTF();
        if(!Objects.isNull(lastTF)){
            String tfNewText = lastTF.getText();
            lastTF.setText(evt.getActionCommand());

            if(tfNewText.equals(connectedCalculator.getHeightTFPlaceholder()) || tfNewText.equals(connectedCalculator.getRadiusTFPlaceholder()) ){
                tfNewText = evt.getActionCommand();
            }
            else {
                tfNewText = tfNewText+evt.getActionCommand();
            }
            lastTF.setText(tfNewText);
            lastTF.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nr0ButtonnrButtonActionPerformed

    private void switchEditedTFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchEditedTFButtonActionPerformed
        connectedCalculator.switchLastTF();
        lastTF = connectedCalculator.getLastTF();
    }//GEN-LAST:event_switchEditedTFButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel jPanel2;
    java.awt.Button nr0Button;
    java.awt.Button nr1Button;
    java.awt.Button nr2Button;
    java.awt.Button nr3Button;
    java.awt.Button nr4Button;
    java.awt.Button nr5Button;
    java.awt.Button nr6Button;
    java.awt.Button nr7Button;
    java.awt.Button nr8Button;
    java.awt.Button nr9Button;
    java.awt.Button resetButton;
    java.awt.Button switchEditedTFButton;
    javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables


}
