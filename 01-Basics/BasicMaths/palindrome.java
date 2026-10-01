/*Check if a number is Palindrome or Not
Problem Statement: Given an integer N, return true if it is a palindrome else return false.

A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.*/
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=sc.nextInt();
        int digit;
        int rev=0;
        for(int i=x; i>0; i=i/10)
        {
            digit=i%10;
            rev=(rev*10)+digit;
        }
        if(x==rev)
        {
            System.out.println("palindrome number");
        
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
    
}
