//  A program to 
package arrayex1;

import java.util.Scanner;

public class ArrayEx1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String []sname = new String[10];        
        int []age = new int[10];
        int N;
        int A = 23;
        
        for (N = 0; N <= 2; N++) {
            System.out.print("Enter the name of student " + (N+1));
            sname[N] = input.next();
            System.out.print("Enter his/her age ");
            age[N] = input.nextInt();
        }
        
        for (N = 0; N <= 2; N++) {
            System.out.println(sname[N] + " is " + age[N] + " years old");
        }

    }
 
}
