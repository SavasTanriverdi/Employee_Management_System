// Base class: Employee
class Employee {
    private String name;
    private int id;
    private String department;

    // Constructor
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }

    // Method to show work details
    public void work() {
        System.out.println(name + " is working in the " + department + " department.");
    }
}