/*Check if a number is prime or not
Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2..*/
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=sc.nextInt();
        int flag=0;
        for (int i=2; i<x; i++)
        {
            if(x%i==0)
            {
                flag=1;
            }
        }
        if (flag==1)
        {
            System.out.println("not prime");
        }
        else 
        {
            System.out.println("prime");
        }
    }
}
