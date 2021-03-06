/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Cards.Card;
import Minions.Minion;
import cardgame1.Hero;
import cardgame1.Main;

/**
 *
 * @author Joseph
 */
public class SettingsPane extends javax.swing.JFrame {

    /**
     * Creates new form Settingspane
     */
    public SettingsPane() {
        initComponents();
        this.aiSpeedField.setText(String.valueOf(AI.AI.speed));
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        aiSPeedLabel = new javax.swing.JLabel();
        aiSpeedField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        showValueButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        gameOverLabel = new javax.swing.JLabel();
        disableButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("SETTINGS");

        aiSPeedLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aiSPeedLabel.setText("Effect Duration");
        aiSPeedLabel.setToolTipText("Determines length of pauses between AI moves and How long visual effects and card previews last\nincrease if you find reading cards in time too difficult");

        aiSpeedField.setText("800");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        showValueButton.setText("Show Value");
        showValueButton.setToolTipText("Displays how valuable a card is to the AI, mainly for debugging. May Hurt Performance");
        showValueButton.setAutoscrolls(true);
        showValueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showValueButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Display AI-Assessed Value on cards");
        jLabel1.setToolTipText("Displays how valuable a card is to the AI, mainly for debugging.");

        gameOverLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gameOverLabel.setText("Disable Game Over On Death");
        gameOverLabel.setToolTipText("If disabled, game continues after a hero dies. putting the hero into negative HP");

        disableButton.setText("Disabled");
        disableButton.setToolTipText("");
        disableButton.setAutoscrolls(true);
        disableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disableButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aiSPeedLabel)
                    .addComponent(jLabel1)
                    .addComponent(gameOverLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showValueButton)
                    .addComponent(aiSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disableButton))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aiSPeedLabel)
                    .addComponent(aiSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showValueButton)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gameOverLabel)
                    .addComponent(disableButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
           int newSpeed = Integer.parseInt(this.aiSpeedField.getText());
           AI.AI.speed = newSpeed;
       }catch(NumberFormatException nfe){
           Main.display("invalid number for AI speed");
           return;
       }
       Card.showValue = showValueButton.isSelected();
       Minion.showValue = showValueButton.isSelected();
       Hero.endGameOnDeath = !this.disableButton.isSelected();
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showValueButtonActionPerformed

    }//GEN-LAST:event_showValueButtonActionPerformed

    private void disableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disableButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disableButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aiSPeedLabel;
    private javax.swing.JTextField aiSpeedField;
    private javax.swing.JRadioButton disableButton;
    private javax.swing.JLabel gameOverLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton showValueButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
