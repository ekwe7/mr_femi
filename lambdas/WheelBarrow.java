public class WheelBarrow implements Vehicle{
    @Override
    public void accelerate(double distance) {
        System.out.println(String.format("This wheelBarrow has covereda distance of %.2f", distance));
    }
}
