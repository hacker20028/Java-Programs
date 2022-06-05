// Accept a string from user and print the number of vowels. Accept another string from user and 
//concatenate the two strings.
import java.util.*;

public class concatenate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string");
            String str = sc.nextLine();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    count++;
                }
            }
            System.out.println("Number of vowels in the string is: " + count);
            System.out.println("Enter another string");
            String str1 = sc.nextLine();
            System.out.println("Concatenated string is: " + str + str1);
        }
    }
}

