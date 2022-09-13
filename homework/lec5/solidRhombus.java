/*
Print A solid Rhombus
*/
public class solidRhombus{
    public static void main(String args[]){
        int m=5;
        for(int i=0;i<m;i++){
            for (int j = 0;j<m-i;j++){
                System.out.print(" ");

            } 
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            // for(int k=0;k<m-i;k++){
            //     System.out.print("*");
            // }
            
            System.out.print("\n");
        }
    }
}
/*==========Output======
     *****
    *****
   *****
  *****
 *****

 */