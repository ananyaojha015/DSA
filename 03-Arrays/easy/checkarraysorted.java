/*Check if an Array is Sorted
Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.*/
import java.util.Scanner;
public class checkarraysorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the "+n+" elements:");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0; i<n-1; i++)
        {
            
                if(arr[i]>arr[i+1])
                {
                    flag=1;
                    break;
                }
        }
        if(flag==0)
        {
            System.out.println("array is sorted");
        }
        else
        {
            System.out.println("not sorted");
        }
    }
    
}
