/*
Make a Menu Driven program .The user can enter 2 numbers Either 1 or 0
if the user enters 1 then keep taking input from the user for a student's marks(out of 100).
 if they enter 0 then stop.
 if he/ she scores :
 Marks >=90 -> print"This is good"
 Marks 89>=Marks >=60 -> print"This is also good"
 Marks 59>=Marks>= 0 -> print"This is good as well" 
*/
import java.util.*;
public class menu{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your choice : \n 1 for Enter Marks\n 2 for exit");
int ch,marks; 
 ch= sc.nextInt();
    do{
        if (ch==1){
            System.out.print("Enter your Marks :");
            marks=sc.nextInt();
            if (marks>=90 && marks <101){
                System.out.println("This is good");
            }
            else if(marks <=89 && marks>=60){
                System.out.println("This is also GOOD :P");
            }
            else if (marks<=59 && marks >=0){
                System.out.println("This is good as well !!");
            }
            else{
                System.out.println("Invalid Marks !");
            }
        }
        else{
            System.out.println("Invalid input Try Again");
        }
        
        
    System.out.println("\nEnter your choice : \n 1 for continue\n 0 for exit\n");

    ch = sc.nextInt();
    } while(ch!=0);

}
}
/*===========Output===========
Enter your choice :
 1 for Enter Marks
 2 for exit
1
Enter your Marks :95
This is good        

Enter your choice : 
 1 for continue     
 0 for exit

1
Enter your Marks :79
This is also GOOD :P

Enter your choice : 
 1 for continue     
 0 for exit

1
Enter your Marks :26
This is good as well !!

Enter your choice :    
 1 for continue        
 0 for exit

54
Invalid input Try Again

Enter your choice :    
 1 for continue        
 0 for exit

1
Enter your Marks :3298
Invalid Marks !

Enter your choice :
 1 for continue
 0 for exit

0
*/