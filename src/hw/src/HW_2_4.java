import java.util.Scanner;

public class HW_2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число x: ");
        int x = input.nextInt();
        System.out.println("Введите неотрицательную степень n: ");
        int n = input.nextInt();

        if (n == 0) {
            System.out.println("Результат x^n = 1");
        } else if (n > 0) {
            int res = x;
            for (int i = 2; i <= n; i++) {
                res = res * x;
            }
            System.out.println("Результат x^n = " + res);
        } else {
            System.out.println("Степень должна быть неотрицательной");
        }

    }
}
