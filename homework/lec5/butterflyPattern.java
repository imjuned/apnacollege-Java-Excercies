public class butterflyPattern {

  public static void main(String args[]) {
    int m = 1000;

    for (int i = 0; i <= m; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      int space = 2 * (m - i);
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }

    for(int i=m;i>=0;i--){
        for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      int space = 2 * (m - i);
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }
        for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      
    System.out.print("\n");
    }
  }
}
/*=======OUtput=====
        hj
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
*/