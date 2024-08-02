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
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class CheckBoxTest1WithSingleSelection  {
    JFrame frm;
   
    JLabel lbl1,lbl2;
    JRadioButton chkjava,chkcpp;
    JCheckBox check;
    public CheckBoxTest1WithSingleSelection() {
        frm = new JFrame("CheckBox");
        
        chkjava  = new JRadioButton("JAVA",true);
        chkcpp = new JRadioButton("C++",false);
        lbl1 = new JLabel("xyz");
        lbl2 = new JLabel("xyz");
        
        frm.add(chkjava);
        frm.add(chkcpp);
        frm.add(lbl1);
        frm.add(lbl2);
        frm.setSize(500,500);
        frm.setLayout(null);
        frm.setVisible(true);
        
        chkjava.setBounds(100,100,100,100);
        chkjava.setFont(new Font("Arial",Font.BOLD, 15));
        chkcpp.setBounds(100,200,100,100);
        chkcpp.setFont(new Font("Arial",Font.BOLD, 15));
        lbl1.setBounds(100,300,150,100);
        lbl1.setFont(new Font("Arial",Font.BOLD, 15));
        lbl2.setBounds(100,370,150,100);
        lbl2.setFont(new Font("Arial",Font.BOLD, 15));
        
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
       
        chkjava.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                lbl1.setText(chkjava.getText()+" "+"Is Selected");
            }

        });
        chkcpp.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                lbl2.setText(chkcpp.getText()+" "+"Is Selected");

            }
        });

   
  }
   
    
    
    public static void main(String[] args) {
        new CheckBoxTest1WithSingleSelection();
    }

    
    
}

