/*Find GCD of two numbers
Problem Statement: Given two integers N1 and N2, find their greatest common divisor.*/
import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int gcd=1;
        for (int i=1; i<=x; i++)
        {
            if(x%i==0 && y%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("the gcd is:"+gcd);


    }
}
