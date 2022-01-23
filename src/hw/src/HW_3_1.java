import java.util.Arrays;

public class HW_3_1<i> {
    public static void main(String[] args) {
    /* Создайте массив, содержащий 10 первых нечетных чисел.
    Выведете элементы массива на консоль в одну строку, разделяя запятой.*/
        int n = 10;
        int[] arr = new int[n];
        int j = 0;
        int i = 0;
        while (j < n) {
            if (i % 2 != 0) {
                arr[j] = i;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr)); //вывод через Arrays
        for (j = 0; j < arr.length; j++) { //вывод через for
            if (j != arr.length - 1) {
                System.out.print(arr[j] + ", ");
            } else {
                System.out.println(arr[j]);
            }
        }
    }
}


