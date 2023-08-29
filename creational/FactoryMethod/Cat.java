package creational.FactoryMethod;

public class Cat implements Animal {

    private String name;
    private String breed;

    private String ownerName;
    private int price;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String ownerName() {
        return ownerName;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", price=" + price +
                '}';
    }
}
