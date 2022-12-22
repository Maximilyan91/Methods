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
        String actualApp = clientYearDevice(2015);
        String actualOS = clientOS(1);
        System.out.println(actualApp + actualOS);
    }

        public static String clientYearDevice(int yearDevice) {
            int currentYear = LocalDate.now().getYear();
            if (yearDevice < currentYear) {
                return "Установите облегченную версию для";
            } else {
                return "Установите последнюю версию для";
            }
        }

        public static String clientOS(int oS) {
            if (oS == 1) {
                return " Android";
            } else {
                return " iOS";
            }

        }

    public static void task3() {
        String delivery = clientDistance(110);
        System.out.println(delivery);
    }

    public static String clientDistance(int distance) {
        if (distance <= 20) {
            return "Доставка займет 1 сутки";
        } else if (distance > 20 && distance <= 60) {
            return "Доставка займет 2 суток";
        } else if (distance > 60 && distance <= 100) {
            return "Доставка займет 3 суток";
        } else {
            return "Доставка невозможна";
        }

    }


}













