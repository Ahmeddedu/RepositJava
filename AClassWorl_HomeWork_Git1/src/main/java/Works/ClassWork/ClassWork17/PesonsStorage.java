package Works.ClassWork.ClassWork17;

import java.util.ArrayList;
import java.util.List;

public class PesonsStorage {
    List<Person> persons = new ArrayList<>(); // Список людей

    public List<Person> getPersons() {
        return persons; // Получить список людей
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons; // Установить новый список людей
    }
}
