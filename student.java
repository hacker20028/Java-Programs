//Write a java program to read roll no. name and marks of 4 subject for students. Calculate total marks and percentage and print the result.
import java.util.*;
public class student {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the roll no.");
            int roll = sc.nextInt();
            System.out.println("Enter the name");
            String name = sc.next();
            System.out.println("Enter the marks of 4 subjects");
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            int m4 = sc.nextInt();
            int total = m1 + m2 + m3 + m4;
            double per = total / 4.0;
            System.out.println("Roll no. is: " + roll);
            System.out.println("Name is: " + name);
            System.out.println("Total marks is: " + total);
            System.out.println("Percentage is: " + per);
        }
    }
    
}
