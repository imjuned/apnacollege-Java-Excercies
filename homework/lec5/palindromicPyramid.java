/*
Print Palindromic Pyramid Using Number

*/
public class palindromicPyramid{
    public static void main(String args[]){
        int m=5;
        for(int i=0;i<m;i++){
            for(int n=0;n<m-i-1;n++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+1);
            }
            for(int k=0;k<=i;k++){
                System.out.print(k+1);
            }
            System.out.print("\n");
        }
    }
}
/*========Output======
    1
   212
  32123
 4321234
543212345
*/