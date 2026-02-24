public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.accelerate(1500);

        Vehicle wheelBarrow = new WheelBarrow();
        wheelBarrow.accelerate(100);

        Vehicle bike = new Bike();
        bike.accelerate(1800);
    }
}
