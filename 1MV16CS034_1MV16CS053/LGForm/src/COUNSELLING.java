
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Harshitha
 */
public class COUNSELLING extends javax.swing.JFrame {

    /**
     * Creates new form COUNSELLING
     */
    public COUNSELLING() {
        initComponents();
         Toolkit tk = Toolkit.getDefaultToolkit();
        this.setSize(tk.getScreenSize().width, tk.getScreenSize().height);

    }
    String usn;
    String LgName;

    public COUNSELLING(String usn,String LgName) throws SQLException {

        initComponents();
        this.usn = usn;
        this.LgName= LgName;
        JUsn.setText(usn);
        cid.setEnabled(false);
        getTheActivityId();
        updateJTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        csem = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        cdate = new javax.swing.JTextField();
        issue = new javax.swing.JTextField();
        remarks = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ctable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        JLblUsn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JUsn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transp.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setBackground(new java.awt.Color(0, 51, 51));
        jPanel11.setLayout(null);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 51));
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton3);
        jButton3.setBounds(470, 310, 147, 25);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 255));
        jLabel26.setText("SEMESTER                    :");
        jPanel11.add(jLabel26);
        jLabel26.setBounds(390, 100, 131, 28);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 255));
        jLabel27.setText("COUNSELING_ID         :");
        jPanel11.add(jLabel27);
        jLabel27.setBounds(390, 130, 131, 30);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 255));
        jLabel28.setText("DATE                              :");
        jPanel11.add(jLabel28);
        jLabel28.setBounds(390, 170, 131, 32);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 255));
        jLabel29.setText("ISSUES                            :");
        jPanel11.add(jLabel29);
        jLabel29.setBounds(390, 210, 131, 29);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 255));
        jLabel30.setText("REMARKS                      :");
        jPanel11.add(jLabel30);
        jLabel30.setBounds(390, 250, 131, 31);

        csem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csemActionPerformed(evt);
            }
        });
        jPanel11.add(csem);
        csem.setBounds(540, 100, 130, 24);

        cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidActionPerformed(evt);
            }
        });
        jPanel11.add(cid);
        cid.setBounds(540, 140, 130, 25);
        jPanel11.add(cdate);
        cdate.setBounds(540, 180, 130, 20);
        jPanel11.add(issue);
        issue.setBounds(540, 210, 130, 29);
        jPanel11.add(remarks);
        remarks.setBounds(540, 260, 130, 20);

        ctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(ctable);

        jPanel11.add(jScrollPane3);
        jScrollPane3.setBounds(520, 390, 594, 112);

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 204, 204));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton1);
        jButton1.setBounds(670, 310, 73, 25);
        jPanel11.add(JLblUsn);
        JLblUsn.setBounds(1044, 60, 129, 25);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("USN                                :");
        jPanel11.add(jLabel2);
        jLabel2.setBounds(390, 70, 131, 29);

        JUsn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JUsn.setForeground(new java.awt.Color(255, 204, 204));
        JUsn.setText("usn");
        jPanel11.add(JUsn);
        JUsn.setBounds(540, 70, 116, 17);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("COUNSELLING DETAILS");
        jPanel11.add(jLabel1);
        jLabel1.setBounds(420, 10, 433, 42);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transp.png"))); // NOI18N
        jPanel11.add(jLabel4);
        jLabel4.setBounds(10, 260, 510, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {

            MySqlConnect my = new MySqlConnect();
            //String aid1=aid.getText().trim();
            String sem2 = csem.getText().trim();
            String usn2 = this.usn;

            // getTheActivityId();
            String cid1 = cid.getText();

            String date2 = cdate.getText();
            String issue2 = issue.getText();
            String remark2 = remarks.getText();
            int n = my.insertIntoCounseling_details(sem2, usn2, cid1, date2, issue2, remark2);
            if (n != 0) {
                JOptionPane.showMessageDialog(null, "inserted successfully");
                updateJTable();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            getTheActivityId();
        } catch (SQLException ex) {
            Logger.getLogger(COUNSELLING.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DisplayStudent ds=new DisplayStudent(usn,LgName);
        ds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void csemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csemActionPerformed

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
            java.util.logging.Logger.getLogger(COUNSELLING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(COUNSELLING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(COUNSELLING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(COUNSELLING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new COUNSELLING().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLblUsn;
    private javax.swing.JLabel JUsn;
    private javax.swing.JTextField cdate;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField csem;
    private javax.swing.JTable ctable;
    private javax.swing.JTextField issue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField remarks;
    // End of variables declaration//GEN-END:variables

    private void getTheActivityId() throws SQLException {
        MySqlConnect obj = new MySqlConnect();

        int n = obj.getCounselingIdFromCounseling(usn);

        cid.setText((n + 1) + "");
        cid.setEditable(false);

    }

    private void updateJTable() throws SQLException {
        MySqlConnect obj = new MySqlConnect();

        ResultSet rs = obj.getCounseling(usn);

        // if(rs.){
        //   rs.absolute(1);
        ctable.setModel(DbUtils.resultSetToTableModel(rs));

    }

    // private void getTheActivityId() {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
}