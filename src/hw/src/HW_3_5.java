import java.util.Arrays;
import java.util.Scanner;

public class HW_3_5 {
    public static void main(String[] args) {
//Найти среднее арифметическое всех элементов массива.
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива - целое число n: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите n чисел массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        double arrStorage = 0;
        for (int i = 0; i < n; i++) {
            arrStorage += arr[i];

        }
        double res = arrStorage/n;
        System.out.println(Arrays.toString(arr));
        System.out.println(arrStorage);
        System.out.println(res);

    }
}
