package Works.HomeWork.HomeWork26.decorator;

public class CafeSingleton {
    private static CafeSingleton instance;
    private int count;

    private CafeSingleton() {
        count = 0;
    }

    public static CafeSingleton getInstance() {
        if (instance == null) {
            instance = new CafeSingleton();
        }
        return instance;
    }

    public void addToCount(int amount) {
        count += amount;
    }

    public int getCount() {
        return count;
    }
}