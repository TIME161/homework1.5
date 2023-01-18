public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 45;
        int deliveryDays = 1;
        boolean oneDay = deliveryDistance < 20;
        boolean twoDay = deliveryDistance >= 20 && deliveryDistance < 60;
        boolean threeDay = deliveryDistance < 100 && deliveryDistance >= 60;
        if (oneDay) {deliveryDays = 1;}
        else if (twoDay) {deliveryDays = 2;}
        else if (threeDay) {deliveryDays = 3;}
        if (oneDay) {
            System.out.println("Потребуется дней: " + deliveryDays);}
        else if (twoDay) {
            System.out.println("Потребуется дней: " + deliveryDays);}
        else if (threeDay) {
            System.out.println("Потребуется дней: " + deliveryDays);}
        else {
            System.out.println("Доставки нет");}
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        String seazon = "Время года";
        boolean winter = monthNumber == 12 || monthNumber == 1 || monthNumber == 2;
        boolean spring = monthNumber == 3 || monthNumber == 4 || monthNumber == 5;
        boolean summer = monthNumber == 6 || monthNumber == 7 || monthNumber == 8;
        boolean autumn = monthNumber == 9 || monthNumber == 10 || monthNumber == 11;
             if (winter) {seazon = " Зима.";}
        else if (spring) {seazon = " Весна.";}
        else if (summer) {seazon = " Лето.";}
        else if (autumn) {seazon = " Осень.";}
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 1: {
                    System.out.println(monthNumber + "-й месяц пренадлежит к сезону" + seazon);
                }
                break;
                case 2: {
                    System.out.println(monthNumber + "-й месяц пренадлежит к сезону" + seazon);
                }
                break;
                case 3: {
                    System.out.println(monthNumber + "-й месяц пренадлежит к сезону" + seazon);
                }
                break;
                case 4: {
                    System.out.println(monthNumber + "-й месяц пренадлежит к сезону" + seazon);
                }
                break;
                case 5: {
                    System.out.println(monthNumber + "-й месяц пренадлежит к сезону" + seazon);
                }
                break;
                case 6: {
                    System.out.println(monthNumber + "-й месяц пренадлежит к сезону" + seazon);
                }
                break;
                case 7: {
                    System.out.println(monthNumber + "-й месяц пренадлежит к сезону" + seazon);
                }
                break;
                case 8: {
                    System.out.println(monthNumber + "-й месяц пренадлежит к сезону" + seazon);
                }
                break;
                case 9: {
                    System.out.println(monthNumber + "-й месяц пренадлежит к сезону" + seazon);
                }
                break;
                case 10: {
                    System.out.println(monthNumber + "-й месяц пренадлежит к сезону" + seazon);
                }
                break;
                case 11: {
                    System.out.println(monthNumber + "-й месяц пренадлежит к сезону" + seazon);
                }
                break;
                case 12: {
                    System.out.println(monthNumber + "-й месяц пренадлежит к сезону" + seazon);
                }
                break;
            }
        }
    }
    }