import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
//deleting an element in array
public class leetcode1218 {
    public static void main(String[] args) {
                int[] array = {1, 2, 3, 4, 5};
                int indexToDelete = 2;  // Index of the element to delete

                // Perform deletion
                if (indexToDelete >= 0 && indexToDelete < array.length) {
                    for (int i = indexToDelete; i < array.length - 1; i++) {
                        array[i] = array[i + 1];
                    }
                    array[array.length - 1] = 0;  // Optional: Set the last element to a default value
                } else {
                    System.out.println("Invalid index");
                }

                // Print the modified array
                for (int element : array) {
                    System.out.print(element + " ");
                }
    }
}
