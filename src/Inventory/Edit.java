/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author user
 */
public class Edit extends javax.swing.JFrame {

    Connection con;
    /**
     * Creates new form Edit
     */
    public Edit() {
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        confirmEditButton.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        insertButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        featuredBox = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        valueField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        backButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        editIdField = new javax.swing.JTextField();
        confirmEditButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        TypeComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        brandComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ColorComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nameComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        EnterButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insertButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });
        jPanel4.add(insertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 120, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Random\\toppic\\edit_64px.png")); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 110, 80));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Insert Feature");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 110, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Random\\toppic\\2772672.jpg")); // NOI18N
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 140));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 720, -1));

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Feature");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 89, 26));

        featuredBox.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        featuredBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "brands", "colors", "phones", "type" }));
        jPanel4.add(featuredBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 170, 30));

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Value");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 89, 26));

        valueField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueFieldActionPerformed(evt);
            }
        });
        jPanel4.add(valueField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 160, 30));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 10, 80));

        backButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        backButton1.setText("Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 110, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Random\\toppic\\2772672.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 760, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 458, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 118, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Insert Feature", jPanel3);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Phone ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 130, 40));

        editIdField.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        editIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editIdFieldActionPerformed(evt);
            }
        });
        jPanel1.add(editIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 160, 40));

        confirmEditButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        confirmEditButton.setText("Confirm Edit");
        confirmEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEditButtonActionPerformed(evt);
            }
        });
        jPanel1.add(confirmEditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 140, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Random\\toppic\\edit_64px.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 110, 80));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EDIT PHONE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 110, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Random\\toppic\\2772672.jpg")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 130));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 720, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Type");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 89, 26));

        TypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new CentralProvider().getType()));
        jPanel1.add(TypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 160, 20));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Brand");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 89, 26));

        brandComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new CentralProvider().getBrands()));
        brandComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(brandComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 160, 20));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Color");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 89, 26));

        ColorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new CentralProvider().getColor()));
        jPanel1.add(ColorComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 160, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 89, 26));

        nameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new CentralProvider().getPhoneName()));
        jPanel1.add(nameComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 160, -1));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Price");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 89, 26));

        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });
        jPanel1.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 160, 30));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Description");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 89, 26));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 170, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 230, 10, 200));

        EnterButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        EnterButton.setText("Enter");
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });
        jPanel1.add(EnterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        backButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 110, 30));

        jTabbedPane1.addTab("Edit Products", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editIdFieldActionPerformed

    private void confirmEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEditButtonActionPerformed
//        
        if(priceField.getText().isEmpty() || descriptionTextArea.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Required Field id Empty", "WARNING", HEIGHT);
            return;
        }
        int id = Integer.valueOf(editIdField.getText());
        new CentralProvider().updateProduct(TypeComboBox, brandComboBox, ColorComboBox, nameComboBox, descriptionTextArea, priceField, id);
        confirmEditButton.setEnabled(false);
        priceField.setText("");
        descriptionTextArea.setText("");
        

    }//GEN-LAST:event_confirmEditButtonActionPerformed

    private void brandComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandComboBoxActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButtonActionPerformed
        // TODO add your handling code here:
        
//        if(deletedLabel.isVisible()){
//            deletedLabel.setVisible(false);
//        }
//
        ResultSet rs = null;
        try {
            // TODO add your handling code here:
            String id = editIdField.getText().trim();
            if(id.isEmpty()){
                JOptionPane.showMessageDialog(null, "No ID Selected", "WARNING", HEIGHT);
                return;
            }

            String con_String = "jdbc:mysql://127.0.0.1:3306/phoneshop";
            con = DriverManager.getConnection(con_String, "root", "" );

            String str = "SELECT * FROM `products_stock` WHERE id=?";
            PreparedStatement ps = con.prepareStatement(str);
            ps.setString(1, id);

            rs = ps.executeQuery();
            if(! rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null, id + "ID does not exist", "WARNING", HEIGHT);
                return;
            }
            
            new CentralProvider().onEditClick(rs, TypeComboBox, brandComboBox, ColorComboBox, nameComboBox, priceField, descriptionTextArea);
            confirmEditButton.setEnabled(true);
            

            

        }
        catch (SQLException ex) {
            System.out.println(ex.toString() + " Error occured when sellCart button was clicked");
        }
    }//GEN-LAST:event_EnterButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        // TODO add your handling code here:
        if(valueField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Required Field is Empty", "WARNING", HEIGHT);
            return;
        }
        
        String value = valueField.getText();
        String feature = (String) featuredBox.getSelectedItem();
        
        try{
           
            String con_String = "jdbc:mysql://127.0.0.1:3306/phoneshop";
            con = DriverManager.getConnection(con_String, "root", "" );
            String str = "INSERT INTO "+ feature +" VALUES (null, ?)";
            PreparedStatement ps = con.prepareStatement(str, Statement.RETURN_GENERATED_KEYS);
            
//            ps.setString(1, feature);
            ps.setString(1, value);
            System.out.println(ps.toString() + " tii");
            
            
            
            int editInput = ps.executeUpdate();
            
            if(editInput >0){
                JOptionPane.showMessageDialog(null, feature + "Inserted succesfullt", "SUCCESSFUL", HEIGHT);
            }
            
            

            
            
        }
        catch(Exception e){
            System.out.println("Error while Connecting to Database1" + e.toString());
        }
    }//GEN-LAST:event_insertButtonActionPerformed

    private void valueFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ColorComboBox;
    private javax.swing.JButton EnterButton;
    private javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JButton backButton;
    private javax.swing.JButton backButton1;
    private javax.swing.JComboBox<String> brandComboBox;
    private javax.swing.JButton confirmEditButton;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JTextField editIdField;
    private javax.swing.JComboBox<String> featuredBox;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> nameComboBox;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField valueField;
    // End of variables declaration//GEN-END:variables
}
