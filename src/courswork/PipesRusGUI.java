/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courswork;

import javax.swing.ButtonGroup;

/**
 *
 * @author up750148
 */
public class PipesRusGUI extends javax.swing.JFrame {

    /**
     * Creates new form PipesRusGUI
     */
    public PipesRusGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        plasticTypeGUIRB1 = new javax.swing.JRadioButton();
        plasticTypeGUIRB2 = new javax.swing.JRadioButton();
        plasticTypeGUIRB3 = new javax.swing.JRadioButton();
        plasticTypeGUIRB4 = new javax.swing.JRadioButton();
        plasticTypeGUIRB5 = new javax.swing.JRadioButton();
        plasticTypeGUIRBNI = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        innerInsulationGUIRBY = new javax.swing.JRadioButton();
        innerInsulationGUIRBN = new javax.swing.JRadioButton();
        innerInsulationGUIRBNI = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        outerReinforcementGUIRBY = new javax.swing.JRadioButton();
        outerReinforcementGUIRBN = new javax.swing.JRadioButton();
        outerReinforcementGUIRBNI = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        chemicalResistanceGUIRBY = new javax.swing.JRadioButton();
        chemicalResistanceGUIRBN = new javax.swing.JRadioButton();
        chemicalResistanceGUIRBNI = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        lengthGUITF1 = new javax.swing.JTextField();
        lengthGUIRBM = new javax.swing.JRadioButton();
        lengthGUIRBI = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        outerDiameterGUITF1 = new javax.swing.JTextField();
        outerDiameterGUIRBM = new javax.swing.JRadioButton();
        outerDiameterGUIRBI = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        colourGUIRBNoColour = new javax.swing.JRadioButton();
        colourGUIRB1Colour = new javax.swing.JRadioButton();
        colourGUIRB2Colour = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        placeOrderGUIRB = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        checkOutGUIButton = new javax.swing.JButton();
        saveOrderGUIButton = new javax.swing.JButton();
        nextOrderGUIButton = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        jTextField7.setText("jTextField7");

        jRadioButton6.setText("jRadioButton6");

        jRadioButton9.setText("jRadioButton9");

