import java.io.Serializable;
import java.util.Comparator;

public class Customer implements Serializable {
    private String firstName;
    private String lastName;
    private int id;
    private double balance;

    public Customer() {
    }

    public Customer(String firstName, String lastName, int id, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer [ID=" + id + ", First Name=" + firstName + ", Last Name=" + lastName + ", Balance=" + balance + "]";
    }
}
;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        int firstNameCompare = c1.getFirstName().compareTo(c2.getFirstName());
        if (firstNameCompare != 0) {
            return firstNameCompare;
        }

        int lastNameCompare = c1.getLastName().compareTo(c2.getLastName());
        if (lastNameCompare != 0) {
            return lastNameCompare;
        }

        int idCompare = Integer.compare(c1.getId(), c2.getId());
        if (idCompare != 0) {
            return idCompare;
        }

        return Double.compare(c1.getBalance(), c2.getBalance());
    }
}
