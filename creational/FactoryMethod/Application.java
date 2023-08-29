package creational.FactoryMethod;

public class Application {

    public static void main(String[] args) {

        AnimalFactory animalFactory = new CatFactory();

        Animal animal = animalFactory.create();

        System.out.println(animal.toString());

        animalFactory = new DogFactory();

        animal = animalFactory.create();

        System.out.println(animal.toString());
    }

}
