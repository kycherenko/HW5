public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        {
            int clientDeviceYear = 2015;
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для ");
            } else {
                System.out.println("Установите версию приложения для ");
            }
            if (clientOS == 1) {
                System.out.println( "Android по ссылке");
            } else {
                System.out.println( "iOS по ссылке");
            }
            if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

        int year = 2021;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 && year >= 1584)) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет!");
        } else {
            if (deliveryDistance >= 20) {
                day++;
            }
            if (deliveryDistance >= 60) {
                day++;
            }
            System.out.println("Потребуется дней: " + day + " срок доставки");
        }
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
                System.out.println("Такого месяца нет");
        }




            }
}