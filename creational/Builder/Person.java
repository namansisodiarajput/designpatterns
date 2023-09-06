package creational.Builder;

public class Person {

    private String person;
    private int age;

    private String address;
    private String uniqueId;

    private Person(String person, int age, String address, String uniqueId) {
        this.person = person;
        this.age = age;
        this.address = address;
        this.uniqueId = uniqueId;
    }

    static PersonBuilder PersonBuilder() {
        return new PersonBuilder();
    }

    public String getPerson() {
        return person;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "person='" + person + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", uniqueId='" + uniqueId + '\'' +
                '}';
    }

    public static class PersonBuilder {

        private String person;

        private int age;

        private String address;

        private String uniqueId;

        PersonBuilder() {
        }

        public PersonBuilder person(String person) {
            this.person = person;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder uniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }

        public Person build() {
            return new Person(this.person, this.age, this.address, this.uniqueId);
        }
    }
}
