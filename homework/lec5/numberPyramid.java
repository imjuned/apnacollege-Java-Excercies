public class numberPyramid{
    public static void main(String args[]){
        int m=5;
        for(int i=0;i<m;i++){
            for(int j=m-i-1;j>0;j--){
                System.out.print(" ");
            }

            for(int j=0;j<i+1;j++){
                System.out.print(i+1);
                System.out.print(" ");
            }
            System.out.print("\n");   
        }
    }
}
/*======Output======
    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

*/
