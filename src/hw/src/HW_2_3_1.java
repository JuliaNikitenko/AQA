import java.util.Scanner;

public class HW_2_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите неотрицательное число для вычисления факториала: ");
        int n = input.nextInt();
        if (n >= 0) {
            int a = 1;
            int i = 2;
            while (i <= n) {
                a = a * i;
                i++;
            }
            System.out.println("Факториал числа " + n + " = " + a);
        } else {
            System.out.println("Число должно быть неотрицательным");
        }
    }
}







