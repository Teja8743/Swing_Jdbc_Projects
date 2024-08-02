/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc;

/**
 *
 * @author tejas
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxTextFieldExample {
    JFrame frame;
    JComboBox<String> comboBox;
    JTextField textField;

    public ComboBoxTextFieldExample() {
        // Create the frame
        frame = new JFrame("ComboBox JTextField Example");

        // Create the combo box with some items
        String[] items = { "Select", "Item 1", "Item 2", "Item 3" };
        comboBox = new JComboBox<>(items);

        // Create the text field
        textField = new JTextField(20);

        // Add action listener to the combo box
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected item from the combo box
                String selectedItem = (String) comboBox.getSelectedItem();
                // Set the text field with the selected item
                textField.setText(selectedItem);
            }
        });

        // Set layout and add components to the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(new JLabel("Select an Item:"));
        frame.add(comboBox);
        frame.add(new JLabel("Selected Item:"));
        frame.add(textField);

        // Frame settings
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxTextFieldExample();
    }
}

