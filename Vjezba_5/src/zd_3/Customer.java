package zd_3;

public class Customer {
    private String name;
    private int idCustomer;
    private static int cntCustomer = 0;

    public Customer(String name) {
        this.name = name;
        this.idCustomer = ++cntCustomer;
    }

    public int customerID() { return idCustomer; }

    public void customerInfo() {
        System.out.println("Kupac: " + name + " (ID: " + idCustomer + ")");
    }

    @Override
    public String toString() { return name; }
}
