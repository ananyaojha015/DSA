/*Find Second Smallest and Second Largest Element in an array
Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.*/
import java.util.Scanner;
public class secondlargest {
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
        int temp;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("the sorted array is:");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("second smallest element:"+arr[1]);
        System.out.println("second largest element:"+arr[n-2]);
    }
    
}
