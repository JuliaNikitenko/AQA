public class HW_1_2a {
    public static void main(String[] args) {

        int[] num = {5, 9, 3, 9};
        int maxElement = num[0];
        int count = 1;

        for (int i = 1; i < num.length; i++) {
            if (num[i] > maxElement) {
                maxElement = num[i];
                count = 1;
            } else if (maxElement == num[i]) {
                count++;
            }
            //System.out.println(i + " " + num[i] + " " + maxElement + " " + count);  //проверка итерации
        }
        System.out.println("Максимальный элемент " + maxElement + " встречается " + count + " раз(а)");
    }
}
