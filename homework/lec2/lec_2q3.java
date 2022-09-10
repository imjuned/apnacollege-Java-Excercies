/*
Make a program that prints the table of a number that is input by the user
*/
import java.util.*;

public class lec_2q3{
    public static void main (String args[]){
        int Number;
        Scanner sc = new Scanner(System.in);
        System.out.print5("Enter number:");
        Number = sc.nextInt();
        System.out.println("Table of input Number is:");
        System.out.println(Number*1);
        System.out.println(Number*2);
        System.out.println(Number*3);
        System.out.println(Number*4);
        System.out.println(Number*5);
        System.out.println(Number *6);
        System.out.println(Number*7);
        System.out.println(Number*8);
        System.out.println(Number*9);
        System.out.print(Number*10);
    }
}
/*=============Output=============
Enter number:7
Table of input Number is:
7
14
21
28
35
42
49
56
63
70

*/