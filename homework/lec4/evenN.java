/* Print All even Number till N
*/
import java.util.*;
public class evenN{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=0;i<=n;i+=2)
        System.out.println(i);
    }
}

/*=============Output==========
13
0
2
4
6
8
10
12
*/