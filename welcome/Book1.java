/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;
import Book.*;
/**
 *
 * @author rohit
 */
public class Book1 {
    public static void main(String[] args){
       Book b=new Book(); 
       b.read("Star war","Vishwak",1000,2016);
       b.disp();
    }
}
