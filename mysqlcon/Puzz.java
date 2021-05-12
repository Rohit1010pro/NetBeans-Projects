/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlcon;
import java.util.*;
/**
 *
 * @author rohit
 */
public class Puzz {
    int prime(int n){
        int  i,flag=0;
         for(i=2;i<=n/2;i++){
             if(n%i==0){
                 flag=1;
                 break;
             }
         }
         return flag;
    }
    public static void main(String[] args){
        Puzz p=new Puzz();
        int i,j,k,l,m,n,num,f,temp,step=0;
        int a[][]=new int[3][3];
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        Scanner in=new Scanner(System.in); 
        l=in.nextInt();
        for(m=0;m<l;m++){
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    a[i][j]=in.nextInt();
                }
               
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
              num=a[i][j]+a[i][j+1];  
              f=p.prime(num);
              if(f==1){
                  step++;
                  temp=a[i][j];
                  a[i][j]=a[i][j+1];
                  a[i][j+1]=temp;
              }
              else 
                  step=-1; 
            }
            for(k=0;k<3;k++){
                num=a[i][k]+a[i+1][k];
                f=p.prime(num);
                if(f==1){
                    step++;
                    temp=a[i][k];
                    a[i][k]=a[i+1][k];
                    a[i+1][k]=temp;
                }
                else
                    step=-1;
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }
    
}
