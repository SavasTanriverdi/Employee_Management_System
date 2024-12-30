// Subclass: Developer
class Developer extends Employee {
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int id, String department, String programmingLanguage) {
        super(name, id, department); // Call parent class constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Method to write code
    public void writeCode() {
        System.out.println("Developer is writing code in " + programmingLanguage + ".");
    }

    // Override displayInfo to include programming language
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent class method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}