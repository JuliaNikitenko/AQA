public class HW_1_6 {
    public static void main(String[] args) {
        String season;
        int month = (int) ((Math.random() * 13) + 1); //номер месяца увеличен до 14, чтобы иногда было некорректное значение
        System.out.println("Месяц: " + month);

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "не определен";
                break;
        }
        System.out.println("Сезон: " + season);

    }

}
