import java.util.Arrays;
import java.util.Scanner;

public class HW_3_4 {
    public static void main(String[] args) {
//Поменять наибольший и наименьший элементы массива местами.
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива - целое число n: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите n чисел массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int minTemp = 0;
        int maxTemp = 0;
        int maxElement = arr[0];
        int countMax = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                countMax = 1;
                maxTemp = i;
            }
        }

        int minElement = arr[0];
        int countMin = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
                countMin = 1;
                minTemp = i;
            }
        }
        System.out.println("Первоначальный массив " + Arrays.toString(arr));
        System.out.println("Максимальный элемент " + maxElement);
        System.out.println("Минимальный элемент " + minElement);

        arr[minTemp] = maxElement;
        arr[maxTemp] = minElement;
        System.out.println("Измененный массив " + Arrays.toString(arr));
    }
}
