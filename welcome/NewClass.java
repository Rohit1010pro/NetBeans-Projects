import java.util.Scanner;
public class NewClass{
    
    public static void main(String[] args){
        int num,p,r,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ënter the three digit no: ");
        num=in.nextInt();
        while(num>0)
        {
          r=num%10;
          sum=sum+r;
          num=num/10;
        }
        System.out.println("Sum of three digit is "+sum);
    
    }
            
            
}