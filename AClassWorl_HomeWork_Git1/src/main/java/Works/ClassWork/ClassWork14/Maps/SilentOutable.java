package Works.ClassWork.ClassWork14.Maps;

public class SilentOutable implements Outable {

    @Override
    public void out(String s) {
        System.out.println(s.toUpperCase()); // Преобразует строку в верхний регистр и выводит на консоль
    }
}
