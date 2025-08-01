import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numQueries = scanner.nextInt();

        for (int q = 0; q < numQueries; q++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            printSeries(a, b, n);
        }

        scanner.close();
    }

    private static void printSeries(int a, int b, int n) {
        int result = a;
        for (int i = 0; i < n; i++) {
            result += (int) Math.pow(2, i) * b;
            System.out.print(result + " ");
        }
        System.out.println();
    }
}
