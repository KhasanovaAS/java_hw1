import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // 1.1
        int a = 5;
        int x = 12 * a * a + 7 * a - 16;
        System.out.println(x);

        int y = 7 * x * x - 3 * x + 6;
        System.out.println(y);

        // 1.2
        double height = 12.3;
        double width = 13.5;
        double s = height * width;
        double p = 2 * (height + width);
        System.out.println("Площадь: " + s);
        System.out.println("Периметр: " + p);

        // 1.3
        int tc = 10;
        double tf = tc * 1.8 + 32;
        double tk = tc + 273.15;
        System.out.println("Температура по Фаренгейту: " + tf);
        System.out.println("Температура по Кельвину: " + tk);

        // 2.1
        System.out.println("Введите число : ");
        Scanner in = new Scanner(System.in);
        int data = in.nextInt();
        System.out.println("Вы ввели число " + data);

        // 2.2
        int another_data = in.nextInt();
        System.out.println(another_data + " - вот какое число Вы ввели" );

        // 2.3
        System.out.printf("%d %d %d\n", 1, 13, 49);

        // 2.4
        System.out.printf("%d\n%d\n", 50, 10);

        // 2.5 а
        System.out.println("7 см");

        // 2.5 б
        System.out.println("Введите число x: ");
        int entered_x = in.nextInt();
        System.out.printf("%d 25\n", entered_x);

        // 2.5 в
        System.out.println("Введите число y: ");
        int entered_y = in.nextInt();
        System.out.printf("%d %d\n", entered_x, entered_y);

        // 3.1
        System.out.printf("%.1f\n", Math.PI);
        System.out.printf("%.2f\n", Math.E);

        // 3.2
        // а
        int x1 = 2;
        int x2 = 5;
        System.out.println(Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2)));

         // б
        int x3 =8;
        System.out.println(x1 * x2 + x1 * x3 + x2 * x3);

        // в
        int v0 = 20;
        int t = 30;
        int a1 = 5;
        System.out.println(v0 * t + (a1 * Math.pow(t, 2) / 2.0));

        // г
        double m = 10.2;
        double v = 15;
        double g = 9.8;
        int h = 20;
        System.out.println(m * v * v / 2.0 + m * g * h);

        // д
        double r1 = 12.3;
        double r2 = 13.5;
        System.out.println(1/Math.pow(r1,2)+ 1/Math.pow(r2,2));

        // е
        double alpha = 60;
        System.out.println(m * g * Math.cos(alpha));

        // ж
        int r = 30;
        System.out.println(2 * Math.PI * r);

        // з
        int b = 23;
        int c = 3;
        System.out.println(Math.pow(b,2) - 4 * a * c);

        // и
        double gamma = 24;
        double m1 = 50;
        double m2 = 60;
        System.out.println(gamma * m1 * m2 / Math.pow(r, 2));

        // к
        double i = 20;
        double resistance = 30;
        System.out.println(Math.pow(i,2) * resistance);

        // л
        System.out.println(a * b * Math.sin(c));

        // м
        System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(c)));

        // н
        double d =348.5;
        System.out.println((a * b + b*c) / (a*d));

        // о
        System.out.println(Math.sqrt(1 - Math.pow(Math.sin(x), 2)));

        // п
        System.out.println(1 / Math.sqrt(a * Math.pow(x,2) + b * x +c));

        // р
        System.out.println((Math.sqrt(x+1) + Math.sqrt(x-1)) / 2 * Math.sqrt(x));

        // с
        x = -4;
        System.out.println(Math.abs(x) + Math.abs(x+1));

        // т
        System.out.println(Math.abs(1 - Math.abs(x)));

        // 3.3
        System.out.println("Enter x: ");
        x = in.nextInt();
        System.out.println("Enter y: ");
        y = in.nextInt();
        double z = Math.pow(x, 3) - 2.5 * x * y + 1.78 * Math.pow(x,2) - 2.5 * y + 1;
        System.out.println(z);

        // 3.4
        System.out.println("Введите первый катет: ");
        double kat1 = in.nextDouble();
        System.out.println("Введите второй катет: ");
        double kat2 = in.nextDouble();
        System.out.println(kat1 + kat2 + Math.sqrt(Math.pow(kat1, 2)) + Math.pow(kat2, 2));

//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
    }
}