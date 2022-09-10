/*
Make a cakcuator .Take two numbers(A & B ) from the user and an operation as follows:
1.(Additon)
2.(substraction)
3.(multiplication)
4.(division)
Calculate the result according to the operation given and dispaly given and display it to the user.
*/

import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextInt();
        float c;

        System.out.println("Enter choice To perform operation :");
        System.out.print("1.Additon\n2.Substraction\n3.Multiplication\n4.Division\n");
        int ch = sc.nextInt();
        //Using if else table
        if (ch==1){
            System.out.print("sum is :");
            System.out.print(a+b);
        }else if(ch==2){
                System.out.print("Substracion is :");
                System.out.print(a-b);
        }
        else if (ch==3){
            System.out.print("Multiplication is :");
            System.out.print(a*b);

        }else if (ch==4){
            System.out.print("division is :");
            System.out.print(a/b);
        }
        else{
            System.out.print("Invalid choice");
        }
        
        
        
        
        
        
        //using Switch case
        // switch(ch){
        //     case 1:
        //     {
        //         c=a+b;
        //         System.out.print("sum is :");
        //         System.out.print(c);
        //         break;
        //     }
        //     case 2:
        //     {
        //         c=a-b;
        //         System.out.print("substraction is :");
        //         System.out.print(c);
        //         break;
        //     }
            
        //     case 3:
        //     {
        //         c=a*b;
        //         System.out.print("Multiplication is :");
        //         System.out.print(c);
        //         break;
        //     }
        //     case 4:
        //     {
        //         c=a/b;
        //         System.out.print("Division is :");
        //         System.out.print(c);
        //         break;
        //     }
        //     default :
        //     System.out.print("Invalid choice");
        // }

    }
}
/*============Output================
4
2
Enter choice To perform operation :
1.Additon
2.Substraction
3.Multiplication
4.Division
2
substraction is :2.0

5
3
Enter choice To perform operation :
1.Additon
2.Substraction
3.Multiplication
4.Division
4
Division is :1.6666666

*/