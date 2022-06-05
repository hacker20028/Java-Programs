//Accept 10 int values from user and delete the duplicate values.
import java.util.*;
public class dublicateRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; 
        int i = 0;
        int j = 0;
        int k = 0;
        int temp = 0;
        System.out.println("Enter 10 int values");
        while (i < 10) {
            arr[i] = sc.nextInt();
            i++;
        }
        for (i = 0; i < 10; i++) {
            for (j = i + 1; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    temp = arr[j];
                    for (k = j; k < 9; k++) {
                        arr[k] = arr[k + 1];
                    }
                    arr[9] = temp;
                }
            }
        }
        System.out.println("After removing duplicate values: ");
        for (i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
