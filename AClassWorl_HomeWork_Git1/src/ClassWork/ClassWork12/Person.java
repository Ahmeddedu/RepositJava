package ClassWork.ClassWork12;

import java.util.Objects;

public class Person {

    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return this.age == person.age && Objects.equals(this.name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}