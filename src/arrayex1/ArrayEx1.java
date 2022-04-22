//  A program to 
package arrayex1;

import java.util.Scanner;

public class ArrayEx1 {

    public static void main(String[] args) {
        Scanner accept = new Scanner(System.in);
        String []cname = new String[3];        
        String [][]items = new String[3][3];
        double [][]price = new double[3][3]; //dynamic two dimensional array
        double []total = new double[3];  //dynamic One dimensional array
        double subTotal = 0;
        
        for (int i = 0; i <= 1 ; i++) {
            System.out.println("Enter name for customer " + (i + 1));
            cname[i] = accept.next();
            total[i] = 0;
            for (int j = 0; j <= 1; j++) {
                System.out.println("Enter Item " + (j + 1));
                items[i][j] = accept.next();
                System.out.println("Enter Price for Item " + (j + 1));
                price[i][j] = accept.nextDouble();
                total[i] = total[i] + price[i][j];
            }
            subTotal += total[i];
        }
        
        System.out.println("\n\nNAME \t ITEM1 \t ITEM2 \t ITEM3 \t TOTAL");
        System.out.println("===================================================================================");
        
        for (int i = 0; i <= 1 ; i++) {
            System.out.print(cname[i] + "\t");
            
            for (int j = 0; j <= 1; j++) {
                System.out.print(items[i][j] + " @ ");
                System.out.print(price[i][j] + "naira \t");
            }
            
            System.out.println(total[i]);
        }
        
        System.out.println("\n===================================================================================");
        System.out.println("SUB TOTAL = " + subTotal);
    }
 
}
