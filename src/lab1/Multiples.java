package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    static int multiples(int n, int a, int b) {
        int i = 1;
        int count = 0;
        while (i < n) {
            boolean divisibleBya = i % a == 0;
            boolean divisibleByb = i % b == 0;

            if (divisibleBya || divisibleByb) {
                count++;
            }
            i++;
        }
        return count;
    }
}
