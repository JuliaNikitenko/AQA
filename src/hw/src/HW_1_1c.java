import java.util.Scanner;

public class HW_1_1c {
    public static void main(String[] args) {
        //третий вариант
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 4 числа и программа определит наименьшее из них");
        int[] array1 = new int[4];
        int i;

        for (i = 0; i < 4; i++) {
            System.out.print("Введите " + (i + 1) + "-е число: ");
            array1[i] = input.nextInt();
        }

        int n1 = Math.min(array1[0], array1[1]);
        int n2 = Math.min(array1[2], array1[3]);
        int n3 = Math.min(n1, n2);
        System.out.println("Наименьшее число: " + n3);
    }

}