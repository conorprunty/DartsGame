/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darts;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author a990553
 */
public class Score extends javax.swing.JFrame {

    /**
     * Creates new form Score
     */
    public Score() {
        initComponents();
        enterButton.setVisible(false);
        scoreEntryTf.setVisible(false);
        mainGamePlayPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gameOptionsComboBox = new javax.swing.JComboBox<>();
        chooseGameLabel = new javax.swing.JLabel();
        gameChoiceButton = new javax.swing.JButton();
        mainGamePlayPanel = new javax.swing.JPanel();
        gameChosenLabel = new javax.swing.JLabel();
        currentScoreLabel = new javax.swing.JLabel();
        gameChosen2Label = new javax.swing.JLabel();
        enterScoreLabel = new javax.swing.JLabel();
        scoreEntryTf = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        player1Label = new javax.swing.JLabel();
        player2Label = new javax.swing.JLabel();
        currentScoreLabelP2 = new javax.swing.JLabel();
        gameChosen2LabelP2 = new javax.swing.JLabel();
        enterScoreLabelP2 = new javax.swing.JLabel();
        scoreEntryTfP2 = new javax.swing.JTextField();
        enterButtonP2 = new javax.swing.JButton();
        playerOneWinsLabel = new javax.swing.JLabel();
        playerOneWins = new javax.swing.JLabel();
        playerTwoWinsLabel = new javax.swing.JLabel();
        playerTwoWins = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Let's play Darts!");
        setResizable(false);

        gameOptionsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "301", "501" }));
        gameOptionsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameOptionsComboBoxActionPerformed(evt);
            }
        });

        chooseGameLabel.setText("Choose Game:");

        gameChoiceButton.setText("Go!");
        gameChoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameChoiceButtonActionPerformed(evt);
            }
        });

        gameChosenLabel.setText("dummyText");

        currentScoreLabel.setText("dummyText");

        gameChosen2Label.setText("dummyText");

        enterScoreLabel.setText("dummyText");

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        player1Label.setText("Player 1:");

        player2Label.setText("Player 2:");

        currentScoreLabelP2.setText("dummyText");

        gameChosen2LabelP2.setText("dummyText");

        enterScoreLabelP2.setText("dummyText");

        enterButtonP2.setText("Enter");
        enterButtonP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonP2ActionPerformed(evt);
            }
        });

        playerOneWinsLabel.setText("Wins:");

        playerOneWins.setText("0");

        playerTwoWinsLabel.setText("Wins:");

        playerTwoWins.setText("0");

        javax.swing.GroupLayout mainGamePlayPanelLayout = new javax.swing.GroupLayout(mainGamePlayPanel);
        mainGamePlayPanel.setLayout(mainGamePlayPanelLayout);
        mainGamePlayPanelLayout.setHorizontalGroup(
            mainGamePlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainGamePlayPanelLayout.createSequentialGroup()
                .addGroup(mainGamePlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainGamePlayPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(mainGamePlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainGamePlayPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(mainGamePlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(currentScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player1Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainGamePlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainGamePlayPanelLayout.createSequentialGroup()
                                        .addComponent(playerOneWinsLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(playerOneWins))
                                    .addComponent(gameChosen2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addGroup(mainGamePlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(currentScoreLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player2Label)
                                    .addComponent(enterScoreLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(gameChosenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainGamePlayPanelLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(enterButton))
                    .addGroup(mainGamePlayPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(enterScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scoreEntryTf, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainGamePlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainGamePlayPanelLayout.createSequentialGroup()
                        .addComponent(enterButtonP2)
                        .addGap(87, 87, 87))
                    .addGroup(mainGamePlayPanelLayout.createSequentialGroup()
                        .addGroup(mainGamePlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameChosen2LabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scoreEntryTfP2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainGamePlayPanelLayout.createSequentialGroup()
                                .addComponent(playerTwoWinsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerTwoWins)))
                        .addGap(52, 52, 52))))
        );
        mainGamePlayPanelLayout.setVerticalGroup(
            mainGamePlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainGamePlayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameChosenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainGamePlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1Label)
                    .addComponent(player2Label)
                    .addComponent(playerOneWinsLabel)
                    .addComponent(playerOneWins)
                    .addComponent(playerTwoWinsLabel)
                    .addComponent(playerTwoWins))
                .addGap(13, 13, 13)
                .addGroup(mainGamePlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameChosen2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentScoreLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameChosen2LabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainGamePlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreEntryTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterScoreLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreEntryTfP2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(mainGamePlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterButton)
                    .addComponent(enterButtonP2))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gameChoiceButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chooseGameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(gameOptionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(mainGamePlayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gameOptionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseGameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gameChoiceButton)
                .addGap(27, 27, 27)
                .addComponent(mainGamePlayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gameOptionsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameOptionsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameOptionsComboBoxActionPerformed

    private void gameChoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameChoiceButtonActionPerformed
        // TODO add your handling code here:
        if (gameChoiceButton.getText().equals("Reset")) {
            int choice = JOptionPane.showConfirmDialog(null,
                    "Are you sure? This will reset the players scores",
                    "Reset",
                    JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                playerOneWins.setText("0");
                playerTwoWins.setText("0");
            }
        } else {
            gameChosenLabel.setText("Game Chosen: " + gameOptionsComboBox.getSelectedItem());
            currentScoreLabel.setText("Current Score: ");
            currentScoreLabelP2.setText("Current Score: ");
            gameChosen2Label.setText((String) gameOptionsComboBox.getSelectedItem());
            gameChosen2LabelP2.setText((String) gameOptionsComboBox.getSelectedItem());
            enterScoreLabel.setText("Enter Score: ");
            enterScoreLabelP2.setText("Enter Score: ");
            enterButton.setVisible(true);
            scoreEntryTf.setVisible(true);
            mainGamePlayPanel.setVisible(true);
            scoreEntryTf.setText("");
            gameChoiceButton.setText("Reset");
            hidePlayerTwo();
        }

        //jTextField1.setText("");
    }//GEN-LAST:event_gameChoiceButtonActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        // TODO add your handling code here:
        if (checkIfNumber(scoreEntryTf.getText())) {
            int currentScore = Integer.parseInt(gameChosen2Label.getText());
            int pointsThrown = Integer.parseInt(scoreEntryTf.getText());
            if (currentScore > pointsThrown) {
                int updatedScore = currentScore - pointsThrown;
                gameChosen2Label.setText(Integer.toString(updatedScore));
                scoreEntryTf.setText("");
                showPlayerTwo();
                hidePlayerOne();
            } else if (currentScore == pointsThrown) {
                JOptionPane.showMessageDialog(null, player1Label.getText() + " wins!");
                playerOneWins.setText(Integer.toString(addOneToWins(playerOneWins.getText())));
                scoreEntryTf.setText("");
                gameChosen2Label.setText(gameChosenLabel.getText().replaceAll("[^0-9]", ""));
                gameChosen2LabelP2.setText(gameChosenLabel.getText().replaceAll("[^0-9]", ""));
                //gameChoiceButton.setText("Go!");
                //startAgain();
            } else {
                JOptionPane.showMessageDialog(null, "You can't possibly have scored that.");
                scoreEntryTf.setText("");
            }
        } else {
            scoreEntryTf.setText("");
        }


    }//GEN-LAST:event_enterButtonActionPerformed

    private void enterButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonP2ActionPerformed
        // TODO add your handling code here:
        if (checkIfNumber(scoreEntryTfP2.getText())) {
            int currentScore = Integer.parseInt(gameChosen2LabelP2.getText());
            int pointsThrown = Integer.parseInt(scoreEntryTfP2.getText());
            if (currentScore > pointsThrown) {
                int updatedScore = currentScore - pointsThrown;
                gameChosen2LabelP2.setText(Integer.toString(updatedScore));
                scoreEntryTfP2.setText("");
                showPlayerOne();
                hidePlayerTwo();
            } else if (currentScore == pointsThrown) {
                JOptionPane.showMessageDialog(null, player2Label.getText() + " wins!");
                playerTwoWins.setText(Integer.toString(addOneToWins(playerTwoWins.getText())));
                scoreEntryTfP2.setText("");
                showPlayerOne();
                hidePlayerTwo();
                gameChosen2Label.setText(gameChosenLabel.getText().replaceAll("[^0-9]", ""));
                gameChosen2LabelP2.setText(gameChosenLabel.getText().replaceAll("[^0-9]", ""));
                //gameChoiceButton.setText("Go!");
                //startAgain();
            } else {
                JOptionPane.showMessageDialog(null, "You can't possibly have scored that.");
                scoreEntryTfP2.setText("");
            }
        } else {
            scoreEntryTfP2.setText("");
        }

    }//GEN-LAST:event_enterButtonP2ActionPerformed

    boolean checkIfNumber(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "You did not enter a number!");
            return false;
        }
        return true;
    }

    public void startAgain() {
        mainGamePlayPanel.setVisible(false);
    }

    public void hidePlayerOne() {
        enterScoreLabel.setVisible(false);
        scoreEntryTf.setVisible(false);
        enterButton.setVisible(false);
    }

    public void hidePlayerTwo() {
        enterScoreLabelP2.setVisible(false);
        scoreEntryTfP2.setVisible(false);
        enterButtonP2.setVisible(false);
    }

    public void showPlayerOne() {
        enterScoreLabel.setVisible(true);
        scoreEntryTf.setVisible(true);
        enterButton.setVisible(true);
    }

    public void showPlayerTwo() {
        enterScoreLabelP2.setVisible(true);
        scoreEntryTfP2.setVisible(true);
        enterButtonP2.setVisible(true);
    }

    public int addOneToWins(String s) {
        int newAmount = (Integer.parseInt(s) + 1);
        return newAmount;
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
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Score().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseGameLabel;
    private javax.swing.JLabel currentScoreLabel;
    private javax.swing.JLabel currentScoreLabelP2;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton enterButtonP2;
    private javax.swing.JLabel enterScoreLabel;
    private javax.swing.JLabel enterScoreLabelP2;
    private javax.swing.JButton gameChoiceButton;
    private javax.swing.JLabel gameChosen2Label;
    private javax.swing.JLabel gameChosen2LabelP2;
    private javax.swing.JLabel gameChosenLabel;
    private javax.swing.JComboBox<String> gameOptionsComboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainGamePlayPanel;
    private javax.swing.JLabel player1Label;
    private javax.swing.JLabel player2Label;
    private javax.swing.JLabel playerOneWins;
    private javax.swing.JLabel playerOneWinsLabel;
    private javax.swing.JLabel playerTwoWins;
    private javax.swing.JLabel playerTwoWinsLabel;
    private javax.swing.JTextField scoreEntryTf;
    private javax.swing.JTextField scoreEntryTfP2;
    // End of variables declaration//GEN-END:variables
}
