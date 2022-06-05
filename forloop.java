/* Write a java progarme to print the following with the sue of for loop.
  1*
  2**
  3***
  4****
 */
public class forloop {
    
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
