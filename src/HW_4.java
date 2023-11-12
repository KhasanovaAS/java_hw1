import java.util.Scanner;
import java.util.Calendar;

public class HW_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1
        {
            System.out.println("Введите 3 числа: ");
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            System.out.printf(
                    "Max number is %d\n", max_number(a,b,c)
            );
            System.out.printf(
                    "Min number is %d\n", min_number(a,b,c)
            );
        }

        // 2
        {
            System.out.println("Введите год рождения");
            int birth_year = in.nextInt();
            System.out.println("Введите месяц рождения");
            int birth_month = in.nextInt();
            if (birth_month > 12 || birth_month < 1)
                System.out.printf("Некорректные данные месяца %d", birth_month,
                        ", месяц должен быть в диапазоне от 1 до 12\n");
            else {
                int a = get_age(birth_year, birth_month);
                if (a != -1)
                    System.out.printf("Возраст: %d\n", a);
            }
        }

        // 3
        {
            System.out.println("Введите день в году от 1 до 365");
            int k = in.nextInt();
            if (1 <= k && k <= 365)
                System.out.println(weekend_define(k));
            else
                System.out.println("Номер дня введен некорректно");
        }

        // 4
        {
            System.out.println("Введите количество очков от 0, 1 или 3:");
            int score = in.nextInt();
            System.out.printf("Результат команды: %s\n", get_result(score));
        }

        // 5
        {
            System.out.println("Введите номер месяца: ");
            int month = in.nextInt();
            if (month < 1 || month > 12)
                System.out.println("Вееденный номер месяца некорректен");
            else
            {
                System.out.printf("Введен месяц: %s\n", get_month_name(month));
                System.out.printf("Сезон: %s\n", get_season(month));
                System.out.printf("Количество дней в данном месяце: %d", get_days_in_month(month));
            }

        }
    }

    public static int max_number(int a, int b, int c) {
        if (a >= b)
            if (a >= c)
                return a;
            else
                return c;
        else
            if (b >= c)
                return b;
            else
                return c;

    }

    public static int min_number(int a, int b, int c) {
        if (a <= b)
            if (a <= c)
                return a;
            else
                return c;
        if (b <= c)
            return b;
        else
            return c;

    }

    public static int get_age(int birth_year, int birth_month) {
        Calendar c = Calendar.getInstance();
        int curr_year = c.get(Calendar.YEAR);
        int curr_month = c.get(Calendar.MONTH);
        if ((curr_year < birth_year) || (curr_year == birth_year && curr_month < birth_month)) {
            System.out.println("Birthday is later then current date");
            return -1;
        }
        if (birth_month >= curr_month)
            return curr_year - birth_year - 1;
        else
            return curr_year - birth_year;
    }

    public static String weekend_define(int k) {
        int day_of_week = k - (k / 7 * 7);
        if (day_of_week == 6 || day_of_week == 0)
            return "weekend";
        else
            return "workday";
    }

    public static String get_result(int score) {
//        String result;
//        switch(score){
//            case 0:
//                result = "проигрыш";
//                break;
//            case 1:
//                result = "ничья";
//                break;
//            case 3:
//                result = "выигрыш";
//                break;
//            default:
//                result = "no info";
//                break;
//        }
//        return result;
        return switch (score) {
            case 0 -> "проигрыш";
            case 1 -> "ничья";
            case 3 -> "выигрыш";
            default -> "no info";
        };
    }

    public static String get_month_name(int month) {
        return switch (month) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> "no info";
        };
    }

    public static String get_season(int month) {
        return switch (month) {
            case 12, 1, 2 -> "зима";
            case 3, 4, 5 -> "весна";
            case 6, 7, 8 -> "лето";
            case 9, 10, 11 -> "осень";
            default -> "no info";
        };
    }

    public static int get_days_in_month(int month) {
        return switch (month) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            default -> -1;
        };
    }
}
