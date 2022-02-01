import java.util.Arrays;
import java.util.Scanner;
public class HW_3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива - целое число n: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите n чисел массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int maxElement = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                count = 1;
            } else if (maxElement == arr[i]) {
                count++;
            }

        }System.out.println("Максимальный элемент " + maxElement + " встречается " + count + " раз(а)");
    }
}
