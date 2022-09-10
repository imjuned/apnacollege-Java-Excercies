import java.util.*;

public class conditionswitch{
    public static void main(String args[]){
        int button;
        Scanner sc = new Scanner(System.in);
        button = sc.nextInt();

        switch(button){
            case 1 : System.out.print("Hello");
            break;

            case 2 : System.out.print("namsate");
            break;

            case 3: System.out.print("Bonjour");
            break;

            default: System.out.print("Invalid option");
            // break;
        }


    }
}