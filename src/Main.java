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
        System.out.println(" Задание 5");
        task5();
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
        int year = 2014;
        boolean versionYear = year < 2015;
        int clientOS = 1;
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
        int deliveryDistance = 98;
        int deliveryTerm = 1;

        if (deliveryDistance >20){
            deliveryTerm++;
        }
        if (deliveryDistance >60){
            deliveryTerm++;
        }
        System.out.println("Потребуется дней: " + deliveryTerm);
    }
    public static void task5(){
        int month = 11;
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("This month doesn't exist");
        }
        switch (month) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Autumn");
                break;
            case 10:
                System.out.println("Autumn");
                break;
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
                System.out.println("Winter");
            default:
                System.out.println("This month doesn't exist");
        }
    }
}