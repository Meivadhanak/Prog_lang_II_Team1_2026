
/*public class Car {

    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public void startEngine() {
        System.out.println("The car is starting!");
    }

    public void stopEngine() {
        System.out.println("The car is stopping!");
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2022);

        car1.displayInfo();
        car1.startEngine();
        car1.stopEngine();
    }
}*/

public class Week2 {

    String name;
    double[] grades;

    public Week2(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage() {
        if (grades == null || grades.length == 0) {
            return 0;
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

    public static void main(String[] args) {
        double[] grades = { 85.5, 90.0, 78.5, 88.0 };
        Week2 student1 = new Week2("Vadhanak", grades);

        System.out.println("Student Name: " + student1.name);
        System.out.println("Average Grade: " + student1.calculateAverage());
    }
}