/*public class Student {

    private static int studentCount = 0;

    private String name;

    public Student(String name) {
        this.name = name;

        studentCount++;
    }

    public static void printTotalStudents() {
        System.out.println("Total students created: " + studentCount);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        Student.printTotalStudents();
    }
}*/

public class CoffeeMachine {
    private String model;
    private double price;

    public CoffeeMachine(String model, double price) {
        this.model = model;
        // Use the setter even in the constructor to ensure validation
        setPrice(price);
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter with safety validation
    public void setPrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
        } else {
            System.out.println("Error: Price cannot be negative. Value unchanged.");
        }
    }

    public void displayInfo() {
        System.out.println("Model: " + model + " | Price: $" + price);
    }

    public static void main(String[] args) {
        CoffeeMachine myMachine = new CoffeeMachine("BrewMaster 3000", 49.99);

        // Attempting to set an invalid price
        myMachine.setPrice(-10.00);

        // Attempting to set a valid price
        myMachine.setPrice(39.99);

        myMachine.displayInfo();
    }
}