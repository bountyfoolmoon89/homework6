import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1");
        task1();
        System.out.println(" Задание 2");
        task2();
        System.out.println(" Задание 3");
        task3();
        System.out.println(" Задание 4");
        task4();
        test();
    }
    public static void task1(){
        int clientOS = 3;
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("У вас что ли Linux? :))");
        }
    }
    public static void task2(){
        int year = 2021;
        boolean versionYear = year < 2015;
        int clientOS = 0;
        boolean iOS = clientOS == 0;
        boolean android = clientOS == 1;
        if (versionYear && iOS){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (versionYear && android) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task3(){
        int year = 2023;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4(){
        int deliveryDistance = 99;
        int deliveryTerm = 1;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + deliveryTerm);
        }
        if ((deliveryDistance >20)&&(deliveryDistance <=60)){
            deliveryTerm+=1;
            System.out.println("Потребуется дней: " + deliveryTerm);
        }
        if ((deliveryDistance >60)&&(deliveryDistance <=100)){
            deliveryTerm+=2;
            System.out.println("Потребуется дней: " + deliveryTerm);
        }
    }
}