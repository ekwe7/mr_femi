public class Bike implements Vehicle{
    @Override
    public void accelerate(double distance) {
        System.out.printf("This Bike has covered a distance of %.2f kms", distance);
    }
}
