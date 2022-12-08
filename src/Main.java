public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("задача 1");
        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
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
        int speed = 70;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + "км/ч, то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + "км/ч, то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("задача 4");
        int age = 32;
        if (age >= 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }

        if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }

        if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }

        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("задача 5");
        int age = 20;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему то ему кататься только без сопровождении взрослого");
        }
    }

    public static void task6() {
        System.out.println("задача 6");
        int passenger = 102;
        int totalSeating = 60;
        int totalStandingPlaces = passenger - totalSeating;
        int occupiedStandingplaces = 41;
        int occupiedSeating = 61;
        if (totalSeating >= occupiedSeating) {
            System.out.println("в вагоне осталось " + (totalSeating - occupiedSeating) + " сидящих мест");
        } else {
            System.out.println("в вагоне отсутствуют сидячие места ");
            if (totalStandingPlaces >= occupiedStandingplaces) {
                System.out.println("в вагоне осталось " + (totalStandingPlaces - occupiedStandingplaces) + " стоячих мест");
            } else {
                System.out.println("в вагоне отсутствуют стоячие места ");
            }
        }
    }

    public static void task7() {
        System.out.println("задача 7");
        int one = 2;
        int two = 2;
        int three = -60;
        if (one > two && one > three) {
            System.out.println("one самое большое число ");
        } else if (two > one && two > three) {
            System.out.println("two самое большое число");
        } else if (three > one && three > two) {
            System.out.println("three самое большое число");
        } else {
            System.out.println("все переменные равны");
        }
    }
    }
