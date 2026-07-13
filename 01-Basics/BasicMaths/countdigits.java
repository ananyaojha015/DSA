
import java.util.Scanner;
public class countdigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the integer:");
        int n=sc.nextInt();
        int c;
        if(n==0)
        {
            c=1;
        }
        else{
            c=0;
        
        for (int i=n; i>0; i=i/10)
        {
            c++;
        }
        
        }
        System.out.println("output:"+ c);
    }
    
}
