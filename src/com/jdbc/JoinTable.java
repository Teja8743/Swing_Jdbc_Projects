/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc;

/**
 *
 * @author tejas
 */
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class JoinTable extends javax.swing.JFrame {

    /**
     * Creates new form JoinTable
     */
    public JoinTable() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btninnerjoin = new javax.swing.JButton();
        btnLeftjoin = new javax.swing.JButton();
        btnrightjoin = new javax.swing.JButton();
        btnFulljoin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1030, -1));

        btninnerjoin.setText("InnerJoin");
        btninnerjoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninnerjoinActionPerformed(evt);
            }
        });
        jPanel1.add(btninnerjoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        btnLeftjoin.setText("LeftJoin");
        btnLeftjoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftjoinActionPerformed(evt);
            }
        });
        jPanel1.add(btnLeftjoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        btnrightjoin.setText("RightJoin");
        btnrightjoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrightjoinActionPerformed(evt);
            }
        });
        jPanel1.add(btnrightjoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        btnFulljoin.setText("Full Join");
        btnFulljoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFulljoinActionPerformed(evt);
            }
        });
        jPanel1.add(btnFulljoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninnerjoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninnerjoinActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1","root","");
            String sql = "select tb_orders.order_id,tb_customer.CustomerName,tb_orders.order_date from tb_orders inner join tb_customer on tb_orders.customer_id = tb_customer.customer_id ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            System.out.println("Ex: "+ex.getMessage());
        }
        
    }//GEN-LAST:event_btninnerjoinActionPerformed

    private void btnLeftjoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftjoinActionPerformed
        // TODO add your handling code here:
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1","root","");
            String sql = "select tb_orders.order_id,tb_customer.CustomerName,tb_orders.order_date from tb_orders left join tb_customer on tb_orders.customer_id = tb_customer.customer_id ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            System.out.println("Ex: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnLeftjoinActionPerformed

    private void btnrightjoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrightjoinActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1","root","");
            String sql = "select tb_orders.order_id,tb_customer.CustomerName,tb_orders.order_date from tb_orders right join tb_customer on tb_orders.customer_id = tb_customer.customer_id ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            System.out.println("Ex: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnrightjoinActionPerformed

    private void btnFulljoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFulljoinActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1","root","");
            String sql = "select tb_customer.CustomerName,tb_orders.order_id from tb_customer FULL OUTER JOIN Orders on tb_customer.customer_id = tb_orders.customer_id ORDER BY tb_customer.CustomerName ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            System.out.println("Ex: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnFulljoinActionPerformed

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
            java.util.logging.Logger.getLogger(JoinTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JoinTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JoinTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JoinTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JoinTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFulljoin;
    private javax.swing.JButton btnLeftjoin;
    private javax.swing.JButton btninnerjoin;
    private javax.swing.JButton btnrightjoin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
