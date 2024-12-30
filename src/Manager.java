// Subclass: Manager
class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(String name, int id, String department, int teamSize) {
        super(name, id, department); // Call parent class constructor
        this.teamSize = teamSize;
    }

    // Method to conduct a meeting
    public void conductMeeting() {
        System.out.println("Manager is conducting a meeting for a team of " + teamSize + " members.");
    }

    // Override displayInfo to include team size
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent class method
        System.out.println("Team Size: " + teamSize);
    }
}