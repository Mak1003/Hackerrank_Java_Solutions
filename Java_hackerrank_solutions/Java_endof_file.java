import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 0;

        while (scanner.hasNext()) {
            lineNumber++;
            System.out.println(lineNumber + " " + scanner.nextLine());
        }

        scanner.close();
    }
}