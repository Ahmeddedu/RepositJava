package ClassWork.ClassWork12; // Пакет для работы с демонстрацией Person

public class PersonDemo {
    public static void main(String... args) { // Главная точка входа в программу

        // Создаем первый объект Person и устанавливаем его свойства
        Person p1 = new Person();
        p1.setAge(11);
        p1.setName("Alex");

        // Ссылка на тот же объект, что и p1
        Person p2 = p1;

        // Создаем второй объект Person с теми же свойствами
        Person p3 = new Person();
        p3.setAge(11);
        p3.setName("Alex");

        // Сравниваем объекты p1 и p2
        if (p1 == p2) {
            System.out.println("p1==p2");
        } else {
            System.out.println("p1!=p2");
        }

        // Сравниваем объекты p2 и p3
        if (p2 == p3) {
            System.out.println("p2==p3");
        } else {
            System.out.println("p2!=p3");
        }

        // Сравниваем объекты p1 и p3
        if (p1 == p3) {
            System.out.println("p1==p3");
        } else {
            System.out.println("p1!=p3");
        }

        // Используем метод equals() для сравнения объекта с самим собой
        p1.equals(p1);

        // Проверка equals() на null
        p1.equals(null);

        // Проверка equals() на строку
        p1.equals("somestring");

        // Сравнение объектов через equals()
        if (p1.equals(p3)) {
            System.out.println("p1 eq p3");
        } else {
            System.out.println("p1 !eq p3");
        }
    }
}
