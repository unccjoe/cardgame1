/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Cards.Base.*;
import Cards.Card;
import Cards.Fish.*;
import cardgame1.Board;
import cardgame1.Hero;
import cardgame1.Main;
import cardgame1.SpriteHandler;
import java.awt.Dimension;
import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class OpeningGUI extends javax.swing.JFrame {
    /*    FIELDS      */
    private ArrayList<Card> AIDeck;
    private ArrayList<Card> PlayerDeck;
    /**
     * Creates new form OpeningGUI
     */
    public OpeningGUI() {
        initComponents();
        populateCombo();
        this.setVisible(true);
    }
    
    private void populateCombo(){
        this.yourDeckCombo.addItem("Base Deck");
        this.yourDeckCombo.addItem("Ocean Depths Theme");
        this.AIDeckCombo.addItem("Base Deck");
        this.AIDeckCombo.addItem("Ocean Depths Theme");
        repaint();
    }

    private ArrayList<Card> getBaseDeck(){
        //Base
        ArrayList<Card> BaseDeck = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            BaseDeck.add(new ArakkoaCard());
            BaseDeck.add(new ArcherCard());
            BaseDeck.add(new FireBoltCard());
            BaseDeck.add(new FrostBearCard());
            BaseDeck.add(new KnightCard());
            BaseDeck.add(new VengefullKnightCard());
        }
        return BaseDeck;
    }
    
        private ArrayList<Card> getFishDeck(){
        //Base
        ArrayList<Card> BaseDeck = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            BaseDeck.add(new BaitfishCard());
            BaseDeck.add(new CarnifishCard());
            BaseDeck.add(new ThrasherCard());
            BaseDeck.add(new PredationCard());
            BaseDeck.add(new FrenzyCard());
        }
        return BaseDeck;
    }
        /**
         * sets the decks based on combo boxes
         */
        private void assignDecks(){
                    switch(this.AIDeckCombo.getSelectedIndex()){
            case 0:
                AIDeck = this.getBaseDeck();
                break;
            case 1:
                AIDeck = this.getFishDeck();
                break;
        }
        switch(this.yourDeckCombo.getSelectedIndex()){
            case 0:
                PlayerDeck = this.getBaseDeck();
                break;
            case 1:
                PlayerDeck = this.getFishDeck();
                break;
        }
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
        resX = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resY = new javax.swing.JTextField();
        button1080 = new javax.swing.JButton();
        button720 = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        yourDeckLabel = new javax.swing.JLabel();
        opponentDeckLabel = new javax.swing.JLabel();
        yourDeckCombo = new javax.swing.JComboBox();
        AIDeckCombo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setText("CARDGAME ALPHA ");

        resX.setText("1920");
        resX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resXActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Resolution:");

        jLabel2.setText("x");

        resY.setText("1080");
        resY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resYActionPerformed(evt);
            }
        });

        button1080.setText("1080p");
        button1080.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1080ActionPerformed(evt);
            }
        });

        button720.setText("720p");
        button720.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button720ActionPerformed(evt);
            }
        });

        settingsButton.setText("Settings...");

        playButton.setText("Play!");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        yourDeckLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        yourDeckLabel.setText("Your Deck");

        opponentDeckLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        opponentDeckLabel.setText("AI Deck");

        yourDeckCombo.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resX, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resY, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button1080)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button720))
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playButton)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yourDeckCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yourDeckLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opponentDeckLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(AIDeckCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(resY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1080)
                    .addComponent(button720))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yourDeckLabel)
                    .addComponent(opponentDeckLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yourDeckCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AIDeckCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(settingsButton)
                    .addComponent(playButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resXActionPerformed

    private void resYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resYActionPerformed

    private void button1080ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1080ActionPerformed
        this.resX.setText("1920");
        this.resY.setText("1080");
    }//GEN-LAST:event_button1080ActionPerformed

    private void button720ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button720ActionPerformed
        this.resX.setText("720");
        this.resY.setText("1280");
    }//GEN-LAST:event_button720ActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        this.assignDecks();
        int x = 0, y =0;
        try{
            x = Integer.parseInt(this.resX.getText());
            y = Integer.parseInt(this.resY.getText());
        }catch(NumberFormatException nfe){
            Main.display("Invalid dimensions. Must be numeric.");
            return;
        }catch(Exception e){
            e.printStackTrace();
        }
        Hero enemy = new Hero("AI Hero", AIDeck, SpriteHandler.ashePortrait);
        enemy.setAIControlled(true);
        Hero player = new Hero("Player Hero", PlayerDeck, SpriteHandler.ashePortrait);
        if(x < 480 || y < 480){
            Main.display("Warning, window too small");
            return;
        }
        Board b = new Board(enemy, player, new Dimension(x,y));
        this.dispose();
    }//GEN-LAST:event_playButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AIDeckCombo;
    private javax.swing.JButton button1080;
    private javax.swing.JButton button720;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel opponentDeckLabel;
    private javax.swing.JButton playButton;
    private javax.swing.JTextField resX;
    private javax.swing.JTextField resY;
    private javax.swing.JButton settingsButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox yourDeckCombo;
    private javax.swing.JLabel yourDeckLabel;
    // End of variables declaration//GEN-END:variables
}
