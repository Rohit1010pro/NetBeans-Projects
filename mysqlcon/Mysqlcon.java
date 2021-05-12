/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlcon;
import java.sql.*;
/**
 *
 * @author rohit
 */
public class Mysqlcon {   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rohit","root","rohit@100");
            System.out.println("Connection Established");
            Statement s=con.createStatement();
            s.executeUpdate("INSERT INTO student "+" VALUES (106, 'Abhay', 'CSE' )");
            s.executeUpdate("INSERT INTO student "+" VALUES (107, 'Bhavya', 'Mech' )");
            System.out.println("Query Executed");
        }
        catch(ClassNotFoundException e){
            System.out.println("Exception : "+e.getMessage());
        }
        catch(SQLException e){
            System.out.println("SQL Exception "+e.getMessage());
        }
    }
    
}
