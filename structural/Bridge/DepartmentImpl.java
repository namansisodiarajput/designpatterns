package structural.Bridge;

public class DepartmentImpl implements Department {

    private String name;

    public DepartmentImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
