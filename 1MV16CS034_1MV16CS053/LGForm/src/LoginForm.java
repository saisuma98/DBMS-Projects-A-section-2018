/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suma
 */
//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;

public class LoginForm extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pat = null;
    ResultSet rs = null;

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
       this.setSize(tk.getScreenSize().width, tk.getScreenSize().height);
       // System.out.println("width="+tk.getScreenSize().width+"height="+tk.getScreenSize().height);
       // JPnlBack.setVisible(false);
        // JPnlBack.setLocation(JPnlBack.getLocation().x,JPnlBack.getLocation().y);
        // int px=JPnlBack.getLocation().x;
         //int py=JPnlBack.getLocation().y;
         
        animate();
    }
    Timer t;
    
    private void animate(){
        
        t = new Timer(30, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              // JPnlBack.setVisible(true);
             
            
                        JPnlBack.setLocation(JPnlBack.getLocation().x,JPnlBack.getLocation().y+20);
                       if(JPnlBack.getLocation().y>getContentPane().getHeight());
                                t.stop();
           }
       });
       
       t.start();
       
       
       
       
        
        
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        JPnlBack = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        btnsubmit = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2);
        jPanel2.setBounds(36, 0, 0, 0);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("LOCAL GUARDIAN MANAGEMENT  SYSTEM");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(260, 90, 1080, 56);

        JPnlBack.setBackground(new java.awt.Color(51, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("TEACHER LOGIN");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Username  : ");

        user.setToolTipText("Username");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Password  :");

        btnsubmit.setBackground(new java.awt.Color(0, 102, 153));
        btnsubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsubmit.setText("LOGIN");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        addUser.setBackground(new java.awt.Color(204, 0, 51));
        addUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addUser.setForeground(new java.awt.Color(255, 204, 204));
        addUser.setText("NEW USER?");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPnlBackLayout = new javax.swing.GroupLayout(JPnlBack);
        JPnlBack.setLayout(JPnlBackLayout);
        JPnlBackLayout.setHorizontalGroup(
            JPnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPnlBackLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(JPnlBackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(JPnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPnlBackLayout.createSequentialGroup()
                        .addComponent(btnsubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addUser)
                        .addGap(82, 82, 82))
                    .addGroup(JPnlBackLayout.createSequentialGroup()
                        .addGroup(JPnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(pass))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        JPnlBackLayout.setVerticalGroup(
            JPnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(JPnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsubmit))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel3.add(JPnlBack);
        JPnlBack.setBounds(500, 320, 422, 234);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lgform/build.png"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 10, 1430, 810);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(-10, -40, 1450, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed

        // TODO add your handling code here:
        String query = "SELECT NAME,USERNAME,PASSWORD FROM LOGIN WHERE USERNAME=? AND PASSWORD=?;";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lgform", "root", "konda");
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, user.getText());
            pst.setString(2, pass.getText());

            ResultSet pp = pst.executeQuery();

            if (pp.next()) {

                welcome sg = new welcome(pp.getString(1));
                sg.setVisible(true);
                this.dispose();
                ResultSet rs1 = null;
                String Sql = "Select s.usn,s.student_name from student s, login f where f.name=s.local_guardian_name and f.username='" + user.getText() + "'";
                PreparedStatement pat = con.prepareStatement(Sql);

                rs = pat.executeQuery();

                sg.JTableUsnName.setModel(DbUtils.resultSetToTableModel(rs));

            } else {
                user.setText(null);
                pass.setText(null);
                JOptionPane.showMessageDialog(null, "invalid username or password");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_btnsubmitActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        // TODO add your handling code here:
        AddUser add = new AddUser();
        add.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_addUserActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPnlBack;
    private javax.swing.JButton addUser;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
