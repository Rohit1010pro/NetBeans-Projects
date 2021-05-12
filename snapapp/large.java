/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snapapp;
import java.util.Scanner;
/**
 *
 * @author rohit
 */
public class large {
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int i,n,l,s;
    System.out.println("Enter the no. of elements");
    n=in.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++){
    a[i]=in.nextInt();
    }
    l=a[0];
    s=a[0];
    for(i=0;i<n;i++){
        if(a[i]>l)
            l=a[i];
        if(a[i]<s)
            s=a[i];
    }
    System.out.println("Largest="+l);
    System.out.println("Smallest="+s);
    } 
    
}
