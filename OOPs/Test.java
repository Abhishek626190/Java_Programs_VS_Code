package OOPs;

public class Test {
    private int id;
    private String name;
    private String role;
    private double salary;

    Test() {
        System.out.println("I am in default constructor");
    }

    Test(int id, String name, String role, double sal) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = sal;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setSalary(double sal) {
        this.salary = sal;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return " Id: " + id + " Name: " + name + " Role: " + role + " Salary: " + salary;
    }

    public static void main(String[] args) {
        Test t = new Test(101, "Abhishek", "Developer", 100000);
        System.out.println(t);
        t.setName("Abhi");
        System.out.println(t);
    }

}
