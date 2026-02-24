public class CustomComparatorImpl {
    public static void main(String[] args) {
        Vehicle vehicle = (double distance) -> {
            System.out.println("Vehicle is accelerated for : " + distance + "KM");
        };
        printDistanceCoveredBy((distance) -> {
            System.out.println("Distance covered by "+ distance + "KM");
        });

        Vehicle bicycle = (double distance) -> {
            System.out.println("Bicycle is accelerated for : " + distance + "KM");
        };
        bicycle.accelerate(457);

        Vehicle keke =  (double distance) -> {
            System.out.println("Keke is accelerated for : " + distance + "KM");
        };
        keke.accelerate(206);

        Vehicle lambogini = (double distance) -> {
            System.out.println("Lambogini is accelerated for : " + distance + "KM");
        };
        lambogini.accelerate(565);


    }
    public static void printDistanceCoveredBy(Vehicle vehicle) {
        vehicle.accelerate(150);
    }


}
