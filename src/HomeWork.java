import java.util.Random;

public class HomeWork {

        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();

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
        int monthNumber = 7;

        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон : ЗИМА");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон : ВЕСНА");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон : ЛЕТО");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон : ОСЕНЬ");
                break;

            default:
            System.out.println("Задача не выполнена!!!");
        }



        }
    public static void task6() {
        System.out.println("Задача №6");
        int number = 12;
        if (number%2==0){
            System.out.println(number + " Четное число");
        }else {
            System.out.println(number+ " Нечетное число");
        }
        }
    public static void task7() {
        System.out.println("Задача №7");
        Random rnd = new Random();
        int a = (int) rnd.nextInt(899) + 100;
        int b = a % 10;
        int c = (a / 10) % 10;
        int d = (a / 100) % 10;
        if (b > c && b > d) {
            System.out.println("В числе " + a + " наибольшая цифра " + b);
        } else if (c > b && c > d) {
            System.out.println("В числе " + a + " наибольшая цифра " + c);
        } else {
            System.out.println("В числе " + a + " наибольшая цифра " + d);
        }
        if (d>b && d>c && b>c){
            System.out.println("На уменьшение - " + d + b + c);
        } else if (b>d && b>c && c>d){
            System.out.println("На уменьшение - " + b + c + d);

        } else if (c>d && c>b && b>d) {
            System.out.println("На уменьшение - " + c + b + d);
        } else if (b>c && b>d && d>c) {
            System.out.println("На уменьшение - " + b + d + c);
        } else if (b>c && b>d && c>d) {
            System.out.println("На уменьшение - " + b + c + d );
        } else {
            System.out.println("На уменьшение - " + c + d + b);
        }

        //for (int i = 50;i > 5; i-=5) {
          //  System.out.println(i);

            int g= 1;
            while (g < 15) {
                System.out.println(g);
                g += 2;

            }


        }


    }
