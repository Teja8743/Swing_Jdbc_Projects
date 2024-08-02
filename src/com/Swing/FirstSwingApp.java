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
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
public class FirstSwingApp extends WindowAdapter implements ActionListener {
    JFrame frm;
    JButton btn;
    JTextField txt;
    JLabel lbl;
    
    public FirstSwingApp() {
        
        
        frm = new JFrame("First Swing App");
        
        btn = new JButton();
        btn.setBounds(180,200,50,50);
        ImageIcon icon = new  ImageIcon("C:\\Users\\tejas\\OneDrive\\Desktop\\desktop\\7223217.png");
        Image img = icon.getImage();
        Image newImage = img.getScaledInstance(btn.getWidth(),btn.getHeight(),Image.SCALE_SMOOTH);
        btn.setIcon(new ImageIcon(newImage));
        
        txt = new JTextField();
        lbl = new JLabel("-+-+-+-+-+-");
        
        txt.setBounds(100,100,200,50);
        
       
        lbl.setBounds(100,280,200,50);
        
        frm.add(txt);
        frm.add(btn);
        
        frm.add(lbl);
        
        frm.setSize(600,600);
        frm.setLayout(null);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DO_NOTHING_ON_CLOSE);
        
        btn.addActionListener(this);
        frm.addWindowListener(this);
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
        
        int i = JOptionPane.showConfirmDialog(frm,"Are you sure to close Application");
        if(i == JOptionPane.YES_OPTION){
            frm.dispose();
        }
        else if(i == JOptionPane.NO_OPTION){
           
        }
        else{
           
        }
        
    }
    
    
    
     @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        String string  = txt.getText();
//        String str  = string.toUpperCase();
//        lbl.setText("In UpperCase: "+str);
          //JOptionPane.showMessageDialog(null,"Welcome To String");
          //JOptionPane.showConfirmDialog(frm,"Sucessfully Updated","Alert",JOptionPane.WARNING_MESSAGE);
//          String sks = JOptionPane.showInputDialog(frm,"Enter Name");
//          System.out.println(" "+sks);
          //lbl.setText(sks);
        int i = JOptionPane.showConfirmDialog(frm,"Are You Sure");
        if(i == JOptionPane.YES_OPTION){
            System.out.println("Yes Option Is Clicked");
            lbl.setText("Yes Option is Clicked");
        }
        else if(i == JOptionPane.NO_OPTION){
            System.out.println("No Option Is Clicked");
            lbl.setText("No Option is Clicked");
        }
        else{
            System.out.println("Canceled Option Is Clicked");
            lbl.setText("Canceled Option Is Clicked");
        }
         
    }
    
    
    public static void main(String[] args) {
        new FirstSwingApp();
    }

   
    
}
