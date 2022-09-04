public class Main {
    public static void task1() {
        int year = 2001;
        checkYearForLeap(year);
    }

    public static void checkYearForLeap(int year) {
        boolean isYearLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (isYearLeap) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void task2() {
        int clientOS = 1;
        int releaseYear = 2020;
        checkOS(clientOS, releaseYear);
    }

    public static void checkOS(int clientOS, int releaseYear) {
        if (clientOS != 0 && clientOS != 1) {
            System.out.println("Ваша операционная система не распознана");
        } else if (clientOS == 0 && releaseYear >= 2015) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (clientOS == 0 && releaseYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && releaseYear >= 2015) {
            System.out.println("Установите приложение для Android по ссылке");
        } else if (clientOS == 1 && releaseYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        int deliveryDistance = 60;

        System.out.println(countDeliveryDistance(deliveryDistance));
    }


    public static int countDeliveryDistance(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance < 20) {
            deliveryDays = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays = 3;
        } else {throw new RuntimeException("Доставка на такое расстояние не осуществляется");}
        return  deliveryDays;
    }

    public static void main (String[] args){
        task1();
        task2();
        task3();
        }
}