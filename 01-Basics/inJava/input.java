/*nput Output
Subscribe to TUF+

Hints
Company
Complete the function printNumber which takes an integer input from the user and prints it on the screen.



Use:-

for C++ : cout << variable_name;
for Java : System.out.print();
for Python : print()
for Javascript : console.log()

Example 1

Input(user gives value): 7

Output: 7

Example 2

Input(user gives value): -5

Output: -5 */

import java.util.Scanner;
public class input {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int x= sc.nextInt();
        System.out.println("output:" + x);

    }

    
}
