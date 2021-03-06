
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saurabh
 */
public class Account extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    /**
     * Creates new form Account
     */
    public Account() {
        super("Create Account");
        initComponents();
        conn = JavaConnect.Connectdb();
        RandomAc();
        RandomIFSC();
        RandomPin();
        setFields();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NewAccTFAccNo = new javax.swing.JTextField();
        NewAccTFFirstName = new javax.swing.JTextField();
        NewAccTFLastName = new javax.swing.JTextField();
        NewAccTFMobNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NewAccTFAadharNo = new javax.swing.JTextField();
        NewAccTFAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        NewAccTFInitialAmount = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        NewAccTFIFSCCode = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        NewAccTFPin = new javax.swing.JTextField();
        NewAccBackButton = new javax.swing.JButton();
        NewAccClearButton = new javax.swing.JButton();
        newAccCreateButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        NewAccGenderComboBox = new javax.swing.JComboBox<>();
        NewAccDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        NewAccDesignationComboBox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        NewAccReligionComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 240, 245));

        jPanel1.setBackground(new java.awt.Color(245, 250, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 3), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 0, 28), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(807, 650));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Date of Birth");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Religion");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Mobile Number");

        NewAccTFAccNo.setEditable(false);
        NewAccTFAccNo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        NewAccTFFirstName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        NewAccTFLastName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        NewAccTFMobNo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Account Number");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Aadhar Number");

        NewAccTFAadharNo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        NewAccTFAddress.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Address");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Initial Amount");

        NewAccTFInitialAmount.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("IFSC Code");

        NewAccTFIFSCCode.setEditable(false);
        NewAccTFIFSCCode.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Pin");

        NewAccTFPin.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        NewAccBackButton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NewAccBackButton.setText("Back");
        NewAccBackButton.setMaximumSize(new java.awt.Dimension(100, 30));
        NewAccBackButton.setMinimumSize(new java.awt.Dimension(100, 30));
        NewAccBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAccBackButtonActionPerformed(evt);
            }
        });

        NewAccClearButton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NewAccClearButton.setText("Clear");
        NewAccClearButton.setMaximumSize(new java.awt.Dimension(100, 30));
        NewAccClearButton.setMinimumSize(new java.awt.Dimension(100, 30));
        NewAccClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAccClearButtonActionPerformed(evt);
            }
        });

        newAccCreateButton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        newAccCreateButton.setText("Create");
        newAccCreateButton.setMaximumSize(new java.awt.Dimension(100, 30));
        newAccCreateButton.setMinimumSize(new java.awt.Dimension(100, 30));
        newAccCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAccCreateButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Please enter the following information: ");

        NewAccGenderComboBox.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NewAccGenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        NewAccGenderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAccGenderComboBoxActionPerformed(evt);
            }
        });

        NewAccDateChooser.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        NewAccDesignationComboBox.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NewAccDesignationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non-Teaching Staff", "Assistant Professor", "Professor", "Head of Department", "Dean", "Bank Employee" }));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Designtion");

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Win 10 Pc\\Documents\\NetBeansProjects\\OOPCP\\Images\\New_Account.png")); // NOI18N

        NewAccReligionComboBox.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NewAccReligionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hindu", "Muslim", "Christian", "Sikh", "Other" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(596, 596, 596)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(197, 197, 197))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NewAccTFFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewAccTFMobNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewAccGenderComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                            .addComponent(NewAccReligionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NewAccTFLastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewAccTFAccNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NewAccTFIFSCCode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewAccTFInitialAmount, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewAccTFAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewAccDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NewAccTFPin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(NewAccTFAadharNo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(60, 60, 60))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NewAccDesignationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(NewAccBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(NewAccClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(newAccCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NewAccTFAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(243, 243, 243))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(173, 173, 173)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(NewAccTFIFSCCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel12)
                                                    .addComponent(NewAccTFPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(NewAccDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addGap(20, 20, 20))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(NewAccTFAadharNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(21, 21, 21)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel9)
                                                    .addComponent(NewAccTFAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel10)
                                                    .addComponent(NewAccTFInitialAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(1, 1, 1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(NewAccTFFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(NewAccTFLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(NewAccGenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NewAccTFMobNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(NewAccReligionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(14, 14, 14)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(NewAccDesignationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newAccCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewAccClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewAccBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(817, 737));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RandomAc() {
        Random r;
        int ac = 12345;
        boolean isUnique = false;
        while(isUnique == false) {
            r = new Random();
            ac = r.nextInt(90000+1) + 10000;
            isUnique = checkRepeatation(ac);
        }
        NewAccTFAccNo.setText(""+ac);
    }
    
    private boolean checkRepeatation(int ac) {
        String q = "select First_Name from account where Acc_No = '"+ac+"'";
        try {
            pst = conn.prepareStatement(q);
            rs = pst.executeQuery();
            if(rs.next()) {
                return false;
            } else {
                return true;
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return true;
        }
    }
    
    private void RandomIFSC() {
        String d = Home.getDateTime();
        String t = d.substring(3,4) + d.substring(5,7) + d.substring(8,10) + d.substring(11,13) + d.substring(14,16) + d.substring(17,19);
        Random r = new Random();
        NewAccTFIFSCCode.setText("ECMS"+r.nextInt(10+1)+t);
    }
    
    private void RandomPin() {
        Random r = new Random();
        int pin = r.nextInt(900+1) + 100;
        NewAccTFPin.setText(""+pin);
    }
    
    private void Bal() {
        String sql = "insert into balance(First_Name,Last_Name,Account_No,IFSC_Code,Balance) values(?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,NewAccTFFirstName.getText());
            pst.setString(2,NewAccTFLastName.getText());
            pst.setString(3,NewAccTFAccNo.getText());
            pst.setString(4,NewAccTFIFSCCode.getText());
            pst.setString(5,NewAccTFInitialAmount.getText());
            pst.execute();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void setFields() {
        NewAccGenderComboBox.setSelectedItem(null);
        NewAccDesignationComboBox.setSelectedItem(null);
        NewAccReligionComboBox.setSelectedItem(null);
    }
    
    private void NewAccBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAccBackButtonActionPerformed
        // Back button
        setVisible(false);
        Welcome ob = new Welcome();
        ob.setVisible(true);
    }//GEN-LAST:event_NewAccBackButtonActionPerformed

    private void NewAccClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAccClearButtonActionPerformed
        // Clear button
        NewAccTFFirstName.setText("");
        NewAccTFLastName.setText("");
        NewAccTFMobNo.setText("");
        NewAccReligionComboBox.setSelectedItem(null);
        NewAccTFAadharNo.setText("");
        NewAccTFAddress.setText("");
        NewAccTFInitialAmount.setText("");
        NewAccGenderComboBox.setSelectedItem(null);
        NewAccDesignationComboBox.setSelectedItem(null);
    }//GEN-LAST:event_NewAccClearButtonActionPerformed

    private void newAccCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAccCreateButtonActionPerformed
        // Create button
        if(NewAccTFFirstName.getText().equals("") || NewAccTFLastName.getText().equals("") || NewAccTFMobNo.getText().equals("") || ((String)NewAccReligionComboBox.getSelectedItem()).equals("") || ((String)NewAccGenderComboBox.getSelectedItem()).equals("") || ((JTextField)NewAccDateChooser.getDateEditor().getUiComponent()).getText().equals("") || NewAccTFAadharNo.getText().equals("") || NewAccTFInitialAmount.getText().equals("") || NewAccTFPin.getText().equals("") || NewAccTFAddress.getText().equals("") || ((String)NewAccDesignationComboBox.getSelectedItem()).equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all required fields");
        } else {
            String sql = "insert into account(Acc_No,First_Name,Last_Name,Religion,Mobile_No,Gender,DOB,Aadhar_No,Baseline_Bal,IFSC_Code,Pin,Address,Date_of_Interest,Designation,Pay_Date) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1,NewAccTFAccNo.getText());
                pst.setString(2,NewAccTFFirstName.getText());
                pst.setString(3,NewAccTFLastName.getText());
                pst.setString(5,NewAccTFMobNo.getText());
                pst.setString(4,(String)NewAccReligionComboBox.getSelectedItem());
                pst.setString(6,(String)NewAccGenderComboBox.getSelectedItem());
                pst.setString(7,((JTextField)NewAccDateChooser.getDateEditor().getUiComponent()).getText());
                pst.setString(8,NewAccTFAadharNo.getText());
                pst.setString(9,NewAccTFInitialAmount.getText());
                pst.setString(10,NewAccTFIFSCCode.getText());
                pst.setString(11,NewAccTFPin.getText());
                pst.setString(12,NewAccTFAddress.getText());
                pst.setString(13,Home.getDateTime());
                pst.setString(14,(String)NewAccDesignationComboBox.getSelectedItem());
                pst.setString(15,Home.getDateTime());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Account has been created successfully!");
                Bal();
                setVisible(false);
                Welcome ob = new Welcome();
                ob.setVisible(true);
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_newAccCreateButtonActionPerformed

    private void NewAccGenderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAccGenderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewAccGenderComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewAccBackButton;
    private javax.swing.JButton NewAccClearButton;
    private com.toedter.calendar.JDateChooser NewAccDateChooser;
    private javax.swing.JComboBox<String> NewAccDesignationComboBox;
    private javax.swing.JComboBox<String> NewAccGenderComboBox;
    private javax.swing.JComboBox<String> NewAccReligionComboBox;
    private javax.swing.JTextField NewAccTFAadharNo;
    private javax.swing.JTextField NewAccTFAccNo;
    private javax.swing.JTextField NewAccTFAddress;
    private javax.swing.JTextField NewAccTFFirstName;
    private javax.swing.JTextField NewAccTFIFSCCode;
    private javax.swing.JTextField NewAccTFInitialAmount;
    private javax.swing.JTextField NewAccTFLastName;
    private javax.swing.JTextField NewAccTFMobNo;
    private javax.swing.JTextField NewAccTFPin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newAccCreateButton;
    // End of variables declaration//GEN-END:variables
}
