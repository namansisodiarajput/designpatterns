package structural.Bridge;

public class PersonImpl implements Person {

    private String name;
    private Department department;

    public PersonImpl(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Department getDepartment() {
        return department;
    }
}
