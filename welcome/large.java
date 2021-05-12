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
public class large {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the three numbers:");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a>b)
        {
            
            if(a>c){
              System.out.println(a+" is greater");
            }
            else{
                System.out.println(c+" is greater");
            }
        }
        else{
            System.out.println(b+" is greater");
        }
    }
    
    
}
