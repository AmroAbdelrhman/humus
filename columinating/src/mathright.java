/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amabd7808
 */
public class mathright extends javax.swing.JFrame {

    /**
     * Creates new form mathright
     */
    public mathright() {
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

        jPanel1 = new javax.swing.JPanel();
        lbltitle1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadiscription = new javax.swing.JTextArea();
        lbltypeanswer = new javax.swing.JLabel();
        txtfanswer = new javax.swing.JTextField();
        btnslap = new javax.swing.JButton();
        btncomplain = new javax.swing.JButton();
        lblpic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitle1.setFont(new java.awt.Font("Ti92Pluspc", 1, 24)); // NOI18N
        lbltitle1.setText("Make your own adventure stage 3");

        txtadiscription.setColumns(20);
        txtadiscription.setRows(5);
        txtadiscription.setText("It is 3:20 and the last period was \ndone and on your way to your locker \nto get your jacket you saw your \nmusic classmate (Hizashi) that you \nhate the most because he keeps \nyelling at Shinji and insulting him \nbecause he is a Japanese boy who \ncame to learn English new. Hizashi  \nleaned to you and said\nHizashi: look at you walking in a \nschool that is not yours \nYou ignored him until he started \nswearing at you in Japanese and told \nyou \n“I dare you to even say the English \nalphabet letters” (please write all of \nthem in capital letter) you looked at \nhim and said it all. You got so mad at him \n");
        txtadiscription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtadiscriptionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtadiscription);

        lbltypeanswer.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        lbltypeanswer.setText("Type your answer here ");

        btnslap.setText("Slap him in the shoulder");
        btnslap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnslapActionPerformed(evt);
            }
        });

        btncomplain.setText("go to the office and complain");
        btncomplain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomplainActionPerformed(evt);
            }
        });

        lblpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/yamada.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(lbltitle1)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(lbltypeanswer)
                    .addComponent(txtfanswer))
                .addGap(18, 18, 18)
                .addComponent(lblpic)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnslap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncomplain)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltypeanswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfanswer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblpic, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnslap)
                    .addComponent(btncomplain))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtadiscriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtadiscriptionMouseClicked
    txtadiscription.setEditable(false);
    }//GEN-LAST:event_txtadiscriptionMouseClicked

    private void btnslapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnslapActionPerformed
 String answer;
 answer = (txtfanswer.getText());
 if (answer == "ABCDEFGHIJKLMNOPQRSTUVWXYZ"){
     this.setVisible(false);
     new Englishslapright().setVisible(true);
 }
 else {
     this.setVisible(false);
     new Englishslapwrong().setVisible(true);
    }         // TODO add your handling code here:
    }//GEN-LAST:event_btnslapActionPerformed

    private void btncomplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomplainActionPerformed
    String answer;
 answer = (txtfanswer.getText());
 if (answer == "ABCDEFGHIJKLMNOPQRSTUVWXYZ"){
     this.setVisible(false);
     new Englishcomplainright().setVisible(true);
 }
 else {
     this.setVisible(false);
     new Englishcomplainwrong().setVisible(true);
    }//GEN-LAST:event_btncomplainActionPerformed

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
            java.util.logging.Logger.getLogger(mathright.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mathright.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mathright.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mathright.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mathright().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncomplain;
    private javax.swing.JButton btnslap;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblpic;
    private javax.swing.JLabel lbltitle1;
    private javax.swing.JLabel lbltypeanswer;
    private javax.swing.JTextArea txtadiscription;
    private javax.swing.JTextField txtfanswer;
    // End of variables declaration//GEN-END:variables
}
