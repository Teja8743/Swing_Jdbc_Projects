/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MDI;

import javax.swing.JDesktopPane;

/**
 *
 * @author tejas
 */
public class Form2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Form2
     */
    public Form2() {
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

        btnprevious = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(900, 700));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(900, 700));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnprevious.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnprevious.setText("Previous");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });
        getContentPane().add(btnprevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 127, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
        // TODO add your handling code here:
        JDesktopPane pane = getDesktopPane();
        Form1 ob = new Form1();
        pane.add(ob);
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnpreviousActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnprevious;
    // End of variables declaration//GEN-END:variables
}
