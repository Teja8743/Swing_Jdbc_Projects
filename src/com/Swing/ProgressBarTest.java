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
import javax.swing.*;
public class ProgressBarTest {
    JFrame frm;
    JProgressBar jb;
    JTextArea txt;
    JButton btn;
    int i = 0;
    public ProgressBarTest() {
        frm = new JFrame("Progress Bar");
        jb = new JProgressBar(0,100);
        txt = new JTextArea();
        btn = new JButton("Submit");
        
        frm.setSize(600,600);
        frm.setLayout(null);
        frm.setVisible(true);
        frm.add(jb);
        frm.add(txt);
        frm.add(btn);
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
        
        jb.setBounds(180,100,200,50);
        txt.setBounds(180,230,200,50);
        btn.setBounds(180,350,200,50);
    }
    
    public void itrate(){
        while(i<=2000){
            jb.setValue(i);
            i += 20;
            try {
               Thread.sleep(150);
            } catch (Exception e) {
                System.out.println("Ex: "+e);
            }
        }
    }
    
    public static void main(String[] args) {
        ProgressBarTest pb = new ProgressBarTest();
        pb.itrate();
    }
}
