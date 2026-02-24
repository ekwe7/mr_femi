public class Car implements Vehicle {
    @Override
    public void accelerate(double distance) {
        System.out.println(String.format("The car has gone a distance of %.2f", distance));
    }
}
