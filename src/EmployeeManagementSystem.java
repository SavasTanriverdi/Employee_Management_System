// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create a Manager object
        Manager manager = new Manager("Alice", 101, "Operations", 5);

        // Create a Developer object
        Developer developer = new Developer("Bob", 102, "Development", "Java");

        // Display their information and actions
        System.out.println("Manager Details:");
        manager.displayInfo();
        manager.conductMeeting();

        System.out.println("\nDeveloper Details:");
        developer.displayInfo();
        developer.writeCode();
    }
}