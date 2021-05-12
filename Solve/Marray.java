/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solve;
import java.util.Scanner;
/**
 *
 * @author rohit
 */
public class Marray {
    public static void main(String[] args){
        int i,j,n,max,min;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[] a=new int[n];
        int[] sum=new int[n];
        for(i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++){
            sum[i]=0;
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                sum[i]+=a[j];
            }
        }
        
        for(i=0;i<n;i++){
            sum[i]-=a[i];
        }
        max=min=sum[0];
        for(i=0;i<n;i++){
            if(sum[i]>max)
                max=sum[i];
            if(sum[i]<min)
                min=sum[i];
        }
        System.out.println(max+" "+min);
    }
    
}
