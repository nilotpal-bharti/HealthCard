package javaapplication6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class about extends javax.swing.JFrame {

    /**
     * Creates new form about
     */
    public about() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        patid = new javax.swing.JTextField();
        patname = new javax.swing.JTextField();
        medname = new javax.swing.JTextField();
        dose = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        dur = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THE PATIENT'S BOOK");
        jLabel1.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\images\\logo.PNG")); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 695, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 1380, 160);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("MEDICINE DETAILS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 170, 313, 44);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("PATIENT ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(255, 228, 97, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("PATIENT NAME");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(679, 228, 125, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("MEDICINE NAME");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(255, 344, 136, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("DOSAGE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(255, 476, 68, 22);

        patid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patidActionPerformed(evt);
            }
        });
        getContentPane().add(patid);
        patid.setBounds(255, 256, 241, 42);

        patname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patnameActionPerformed(evt);
            }
        });
        getContentPane().add(patname);
        patname.setBounds(679, 257, 244, 41);
        getContentPane().add(medname);
        medname.setBounds(255, 377, 241, 43);
        getContentPane().add(dose);
        dose.setBounds(255, 512, 241, 47);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TABLET", "CAPSULE", "SYRUP" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(679, 377, 241, 43);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("DURATION");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(679, 476, 89, 22);
        getContentPane().add(dur);
        dur.setBounds(679, 509, 241, 50);

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("ADD MEDICINE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(504, 647, 168, 31);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("TYPE");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(679, 344, 41, 22);

        jLabel11.setIcon(new javax.swing.ImageIcon("E:\\images\\wallpaper-802223.jpg")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(-20, 130, 2030, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
doctor obj = new doctor("");
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void patidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patidActionPerformed

    private void patnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String pid,pname,medicinename,type,dosage,duration;
    
    pid=patid.getText();
    pname=patname.getText();
    medicinename=medname.getText();
    type=jComboBox1.getSelectedItem().toString();
    dosage=dose.getText();
    duration=dur.getText();
    if(!pid.equals("") ||pname.equals("")||!medicinename.equals("")||!type.equals("")||!dosage.equals("")||!duration.equals(""))
    {
    Connection con =null;
    Statement smt=null;
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/patientbook","root","");
        smt=con.createStatement();
        String qry="insert into medicine  values('"+pid+"','"+pname+"','"+medicinename+"','"+type+"','"+dosage+"','"+duration+"')";
        int r=smt.executeUpdate(qry);
        if(r>0)
        {
            JOptionPane.showMessageDialog(null, "MEDICINE ADDED!!!");
        }
        con.close();          
    }catch(Exception ex)
    {
        System.out.println(ex.toString());
    }  
    }
    else
    {
    JOptionPane.showMessageDialog(null, "PLEASE FILL ALL THE COLUMNS");
    }                                        

    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dose;
    private javax.swing.JTextField dur;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField medname;
    private javax.swing.JTextField patid;
    private javax.swing.JTextField patname;
    // End of variables declaration//GEN-END:variables
}