/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solve;

/**
 *
 * @author rohit
 */
public class NewClass {
    public static void main(String[]nargs){
        int m[]={73,80,71,38,49};
        int a[]=new int[5];
        int b,c=0;
        for(int i=0;i<5;i++){
            a[i]=m[i];
        }
        for(int i=0;i<5;i++){
            if(m[i]>=38){
            for(int j=0;j<5;j++){
              b=m[i]++;
              if(b%5==0){
                  c=b;
                  
              }}
              if((c-a[i])<3){
                  a[i]=c;
              }
            
        }}
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
    
}
