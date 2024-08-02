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
import java.sql.*;
public class Emp_infoTest {
    JFrame frm;
    JLabel lblid,lblname,lbladd,lblcity,lblphone;
    JTextField txtid,txtname,txtphone;
    JComboBox city;
    JTextArea txtadd;
    JButton btnnew,btnsave,btndelete,btnupdate,btnsearch,btnclear;
    
    public Emp_infoTest() {
        frm = new JFrame("Id Search");
        
        lblid = new JLabel("Id: ");
        lblname = new JLabel("Name: ");
        lbladd = new JLabel("Address: ");
        lblcity = new JLabel("Select City: ");
        lblphone = new JLabel("Phone NO: ");
        
        
        txtid  = new JTextField();
        txtname  = new JTextField();
        txtphone  = new JTextField();
        
        txtadd = new JTextArea();
        
        String C [] = {"-Select City-","Nagpur","Pune","Mumbai","Bhandara"};
        city  = new JComboBox(C);
        
        btnnew = new JButton("New");
        btnsave = new JButton("Save");
        btndelete = new JButton("Delete");
        btnupdate = new JButton("Update");
        btnsearch = new JButton("Search");
        btnclear = new JButton("Clear");
        
        frm.add(lblid);
        frm.add(lblname);
        frm.add(lbladd);
        frm.add(lblcity);
        frm.add(lblphone);
        frm.add(txtid);
        frm.add(txtname);
        frm.add(txtadd);
        
        frm.add(city);
        frm.add(txtphone);
        frm.add(btnnew);
        frm.add(btnsave);
        frm.add(btndelete);
        frm.add(btnupdate);
        frm.add(btnsearch);
        frm.add(btnclear);
        
        frm.setSize(600,700);
        frm.setLayout(null);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
        
        lblid.setBounds(50,50,100,50);
        lblid.setFont(new Font("Arial",Font.BOLD,17));
        txtid.setBounds(150,60,150,30);
        txtid.setFont(new Font("Arial",Font.BOLD,17));
        lblname.setBounds(50,120,100,50);
        lblname.setFont(new Font("Arial",Font.BOLD,17));
        txtname.setBounds(150,130,150,30);
        txtname.setFont(new Font("Arial",Font.BOLD,17));
        lbladd.setBounds(50,190,100,50);
        lbladd.setFont(new Font("Arial",Font.BOLD,17));
        txtadd.setBounds(150,200,200,100);
        txtadd.setFont(new Font("Arial",Font.BOLD,17));
        lblcity.setBounds(50,300,100,50);
        lblcity.setFont(new Font("Arial",Font.BOLD,17));
        city.setBounds(150,310,150,30);
        city.setFont(new Font("Arial",Font.BOLD,17));
        lblphone.setBounds(50,360,100,50);
        lblphone.setFont(new Font("Arial",Font.BOLD,17));
        txtphone.setBounds(150,370,150,30);
        txtphone.setFont(new Font("Arial",Font.BOLD,17));
        
        btnnew.setBounds(50,420,100,50);
        btnnew.setFont(new Font("Arial",Font.BOLD,17));
        btnsave.setBounds(180,420,100,50);
        btnsave.setFont(new Font("Arial",Font.BOLD,17));
        btndelete.setBounds(310,420,100,50);
        btndelete.setFont(new Font("Arial",Font.BOLD,17));
        btnupdate.setBounds(440,420,100,50);
        btnupdate.setFont(new Font("Arial",Font.BOLD,17));
        btnsearch.setBounds(400,50,100,50);
        btnsearch.setFont(new Font("Arial",Font.BOLD,17));
        btnclear.setBounds(250,500,100,50);
        btnclear.setFont(new Font("Arial",Font.BOLD,17));

        btnsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                
                
                    // set a Driver.
                    if(checkEmptyField())
                    {
                        
                    }else{
               try {
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    //establish a connection (creating a bridge between java and database)
                    Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1","root","");
                    String id = txtid.getText();
                    String name = txtname.getText();
                    String add = txtadd.getText();
                    String city1 = (String) city.getSelectedItem();
                    String phone = txtphone.getText();
                    
                    
                    
                    
                    String sql1 = "Select * from tb_student where id = '"+txtid.getText()+"'";
                    PreparedStatement pst1 = con.prepareStatement(sql1);
                    ResultSet rs = pst1.executeQuery();
                    if(rs.next()){
                        JOptionPane.showMessageDialog(null,"Id Is Already Exist");
                    }
                    else{
                        //write a query 
                        String sql = "insert into tb_student(id,name,address,city,phone) values('"+txtid.getText()+"','"+txtname.getText()+"','"+txtadd.getText()+"','"+city.getSelectedItem()+"','"+txtphone.getText()+"')";
                        // it prepare a statement (sql query) for execution 
                        PreparedStatement pst = con.prepareStatement(sql);
                        // it exeute a query and return some value (0,1) after execution 
                        int i = pst.executeUpdate();
                        if(i>0){
                         JOptionPane.showMessageDialog(null,"Row Inserted Successfully");
                        }
                    }
                    
                    
                    
                }catch (Exception ex) {
                    System.out.println("Ex: "+ex.getMessage());
                }
                    }
            }
            
        });
        
        btnsearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1","root","");
                    String sql = "Select * from tb_student where id ='"+txtid.getText()+"' ";
                    PreparedStatement pst = con.prepareStatement(sql);
                    //read row 
                    ResultSet rs = pst.executeQuery();
                    boolean status = false;
                    while(rs.next()){
                        //1st Method
                        String name = rs.getString("name");
                        txtname.setText(name);
                        // 2nd method
                        txtadd.setText(rs.getString("address"));
                        city.setSelectedItem(rs.getString("city"));
                        txtphone.setText(rs.getString("phone"));
                        status = true;
                    }
                    if(status!=true){
                        
                        JOptionPane.showMessageDialog(null,"Record Not Found");
                    }
                } catch (Exception ex) {
                    System.out.println("Ex: "+ex.getMessage());
                }
            }
        });
        
        btnupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1","root","");
                    String sql="Update tb_student set name='"+txtname.getText()+"',city='"+city.getSelectedItem()+"',phone='"+txtphone.getText()+"',address='"+txtadd.getText()+"'where id='"+txtid.getText()+"'";
                    PreparedStatement pst=con.prepareStatement(sql);
                    int i=pst.executeUpdate();
                    if(i>0)
     
                        JOptionPane.showMessageDialog(null,"Record Updated sucessfully");
                } catch (Exception ex) {
                    System.out.println("Ex: "+ex.getMessage());
                }
            }
        });
        btndelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1","root","");
                    String sql="Delete from tb_student where id='"+txtid.getText()+"'";                    
                    PreparedStatement pst=con.prepareStatement(sql);
                    int i=pst.executeUpdate();
                    if(i>0){
                        JOptionPane.showMessageDialog(null,"Record Delete sucessfully");
                    }
                    clear();
                } catch (Exception ex) {
                    System.out.println("Ex: "+ex.getMessage());
                }
            }
        });
        
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });
        
        btnnew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1","root","");
                    String sql = "select MAX(id) from tb_student";
                    PreparedStatement pst = con.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    while(rs.next()){
                        int id = rs.getInt(1)+1;
                        txtid.setText(""+id);
                    }
                    con.close();
                    rs.close();
                    pst.close();
                } catch (Exception ex) {
                    System.out.println("Ex: "+ex.getMessage());
                }
            }
        });
            
        
    }
    
    public void clear(){
         txtid.setText("");
         txtname.setText("");
         txtadd.setText("");
         city.setSelectedIndex(0);
         txtphone.setText("");
    }
    
    public boolean checkEmptyField()
    {
        String city1 = (String)city.getSelectedItem();
      
        boolean checkEmpty=false;
        if(txtid.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Id Field is blank");
            checkEmpty= true;
        }
        else
            if(txtname.getText().isEmpty())
            {
                 JOptionPane.showMessageDialog(null, "Name Field is blank");
                 checkEmpty = true;
            }
            else if(txtadd.getText().isEmpty())
            {
                 JOptionPane.showMessageDialog(null, "Address Field is blank");
                 checkEmpty = true;
            }
             else if(city1.matches("-Select City-"))
            {
                 JOptionPane.showMessageDialog(null, "City Field is blank");
                 checkEmpty = true;
            }
        else if(txtphone.getText().isEmpty())
            {
                 JOptionPane.showMessageDialog(null, "Phone Field is blank");
                 checkEmpty = true;
            }
        return checkEmpty;
    }
    
    public static void main(String[] args) {
        new Emp_infoTest();
    }
    
}
