package view;

import controller.SpendSmartController;
import javax.swing.JOptionPane;
import view.SpendSmartApp;

public class Signup extends javax.swing.JFrame {

    public Signup() {
        initComponents();
        this.setSize(1000,500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        registerBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        confirmedPasswordText = new javax.swing.JPasswordField();
        usernameText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(92, 158, 173));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/SPEND SMART .jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 140, 442, 570);
        jPanel1.add(jScrollBar1);
        jScrollBar1.setBounds(0, 0, 17, 48);

        jPanel3.setBackground(new java.awt.Color(92, 158, 173));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("");
        jPanel3.setFocusable(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Register");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(160, 10, 140, 60);

        emailText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailText.setForeground(new java.awt.Color(204, 204, 204));
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });
        jPanel3.add(emailText);
        emailText.setBounds(110, 250, 240, 30);

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        jPanel3.add(passwordText);
        passwordText.setBounds(110, 300, 240, 30);

        registerBtn.setBackground(new java.awt.Color(50, 98, 115));
        registerBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Registre Now ");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        jPanel3.add(registerBtn);
        registerBtn.setBounds(110, 390, 240, 50);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(110, 230, 70, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PassWord");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(110, 280, 80, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirm PassWord");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(110, 330, 170, 22);
        jPanel3.add(confirmedPasswordText);
        confirmedPasswordText.setBounds(110, 350, 240, 30);

        usernameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameText.setForeground(new java.awt.Color(204, 204, 204));
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        jPanel3.add(usernameText);
        usernameText.setBounds(110, 200, 240, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(110, 180, 100, 22);

        lastNameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastNameText.setForeground(new java.awt.Color(204, 204, 204));
        lastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextActionPerformed(evt);
            }
        });
        jPanel3.add(lastNameText);
        lastNameText.setBounds(110, 150, 240, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Last name");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(110, 130, 100, 22);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("First name");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(110, 80, 100, 22);

        firstNameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstNameText.setForeground(new java.awt.Color(204, 204, 204));
        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextActionPerformed(evt);
            }
        });
        jPanel3.add(firstNameText);
        firstNameText.setBounds(110, 100, 240, 30);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(40, 60, 50, 360);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(440, 150, 560, 560);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(380, 370, 50, 10);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -160, 1000, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void lastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextActionPerformed

    private void firstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        String firstname = firstNameText.getText();
        String lastname = lastNameText.getText();
        String username = usernameText.getText();
        String email = emailText.getText();
        String password = new String(passwordText.getPassword());
        String confirmedPassword = new String(confirmedPasswordText.getPassword());
            if (firstname == null || firstname.isEmpty()) {
                JOptionPane.showMessageDialog(this, "First Name is empty.");
            }
            if (lastname == null || lastname.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Last Name is empty.");
            }
            if (username == null || username.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Username is empty.");
            }
            if (email == null || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email is empty.");
            }

            if (password == null || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Password is empty.");
            }

            if (!password.equals(confirmedPassword)) {
                JOptionPane.showMessageDialog(this, "Confirmed Password is empty.");
            }
            if (password.equals(confirmedPassword)) {
                SpendSmartController controller = new SpendSmartController();
                if (controller.signUpUser(firstname, lastname, username, password)) {
                    dispose();
                    SpendSmartApp hpage = new SpendSmartApp(username);
                    hpage.show();
                }else {
                JOptionPane.showMessageDialog(this, "password don't match.");
                }
            }
    }//GEN-LAST:event_registerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmedPasswordText;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
