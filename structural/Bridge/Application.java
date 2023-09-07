package structural.Bridge;

public class Application {

    public static void main(String[] args) {

        Department softwareEngineering = new DepartmentImpl("SOFTWARE_ENGINEERING");

        Person naman = new PersonImpl("naman", softwareEngineering);
        Person nikhil = new PersonImpl("nikhil", softwareEngineering);

        Department electricalEngineering = new DepartmentImpl("ELECTRICAL_ENGINEERING");

        Person hada = new PersonImpl("hada", electricalEngineering);
        Person nitin = new PersonImpl("nitin", electricalEngineering);

        System.out.println(naman.getName() + "-----" + naman.getDepartment().getName());
        System.out.println(nikhil.getName() + "-----" + nikhil.getDepartment().getName());
        System.out.println(hada.getName() + "-----" + hada.getDepartment().getName());
        System.out.println(nitin.getName() + "-----" + nitin.getDepartment().getName());
    }

}
