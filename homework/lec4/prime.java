/*Print If a number is prime or not (Input n from the user).
*/
import java.util.Scanner;
public class prime{
    public static void main(String args[]){
        int num;
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        num = sc.nextInt();
        for (int i=2 ;i<num;i++){       //instead of check each number we can check till half of that number
            if (num%i==0) {             // It will reduce it time complexity 
                flag = false;
                break;
            }
        }
        if (num ==0){
            System.out.println("0 is also wired case"); //actually i dont know what to say about that
        }
        else if (num ==1){
            System.out.println("1 is not Prime nor Composite number");        
        }
        else if (flag){
            System.out.println("It is a Prime Number");
        }
        else{
            System.out.println("It is not a Prime Number");
        }


    }
}
/*==========Output========
Enter Number :1
1 is not Prime nor Compound number

Enter Number :38
It is not a Prime Number

Enter Number :0
0 is also wired case

Enter Number :37
It is a Prime Number
*/