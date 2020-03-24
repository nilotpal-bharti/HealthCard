package javaapplication6;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class addpatient extends javax.swing.JFrame {
    public addpatient() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        patid = new javax.swing.JTextField();
        patname = new javax.swing.JTextField();
        patmno = new javax.swing.JTextField();
        patadd = new javax.swing.JTextField();
        patpro = new javax.swing.JTextField();
        patdes = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        patage = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("PATIENT DETAILS");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(412, 185, 290, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("PATIENT ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(129, 284, 100, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("PATIENT NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(610, 284, 130, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("GENDER");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(610, 374, 80, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("MOBILE NUMBER");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 460, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("ADDRESS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(131, 550, 90, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("PROBLEM");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(610, 470, 78, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("DESCRIPTION");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(610, 550, 120, 22);

        patid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(patid);
        patid.setBounds(264, 277, 213, 35);

        patname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        patname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patnameActionPerformed(evt);
            }
        });
        getContentPane().add(patname);
        patname.setBounds(761, 279, 206, 31);

        patmno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        patmno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patmnoActionPerformed(evt);
            }
        });
        getContentPane().add(patmno);
        patmno.setBounds(760, 530, 210, 60);

        patadd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(patadd);
        patadd.setBounds(264, 462, 213, 32);

        patpro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(patpro);
        patpro.setBounds(260, 530, 220, 60);

        patdes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(patdes);
        patdes.setBounds(760, 460, 213, 35);

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("ADD RECORD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(480, 630, 160, 40);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\images\\logo.PNG")); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 30, 165, 64);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("THE PATIENT'S BOOK");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(870, 10, 474, 89);

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1250, 140, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1390, 180);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("PATIENT AGE");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(129, 374, 120, 22);

        patage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(patage);
        patage.setBounds(264, 369, 213, 31);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton1.setText("MALE");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(761, 370, 90, 31);

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton2.setText("FEMALE");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(880, 370, 89, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon("E:\\images\\wallpaper-802223.jpg")); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(-20, 150, 2960, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patnameActionPerformed

    private void patmnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patmnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patmnoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String pid,pname,page,pgender,pmno,paddress,pproblem,pdescription;
    
    pid=patid.getText();
    pname=patname.getText();
    page=patage.getText();
    if(jRadioButton1.isSelected())
    {
    pgender="Male";
    }
    else
    {
    pgender="Female";
    }
    pmno=patadd.getText();
    paddress=patpro.getText();
    pproblem=patdes.getText();
    pdescription=patmno.getText();
    if(!pid.equals("") ||!pname.equals("")||!pgender.equals("")||!page.equals("")||!pmno.equals("")||!paddress.equals("")||!pproblem.equals("")||!pdescription.equals(""))
    {
    Connection con =null;
    Statement smt=null;
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/patientbook","root","");
        smt=con.createStatement();
        String qry="insert into addpatient values('"+pid+"','"+page+"','"+pname+"','"+pgender+"','"+pmno+"','"+pproblem+"','"+paddress+"','"+pdescription+"')";
        int r=smt.executeUpdate(qry);
        if(r>0)
        {
            JOptionPane.showMessageDialog(null, "PATIENT ADDED!!!");
        }
        con.close();          
    }catch(Exception ex)
    {
     JOptionPane.showMessageDialog(null, "PLEASE FILL ALL THE COLUMNS");   
    }  
    }
    else
    {
    JOptionPane.showMessageDialog(null, "PLEASE FILL ALL THE COLUMNS");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     doctor obj = new doctor("");
        obj.setVisible(true);
        this.setVisible(false);
 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(addpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addpatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField patadd;
    private javax.swing.JTextField patage;
    private javax.swing.JTextField patdes;
    private javax.swing.JTextField patid;
    private javax.swing.JTextField patmno;
    private javax.swing.JTextField patname;
    private javax.swing.JTextField patpro;
    // End of variables declaration//GEN-END:variables
}
