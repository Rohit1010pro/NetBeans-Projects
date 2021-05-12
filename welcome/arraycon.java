/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;

/**
 *
 * @author rohit
 */
import java.util.Scanner;
public class arraycon {
    int a;
    arraycon(int a)
    {
        this.a=a;
    }
    public static void main(String args[])
    {
        int c,i;
        Scanner en = new Scanner(System.in);
        arraycon ob[] =new arraycon[5];
        for(i=0;i<5;i++)
        {
         c=en.nextInt();
         ob[i]=new arraycon(c);
    
        }
        for(i=0;i<5;i++)
        {
           System.out.println(ob[i].a); 
        }
    }
}
 