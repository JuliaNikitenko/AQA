import java.util.Arrays;

public class HW_3_6 {
    public static void main(String[] args) {
        //(int)(( Math.random() * (b - a + 1) + a)
        int[] arr = new int[20];
        for (int i = 0; i<20; i++) {
            int a = (int) (Math.random() * (1001));
            arr[i] = a;
        }
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length -1; i++) {
                if(arr[i] < arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
