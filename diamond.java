  public class diamond{
    public static void main(String args[]){
        int m=5;

        for(int i=0;i<m;i++){
            for(int j=1;j<m-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.print("\n");  

        }
      //  System.out.print("Thsi is haf");
        for(int i=m;i>0;i--){
            for(int j=0;j<m-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
            }
            
        }
    }
/*========Output=======
     
    * 
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/