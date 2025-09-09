package lab1;

public class Reduce {
    public static void main(String[] args) {
        int count = reduce();
        System.out.println(count);
    }

    public static int reduce() {
        int count = 0;
        int i = 100;
        while (i > 0) {
            if (i % 2 == 0) {
                i =  i / 2;
                count++;
            }
            else {
                i--;
                count++;
            }
        }
        return count;
    }

    public static int reduce(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n =  n / 2;
                count++;
            }
            else {
                n--;
                count++;
            }
        }
        return count;
    }
}
