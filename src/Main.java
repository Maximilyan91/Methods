import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {
        printYear(2020);
        printYear(3061);
    }

        public static boolean checkingTheYear(int year) {
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        }

        public static void printYear(int year) {
            if (checkingTheYear(year)) {
                System.out.println(year + " Год является високосным");
            } else {
                System.out.println(year + " Год не является високосным");
            }

        }

    public static void task2() {
        String actualApp = determineYearDevice(2015);
        String actualOS = determineClientOS(1);
        System.out.println(actualApp + actualOS);
    }

        public static String determineYearDevice(int yearDevice) {
            int currentYear = LocalDate.now().getYear();
            if (yearDevice < currentYear) {
                return "Установите облегченную версию для";
            } else {
                return "Установите последнюю версию для";
            }
        }

        public static String determineClientOS(int oS) {
            if (oS == 1) {
                return " Android";
            } else {
                return " iOS";
            }

        }

    public static void task3() {
        int delivery = calcDistanse(95);
        System.out.println(outputMessage(delivery));
    }

        public static int calcDistanse(int distance) {
            if (distance <= 20) {
                return 1;
            } else if (distance > 20 && distance <= 60) {
                return 2;
            } else if (distance > 60 && distance <= 100) {
                return 3;
            } else {
                return 0;
            }
    }

        public static String outputMessage(int delivery) {
            if (delivery == 0) {
                return "Доставка невозможна!!!";
            } else {
                return "На доставку потребуется " + delivery + " суток";
            }
        }
}













