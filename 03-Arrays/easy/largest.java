/*Find the Largest element in an array
Problem Statement: Given an array, we have to find the largest element in the array.*/
public class largest {
    public static void main(String[] args) {
        int arr[]={12, 45, 90, 67, 21};
        int largest=arr[0];
        for (int i=1; i<arr.length; i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i+1];
            }
        }
        System.out.println("largest element in the array is:" + largest);
    }
}
