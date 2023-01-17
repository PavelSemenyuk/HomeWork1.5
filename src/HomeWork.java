public class HomeWork {

        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();

        }
    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 0;
        int ios=0;
        int android = 1;
        if (clientOS==ios){
            System.out.println ("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println( "Установите версию приложения для Android по ссылке.");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear =2013;
        int ios=0;
        int android = 1;

        if (clientOS==ios) {
            System.out.println ("Установите версию приложения для iOS по ссылке.");
            if (clientDeviceYear<2015){
                System.out.println( "Установите облегченную версию приложения для iOS по ссылке.");
            }
        }
        else if (clientOS==android) {
            System.out.println("Установите версию приложения для Android по ссылке.");
            if (clientDeviceYear<2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }
        }
    public static void task3 () {
        System.out.println("Задача 3");
        int year =1900;
        if (year%4==0 && year%100!=0) {
            System.out.println(year + " год является високосным!");
        } else if (year%4==00 && year%100==0 && year%400==00 ) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год НЕ является високосным!");
        }
        }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance= 95;
        int daysA = 1;
        int daysB = 2;
        int daysC = 3;

        if (deliveryDistance<20){
            System.out.println("Потребуется дней: " + daysA );
        } else if (deliveryDistance>20 && deliveryDistance<60) {
            System.out.println("Потребуется дней: " + daysB);
        } else if (deliveryDistance>60 && deliveryDistance<100){
            System.out.println("Потребуется дней: " + daysC);
        } else {
            System.out.println("Свыше 100 км доставки нет!");
        }


    }
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 3;

        switch (monthNumber){
            case 12:
                System.out.println("Сезон : ЗИМА");
                break;
            case 1:
                System.out.println("Сезон : ЗИМА");
                break;
            case 2:
                System.out.println("Сезон : ЗИМА");
                break;
            case 3:
                System.out.println("Сезон : ВЕСНА");
                break;
            case 4:
                System.out.println("Сезон : ВЕСНА");
                break;
            case 5:
                System.out.println("Сезон : ВЕСНА");
                break;
            case 6:
                System.out.println("Сезон : ЛЕТО");
                break;
            case 7:
                System.out.println("Сезон : ЛЕТО");
                break;
            case 8:
                System.out.println("Сезон : ЛЕТО");
                break;
            case 9:
                System.out.println("Сезон : ОСЕНЬ");
                break;
            case 10:
                System.out.println("Сезон : ОСЕНЬ");
                break;
            case 11:
                System.out.println("Сезон : ОСЕНЬ");
                break;

        } if (monthNumber>=13){
            System.out.println("Задача не выполнена!!!");
        }



        }
}
