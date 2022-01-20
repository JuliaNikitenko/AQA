import java.util.Scanner;

public class HW_2_5 {
    public static void main(String[] args) {
            int a = 0;
            int d = -5;
            int n = 10;
            for (int i = 1; i <= n; i++ ) {
                System.out.println(i + "-й: " + (a + d * (i - 1)));
            }
        }
    }

