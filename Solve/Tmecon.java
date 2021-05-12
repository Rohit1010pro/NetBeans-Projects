/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solve;
import java.util.*;
/**
 *
 * @author rohit
 */
public class Tmecon {
    public static void main(String[] args){
        String s,s1,s2;
        Scanner in=new Scanner(System.in);
        int i;
        s=in.next();
        char ch[]=new char[s.length()];
        char c[]=s.toCharArray();
        for(i=0;i<8;i++){
            ch[i]=c[i];
        }
        if(c[8]=='P'){
        switch(ch[0]){
            case '0':
            switch(ch[1]){
                case '1':
                    ch[0]='1';
                    ch[1]='3';break;
                case '2':
                    ch[0]='1';
                    ch[1]='4';break;
                case '3':
                    ch[0]='1';
                    ch[1]='5';break;
                case '4':
                    ch[0]='1';
                    ch[1]='6';break;
                case '5':
                    ch[0]='1';
                    ch[1]='7';break;
                case '6':
                    ch[0]='1';
                    ch[1]='8';break;
                case '7':
                    ch[0]='1';
                    ch[1]='9';break;
                case '8':
                    ch[0]='2';
                    ch[1]='0';break;
                case '9':
                    ch[0]='2';
                    ch[1]='1';break;
               
            }break;
            case '1':
                switch(ch[1]){
                    case '0':
                        ch[0]='2';
                        ch[1]='2';break;
                    case '1':
                        ch[0]='2';
                        ch[1]='3';break;
                    case '2':
                        ch[0]='2';
                        ch[1]='4'; 
                    break;    
                }
        }
        }
    s1=new String(ch);
    System.out.println(s1);
    }
    
}
