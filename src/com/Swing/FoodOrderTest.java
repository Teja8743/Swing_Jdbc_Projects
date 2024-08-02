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
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class FoodOrderTest {
    JFrame frm;
    JLabel lbl;
    JCheckBox pizza,burger,tea;
    JButton btn;
    public FoodOrderTest() {
        frm = new JFrame();
        
        lbl = new JLabel("Food Ordering System");
        pizza = new JCheckBox("Pizza @ 100/-");
        burger  =new JCheckBox("Burger @ 30/-");
        tea = new JCheckBox("Tea @ 10/-");
        btn = new JButton();
        btn.setBounds(180,350,150,70);
        ImageIcon icon = new  ImageIcon("C:\\Users\\tejas\\Downloads\\logo4.png");
        Image img = icon.getImage();
        Image newImage = img.getScaledInstance(btn.getWidth(),btn.getHeight(),Image.SCALE_SMOOTH);
        btn.setIcon(new ImageIcon(newImage));
        
        frm.add(lbl);
        frm.add(pizza);
        frm.add(burger);
        frm.add(tea);
        frm.add(btn);
        frm.setSize(600,600);
        frm.setLayout(null);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
        
        lbl.setBounds(70,70,250,30);
        lbl.setFont(new Font("Arial",Font.BOLD, 20));
        pizza.setBounds(100,150,200,30);
        pizza.setFont(new Font("Arial",Font.BOLD,17));
        burger.setBounds(100,200,200,30);
        burger.setFont(new Font("Arial",Font.BOLD,17));
        tea.setBounds(100,250,200,30);
        tea.setFont(new Font("Arial",Font.BOLD,17));
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                float amt = 0;
                String msg = "";
                
                if(pizza.isSelected()){
                    amt = amt+100;
                    msg = msg+"Pizza: 100 \n";
                }
               
                
                if(burger.isSelected()){
                    amt = amt+30;
                    msg = msg+"Burger: 30\n";
                }
                
                 if(tea.isSelected()){
                    amt = amt+10;
                    msg = msg+"Tea: 10\n";
                }

                msg = msg+"-----------------\n"; 

//              UIManager.put("OptionPane.minimumSize",new Dimension(500,500)); 
                JOptionPane.showMessageDialog (null,msg+"Total: "+amt);
                
            }
        });
    }
    
    public static void main(String[] args) {
        new FoodOrderTest();
    }
}
