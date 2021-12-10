import java.util.Scanner;

public class HW_1_1d {

    public static void main(String[] args) {

        //четвертый вариант
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите 4 числа и программа определит наименьшее из них");
        int n = 4;
        int[] array = new int[n];
        int minElement = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Введите " + (i + 1) + "-е число: ");
            array[i] = enter.nextInt();
            if(i == 0) {
                minElement = array[i];
            } else {
                minElement = Math.min(minElement, array[i]);
            }
        }
        System.out.println("Наименьшее число: " + minElement);


    }
}
