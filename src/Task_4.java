public class Task_4 {

    public static int powerSum(int b, int n) {
        if (n == 0) return 1;
        return (int)Math.pow(b, n) + powerSum(b, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(powerSum(4, 3));
    }
}