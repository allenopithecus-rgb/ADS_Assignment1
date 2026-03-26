import java.util.Scanner;

public class Task_6 {

    public static void reverseStrings(int n, Scanner sc) {
        if (n == 0) return;

        String s = sc.nextLine();
        reverseStrings(n - 1, sc);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        reverseStrings(n, sc);
    }
}