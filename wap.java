/*Wap to print the following pattern using for loop
 * 1111
 * 000
 * 11
 * 0
 */

 public class wap{
        public static void main(String[] args){
            for(int i=1;i<=4;i++){
                for(int j=1;j<=4;j++){
                    if(i==1 || i==4 || j==1 || j==4){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        }
 }