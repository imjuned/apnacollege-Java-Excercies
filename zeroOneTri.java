public class zeroOneTri{
    public static void main(String args[]){
        int n=5;
        int z;
        for(int i =0 ;i<n;i++){
            for (int j=0;j<=i;j++){
                int s = i+j;
                if (s%2==0){
                    System.out.print(1);
                }
                else {
                   System.out.print(0); 
            }
            }
            System.out.print("\n");
        }
    }
}
/*===========Output==========
1
01
101
0101
10101

*/