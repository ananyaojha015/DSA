/*Problem Statement: Given an integer N return the reverse of the given number.

Note: If a number has trailing zeros, then its reverse will not include them. For e.g , reverse of 10400 will be 401 instead of 00401. */
import java.util.Scanner;
public class reverse {
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
        System.out.println("reversed number is:"+ rev);
    }
    
}
