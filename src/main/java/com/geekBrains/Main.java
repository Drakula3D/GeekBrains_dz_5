package com.geekBrains;

public class Main {
    public static void main(String[] args) {

        Worker[] worker = new Worker[5];
        worker[0] = new Worker("Абрамов Наум Сергеевичч", "Администратор", "Dmtiriy@mail.ru", "+375(29)-532-92-47", 3000, 68);
        worker[1] = new Worker("Жуков Артур Адольфович", "Специалист", "Zguk@mail.ru", "+375(44)-232-17-22", 800, 47);
        worker[2] = new Worker("Попов Вольдемар Владимирович", "Специалист", "Pop@mail.ru", "+375(33)-654-63-15", 500, 26);
        worker[3] = new Worker("Козлов Арнольд Иосифович", "Главный специалист", "Kozlov@mail.ru", "+375(44)-857-78-16", 1100, 30);
        worker[4] = new Worker("Копылов Лавр Егорович", "Специалист", "Kop@mail.ru", "+375(29)-476-15-68", 600, 32);

        for (Worker value : worker) {
            System.out.println(value.getInfo());
        }
        System.out.println("\nсотрудники старше 60 лет:");
        for (Worker value : worker) {
            if (value.getAge() > 40) {
                System.out.println(value.getInfo());
            }
        }
    }
}
