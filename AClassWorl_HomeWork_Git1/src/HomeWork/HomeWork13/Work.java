package HomeWork.HomeWork13;

import java.util.*;

public class Work {

    public static void main(String[] args) {
        Work work = new Work();

        List<String> firstCollection = work.getFirstCollection();
        List<String> secondCollection = work.getSecondCollection();

        System.out.println("First collection:");
        printIterable(firstCollection);

        System.out.println("Second collection:");
        printIterable(secondCollection);

        boolean areEqual = areCollectionsEqual(firstCollection, secondCollection);
        System.out.println("Collections are equal: " + areEqual);
    }
    
    public List<String> getFirstCollection() {
        List<String> list = new ArrayList<>();
        list.add("Titanic");
        list.add("Olympic");
        list.add("Britannic");
        return list;
    }

    public List<String> getSecondCollection() {
        List<String> list = new ArrayList<>();
        list.add("Titanic");
        list.add("Olympic");
        list.add("Britannic");
        return list;
    }

    public static boolean areCollectionsEqual(List<String> first, List<String> second) {
        if (first == null && second == null) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        return first.size() == second.size() && first.containsAll(second) && second.containsAll(first);
    }

    public static void printIterable(Iterable<?> iterable) {
        for (Object item : iterable) {
            System.out.println(item);
        }
        System.out.println("--------------------");// я сделал для удобстав кода каеф
    }
}
