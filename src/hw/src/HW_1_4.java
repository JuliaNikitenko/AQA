public class HW_1_4 {
    public static void main(String[] args) {
        String name1 = " SergeY";
        String name2 = "  Sergey ";

        System.out.println(name1.trim().equalsIgnoreCase(name2.trim()) ? "Они тезки" : "Они не тезки");
    }
}