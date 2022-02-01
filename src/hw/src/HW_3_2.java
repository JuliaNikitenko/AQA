import java.util.Arrays;
import java.util.Scanner;

//Дан массив размерности N, найти наименьший элемент массива и вывести на консоль
//(если наименьших элементов несколько — вывести их все).
public class HW_3_2 {
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

        int minElement = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {    //num.length используется, чтобы запомнить этот вариант для цикла for
            if (arr[i] < minElement) {
                minElement = arr[i];
                count = 1;
            } else if (minElement == arr[i]) {
                count++;
            }

        }System.out.println("Минимальный элемент " + minElement + " встречается " + count + " раз(а)");
    }
}
