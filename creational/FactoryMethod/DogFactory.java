package creational.FactoryMethod;

public class DogFactory implements AnimalFactory {

    @Override
    public Animal create() {

        Dog dog = new Dog();

        dog.setName("namandogform");
        dog.setBreed("human like");
        dog.setOwnerName("ashok");
        dog.setPrice(1000);

        return dog;
    }
}
