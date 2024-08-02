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
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class TextAreaCount  {
    JFrame frm;
    JLabel lbl1,lbl2;
    JButton btn;
    JTextArea txt;

    public TextAreaCount() {
        frm = new JFrame("Count");
        lbl1 = new JLabel("Words: ");
        lbl2 = new JLabel("Characters: ");
        btn = new JButton("Count Words");
        txt = new JTextArea();
        
        frm.add(lbl1);
        frm.add(lbl2);
        frm.add(btn);
        frm.add(txt);
        frm.setSize(500,700);
        frm.setLayout(null);
        frm.setVisible(true);
        
        lbl1.setBounds(100,100,100,50);
        lbl2.setBounds(250,100,100,50);
        txt.setBounds(130,250,250,100);
        btn.setBounds(180,450,100,50);
        
        
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);

       
       btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                String text = txt.getText();    
                String words[]=text.split("\\s");    
                lbl1.setText("Words: "+words.length);    
                lbl2.setText("Characters: "+text.length());  
            }

            
        });
       txt.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                String text = txt.getText();    
                String words[]=text.split("\\s");    
                lbl1.setText("Words: "+words.length);    
                lbl2.setText("Characters: "+text.length());
                
                
            } 

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                txt.setBackground(Color.red);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                txt.setBackground(Color.ORANGE);
            }

            

            
        });
        
    }

    
    
    public static void main(String[] args) {
        new TextAreaCount();
    }
    
}
