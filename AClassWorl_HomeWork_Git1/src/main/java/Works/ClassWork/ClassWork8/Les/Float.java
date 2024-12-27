package Works.ClassWork.ClassWork8.Les;

public class Float {
    public static void main(String... args) {
        float res = 123.123123f;
        System.out.println(res);

        float ress = devide(4, 3);
        System.out.println(ress);
    }

    public static float devide(int a, int b) {
        if (b == 0){
            throw new RuntimeException(" You can't divide by zero");
        }
        return (float) a / b;
    }

    public static void demoruntime() {
        throw new RuntimeException("runtimedemo");
    }

    public static void demoChecked() throws Exception {
        throw new Exception("ops");
    }
}
