/*
Make a program that takes the radius of circle as input , calculates
 its radius and area and prints it as output to the user
*/
import java.util.*;

public class lec_2q2{
    public static void main(String args[]){
        double radius,area;

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Radius of circle :");
        radius = sc.nextFloat();
        area = 3.14*radius*radius;
        System.out.print("Area of circle:");
        System.out.print(area);
        }
}
/*====================Output===============
Enter Radius of circle :7.5
Area of circle:176.625


*/