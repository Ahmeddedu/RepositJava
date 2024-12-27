package Works.ClassWork.ClassWork14.Maps;

/*
 * Класс StandartOutable реализует интерфейс Outable.
 * Переопределяет метод out для вывода строки на консоль без преобразования регистров.
 */
public class StandartOutable implements Outable {

    @Override
    public void out(String s) {
        System.out.println(s); // Прямой вывод строки на консоль
    }
}
