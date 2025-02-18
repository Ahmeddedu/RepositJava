package Works.HomeWork.HomeWork25;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printMe() {
        System.out.println(firstName + " " + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class TitledPerson extends Person {
    private String status;

    public TitledPerson(Person person, String status) {
        super(person.getFirstName(), person.getLastName());
        this.status = status;
    }

    @Override
    public void printMe() {
        System.out.println(status + ": " + getFirstName() + " " + getLastName());
    }
}

class MultiLinePerson extends Person {
    private Person person;

    public MultiLinePerson(Person person) {
        super(person.getFirstName(), person.getLastName());
        this.person = person;
    }

    @Override
    public void printMe() {
        System.out.println();
        person.printMe();
        System.out.println();
    }
}