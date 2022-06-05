import java.util.*;
public class palindrome {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Enter the string");
        a = sc.nextLine();
        String b = new StringBuffer(a).reverse().toString();

        if (a.equals(b)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
