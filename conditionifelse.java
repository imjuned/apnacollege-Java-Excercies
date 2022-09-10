import java.util.*;

public class conditionifelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numers :");
        int a =  sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.print("a is greater than b");

        }
        else if (a<b){
            System.out.print("b is greater than a");
        }
        else{
            System.out.print("a is equal to b");
        }




    }
}