        jRadioButton26.setText("jRadioButton26");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plastic Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        plasticTypeGUIRB1.setText("1");
        plasticTypeGUIRB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plasticTypeGUIRB1ActionPerformed(evt);
            }
        });

        plasticTypeGUIRB2.setText("2");

        plasticTypeGUIRB3.setText("3");
        plasticTypeGUIRB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plasticTypeGUIRB3ActionPerformed(evt);
            }
        });

        plasticTypeGUIRB4.setText("4");

        plasticTypeGUIRB5.setText("5");

        plasticTypeGUIRBNI.setText("Not Important");
        plasticTypeGUIRBNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plasticTypeGUIRBNIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plasticTypeGUIRB1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plasticTypeGUIRB2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plasticTypeGUIRB3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plasticTypeGUIRB4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plasticTypeGUIRB5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plasticTypeGUIRBNI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plasticTypeGUIRB1)
                    .addComponent(plasticTypeGUIRB2)
                    .addComponent(plasticTypeGUIRB3)
                    .addComponent(plasticTypeGUIRB4)
                    .addComponent(plasticTypeGUIRB5)
                    .addComponent(plasticTypeGUIRBNI))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inner Insulation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        innerInsulationGUIRBY.setText("Yes");
        innerInsulationGUIRBY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                innerInsulationGUIRBYActionPerformed(evt);
            }
        });

        innerInsulationGUIRBN.setText("No");

        innerInsulationGUIRBNI.setText("Not Important");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(innerInsulationGUIRBY)
                .addGap(18, 18, 18)
                .addComponent(innerInsulationGUIRBN)
                .addGap(18, 18, 18)
                .addComponent(innerInsulationGUIRBNI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(innerInsulationGUIRBY)
                    .addComponent(innerInsulationGUIRBN)
                    .addComponent(innerInsulationGUIRBNI))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Outer Reinforcement", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        outerReinforcementGUIRBY.setText("Yes");
        outerReinforcementGUIRBY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outerReinforcementGUIRBYActionPerformed(evt);
            }
        });

        outerReinforcementGUIRBN.setText("No");
        outerReinforcementGUIRBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outerReinforcementGUIRBNActionPerformed(evt);
            }
        });

        outerReinforcementGUIRBNI.setText("Not Important");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outerReinforcementGUIRBY)
                .addGap(18, 18, 18)
                .addComponent(outerReinforcementGUIRBN)
                .addGap(18, 18, 18)
                .addComponent(outerReinforcementGUIRBNI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outerReinforcementGUIRBY)
                    .addComponent(outerReinforcementGUIRBN)
                    .addComponent(outerReinforcementGUIRBNI))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chemical Resistance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        chemicalResistanceGUIRBY.setText("Yes");

        chemicalResistanceGUIRBN.setText("No");

        chemicalResistanceGUIRBNI.setText("Not Important");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chemicalResistanceGUIRBY)
                .addGap(18, 18, 18)
                .addComponent(chemicalResistanceGUIRBN)
                .addGap(18, 18, 18)
                .addComponent(chemicalResistanceGUIRBNI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chemicalResistanceGUIRBY)
                    .addComponent(chemicalResistanceGUIRBN)
                    .addComponent(chemicalResistanceGUIRBNI))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Length", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        lengthGUITF1.setText("jTextField1");

        lengthGUIRBM.setText("Meters");

        lengthGUIRBI.setText("Inches");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lengthGUITF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lengthGUIRBM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lengthGUIRBI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lengthGUITF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lengthGUIRBM)
                    .addComponent(lengthGUIRBI))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Outer Diameter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        outerDiameterGUITF1.setText("jTextField2");

        outerDiameterGUIRBM.setText("Meters");

        outerDiameterGUIRBI.setText("Inches");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outerDiameterGUITF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outerDiameterGUIRBM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outerDiameterGUIRBI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outerDiameterGUITF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outerDiameterGUIRBM)
                    .addComponent(outerDiameterGUIRBI))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Colour", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        colourGUIRBNoColour.setText("No Colour");

        colourGUIRB1Colour.setText("1 Colour");

        colourGUIRB2Colour.setText("2 Colours");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colourGUIRBNoColour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colourGUIRB1Colour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colourGUIRB2Colour)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colourGUIRBNoColour)
                    .addComponent(colourGUIRB1Colour)
                    .addComponent(colourGUIRB2Colour))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("There is no pipe that fall under this criteria. Please try changing your options.");

        jLabel2.setText("Your pipe is available. Would you like to place an order?");

        placeOrderGUIRB.setText("Place order");
        placeOrderGUIRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderGUIRBActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Pipe #1\nPlastic Type ()\nInner Insualtion ()\nOuter Reinforcement ()\nChemical Resistance ()\nLength ()\nOuter Diameter ()\nColour ()");
        jScrollPane1.setViewportView(jTextArea1);

        checkOutGUIButton.setLabel("Checkout");
        checkOutGUIButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutGUIButtonActionPerformed(evt);
            }
        });

        saveOrderGUIButton.setLabel("Save Order");

        nextOrderGUIButton.setForeground(new java.awt.Color(153, 153, 153));
        nextOrderGUIButton.setLabel("Next Order");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(placeOrderGUIRB))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(checkOutGUIButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveOrderGUIButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextOrderGUIButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placeOrderGUIRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkOutGUIButton)
                    .addComponent(saveOrderGUIButton)
                    .addComponent(nextOrderGUIButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void innerInsulationGUIRBYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_innerInsulationGUIRBYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_innerInsulationGUIRBYActionPerformed

    private void plasticTypeGUIRB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plasticTypeGUIRB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plasticTypeGUIRB1ActionPerformed

    private void plasticTypeGUIRB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plasticTypeGUIRB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plasticTypeGUIRB3ActionPerformed

    private void outerReinforcementGUIRBYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outerReinforcementGUIRBYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outerReinforcementGUIRBYActionPerformed

    private void outerReinforcementGUIRBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outerReinforcementGUIRBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outerReinforcementGUIRBNActionPerformed

    private void plasticTypeGUIRBNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plasticTypeGUIRBNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plasticTypeGUIRBNIActionPerformed

    private void placeOrderGUIRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderGUIRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeOrderGUIRBActionPerformed

    private void checkOutGUIButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutGUIButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkOutGUIButtonActionPerformed
 
    ButtonGroup pipeType = new ButtonGroup();{
    pipeType.add(plasticTypeGUIRB1);
    plasticType.add(jRadioButton4);
    plasticType.add(jRadioButton5);
    plasticType.add(jRadioButton7);
    plasticType.add(jRadioButton8);
    plasticType.add(jRadioButton12);
    }
    ButtonGroup innerInsulation = new ButtonGroup();{
    innerInsulation.add(jRadioButton1);
    innerInsulation.add(jRadioButton2);
    innerInsulation.add(jRadioButton13);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PipesRusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PipesRusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PipesRusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PipesRusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PipesRusGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkOutGUIButton;
    private javax.swing.JRadioButton chemicalResistanceGUIRBN;
    private javax.swing.JRadioButton chemicalResistanceGUIRBNI;
    private javax.swing.JRadioButton chemicalResistanceGUIRBY;
    private javax.swing.JRadioButton colourGUIRB1Colour;
    private javax.swing.JRadioButton colourGUIRB2Colour;
    private javax.swing.JRadioButton colourGUIRBNoColour;
    private javax.swing.JRadioButton innerInsulationGUIRBN;
    private javax.swing.JRadioButton innerInsulationGUIRBNI;
    private javax.swing.JRadioButton innerInsulationGUIRBY;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JRadioButton lengthGUIRBI;
    private javax.swing.JRadioButton lengthGUIRBM;
    private javax.swing.JTextField lengthGUITF1;
    private javax.swing.JButton nextOrderGUIButton;
    private javax.swing.JRadioButton outerDiameterGUIRBI;
    private javax.swing.JRadioButton outerDiameterGUIRBM;
    private javax.swing.JTextField outerDiameterGUITF1;
    private javax.swing.JRadioButton outerReinforcementGUIRBN;
    private javax.swing.JRadioButton outerReinforcementGUIRBNI;
    private javax.swing.JRadioButton outerReinforcementGUIRBY;
    private javax.swing.JRadioButton placeOrderGUIRB;
    private javax.swing.JRadioButton plasticTypeGUIRB1;
    private javax.swing.JRadioButton plasticTypeGUIRB2;
    private javax.swing.JRadioButton plasticTypeGUIRB3;
    private javax.swing.JRadioButton plasticTypeGUIRB4;
    private javax.swing.JRadioButton plasticTypeGUIRB5;
    private javax.swing.JRadioButton plasticTypeGUIRBNI;
    private javax.swing.JButton saveOrderGUIButton;
    // End of variables declaration//GEN-END:variables
}

/**
     * Validation of pipe length & diameter
     */
    private double pipeLength;
    private int PipeColour;
    private static final double minLength = 0.5; // the minimum length of pipe
    private static final double maxLength = 6.0; // the maximum length of pipe
    private double outerRadius;
    private int plasticGrade;
    private int quantityOfPipe;
    private static int minQty = 1; // the minimum quantities of pipe that can be ordered
    private static int maxQty = 100; // the maximum quantities of pipe that can be ordered
    private boolean isItInsulated;
    private boolean isItReinforced;
    private boolean checmicalResistant;
    private PipeColour pipeColour; //an object.
    private final PipeType pipeGrade;
    private static Order order;
    protected static double[] basicCost = {INSERT VALUES OF PIPES HERE}; // the basic cost of 1 sqm of pipe
    protected static double[] colourCost = {12,15}; // additional costs for colours
    protected static int sealableTopsCost = 5; // additional costs for insulation
    protected static int reinforcedBottomCost = 10; // additional costs for outer reinforcement
    */

    private void systemInit() {
        
        //initialise the model of the list from the GUI which will display the ordered boxes
        orderList = new DefaultListModel();
        orderDetails.setModel(orderList);
        
        //initialise the types of boxes 
        boxTypesInit();

    }

private void pipeTypeInit() {
        //create the array of pipetypes
        PipeTypes = new ArrayList<>();
        pipeGrades = new int[]{1,2,3};
        //create the first boxtype and add it to the ArrayList
        BoxType boxType1 = new SimpleBoxType(cardGrades);
        BoxTypes.add(boxType1);
        //create the 2nd boxtype and add it to the ArrayList
        cardGrades = new int[]{2,3,4};
        BoxType boxType2 = new ColoredBoxType(cardGrades, 1);
        BoxTypes.add(boxType2);
        //create the 3rd boxtype and add it to the ArrayList
        cardGrades = new int[]{2,3,4,5};
        BoxType boxType3 = new ColoredBoxType(cardGrades, 2);
        BoxTypes.add(boxType3);
        //create the 4th boxtype and add it to the ArrayList
        cardGrades = new int[]{2,3,4,5};
        BoxType boxType4 = new ReinforcedBoxType(cardGrades, 2, true, false);
        BoxTypes.add(boxType4);
        //create the 5th boxtype and add it to the ArrayList
        cardGrades = new int[]{3,4,5};
        BoxType boxType5 = new ReinforcedBoxType(cardGrades, 2, true, true);
        BoxTypes.add(boxType5);
        //end boxtypes creation
    }

 /*
     * Checks if there are any set errors and if the box can be supplied
     */
    private void checkErrors() {
        if(!"".equals(heightError.getText()) || !"".equals(widthError.getText()) || !"".equals(lengthError.getText()) ||
           !"".equals(quantityError.getText()) || !"".equals(colourPrintError.getText()) || !"".equals(gradeError.getText()))
        {
            
        }
        else
        {
            //check if the type of box can be supplied
            if(canBeSupplied())
            {
                placeOrder(); // place the order and display the total cost
                resetFields(); // reset the fields before a new order
                boxTypesInit(); // we have to re-initialise the box types because we modified the card grade of a box type when we created the box so that it had only one value in the array
                
            }
            else
            {
                setTypeError("This type of box cannot be supplied ! Please try another configuration !");
            }
        }
    }

 /*
     * Displays the order details on the screen
     */
    private void displayOrderInList() {
        String output = quantity + " x Box (width: " + boxWidth + unitMeasure + "; height: " + boxHeight + unitMeasure +
                             "; length: " + boxLength + unitMeasure + "; grade: " + cardGrade + "; colour: " + colourPrint +"; ";
        if(reinforcedBottom) {
            output = output + "with reinforced bottom; ";
        }
        if(reinforcedCorners) {
            output = output + "with reinforced corners; ";
        }
        if(sealableTops) {
            output = output + "with sealable tops; ";
        }
        output = output + ")";
        orderList.addElement(output);
    }
    
    /*
     * Displays the total cost of the order on the screen
     */
    private void displayTotalCost(double cost) {
        DecimalFormat costFormat = new DecimalFormat("#.##");
        totalCost.setText(costFormat.format(cost));
    }
