package learn.java;

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void startEngine() {
        System.out.println("Car() class startEngine()");
    }

    public void accelerate() {
        System.out.println("Car() class accelerate()");
    }

    public void brake() {
        System.out.println("Car() class brake()");
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", wheels=" + wheels +
                ", name='" + name + '\'' +
                '}';
    }
}
