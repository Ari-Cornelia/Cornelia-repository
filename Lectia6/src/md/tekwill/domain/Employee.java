package md.tekwill.domain;

public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private Department department;
    private static long idCount;

    public Employee(String firstName, String lastName, Department department) {
        id = ++idCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public Employee() {
        id = ++idCount;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                '}';
    }
}
