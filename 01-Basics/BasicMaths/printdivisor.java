/*Print all Divisors of a given Number
Problem Statement: Given an integer N, return all divisors of N.
A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.*/
import java.util.Scanner;
public class printdivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=sc.nextInt();
        System.out.println("the divisors are:");
        for (int i=1; i<=x; i++)
        {
            if(x%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
