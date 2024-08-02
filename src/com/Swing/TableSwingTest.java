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
import javax.swing.*;
public class TableSwingTest {
    JFrame frm;
    JTable table;
    JScrollPane sp;
    public TableSwingTest() {
    String data[][]={ {"101","Tejas","100000"},{"102","Saumya","70000"},{"103","Kalyani","800000"},{"104","Rasika","800000"}};    
    String column[]={"ID","NAME","SALARY"};   
        frm = new JFrame("Table");
        table = new JTable(data,column);
        sp = new JScrollPane(table);
        
        table.setFont(new Font("Arial",Font.BOLD, 15));
        frm.add(sp);
        frm.setSize(500,500);
        frm.setVisible(true);
        
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new TableSwingTest();
    }
}
