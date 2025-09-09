package lab1;

public class Multiples {
    public static void main(String[] args) {
        int num = 1000;
        System.out.println((multiples(num, 3, 5)));
        System.out.println((multiples(10, 3, 5)));
    }

    public static void multiples() {

    }
    public static int multiples(int n, int a, int b) {
        int counter = 0;
        for (int i = 1; i < n; i++) {  // strictly less than n
            if (i % a == 0 || i % b == 0) {
                counter++;
            }
        }
        return counter;
    }
}
