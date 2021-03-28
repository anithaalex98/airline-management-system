/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.airline.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pradeep John
 */
public class ViewDetails extends javax.swing.JFrame {
DefaultTableModel model;
    /**
     * Creates new form ViewDetails
     */
    public ViewDetails() {
        initComponents();
         model= (DefaultTableModel)tb.getModel();
         rb1.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        ctf = new javax.swing.JTextField();
        ftf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lufthansa Flights-View Details");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Customer's name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Father's name");

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer id", "Customer name", "Father's name ", "D.O.B.", "Phone no.", "Email", "Gender", "Addres", "Id Type", "Id no.", "Mode of payment", "Credit/debit card no.", "Total Cost", "Booked on", "From", "Destination", "Flight time", "Flight on", "No. of tickets booked", "Class", "Flight No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb);

        jButton1.setText("Fetch Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb1);
        rb1.setText("Domestic");

        buttonGroup1.add(rb2);
        rb2.setText("International");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("View Details ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ftf, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(ctf))))
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addGap(54, 54, 54)
                .addComponent(jButton2)
                .addContainerGap(695, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1291, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ctf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ftf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb1)
                    .addComponent(rb2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1307, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      String cnm= (String)ctf.getText();
      String fnm= (String)ftf.getText();
      int dprice=0,totcost=0,noticket=0,did=0,dadults=0,dchild=0,dinfant=0;
      String cid="",email="",gender="",address="",idtype="",idno="",paytype="",book="",frm="",to="",dtime="",fdate="",fclass="",fno="",dob="",ph="",payno="";

 if(cnm.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all details");        // TODO add your handling code here:
        }

else
  if(fnm.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all details");        // TODO add your handling code here:
        }

else
  
      if(rb1.isSelected())
      {
try
{           
        
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","1234");
                Statement stmt=null;
                stmt=con.createStatement();
                 PreparedStatement pst1;
                PreparedStatement pst2;
                ResultSet rs1;
                ResultSet rs2;
                String q1= "Select * from ddetails where dname=? and dfnm=?;";
                pst1=con.prepareStatement(q1);
                pst1.setString(1,cnm);
                pst1.setString(2,fnm);
                rs1=pst1.executeQuery();
                
                if(rs1.next())
                {
                    did=rs1.getInt("did");
                    cid=rs1.getString("dcid");
                    frm=rs1.getString("ddfrom");
                    to=rs1.getString("ddto");
                    fdate=rs1.getString("dddate");
                     dadults=rs1.getInt("dadults");
                    dchild=rs1.getInt("dchild");
                    dinfant=rs1.getInt("dinfant");
                    fclass=rs1.getString("ddclass");
                    ph=rs1.getString("dph");
                    email=rs1.getString("demail");
                    idtype=rs1.getString("did_type");
                    idno=rs1.getString("did_no");
                    gender=rs1.getString("dgender");
                    paytype=rs1.getString("paymenttype");
                    dob=rs1.getString("dob");
                    book=rs1.getString("bookd");
                    address=rs1.getString("dadd");
                    cnm=rs1.getString("dname");
                    fnm=rs1.getString("dfnm");
                    payno=rs1.getString("paymenttypeno");
                    
                    String q2="Select*from domestic where did=? ;";
               pst2=con.prepareStatement(q2);
                pst2.setInt(1,did);
                rs2=pst2.executeQuery();
                if(rs2.next())
                {
                    dtime=rs2.getString("dtime");
                    dprice=rs2.getInt("dprice");
                   fno=rs2.getString("dflight");
                
                }
                noticket=dadults+dchild+dinfant;
                    totcost= (dadults+dchild+dinfant)*dprice;
               
                    model.insertRow(model.getRowCount(),new Object[]{cid,cnm,fnm,dob,ph,email,gender,address,idtype,idno,paytype,payno,totcost,book,frm,to,dtime,fdate,noticket,fclass,fno}); 
                    
                }else
 {
 JOptionPane.showMessageDialog(null, "Customer not found.\n please enter correct customer name and father name.");
 }
                
               
                
                
               
               con.close();
                
               
}catch( ClassNotFoundException | SQLException e)
{JOptionPane.showMessageDialog(null, ""+e); }
  }    
 else
      if(rb2.isSelected())
 {
 try
{           
        
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","1234");
                Statement stmt;
                stmt=con.createStatement();
                 PreparedStatement pst1;
                PreparedStatement pst2;
                ResultSet rs1;
                ResultSet rs2;
                String q1= "Select * from idetails where iname=? and ifnm=?;";
                pst1=con.prepareStatement(q1);
                pst1.setString(1,cnm);
                pst1.setString(2,fnm);
                rs1=pst1.executeQuery();
                
                if(rs1.next())
                {
                    did=rs1.getInt("iid");
                    cid=rs1.getString("icid");
                    frm=rs1.getString("iifrom");
                    to=rs1.getString("iito");
                    fdate=rs1.getString("iidate");
                     dadults=rs1.getInt("iadults");
                    dchild=rs1.getInt("ichild");
                    dinfant=rs1.getInt("iinfant");
                    fclass=rs1.getString("iiclass");
                    ph=rs1.getString("iph");
                    email=rs1.getString("iemail");
                    idtype=rs1.getString("iid_type");
                    idno=rs1.getString("iid_no");
                    gender=rs1.getString("igender");
                    paytype=rs1.getString("paymenttype");
                    dob=rs1.getString("dob");
                    book=rs1.getString("bookd");
                    address=rs1.getString("iadd");
                    cnm=rs1.getString("iname");
                    fnm=rs1.getString("ifnm");
                    payno=rs1.getString("paymenttypeno");
                    
                    
                    String q2="Select*from international where iid=? ;";
               pst2=con.prepareStatement(q2);
                pst2.setInt(1,did);
                rs2=pst2.executeQuery();
                if(rs2.next())
                {
                    dtime=rs2.getString("itime");
                    dprice=rs2.getInt("iprice");
                   fno=rs2.getString("iflight");
                
                }
               
               noticket=dadults+dchild+dinfant;
               totcost= (dadults+dchild+dinfant)*dprice;
               
               model.insertRow(model.getRowCount(),new Object[]{cid,cnm,fnm,dob,ph,email,gender,address,idtype,idno,paytype,payno,totcost,book,frm,to,dtime,fdate,noticket,fclass,fno}); 
               
                }else
 {
 JOptionPane.showMessageDialog(null, "Customer not found.\n please enter correct customer name and father name.");
 }
                
               
               con.close();
                
}catch( ClassNotFoundException | SQLException e)
{JOptionPane.showMessageDialog(null, ""+e); }
 
 
      
  }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.hide();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField ctf;
    private javax.swing.JTextField ftf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
}
