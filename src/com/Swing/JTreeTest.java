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
import javax.swing.tree.*;

public class JTreeTest {
    JFrame frm;
    JTree jt;
    DefaultMutableTreeNode style, color, font, red, blue, black, green;

    public JTreeTest() {
        frm = new JFrame("JTree Example");

        style = new DefaultMutableTreeNode("Style");

        color = new DefaultMutableTreeNode("Color");
        font = new DefaultMutableTreeNode("Font");
        style.add(color);
        style.add(font);

        red = new DefaultMutableTreeNode("Red");
        blue = new DefaultMutableTreeNode("Blue");
        black = new DefaultMutableTreeNode("Black");
        green = new DefaultMutableTreeNode("Green");

        color.add(red);
        color.add(blue);
        color.add(black);
        color.add(green);

        jt = new JTree(style);
        frm.add(jt);
        frm.setSize(500, 500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }

    public static void main(String[] args) {
        new JTreeTest();
    }
}
