/* Write a java program to accept starting number and end number from user. 
If starting number is greater then ending number then interexchange the number and print the even numbers between them */
import java.util.*;
public class interexchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int start = sc.nextInt();
        System.out.println("Enter the ending number");
        int end = sc.nextInt();
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    
}
