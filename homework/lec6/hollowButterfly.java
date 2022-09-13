public class hollowButterfly{
    public static void main(String args[]){
        int i,j;
        int m;

        m=5;
        for(i=0;i<m;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            for(j=2*(m-i)-1;j>= 3;j--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}