/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package srms;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author yash_yj_07
 */
public class studentIndex extends javax.swing.JFrame {

    /**
     * Creates new form studentIndex
     */
    public studentIndex() {
        initComponents();
        this.setResizable(false);
        
        this.revalidate();
    }
    
    public studentIndex(String rollno) {
        initComponents();
        rollnumber.setText(rollno);
        this.setResizable(false);
        
        this.revalidate();
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
        rollnumber = new javax.swing.JTextField();
        coursename = new javax.swing.JTextField();
        branchname = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        fathername = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Subject1 = new javax.swing.JLabel();
        Subject2 = new javax.swing.JLabel();
        Subject3 = new javax.swing.JLabel();
        Subject4 = new javax.swing.JLabel();
        Subject5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        marks1 = new javax.swing.JLabel();
        marks2 = new javax.swing.JLabel();
        marks3 = new javax.swing.JLabel();
        marks4 = new javax.swing.JLabel();
        marks5 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Roll Number");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Course Name");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Branch Name");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Father Name");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");

        rollnumber.setEditable(false);
        rollnumber.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        rollnumber.setForeground(new java.awt.Color(0, 0, 0));
        rollnumber.setText("sdfdsf");

        coursename.setEditable(false);
        coursename.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        coursename.setForeground(new java.awt.Color(0, 0, 0));

        branchname.setEditable(false);
        branchname.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        branchname.setForeground(new java.awt.Color(0, 0, 0));

        name.setEditable(false);
        name.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));

        fathername.setEditable(false);
        fathername.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        fathername.setForeground(new java.awt.Color(0, 0, 0));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rollnumber)
                    .addComponent(coursename)
                    .addComponent(branchname, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name)
                    .addComponent(fathername)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(rollnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(coursename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fathername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(branchname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel7.setText("Subjects");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel8.setText("Total Marks");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel9.setText("Passing Marks");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel10.setText("Marks Obtained");

        Subject1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        Subject1.setText("Subject1");

        Subject2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        Subject2.setText("Subject2");

        Subject3.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        Subject3.setText("Subject3");

        Subject4.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        Subject4.setText("Subject4");

        Subject5.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        Subject5.setText("Subject5");

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel16.setText("Total Marks");

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel17.setText("100");

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel18.setText("100");

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel19.setText("100");

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel20.setText("100");

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel21.setText("100");

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel22.setText("33");

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel23.setText("33");

        jLabel24.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel24.setText("33");

        jLabel25.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel25.setText("33");

        jLabel26.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel26.setText("33");

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel27.setText("500");

        marks1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        marks1.setText("marks1");

        marks2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        marks2.setText("marks2");

        marks3.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        marks3.setText("marks3");

        marks4.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        marks4.setText("marks4");

        marks5.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        marks5.setText("marks5");

        total.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        total.setText("total");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Subject5)
                            .addComponent(Subject4)
                            .addComponent(Subject3)
                            .addComponent(Subject2)
                            .addComponent(Subject1)
                            .addComponent(jLabel7))
                        .addGap(149, 149, 149)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel16)
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel27)
                            .addComponent(jLabel17))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marks2)
                            .addComponent(marks1)
                            .addComponent(marks3)
                            .addComponent(marks4)
                            .addComponent(marks5)
                            .addComponent(total))
                        .addGap(164, 164, 164))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel10)
                        .addContainerGap(122, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(42, 42, 42)
                        .addComponent(Subject1)
                        .addGap(39, 39, 39)
                        .addComponent(Subject2)
                        .addGap(45, 45, 45)
                        .addComponent(Subject3)
                        .addGap(47, 47, 47)
                        .addComponent(Subject4)
                        .addGap(43, 43, 43)
                        .addComponent(Subject5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(335, 335, 335)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel16)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel18)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel19)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel20)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel21))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel23)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel24)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel25)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(marks1)
                                .addGap(39, 39, 39)
                                .addComponent(marks2)
                                .addGap(45, 45, 45)
                                .addComponent(marks3)
                                .addGap(47, 47, 47)
                                .addComponent(marks4)
                                .addGap(43, 43, 43)
                                .addComponent(marks5)
                                .addGap(41, 41, 41)
                                .addComponent(total)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String roll = rollnumber.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srms", "root", "Yash@1234");
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM student INNER JOIN result ON student.rollno = result.rollno WHERE student.rollno='"+roll+"'");
            
            if(rs.next()){
                coursename.setText(rs.getString(2));
                branchname.setText(rs.getString(3));
                name.setText(rs.getString(4));
                jTextField6.setText(rs.getString(5));
                fathername.setText(rs.getString(6));
                Subject1.setText(rs.getString(8));
                Subject2.setText(rs.getString(10));
                Subject3.setText(rs.getString(12));
                Subject4.setText(rs.getString(14));
                Subject5.setText(rs.getString(16));
                marks1.setText(rs.getString(9));
                marks2.setText(rs.getString(11));
                marks3.setText(rs.getString(13));
                marks4.setText(rs.getString(15));
                marks5.setText(rs.getString(17));
                
                int m1 = Integer.parseInt(marks1.getText());
                int m2 = Integer.parseInt(marks2.getText());
                int m3 = Integer.parseInt(marks3.getText());
                int m4 = Integer.parseInt(marks4.getText());
                int m5 = Integer.parseInt(marks5.getText());
                
                int total = m1+m2+m3+m4+m5;
                
                this.total.setText(String.valueOf(total));
            }else{
                JOptionPane.showConfirmDialog(null, "Data not found! Please contact admin for more details.");
            }
            
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new studentAdmin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(studentIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Subject1;
    private javax.swing.JLabel Subject2;
    private javax.swing.JLabel Subject3;
    private javax.swing.JLabel Subject4;
    private javax.swing.JLabel Subject5;
    private javax.swing.JTextField branchname;
    private javax.swing.JTextField coursename;
    private javax.swing.JTextField fathername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel marks1;
    private javax.swing.JLabel marks2;
    private javax.swing.JLabel marks3;
    private javax.swing.JLabel marks4;
    private javax.swing.JLabel marks5;
    private javax.swing.JTextField name;
    private javax.swing.JTextField rollnumber;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
