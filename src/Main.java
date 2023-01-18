import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int number = 5;
        if (number == 0 || number == 1) {
            if (number == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Ваша система не распознана");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 1;
        int clientDeviceYear = 2014;
        if (number == 0 || number == 1) {
            if (number == 0) {
                if (2015 > clientDeviceYear) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
                else {
                    System.out.println("Установите версию приложения для iOS по ссылке");}
            }
            if (number == 1) {
                if (2015 > clientDeviceYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");}
                else {
                    System.out.println("Установите версию приложения для Android по ссылке");}
            }
        }
        else {
                System.out.println("Ваша система не распознана");}
        }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 1896;
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным");}
        else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + " год является високосным");}
        else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");}
        else {System.out.println(year + ". год не является високосным");}
}
    }