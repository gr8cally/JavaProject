/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class CentralProvider {
    Connection con;
    public static int staffID;
    public static String staffFname;
    public static String staffLname;
    public static String staffDesignation;
   public static String[] GetStringArray(ArrayList<String> arr){
       String str[] = new String[arr.size()];
       
       for(int i=0; i< arr.size(); i++){
           str[i] = arr.get(i);
       }
       
       return str;
   }
   
   public String[] getBrands(){
        System.out.println("Started");
        String[] returnBrands = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found");
        }
        
        try{
            String con_String = "jdbc:mysql://127.0.0.1:3306/phoneshop";
            con = DriverManager.getConnection(con_String, "root", "" );
            System.out.println("SQL connection to database established");
            
            
            String str = "select brand from brands";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(str);
            ArrayList<String> brandsArray = new ArrayList();
            
            while(rs.next()){
                brandsArray.add(rs.getString("brand"));
            }
            
            returnBrands = GetStringArray(brandsArray);
           
        }
        catch(Exception e){
            int i= 6;
            
            System.out.println("Error while Connecting to Database1" + e.toString());
        }
        
        finally {
            try {
                if (con != null) {
                    con.close();
                }
                System.out.println("Connection closed !!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        
        
        
        return returnBrands;
    }
   
   
   public String[] getType(){
        System.out.println("Started get Type");
        String[] returnType = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found");
        }
        
        try{
            String con_String = "jdbc:mysql://127.0.0.1:3306/phoneshop";
            con = DriverManager.getConnection(con_String, "root", "" );
            
            String str = "select availabletype from type";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(str);
            ArrayList<String> typeArray = new ArrayList();
            
            while(rs.next()){
                typeArray.add(rs.getString("availabletype"));
            }
            
            returnType = GetStringArray(typeArray);
           
        }
        catch(Exception e){
            int i= 6;
            
            System.out.println("Error while Connecting to Database1" + e.toString());
        }
        
        finally {
            try {
                if (con != null) {
                    con.close();
                }
                System.out.println("Connection closed !!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        
        
        
        return returnType;
    }
   
   public String[] getColor(){
        System.out.println("Started get Color");
        String[] returnColor = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found");
        }
        
        try{
            String con_String = "jdbc:mysql://127.0.0.1:3306/phoneshop";
            con = DriverManager.getConnection(con_String, "root", "" );
            
            String str = "select availablecolors from colors";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(str);
            ArrayList<String> colorArray = new ArrayList();
            
            while(rs.next()){
                colorArray.add(rs.getString("availablecolors"));
            }
            
            returnColor = GetStringArray(colorArray);
           
        }
        catch(Exception e){
            int i= 6;
            
            System.out.println("Error while Connecting to Database1" + e.toString());
        }
        
        finally {
            try {
                if (con != null) {
                    con.close();
                }
                System.out.println("Connection closed !!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        
        
        
        return returnColor;
    }
   
   public String[] getPhoneName(){
        System.out.println("Started get Phone Name");
        String[] returnPhoneName = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found");
        }
        
        try{
            String con_String = "jdbc:mysql://127.0.0.1:3306/phoneshop";
            con = DriverManager.getConnection(con_String, "root", "" );
            
            String str = "select phonename from phones";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(str);
            ArrayList<String> PhoneArray = new ArrayList();
            
            while(rs.next()){
                PhoneArray.add(rs.getString("phonename"));
            }
            
            returnPhoneName = GetStringArray(PhoneArray);
           
        }
        catch(Exception e){
            int i= 6;
            
            System.out.println("Error while Connecting to Database1" + e.toString());
        }
        
        finally {
            try {
                if (con != null) {
                    con.close();
                }
                System.out.println("Connection closed !!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        
        
        
        return returnPhoneName;
    }
   
   public long insertProduct(JComboBox<String> typeBox, JComboBox<String> brandBox, JComboBox<String> colorBox, JComboBox<String> nameBox, JTextArea description, JTextField price){
       try{
            String con_String = "jdbc:mysql://127.0.0.1:3306/phoneshop";
            con = DriverManager.getConnection(con_String, "root", "" );
            con.setAutoCommit(false);
            String str = "INSERT INTO `products_stock`( `description`, `type`, `brand`, `color`, `name`, `price`) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(str, Statement.RETURN_GENERATED_KEYS);
            String descriptionText = description.getText();
            String typeText = typeBox.getSelectedItem().toString();
            String brandText = brandBox.getSelectedItem().toString();
            String colorText = colorBox.getSelectedItem().toString();
            String nameText = nameBox.getSelectedItem().toString();
            int priceField = Integer.valueOf(price.getText().toString().trim());
            String sku = brandText.substring(0, 2) + "-" + nameText;
            
            ps.setString(1, descriptionText);
            ps.setString(2, typeText);
            ps.setString(3, brandText);
            ps.setString(4, colorText);
            ps.setString(5, nameText);
            ps.setInt(6, priceField);
            
            int loginInput = ps.executeUpdate();
            
            if(loginInput >0){
                System.out.println("Login insert successful but not commited");
                
            }
            ResultSet generatedRS = ps.getGeneratedKeys();
            generatedRS.next();
            long genID = generatedRS.getLong(1);
            System.out.println( "Generated fam" + genID);
            con.commit();
            System.out.println("Commit Succesful");
            return genID;
            
        }
        catch(Exception e){
            System.out.println("Error while Connecting to Database1" + e.toString());
        }
       return 0;
   }
   
   public void FillTable(JTable table, String Query)
{
    try
    {
        String con_String = "jdbc:mysql://127.0.0.1:3306/phoneshop";
        con = DriverManager.getConnection(con_String, "root", "" );
        Statement stat = con.createStatement();
        ResultSet rs = stat.executeQuery(Query);

        //To remove previously added rows
        while(table.getRowCount() > 0) 
        {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        int columns = rs.getMetaData().getColumnCount();
        while(rs.next())
        {  
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i);
            }
            ((DefaultTableModel) table.getModel()).insertRow(rs.getRow()-1,row);
        }

        rs.close();
        stat.close();
        con.close();
    }
    catch(SQLException e)
    {
        System.out.println("Herror" + e.toString());
    }
}

   
   
public boolean dbToJtable(ResultSet rs, JTable table, JTextField totalText, ArrayList<Integer> list){
        
    
        try {
            while(rs.next()){
                String id;
                String name, brand, color;
                int price;
                
                id = String.valueOf(rs.getInt("id"));
                
                if(list.contains(Integer.valueOf(id))){
                    return true;
                }
                
                list.add(Integer.valueOf(id));
                name = rs.getString("name");
                brand = rs.getString("brand");
                color = rs.getString("color");
                price = rs.getInt("price");
                
                String currentTotal = totalText.getText().trim();
                int newTotal = Integer.valueOf(currentTotal) + price;
                
                DefaultTableModel m = (DefaultTableModel) table.getModel();
                m.addRow(new Object[]{id, name, brand, color, price});
                totalText.setText(newTotal+ "");
               
            }
        } catch (Exception ex) {
            System.out.println(" Error while moving data from DB to sellTable" + ex.toString());
        }
        
        finally{
        try {
            rs.close();
            
        } catch (Exception ex) {
            System.out.println("Error while closing ResultSet " + ex.toString());
        }
        
        
        }
        
        return false;
}

public int productToSales(ArrayList<Integer> list){
    int rowsDeleted = 0;
    String inClause = "";
    for(int i=0; i<list.size(); i++){
        inClause += list.get(i)+ ",";
    }
    inClause = inClause.replaceAll(",$", "");
    System.out.println(inClause);
    
    String insertSelectQuery = "INSERT INTO `sales_table`(`id`, `description`, `type`, `brand`, `color`, `name`, `price`)"
            + "SELECT * FROM `products_stock` WHERE id IN (" + inClause+ ")";
    
    String deleteQuery = "DELETE FROM `products_stock` WHERE id IN (" + inClause+ ")";
    
    try{
            String con_String = "jdbc:mysql://127.0.0.1:3306/phoneshop";
            con = DriverManager.getConnection(con_String, "root", "" );
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            stmt.executeUpdate(insertSelectQuery);
            rowsDeleted = stmt.executeUpdate(deleteQuery);
            con.commit();
    }
    catch(Exception e){
        e.toString();
    }
    finally{
        try {
            con.close();
        } catch (SQLException ex) {
            ex.toString();
        }
    }
    return rowsDeleted;
}

public void updateTableAfterDelete(int rowdDeleted, JLabel label, JTable table, JTextField field){
    while(table.getRowCount() > 0) 
        {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
    label.setText(rowdDeleted + " Phones Sold for a total of #" + field.getText());
    label.setVisible(true);
    field.setText("0");
}

public boolean validateLogin(JTextField username, JPasswordField password){
    try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found");
        }
        
        try{
            String con_String = "jdbc:mysql://127.0.0.1:3306/phoneshop";
            con = DriverManager.getConnection(con_String, "root", "" );
            
            
            String str = "select * from Login where username =? and password =?";
            PreparedStatement ps = con.prepareStatement(str);
            String uname = username.getText().trim();
            String pwd = password.getText().trim();
            ps.setString(1, uname);
            ps.setString(2, pwd);
            ResultSet rs = ps.executeQuery();
            int i;
            if(rs.next()){
                staffID = rs.getInt("staff_id");
                staffFname = rs.getString("firstname");
                staffLname = rs.getString("lastname");
                staffDesignation = rs.getString("designation");
                return true;
            }
            else{
                
                return false;
            }
        }
        catch(Exception e){
           
            System.out.println("Error while Connecting to Database1" + e.toString());
        }
        finally{
        try {
            con.close();
        } catch (SQLException ex) {
            ex.toString();
        }
        }
        return false;
    
}
   
public long insertStaff(JTextField fname, JTextField lname, JTextField email, JTextField designation, JTextField uname, JTextField pword, JTextArea address ){
        String insertfname = fname.getText();
        String insertlname = lname.getText();
        String insertemail = email.getText();
        String insertdesignation = designation.getText();
        String insertuname = uname.getText();
        String insertpword = pword.getText();
        String insertaddress = address.getText();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found");
        }
        
        try{
            String string_con = "jdbc:mysql://127.0.0.1:3306/phoneshop";
            con = DriverManager.getConnection(string_con, "root", "");
            System.out.println("SQL connection to database established");
            String sqlQuery = "INSERT INTO `login`(`username`, `password`, `firstname`, `lastname`, `address`, `email`, `designation`) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, insertuname);
            stmt.setString(2, insertpword);
            stmt.setString(3, insertfname);
            stmt.setString(4, insertlname);
            stmt.setString(5, insertaddress);
            stmt.setString(6, insertemail);
            stmt.setString(7, insertdesignation);
            
            int rowsInserted = stmt.executeUpdate();
            
            ResultSet generatedRS = stmt.getGeneratedKeys();
            generatedRS.next();
            long genID = generatedRS.getLong(1);
            return genID;
        }
        catch (SQLException ex){
            System.out.println("Problem Inserting staff " + ex.toString());
        }
        return 0;
    }

public void onEditClick(ResultSet rs, JComboBox typeBox, JComboBox brandBox, JComboBox colorBox, JComboBox nameBox, JTextField priceField, JTextArea descArea){
    try {
            while(rs.next()){
                String id;
                String name, brand, color, type, description;
                int price;
                
                id = String.valueOf(rs.getInt("id"));
               
                name = rs.getString("name");
                brand = rs.getString("brand");
                color = rs.getString("color");
                price = rs.getInt("price");
                description = rs.getString("description");
                type = rs.getString("type");
                
                typeBox.setSelectedItem(type);
                brandBox.setSelectedItem(brand);
                colorBox.setSelectedItem(color);
                nameBox.setSelectedItem(name);
                priceField.setText(price + "");
                descArea.setText(description);
                
                
                
               
            }
        } catch (Exception ex) {
            System.out.println(" Error while moving data from DB to sellTable" + ex.toString());
        }
        
        finally{
        try {
            rs.close();
            
        } catch (Exception ex) {
            System.out.println("Error while closing ResultSet " + ex.toString());
        }
        
        
        }
}
    
public void updateProduct(JComboBox<String> typeBox, JComboBox<String> brandBox, JComboBox<String> colorBox, JComboBox<String> nameBox, JTextArea description, JTextField price, int id){
       try{
           
            String con_String = "jdbc:mysql://127.0.0.1:3306/phoneshop";
            con = DriverManager.getConnection(con_String, "root", "" );
            con.setAutoCommit(false);
            String str = "UPDATE `products_stock` SET `description`=?,`type`=?,`brand`=?,`color`=?,`name`=?,`price`=? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(str, Statement.RETURN_GENERATED_KEYS);
            String descriptionText = description.getText();
            String typeText = typeBox.getSelectedItem().toString();
            String brandText = brandBox.getSelectedItem().toString();
            String colorText = colorBox.getSelectedItem().toString();
            String nameText = nameBox.getSelectedItem().toString();
            int priceField = Integer.valueOf(price.getText().toString().trim());
            String sku = brandText.substring(0, 2) + "-" + nameText;
            
            ps.setString(1, descriptionText);
            ps.setString(2, typeText);
            ps.setString(3, brandText);
            ps.setString(4, colorText);
            ps.setString(5, nameText);
            ps.setInt(6, priceField);
            ps.setInt(7, id);
            
            
            int editInput = ps.executeUpdate();
            
            if(editInput >0){
                System.out.println("Edit successful but not commited");
                
            }
//            ResultSet generatedRS = ps.getGeneratedKeys();
//            generatedRS.next();
//            long genID = generatedRS.getLong(1);
//            System.out.println( "Generated fam" + genID);
            con.commit();
            System.out.println("Commit Succesful");
            
            
        }
        catch(Exception e){
            System.out.println("Error while Connecting to Database1" + e.toString());
        }
       
   }

    public boolean updateStaff(JTextField fname, JTextField lname, JTextField designation, JTextField email, int id){
        try{
           
            String con_String = "jdbc:mysql://127.0.0.1:3306/phoneshop";
            con = DriverManager.getConnection(con_String, "root", "" );
            String str = "UPDATE `login` SET `firstname`=?,`lastname`=?,`email`=?,`designation`=? WHERE staff_id = ?";
            PreparedStatement ps = con.prepareStatement(str, Statement.RETURN_GENERATED_KEYS);
            String nfname = fname.getText();
            String nlname = lname.getText();
            String nemail = email.getText();
            String ndesignation = designation.getText();
            
            
            ps.setString(1, nfname);
            ps.setString(2, nlname);
            ps.setString(3, nemail);
            ps.setString(4, ndesignation);
            ps.setInt(5, id);
            
            
            int editInput = ps.executeUpdate();
            
            if(editInput >0){
                System.out.println("Edit successful but not commited");
                return true;
                
            }

            
            
        }
        catch(Exception e){
            System.out.println("Error while Connecting to Database1" + e.toString());
        }
        return false;
    }
    
    public boolean populateStaff(JTextField fname, JTextField lname, JTextField designation, JTextField email, int id){
        try{
           
            String con_String = "jdbc:mysql://127.0.0.1:3306/phoneshop";
            con = DriverManager.getConnection(con_String, "root", "" );
            String str = "SELECT * FROM `login` WHERE staff_id = ?";
            PreparedStatement ps = con.prepareStatement(str, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
              fname.setText(rs.getString("firstname"));
              lname.setText(rs.getString("lastname"));
              email.setText(rs.getString("email"));
              designation.setText(rs.getString("designation"));
              return true;
            }
            
        }
        catch(Exception e){
            System.out.println("Error while Connecting to Database1" + e.toString());
        }
        return false;
    }
}
