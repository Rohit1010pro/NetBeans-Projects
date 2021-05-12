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
public class Array {
    public static void main(String args[])
    {
      int a[]=new int[5];
      Scanner in=new Scanner(System.in);
      int i;
      for(i=0;i<5;i++)
      {
          a[i]=in.nextInt();
          
      }
      Array ob=new Array();
      ob.disp(a);
    }
    void disp(int a[])
     {
        int j;
        for(j=0;j<5;j++)
        {
        System.out.println(a[j]);
        }
    }
    
    
    
}
