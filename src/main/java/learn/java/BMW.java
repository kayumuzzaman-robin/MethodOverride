package learn.java;


class BMW extends Car{
    public BMW(int cylinder) {
        super(cylinder, "BMW");
    }

    @Override
    public void startEngine() {
        System.out.println("BMW() class startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW() class accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("BMW() class brake()");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
