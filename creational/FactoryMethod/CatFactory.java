package creational.FactoryMethod;

public class CatFactory implements AnimalFactory {

    @Override
    public Animal create() {

        Cat cat = new Cat();

        cat.setName("namancatform");
        cat.setBreed("human like");
        cat.setOwnerName("ashok");
        cat.setPrice(1000);

        return cat;
    }
}
