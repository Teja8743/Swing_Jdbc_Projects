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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ChoiceTest {
    JFrame frm;
    JComboBox choice;
    JButton btn;
    JLabel lbl1;

    public ChoiceTest() {
        frm = new JFrame("ChoiceTest");
        String country[]={"India","Aus","U.S.A","England","Newzealand"}; 
        choice  = new JComboBox(country);
        btn = new JButton("Submit");
        lbl1 = new JLabel("=====");
        
        frm.add(choice);
        frm.add(btn);
        frm.add(lbl1);
        frm.setSize(500,500);
        frm.setLayout(null);
        frm.setVisible(true);
        
      
        
        choice.setBounds(200,100,150,50);
        choice.setFont(new Font("Arial",Font.BOLD, 15));
        btn.setBounds(200,250,100,50);
        btn.setFont(new Font("Arial",Font.BOLD, 15));
        lbl1.setBounds(200,350,400,100);
        lbl1.setFont(new Font("Arial",Font.BOLD, 15));

        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
        
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               int count = choice.getItemCount();
               lbl1.setText("Total Count: "+count);
               //String item = choice.getName(choice.getSelectedIndex);
               //lbl1.setText("Selected: "+item);
               String item2 = (String) choice.getSelectedItem();
               lbl1.setText("Selected Elements: "+item2);
//               choice.insert("Bhandara",6);
                 choice.remove(2);
            }

            
        });
        
    }
   

   
    
    
    public static void main(String[] args) {
        new ChoiceTest();
    }
    
}
