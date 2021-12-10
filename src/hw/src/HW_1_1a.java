public class HW_1_1a {
    public static void main(String[] args) {


        // первый вариант
        int a = -5;
        int b = 0;
        int c = 2;
        int d = 10;
        int x;
        if (a < b) {
            x = a;
        } else x = b;
        if (x < c) {
            x = x;
        } else x = c;
        if (x < d) {
            x = x;
        } else x = d;
        System.out.println(x);
    }
}