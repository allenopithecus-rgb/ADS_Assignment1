public class Task_8 {

    public static void generate(int n, int k, String current) {
        if (current.length() == n) {
            System.out.println(current);
            return;
        }

        for (int i = 1; i <= k; i++) {
            generate(n, k, current + i);
        }
    }

    public static void main(String[] args) {
        generate(2, 3, "");
    }
}