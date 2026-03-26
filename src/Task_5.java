import java.util.Scanner;

public class Task_5 {

    public static void reverseNumbers(int n, Scanner sc) {
        if (n == 0) return;

        int x = sc.nextInt();
        reverseNumbers(n - 1, sc);
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseNumbers(n, sc);
    }
}