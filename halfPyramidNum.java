public class halfPyramidNum{
    public static void main(String args[]){
        int m=5;
        for(int i=0; i<=m;i++){
            for (int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
/*=========output=======
1
12
123
1234
12345
*/