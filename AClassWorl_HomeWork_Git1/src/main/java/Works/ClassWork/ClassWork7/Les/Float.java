package Works.ClassWork.ClassWork7.Les;

public class Float {
    public static void main(String... args) {
        float res = 123.123123f; // Плавающая точка
        System.out.println(res);

        float ress = devide(4, 3); // Деление
        System.out.println(ress);
    }

    public static float devide(int a, int b) {
        if (b == 0){
            throw new RuntimeException(" You can't divide by zero");
        }
        return (float) a / b; // Приведение типов для точности
    }

    public static void demoruntime() {
        throw new RuntimeException("runtimedemo"); // Ошибка времени выполнения
    }

    public static void demoChecked() throws Exception {
        throw new Exception("ops"); // Проверяемое исключение
    }
}
