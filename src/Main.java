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
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else {
            System.out.println("Установите версию приложения для Android по ссыдке");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссыске");
        }else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "год является високосным");
        }else {
            System.out.println(year + "год не является високосным");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int numberDeliveryDays = 1; // Из условия задачи
        int twoNumberDeliveryDays = numberDeliveryDays + 1; // Из условия задачи
        int threeNumberDeliveryDays = twoNumberDeliveryDays + 1; // Из условия задачи
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней:" + numberDeliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней:" + twoNumberDeliveryDays );
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:" + threeNumberDeliveryDays);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого сезона не сушествует.");
        }
    }


}