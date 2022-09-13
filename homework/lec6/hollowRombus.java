public class hollowRombus{
    public static void main(String args[]){
        int i,j;
        int m=5;
        for(i=0;i<m;i++){
            for(j=1;j<m-i;j++){                 
                System.out.print(" ");
            }
            for(j=i;j<=i;j++){                  //this loop print cross line of rhombus
                System.out.print("* ");
            }
            if(i==0 || i==m-1){                 // this will print upper and lower line 
            for(j=0;j<m-1;j++){
                System.out.print("* ");
            }}
            else{
                for(j=0;j<m;j++){
                    System.out.print(" ");          //adjust space of hollow spaces total lenght minus 2
                }
                System.out.print(" *");             // last middle * 
            }
            System.out.print("\n");
        
        }
    }
}   

            
        
    

/*======Output============
    * * * * * 
   *       *
  *       *
 *       *
* * * * *
*/
