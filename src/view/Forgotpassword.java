package view;

import controller.SpendSmartController;
import javax.swing.JOptionPane;
import view.Login;
import view.SpendSmartApp;


public class Forgotpassword extends javax.swing.JFrame {

    public Forgotpassword() {
        initComponents();
        this.setSize(879, 511);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        findPassword = new javax.swing.JButton();
        loginBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(92, 158, 173));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(50, 98, 115));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 200));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Forgot your password ?");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 30, 240, 27);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter your Email:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 110, 450, 50);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Please enter your email to recover your password");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 60, 450, 50);

        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });
        jPanel2.add(emailText);
        emailText.setBounds(30, 150, 440, 30);

        findPassword.setBackground(new java.awt.Color(50, 98, 115));
        findPassword.setForeground(new java.awt.Color(255, 255, 255));
        findPassword.setText("Find My Password!");
        findPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(findPassword);
        findPassword.setBounds(30, 210, 440, 30);

        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Back To login ");
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        jPanel2.add(loginBtn);
        loginBtn.setBounds(200, 260, 120, 22);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(170, 80, 520, 335);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SPEND SMART");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(350, 30, 180, 26);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 20, 60, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void findPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findPasswordActionPerformed
        String email = emailText.getText();
        SpendSmartController controller = new SpendSmartController();
        if (controller.findPassword(email)) {
            dispose();
            Resetpassword ps = new Resetpassword(email);
            ps.show();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Email");
            emailText.setText("");
        }
        }//GEN-LAST:event_findPasswordActionPerformed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        Login login = new Login();
        dispose();
        login.show();
    }//GEN-LAST:event_loginBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgotpassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailText;
    private javax.swing.JButton findPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loginBtn;
    // End of variables declaration//GEN-END:variables
}
