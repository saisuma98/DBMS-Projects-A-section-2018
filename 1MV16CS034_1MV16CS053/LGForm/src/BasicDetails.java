
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class BasicDetails extends javax.swing.JFrame {

    /**
     * Creates new form BasicDetails
     */
    String usn;
    String LgName;
    Connection con = null;

    public BasicDetails() {
        initComponents();
        JBtnUpdate.setEnabled(false);
    }

    public BasicDetails(String usn, String LgName) throws SQLException {

        initComponents();
        this.usn = usn;
        this.LgName = LgName;
        JBtnUpdate.setEnabled(false);
        updateFields();
        editFields(false);
    }

    public void updateFields() throws SQLException {

        MySqlConnect obj = new MySqlConnect();

        ResultSet rs = obj.getStudentDetails(usn);

        if (rs.next()) {

            Sname.setText(rs.getString(1));
            Susn.setText(rs.getString(2));
            Sbranch.setText(rs.getString(3));
            Sdob.setText(rs.getString(4));
            SEmail.setText(rs.getString(5));
            SPhn.setText(rs.getString(6));
            SLGName.setText(rs.getString(7));
            SAddress.setText(rs.getString(8));
            Stype1.setText(rs.getString(9));
            SBlood.setText(rs.getString(10));
            SHobbies.setText(rs.getString(11));
            SAdmission.setText(rs.getString(12));
            SFatherName.setText(rs.getString(13));
            SFatherPhn.setText(rs.getString(14));
            SMotherName.setText(rs.getString(15));
            SMotherPhn.setText(rs.getString(16));

        } else {
            JOptionPane.showMessageDialog(null, "Empty ResultSet");
        }

    }

    public void editFields(boolean b) {

        Sname.setEditable(b);
        SAddress.setEditable(b);
        SAdmission.setEditable(b);
        SBlood.setEditable(b);
        SEmail.setEditable(b);
        SFatherName.setEditable(b);
        SFatherPhn.setEditable(b);
        SHobbies.setEditable(b);
        SLGName.setEditable(b);
        SMotherName.setEditable(b);
        SMotherPhn.setEditable(b);
        Stype1.setEditable(b);
        Sbranch.setEditable(b);
        Sdob.setEditable(b);
        Susn.setEditable(b);
        SPhn.setEditable(b);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanBack = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Susn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SPhn = new javax.swing.JTextField();
        Sdob = new javax.swing.JTextField();
        SEmail = new javax.swing.JTextField();
        Sname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        SLGName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Sbranch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        SAddress = new javax.swing.JTextField();
        Stype1 = new javax.swing.JTextField();
        SBlood = new javax.swing.JTextField();
        SHobbies = new javax.swing.JTextField();
        SAdmission = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        SMotherPhn = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        SMotherName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SFatherPhn = new javax.swing.JTextField();
        SFatherName = new javax.swing.JTextField();
        JBtnUpdate = new javax.swing.JButton();
        JBtnEdit = new java.awt.Button();
        btnback = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("BRANCH                                  :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 73, 151, 21));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("USN                                          :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 43, 151, 19));
        jPanel1.add(Susn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 42, 164, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("STUDENT NAME                      :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 24));

        SPhn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPhnActionPerformed(evt);
            }
        });
        jPanel1.add(SPhn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 157, 164, -1));
        jPanel1.add(Sdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 164, -1));
        jPanel1.add(SEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 126, 279, -1));

        Sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnameActionPerformed(evt);
            }
        });
        jPanel1.add(Sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 14, 461, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("E-mail  ID                               :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 127, 151, 19));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("DATE OF BIRTH                     :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 101, 151, 19));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Phone Number                      :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 157, 151, 21));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 51, 51));
        jLabel32.setText("Local Guardian Name          :");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 184, 160, 20));

        SLGName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SLGNameActionPerformed(evt);
            }
        });
        jPanel1.add(SLGName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 280, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("STUDENT- LG FORM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, -40, 336, -1));
        jPanel1.add(Sbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 460, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("BASIC STUDENT DETAILS");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 51));
        jLabel13.setText("PERMANENT ADDRESS        :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 51));
        jLabel14.setText("STAY TYPE                           :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 51));
        jLabel15.setText("BLOOD  GROUP                   :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 51));
        jLabel16.setText("HOBBIES                              :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 51));
        jLabel17.setText("ADMISSION CATEGORY       :");

        SAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAddressActionPerformed(evt);
            }
        });

        Stype1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stype1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SAddress)
                    .addComponent(Stype1)
                    .addComponent(SBlood)
                    .addComponent(SHobbies, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(SAdmission))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stype1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(SBlood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SHobbies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SAdmission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("Mother's Name                     :");

        SMotherPhn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMotherPhnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 51));
        jLabel12.setText("Mother Phone Number         :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("Father Phone Number          :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Father/Gaurdian Name         :");

        JBtnUpdate.setBackground(new java.awt.Color(0, 51, 51));
        JBtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JBtnUpdate.setForeground(new java.awt.Color(0, 51, 51));
        JBtnUpdate.setText("UPDATE");
        JBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnUpdateActionPerformed(evt);
            }
        });

        JBtnEdit.setBackground(new java.awt.Color(0, 51, 51));
        JBtnEdit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JBtnEdit.setForeground(new java.awt.Color(204, 204, 255));
        JBtnEdit.setLabel("EDIT");
        JBtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SMotherPhn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SFatherPhn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SFatherName)
                    .addComponent(SMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(JBtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(JBtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(SFatherName, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SFatherPhn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JBtnUpdate, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SMotherPhn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnback.setBackground(new java.awt.Color(102, 0, 0));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 153, 153));
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lgform/stud.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(323, 323, 323)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(200, 200, 200))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(btnback)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnback))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel18)))
                .addContainerGap(378, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPanBackLayout = new javax.swing.GroupLayout(JPanBack);
        JPanBack.setLayout(JPanBackLayout);
        JPanBackLayout.setHorizontalGroup(
            JPanBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanBackLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JPanBackLayout.setVerticalGroup(
            JPanBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SPhnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPhnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPhnActionPerformed

    private void SnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SnameActionPerformed

    private void SLGNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SLGNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SLGNameActionPerformed

    private void SMotherPhnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMotherPhnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SMotherPhnActionPerformed

    private void JBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnUpdateActionPerformed
        try {

            MySqlConnect obj = new MySqlConnect();

            welcome w = new welcome();
            String sql;
            String n = null;
            //String Susn=id.getText();
            sql = "update student set student_name=?,branch_name=?,dob=?,email=?,phone_no=?,local_guardian_name=?,address=?,stay_type=?,blood_group=?,hobbies=?,admission_category=?,father_name=?,father_no=?,mother_name=?,mother_no=? where usn=?";
            PreparedStatement pst = obj.con.prepareStatement(sql);

            int a1 = Sname.getDocument().getLength();
            int a2= Sbranch.getDocument().getLength();
            int a3 = Sdob.getDocument().getLength();
            int a4 = SEmail.getDocument().getLength();
            int a5 = SPhn.getDocument().getLength();
            int a6 = SAddress.getDocument().getLength();
            int a7 = Stype1.getDocument().getLength();
            int a8 = SBlood.getDocument().getLength();
            int a9 = SHobbies.getDocument().getLength();
            int a10=SAdmission.getDocument().getLength();

            //int a10 = SFatherName.getDocument().getLength();
            int a11 = SFatherPhn.getDocument().getLength();
            int a12 = SMotherName.getDocument().getLength();
            int a13 = SMotherPhn.getDocument().getLength();
            int a14 = SLGName.getDocument().getLength();

            if ((a3 == 0) || (a1 == 0) || (a4 == 0) || (a5 == 0) || (a6 == 0) || (a14 == 0) || (a7 == 0) || (a8 == 0) || (a9 == 0) || (a10 == 0) || (a11 == 0) || (a12 == 0) || (a13 == 0)) {

                JOptionPane.showMessageDialog(null, "Please Enter All The Details");

            } else {
                pst.setString(1, Sname.getText());
                pst.setString(2, Sbranch.getText());
                pst.setString(3, Sdob.getText());
                pst.setString(4, SEmail.getText());
                pst.setString(5, SPhn.getText());
                pst.setString(6, SLGName.getText());
                pst.setString(7, SAddress.getText());
                pst.setString(8, Stype1.getText());
                pst.setString(9, SBlood.getText());
                pst.setString(10, SHobbies.getText());
                pst.setString(11, SAdmission.getText());
                pst.setString(12, SFatherName.getText());
                pst.setString(13, SFatherPhn.getText());
                pst.setString(14, SMotherName.getText());
                pst.setString(15, SMotherPhn.getText());
                pst.setString(16, Susn.getText());

                int k = pst.executeUpdate();
                if (k == 1) {
                    JOptionPane.showMessageDialog(null, "successfully Updated ");

                    /*Sname.setText(null);
                    Sdob.setText(null);
                    //Sbranch.setText(null);
                    SEmail.setText(null);
                    SPhn.setText(null);
                    SAddress.setText(null);
                    Stype.setText(null);
                    SBlood.setText(null);
                    SHobbies.setText(null);
                    SFatherName.setText(null);
                    SFatherPhn.setText(null);
                    SMotherName.setText(null);
                    SMotherPhn.setText(null);*/
                } else {
                    JOptionPane.showMessageDialog(null, "Not updated");
                    //this.id.setText(null);

                    /* Sname.setText(null);
                    SEmail.setText(null);
                    SPhn.setText(null);
                    SAddress.setText(null);
                    Stype.setText(null);
                    SBlood.setText(null);
                    SHobbies.setText(null);
                    SFatherName.setText(null);
                    SFatherPhn.setText(null);

                    SMotherName.setText(null);
                    SMotherPhn.setText(null);*/
                }

            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_JBtnUpdateActionPerformed

    private void JBtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnEditActionPerformed

        //edit the fields
        editFields(true);
        JBtnUpdate.setEnabled(true);
    }//GEN-LAST:event_JBtnEditActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        DisplayStudent ds = new DisplayStudent(usn,LgName);
        ds.setVisible(true);
        this.dispose();
        
      /*  try {
            MySqlConnect obj = new MySqlConnect();
            ResultSet rs = null;
            obj.displayStudents();
            rs = obj.displayStudents();
         
                welcome w = new welcome();
                w.setVisible(true);

                w.JTableUsnName.setModel(DbUtils.resultSetToTableModel(rs));
                this.dispose();
            
        } catch (SQLException ex) {
            Logger.getLogger(DisplayStudent.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_btnbackActionPerformed

    private void Stype1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stype1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Stype1ActionPerformed

    private void SAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SAddressActionPerformed

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
            java.util.logging.Logger.getLogger(BasicDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasicDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasicDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasicDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasicDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JBtnEdit;
    private javax.swing.JButton JBtnUpdate;
    private javax.swing.JPanel JPanBack;
    private javax.swing.JTextField SAddress;
    private javax.swing.JTextField SAdmission;
    private javax.swing.JTextField SBlood;
    private javax.swing.JTextField SEmail;
    private javax.swing.JTextField SFatherName;
    private javax.swing.JTextField SFatherPhn;
    private javax.swing.JTextField SHobbies;
    private javax.swing.JTextField SLGName;
    private javax.swing.JTextField SMotherName;
    private javax.swing.JTextField SMotherPhn;
    private javax.swing.JTextField SPhn;
    private javax.swing.JTextField Sbranch;
    private javax.swing.JTextField Sdob;
    private javax.swing.JTextField Sname;
    private javax.swing.JTextField Stype1;
    public javax.swing.JTextField Susn;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
