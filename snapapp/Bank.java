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
interface Bank {
    public void roi();
}
class SBI implements Bank
{
    public void roi(){
        System.out.println("Rate of Interest"+6.7);
    }
}
class BOI implements Bank
{
    public void roi(){
        System.out.println("Rate of Interest"+7.2);
    }
}
class Bankmain {
    public static void main(String[] args){
        SBI s=new SBI();
        s.roi();
        BOI b=new BOI();
        b.roi(); 
    }
}
