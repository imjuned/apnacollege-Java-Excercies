public class InvertedHalfPyramid{
    public static void main(String args[]){
        int m=5;
        for(int i=m;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*============output=========
*****
****
***
**
*
*/