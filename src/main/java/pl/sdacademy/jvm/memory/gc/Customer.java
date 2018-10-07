package pl.sdacademy.jvm.memory.gc;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(Customer oldCustomer) {
        this.name = oldCustomer.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public void finalize() {
        System.out.println("Objects is gc");
    }
}