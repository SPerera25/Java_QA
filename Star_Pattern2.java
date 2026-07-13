public class Star_Pattern2 {
    public static void main(String[]args){
        for(int i=1; i<6; i++){
            for(int j=1;j<=(i*2-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=6; i>=1; i--){
            for(int j=1;j<=(i*2-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<6; i++){
            for(int j=6;j>i; j--){
                System.out.print(" ");
            }
            for(int z=1;z<=(i*2-1); z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*

*
***
*****
*******
*********
***********
*********
*******
*****
***
*
     *
    ***
   *****
  *******
 ********* 
 
 */