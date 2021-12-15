public class HW_1_1b {
    public static void main(String[] args) {

        // второй вариант
        int[] arr = {-10, 3, 0, 25};
        int num1 = Math.min(arr[0], arr[1]);
        int num2 = Math.min(arr[2], arr[3]);
        int num3 = Math.min(num1, num2);
        System.out.println(num3);
    }

}
