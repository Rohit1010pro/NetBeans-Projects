 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int ele,n,i,flag=0;
        System.out.println("Enter the no. of elements ");
        n=in.nextInt();
        int array[]=new int[n];
        for(i=0;i<n;i++)
        {
          array[i]=in.nextInt();  
        }
        System.out.println("Enter the element to be searched ");
        ele=in.nextInt();
        for(i=0;i<n;i++)
        {
            if(array[i]==ele){
                System.out.println("Element is found at "+i);
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("Not Found");
    }
    
}
