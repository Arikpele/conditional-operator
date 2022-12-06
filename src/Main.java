public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен" + age + "то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен" + age + "то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("задача 2");
        int temp = 2;
        if (temp >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки» — если температура воздуха выше" + temp + "градусов");
        }
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку» — если температура ниже" + temp + "градусов");
        }
    }

    public static void task3() {
        System.out.println("задача 3");
int speed=70;
if (speed>=60){
    System.out.println ("Если скорость"+speed+"км/ч, то придется заплатить штраф");
}
if (speed<60){
    System.out.println ("Если скорость"+speed+"км/ч, то можно ездить спокойно");
}
    }
}