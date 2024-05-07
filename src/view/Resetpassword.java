package view;

import controller.SpendSmartController;
import javax.swing.JOptionPane;
import view.Login;
import view.Signup;


public class Resetpassword extends javax.swing.JFrame {
    String email;

    public Resetpassword() {
        initComponents();
    }
    public Resetpassword(String email) {
        initComponents();
        this.email = email;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        confirmedPasswordText = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        changePasswordBtn = new javax.swing.JButton();
        backLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(92, 158, 173));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reset  your password");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 60, 300, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confirm  password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 220, 230, 30);

        confirmedPasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmedPasswordTextActionPerformed(evt);
            }
        });
        jPanel1.add(confirmedPasswordText);
        confirmedPasswordText.setBounds(60, 250, 660, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter your new password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 130, 230, 30);

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        jPanel1.add(passwordText);
        passwordText.setBounds(60, 160, 660, 40);

        changePasswordBtn.setBackground(new java.awt.Color(50, 98, 115));
        changePasswordBtn.setForeground(new java.awt.Color(255, 255, 255));
        changePasswordBtn.setText("Change password");
        changePasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordBtnActionPerformed(evt);
            }
        });
        jPanel1.add(changePasswordBtn);
        changePasswordBtn.setBounds(60, 330, 650, 40);

        backLogin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        backLogin.setForeground(new java.awt.Color(255, 255, 255));
        backLogin.setText("Back To login ");
        backLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLoginMouseClicked(evt);
            }
        });
        jPanel1.add(backLogin);
        backLogin.setBounds(330, 400, 120, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmedPasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmedPasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmedPasswordTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void changePasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordBtnActionPerformed
        String password = new String(passwordText.getPassword());
        String confirmedPassword = new String(confirmedPasswordText.getPassword());
        if (password.equals(confirmedPassword)) {
                SpendSmartController controller = new SpendSmartController();
                if (controller.changePassword(email,password));
                    dispose();
                    Login login =new Login();
                    login.show();
                }else {
                JOptionPane.showMessageDialog(this, "password don't match.");
                }      
    }//GEN-LAST:event_changePasswordBtnActionPerformed

    private void backLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLoginMouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        dispose();
        login.show();
        
    }//GEN-LAST:event_backLoginMouseClicked

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
            java.util.logging.Logger.getLogger(Resetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resetpassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLogin;
    private javax.swing.JButton changePasswordBtn;
    private javax.swing.JPasswordField confirmedPasswordText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordText;
    // End of variables declaration//GEN-END:variables
}
