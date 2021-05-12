/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snapapp;

/**
 *
 * @author rohit
 */
public class Rio {
    public void rio(String s){
        
        char ch[]=s.toCharArray();
        char a;
        int i,j,n,count=1;
        for(i=0;i<s.length();i++){
            
            if(ch[i]==' '){
                count++;
                n=i-1;
                a=ch[n];
                j=0;
                
                for(int k=i-1;k>j;k--){
                    ch[k]=ch[k-1];
                }
               
                j=i+1;
                n--;
              System.out.println(a);  
            }
        }
        String s1=new String(ch);
        System.out.println(s1);
    }
    public static void main(String[] args){
        Rio r=new Rio();
        String s="Hello welcome in java ";
        r.rio(s);
    }
}
