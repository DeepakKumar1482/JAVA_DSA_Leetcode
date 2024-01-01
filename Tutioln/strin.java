package Tutioln;

import java.util.Arrays;
import java.util.Scanner;

public class strin {
    public static void main(String[] args) {
        String str1 = "schoolmaster";
        String str2 = "the classroom";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    public static boolean areAnagrams(String str1, String str2) {
        // Convert strings to lowercase and remove spaces
        String s1 = str1.toLowerCase().replaceAll(" ", "");
        String s2 = str2.toLowerCase().replaceAll(" ", "");

        // Check if the lengths are different
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
