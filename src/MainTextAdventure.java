/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Illuminati
 */

public class MainTextAdventure extends javax.swing.JFrame {

    /**
     * Creates new form MainTextAdventure
     */
    public int playerHealth;
    public String playerName;
    public boolean gameisOn;
    
    public MainTextAdventure() {
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

        input_RestartGame = new javax.swing.JButton();
        output_Desc_Name = new javax.swing.JLabel();
        input_Name = new javax.swing.JTextField();
        input_StartNewGame = new javax.swing.JButton();
        output_Desc_Drug = new javax.swing.JLabel();
        input_DrugSelection = new javax.swing.JComboBox();
        input_Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drug Trip Text Adventure");
        setBackground(new java.awt.Color(56, 56, 56));
        setLocation(new java.awt.Point(250, 400));

        input_RestartGame.setText("Restart Game");

        output_Desc_Name.setText("Your Name:");

        input_Name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        input_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_NameActionPerformed(evt);
            }
        });

        input_StartNewGame.setText("Start Game");
        input_StartNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_StartNewGameActionPerformed(evt);
            }
        });

        output_Desc_Drug.setText("Drug:");

        input_DrugSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Weed", "LSD", "Magic Mushrooms" }));

        input_Exit.setText("Exit");
        input_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(output_Desc_Drug)
                    .addComponent(output_Desc_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(input_StartNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input_RestartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(input_DrugSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_StartNewGame)
                    .addComponent(input_RestartGame)
                    .addComponent(input_Exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(output_Desc_Name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_DrugSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(output_Desc_Drug))
                .addGap(0, 55, Short.MAX_VALUE))
        );

        input_RestartGame.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Name: input_StartNewGameActionPerformed(java.awt.event.ActionEvent evt)
    // Desc: Starts the Game
    // Returns: Nothing
    private void input_StartNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_StartNewGameActionPerformed

        int selectedObject = input_DrugSelection.getSelectedIndex( );
        
        new chatBox( ).setVisible( true );
        
        if ( selectedObject == 0 )
        {
            gameisOn = true;
            new weedTripAdventure( ).setVisible( true );
        }
        else if ( selectedObject == 1 )
        {
            gameisOn = true;
            new lsdtripAdventure( ).setVisible( true );
        }
        else if ( selectedObject == 2 )
        {
            gameisOn = true;
            new mushroomtripAdventure( ).setVisible( true );
        }
        
    }//GEN-LAST:event_input_StartNewGameActionPerformed

    private void input_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_input_ExitActionPerformed

    public String startGameName()
    {
        String v = "";
        
        if ( gameisOn )
        {
            v = input_Name.getText();
        }
        return playerName = v;
    }     
    
    public String getplayerName()
    {
        return playerName;
    }
    
    
    public int startGameHealth()
    {
        int v = 0;
        
        if ( gameisOn )
        {
            v = 100;
            
        }
        return playerHealth = v;
    }     
    
    private void input_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_NameActionPerformed

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
            java.util.logging.Logger.getLogger(MainTextAdventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainTextAdventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainTextAdventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainTextAdventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainTextAdventure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox input_DrugSelection;
    private javax.swing.JButton input_Exit;
    private javax.swing.JTextField input_Name;
    public javax.swing.JButton input_RestartGame;
    private javax.swing.JButton input_StartNewGame;
    private javax.swing.JLabel output_Desc_Drug;
    private javax.swing.JLabel output_Desc_Name;
    // End of variables declaration//GEN-END:variables
}