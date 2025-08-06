import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int sumLength = A.length() + B.length();
        System.out.println(sumLength);

        String lexComparison = (A.compareTo(B) > 0) ? "Yes" : "No";
        System.out.println(lexComparison);

        String capitalizedA = capitalizeFirstLetter(A);
        String capitalizedB = capitalizeFirstLetter(B);
        System.out.println(capitalizedA + " " + capitalizedB);

        sc.close();
    }

    private static String capitalizeFirstLetter(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}
