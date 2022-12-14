
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
        initComponents();
        
        
        
        
        
        
        this.setLocationRelativeTo (null);
       jLabel_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/building.jpg")));
       Username_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/username_field.png")));
       Password_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password_field.png")));
        //add border to jlabel title
        Border title_border=BorderFactory.createMatteBorder(0, 0, 3, 0, Color.RED);
        jLabel_Title.setBorder(title_border);
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
        jLabel_Image = new javax.swing.JLabel();
        jLabel_Title = new javax.swing.JLabel();
        Username_Icon = new javax.swing.JLabel();
        Password_Icon = new javax.swing.JLabel();
        Enter_Username = new javax.swing.JTextField();
        Enter_Password = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Image.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/building.jpg"))); // NOI18N
        jLabel_Image.setMaximumSize(new java.awt.Dimension(500, 800));
        jLabel_Image.setMinimumSize(new java.awt.Dimension(500, 800));
        jLabel_Image.setOpaque(true);
        jLabel_Image.setPreferredSize(new java.awt.Dimension(950, 800));

        jLabel_Title.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(0, 0, 204));
        jLabel_Title.setText("LOGIN");

        Username_Icon.setBackground(new java.awt.Color(204, 204, 255));
        Username_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/username_field.png"))); // NOI18N
        Username_Icon.setOpaque(true);
        Username_Icon.setPreferredSize(new java.awt.Dimension(50, 50));

        Password_Icon.setBackground(new java.awt.Color(204, 204, 255));
        Password_Icon.setOpaque(true);

        Enter_Username.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Enter_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Enter_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Enter_UsernameFocusLost(evt);
            }
        });
        Enter_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter_UsernameActionPerformed(evt);
            }
        });

        Enter_Password.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N

        jButton_Login.setBackground(new java.awt.Color(0, 0, 204));
        jButton_Login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Login.setText("Log In");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Title)
                    .addComponent(jButton_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Username_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Password_Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Enter_Password))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(Enter_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Enter_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Username_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Password_Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Enter_Password))
                .addGap(106, 106, 106)
                .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void Enter_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Enter_UsernameActionPerformed

    private void Enter_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Enter_UsernameFocusGained
        // remove the text file from the text field on focus gained
      
        /*
        // if the text field text = "username"
       if (Username_Icon.getText().trim().toLowerCase().equals("Username"))
       {
           Username_Icon.setText(" ");
           // change the text field colour to black
           Username_Icon.setForeground(Color.black);
       }
        */
    }//GEN-LAST:event_Enter_UsernameFocusGained

    private void Enter_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Enter_UsernameFocusLost
        // if the text field is empty  (set it to 'Username')
      /*
        if (Username_Icon.getText().trim().equals(" ") ||Username_Icon.getText().trim().toLowerCase().equals("Username"))
       {
           Username_Icon.setText("UserName");
           // change the text field colour to black
           Username_Icon.setForeground(new Color(153,153,153));
       } */
    }//GEN-LAST:event_Enter_UsernameFocusLost
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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Enter_Password;
    private javax.swing.JTextField Enter_Username;
    private javax.swing.JLabel Password_Icon;
    private javax.swing.JLabel Username_Icon;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
