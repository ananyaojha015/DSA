/*If ElseIf

Hints
Company
Given marks of a student, print on the screen:

Grade A if marks >= 90
Grade B if marks >= 70
Grade C if marks >= 50
Grade D if marks >= 35
Fail, otherwise.


For printing use:-

for C++ : cout << variable_name;
for Java : System.out.print();
for Python : print()
for Javascript : console.log()
for C# : Console.WriteLine();
for Go : fmt.Println()

Example 1

Input: marks = 95

Output: Grade A

Explanation: marks are greater than or equal to 90.

Example 2

Input: marks = 14

Output: Fail

Explanation: marks are less than 35. */
import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks:");
        int x= sc.nextInt();
        System.out.println("the result is:");
        if (x>=90)
        {
            System.out.println("grade A");
        }
        else if (x>=70)
        {
            System.out.println("grade B");
        }
        else if (x>=50)
        {
            System.out.println("grade C");
        }
        else if(x>=35)
        {
            System.out.println("grade D");
        }
        else
        {
            System.out.println("fail");
        }
    }
    
}
