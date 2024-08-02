/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc;

import java.awt.Image;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author tejas
 */
public class StudentForm extends javax.swing.JFrame {

    /**
     * Creates new form StudentForm
     */
    String gender =null;
    String course =" ";
    String iname = null;
    public StudentForm() {
        initComponents();
        city.addItem("-Select City-");
        city.addItem("Nagpur");
        city.addItem("Pune");
        city.addItem("Mumbai");
        city.addItem("Banglore");
        city.addItem("Delhi");
    }
    
    public String getCourse(){
        if(chkjava.isSelected())
            course+=chkjava.getText()+" ";
        else
            course+=" ";
        
        if(chkhtml.isSelected())
            course+=chkhtml.getText()+" ";
        else
            course+=" ";
        
        if(chkcss.isSelected())
            course+=chkcss.getText()+" ";
        else
            course+=" ";
        
        if(chkpython.isSelected())
            course+=chkpython.getText()+" ";
        else
            course+=" ";
        
        return course;
    }
    public void Clear()
    {
        txtid.setText(" ");
        txtname.setText(" ");
        txtadd.setText(" ");
        txtphone.setText(" ");
        city.setSelectedIndex(0);
        gender.valueOf(false);
        Jdate.setDate(null);
        rdmale.setSelected(false);
        rdfemale.setSelected(false);
        chkjava.setSelected(false);
        chkhtml.setSelected(false);
        chkcss.setSelected(false);
        chkpython.setSelected(false);
        lblimage.setIcon(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        heaading = new javax.swing.JLabel();
        lblcourse = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        lblid = new javax.swing.JLabel();
        lbladd = new javax.swing.JLabel();
        lblname1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtadd = new javax.swing.JTextArea();
        lblphone = new javax.swing.JLabel();
        city = new javax.swing.JComboBox<>();
        lblcity = new javax.swing.JLabel();
        Jdate = new com.toedter.calendar.JDateChooser();
        lbldob = new javax.swing.JLabel();
        rdfemale = new javax.swing.JRadioButton();
        rdmale = new javax.swing.JRadioButton();
        lblgender = new javax.swing.JLabel();
        chkpython = new javax.swing.JCheckBox();
        chkjava = new javax.swing.JCheckBox();
        chkhtml = new javax.swing.JCheckBox();
        chkcss = new javax.swing.JCheckBox();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        image = new javax.swing.JPanel();
        lblimage = new javax.swing.JLabel();
        btnimage = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnview = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        heaading.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        heaading.setText("Fill Student Form");
        jPanel1.add(heaading, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 190, 30));

        lblcourse.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblcourse.setText("Course:");
        jPanel1.add(lblcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 60, -1));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 160, 40));

        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        jPanel1.add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 160, 40));

        lblid.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblid.setText("Id:");
        jPanel1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 20, -1));

        lbladd.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbladd.setText("Address:");
        jPanel1.add(lbladd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 70, -1));

        lblname1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblname1.setText("Name:");
        jPanel1.add(lblname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 50, -1));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 160, 40));

        txtadd.setColumns(20);
        txtadd.setRows(5);
        jScrollPane2.setViewportView(txtadd);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 240, 60));

        lblphone.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblphone.setText("Phone");
        jPanel1.add(lblphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 50, -1));

        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 130, -1));

        lblcity.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblcity.setText("City:");
        jPanel1.add(lblcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 50, -1));

        Jdate.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(Jdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 432, 140, 30));

        lbldob.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbldob.setText("DOB:");
        jPanel1.add(lbldob, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 50, -1));

        rdfemale.setText("Female");
        rdfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdfemaleActionPerformed(evt);
            }
        });
        jPanel1.add(rdfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        rdmale.setText("Male");
        rdmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdmaleActionPerformed(evt);
            }
        });
        jPanel1.add(rdmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

        lblgender.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblgender.setText("Gender: ");
        jPanel1.add(lblgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 60, -1));

        chkpython.setText("Python");
        jPanel1.add(chkpython, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, -1, -1));

        chkjava.setText("Java");
        jPanel1.add(chkjava, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, -1, -1));

        chkhtml.setText("HTML");
        jPanel1.add(chkhtml, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, -1, -1));

        chkcss.setText("CSS");
        jPanel1.add(chkcss, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, -1, -1));

        btnnew.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel1.add(btnnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, -1, -1));

        btnsave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, -1, -1));

        btnupdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, -1, -1));

        btndelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 630, -1, -1));

        btnclear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, -1, -1));

        btnsearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        javax.swing.GroupLayout imageLayout = new javax.swing.GroupLayout(image);
        image.setLayout(imageLayout);
        imageLayout.setHorizontalGroup(
            imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimage, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        imageLayout.setVerticalGroup(
            imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 150, 120));

        btnimage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnimage.setText("Browse Image");
        btnimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimageActionPerformed(evt);
            }
        });
        jPanel1.add(btnimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 130, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 850, 460));

        btnview.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        jPanel1.add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 550, 140, 40));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void rdmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdmaleActionPerformed
        // TODO add your handling code here:
        gender = "Male";
        if(rdmale.isSelected()){
            rdmale.setSelected(true);
            rdfemale.setSelected(false);
        }
    }//GEN-LAST:event_rdmaleActionPerformed

    private void rdfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdfemaleActionPerformed
        // TODO add your handling code here:
         gender = "Female";
        if(rdfemale.isSelected()){
            rdmale.setSelected(false);
            rdfemale.setSelected(true);
        }
    }//GEN-LAST:event_rdfemaleActionPerformed

    private void btnimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimageActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int i  =chooser.showOpenDialog(this);
        if(i == JFileChooser.APPROVE_OPTION){
            File file = chooser.getSelectedFile();
            String fpath = file.getAbsolutePath();
            iname = file.getName();
            ImageIcon icon = new ImageIcon(fpath);
            Image image = icon.getImage();
            Image iimage = image.getScaledInstance(lblimage.getWidth(),lblimage.getHeight(),Image.SCALE_SMOOTH);
            lblimage.setIcon(new ImageIcon(iimage));
            
            
        }
    }//GEN-LAST:event_btnimageActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        
        try {
            java.util.Date dob = Jdate.getDate();
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            
            String datedob = formatter.format(dob);
            String course = getCourse();
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1","root","");
            String sql = "select * from tb_studata where id = '"+txtid.getText()+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Id Is Already Exist");
            }
            else{
                String sql1 = "insert into tb_studata(id,name,address,phone,city,dob,gender,course,image)values('"+txtid.getText()+"','"+txtname.getText()+"','"+txtadd.getText()+"','"+txtphone.getText()+"','"+city.getSelectedItem()+"','"+datedob+"','"+gender+"','"+course+"','"+iname+"')";
                PreparedStatement pst1 = con.prepareStatement(sql1);
                int i = pst1.executeUpdate();
                if(i>0){
                     JOptionPane.showMessageDialog(null,"Row Inserted Successfully");
                }
            }
        } catch (Exception ex) {
            System.out.println("Ex: "+ex.getMessage());
        }
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        // TODO add your handling code here:
        try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1","root","");
                    String sql = "select MAX(id) from tb_studata";
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
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
         try {
                    java.util.Date dob = Jdate.getDate();
                    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    String datedob = formatter.format(dob);
                    String course = getCourse();
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1","root","");
                    String sql="Update tb_studata set name='"+txtname.getText()+"',city='"+city.getSelectedItem()+"',phone='"+txtphone.getText()+"',address='"+txtadd.getText()+"',dob='"+datedob+"',gender='"+gender+"',course='"+course+"',image='"+iname+"'where id='"+txtid.getText()+"'";
                    PreparedStatement pst=con.prepareStatement(sql);
                    
                    int respond = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Update Data?");
                    if(respond == JOptionPane.YES_OPTION){
                        int i=pst.executeUpdate();
                        if(i>0){
                         JOptionPane.showMessageDialog(null,"Record Updated sucessfully");
                            Clear();
                        }
                    }
                } catch (Exception ex) {
                    System.out.println("Ex: "+ex.getMessage());
                }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        Clear();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1","root","");
            String sql = "delete from tb_studata where id = '"+txtid.getText()+"'";
            PreparedStatement pst  = con.prepareStatement(sql);
            int respond  = JOptionPane.showConfirmDialog(null,"Are you sure to delete a data");
            if(respond == JOptionPane.YES_OPTION){
                int i  = pst.executeUpdate();
                if(i>0){
                    JOptionPane.showMessageDialog(null,"Record Delete Successfully");
                    Clear();
                }
            }
        } catch (Exception ex) {
            System.out.println("Ex: "+ex.getMessage());
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1", "root", "");
            String sql = "Select * from tb_studata where id ='"+txtid.getText()+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            boolean status = false;
            while(rs.next()){
                txtname.setText(rs.getString("name"));
                txtadd.setText(rs.getString("address"));
                txtphone.setText(rs.getString("phone"));
                city.setSelectedItem(rs.getString("city"));
                
                String date = rs.getString("dob");
                java.util.Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(date);
                Jdate.setDate(dob);
                
                gender = rs.getString("gender");
                if(gender.equalsIgnoreCase("Male")){
                    rdmale.setSelected(true);
                    rdfemale.setSelected(false);
                }
                else{
                    rdmale.setSelected(false);
                    rdfemale.setSelected(true);
                }
                
                String course = rs.getString("course");
                String[] cou = course.split("\\s");
                for(int i=0;i<cou.length;i++){
                    if(cou[i].equalsIgnoreCase("Java")){
                        chkjava.setSelected(true);
                    }
                    else if(cou[i].equalsIgnoreCase("HTML")){
                        chkhtml.setSelected(true);
                    }
                    else if(cou[i].equalsIgnoreCase("CSS")){
                        chkcss.setSelected(true);
                    }
                    else if(cou[i].equalsIgnoreCase("Python")){
                        chkpython.setSelected(true);
                    }
                }
                
                
                String imagename = rs.getString("image");
                iname = imagename;
                ImageIcon icon = new ImageIcon("C:\\Users\\tejas\\OneDrive\\Desktop\\Photo\\"+imagename);
                Image image = icon.getImage();
                Image newImage = image.getScaledInstance(lblimage.getWidth(),lblimage.getHeight(),Image.SCALE_SMOOTH);
                lblimage.setIcon(new ImageIcon(newImage));
                
                status = true;
            }
            if(!status){
                JOptionPane.showMessageDialog(null,"Record Not Found");
                Clear();
            }
        } catch (Exception ex) {
            System.out.println("Ex: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test1","root","");
            String sql = "select * from tb_studata";
            PreparedStatement pst =con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            System.out.println("Ex: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnviewActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        TableModel model = table.getModel();
        int row = table.getSelectedRow();
        int id = (int) table.getValueAt(row,0);
        txtid.setText(""+id);
        String name = (String) table.getValueAt(row, 1);
        txtname.setText(""+name);
        String Address = (String) table.getValueAt(row, 2);
        txtadd.setText(""+Address);
        String Phone = (String) table.getValueAt(row, 3);
        txtphone.setText(""+Phone);
        String City = (String) table.getValueAt(row, 4);
        city.setSelectedItem(""+City);
        
        String Date = (String)table.getValueAt(row, 5);
        
        java.util.Date dob = null;
        try {
          dob = new SimpleDateFormat("dd/MM/yyyy").parse(Date);
        } catch (ParseException ex) {
            Logger.getLogger(StudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        Jdate.setDate(dob);
        
              
               
       
       String gender = (String)table.getValueAt(row, 6);
       if(gender.equalsIgnoreCase("Male"))
       {
           rdmale.setSelected(true);
           rdfemale.setSelected(false);
       }else{
           rdmale.setSelected(false);
           rdfemale.setSelected(true);
       }
       String course=(String)table.getValueAt(row, 7);
       String[] cou = course.split("\\s");
       
       for(int i=0;i<cou.length;i++){
           if(cou[i].equalsIgnoreCase("Java"))
               chkjava.setSelected(true);
           else if(cou[i].equalsIgnoreCase("HTML"))
               chkhtml.setSelected(true);
           else if (cou[i].equalsIgnoreCase("CSS"))
               chkcss.setSelected(true);
           else if (cou[i].equalsIgnoreCase("Python"))
               chkpython.setSelected(true);
       }
        
    }//GEN-LAST:event_tableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Jdate;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnimage;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnview;
    private javax.swing.JCheckBox chkcss;
    private javax.swing.JCheckBox chkhtml;
    private javax.swing.JCheckBox chkjava;
    private javax.swing.JCheckBox chkpython;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JLabel heaading;
    private javax.swing.JPanel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbladd;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcourse;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblname1;
    private javax.swing.JLabel lblphone;
    private javax.swing.JRadioButton rdfemale;
    private javax.swing.JRadioButton rdmale;
    private javax.swing.JTable table;
    private javax.swing.JTextArea txtadd;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
