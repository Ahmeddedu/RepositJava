package HomeWork.HomeWork10.HomeWork;

public class Stores implements Store {
    private String[] storage = new String[10];
    private int size = 0;

    @Override
    public boolean add(String a) {
        if (size < storage.length) {
            storage[size] = a;
            size++;
            return true;
        } else {
            // Создаем новый массив
            String[] newStorage = new String[storage.length * 2]; // тут масив в 2 раза величевыеться
            System.arraycopy(storage, 0, newStorage, 0, storage.length);
            storage = newStorage;
            storage[size] = a;
            size++;
            return true;
        }
    }

    @Override
    public boolean add(String a, int number) {
        if (number >= 0 && number <= size && size < storage.length) {
            for (int i = size; i > number; i--) {
                storage[i] = storage[i - 1];
            }
            storage[number] = a;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public void remove(int number) {
        if (number >= 0 && number < size) {
            for (int i = number; i < size - 1; i++) {
                storage[i] = storage[i + 1];
            }
            storage[size - 1] = null;
            size--;
        }
    }

    @Override
    public String get(int number) {
        if (number >= 0 && number < size) {
            return storage[number];
        }
        return null;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(storage[i]);
        }
    }

    public static void main(String[] args) {
        Stores store = new Stores();
        store.add("Привет");
        store.add("Мир");
        store.add("Java", 1);
        store.printAll();
        System.out.println("Всего строк: " + store.length());
        store.remove(1);
        store.printAll();
    }
}
