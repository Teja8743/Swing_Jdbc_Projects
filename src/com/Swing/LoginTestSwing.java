/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Swing;

/**
 *
 * @author tejas
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class LoginTestSwing implements ActionListener{
    JFrame frm;
    JLabel lbluser,lblpass;
    JTextField txtname;
    JPasswordField txtpass;
    JButton btn;
    public LoginTestSwing() {
        frm = new JFrame("Login Form");
        
        lbluser = new JLabel("User Name");
        lblpass = new JLabel("Password");
     
        
        txtname = new JTextField();
        txtpass= new JPasswordField();
        
        
        
        btn = new JButton("Login");
        
        frm.add(lbluser);
        frm.add(lblpass);
        
        frm.add(txtname);
        frm.add(txtpass);
        frm.add(btn);
        frm.setSize(500,500);
        frm.setLayout(null);
        frm.setVisible(true);
        
        lbluser.setBounds(100, 100, 100, 50);
        lblpass.setBounds(100, 200, 100, 50);
        txtname.setBounds(200, 100, 100, 50);
        txtpass.setBounds(200, 200, 100, 50);
        btn.setBounds(200, 300, 100, 50);
        
       frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
       
       btn.addActionListener(this);
        
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String user = txtname.getText();
        String pass = new String (txtpass.getPassword());
        if(user.equals("admin") && pass.equals("admin123")){
            JOptionPane.showMessageDialog(frm,"Login Sucessful");
        }
        else{
            JOptionPane.showMessageDialog(frm,"Login Failed");
        }
        
    }
    
    
    public static void main(String[] args) {
        new LoginTestSwing();
        
    }

   

    
    
}

