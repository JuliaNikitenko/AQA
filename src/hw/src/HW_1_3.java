import java.util.Arrays;
import java.util.Scanner;

public class HW_1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 5 чисел");
        int[] arr = new int[5];
        int numMax = 0;
        int numMin = 0;


        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите " + (i + 1) + "-е число: ");
            arr[i] = in.nextInt();

            numMin = (i == 0) ? arr[i] : Math.min(numMin, arr[i]);
            numMax = (i == 0) ? arr[i] : Math.max(numMax, arr[i]);
        }

        System.out.println("Введенный массив: " + Arrays.toString(arr));
        System.out.println("Наименьшее число: " + numMin + ", наибольшее число: " + numMax);
    }
}

