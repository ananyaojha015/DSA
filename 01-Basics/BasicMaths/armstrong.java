/*Check if a number is Armstrong Number or not
Problem Statement:Given an integer N, return true it is an Armstrong number otherwise return false.

An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.*/
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int x=sc.nextInt();
        int digit;
        int sum=0;
        int count=0;
        for (int i = x; i > 0; i = i / 10) {
            count++;
        }
        for (int i=x; i>0; i=i/10)
        {
            digit=i%10;
            sum = sum + (int)Math.pow(digit, count);
        }
        if(sum==x)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("not armstrong");
        }
    }
}
