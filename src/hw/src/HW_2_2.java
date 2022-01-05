import java.util.Scanner;

public class HW_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите неотрицательное число для вычисления факториала: ");
        int n = input.nextInt();
        if (n >= 0) {
            int a = 1;
            for (int i = 2; i <= n; i++) {
                a = a * i;
            }
            System.out.println("Факториал числа " + n + " = " + a);
        } else {
            System.out.println("Число должно быть неотрицательным");
        }
    }
}
