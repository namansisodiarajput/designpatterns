package creational.Builder;

import creational.Builder.Person.PersonBuilder;
import java.util.UUID;

public class Application {

    public static void main(String[] args) {

        Person p1 = Person.PersonBuilder()
                .person("naman sisodia")
                .age(25)
                .address("naman address")
                .uniqueId(UUID.randomUUID().toString())
                .build();
        System.out.println(p1.toString());

        Person p2 = Person.PersonBuilder()
                .person("harendra singh")
                .age(29)
                .address("harendra address")
                .uniqueId(UUID.randomUUID().toString())
                .build();
        System.out.println(p2.toString());


    }

}
