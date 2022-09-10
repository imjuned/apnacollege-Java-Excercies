/*
Ask the user to enter the number of the month & print the name of the month .
For eg - for "1" month print 'January', '2' print 'February' & so on .
*/

import java.util.*;

public class month {

  public static void main(String args[]) {
    int month;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Number for month :");
    month = sc.nextInt();
    switch (month) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.print("Febuary");
        break;
      case 3:
        System.out.print("March");
        break;
      case 4:
        System.out.print("April");
        break;
      case 5:
        System.out.print("May");
        break;
      case 6:
        System.out.print("june");
        break;
      case 7:
        System.out.print("July");
        break;
      case 8:
        System.out.print("August");
        break;
      case 9:
        System.out.println("september");
        break;
      case 10:
        System.out.print("Octomber");
        break;
      case 11:
        System.out.println("November");
        break;
      case 12:
        System.out.println("December");
        break;
      default:
        System.out.print("Invlaid responce");
    }
  }
}
/*===============Output============
Enter Number for month :9
september

Enter Number for month :14
Invlaid repsonce

*/
