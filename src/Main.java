public class Main {

    // Задача 1.
    public static void main(String[] args) {
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

}
