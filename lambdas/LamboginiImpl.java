public class LamboginiImpl {
    public static void main(String[] args) {
        Vehicle myVehicle = (double distance) -> {
            System.out.println("Lambogini covered the distance %.2f " + distance +"KM");
        };

        printDistanceCoveredBy((distance ) ->{
            System.out.println("Distance covered by " + distance + "KM");
        });

    }
    public static void printDistanceCoveredBy(Vehicle vehicle){
        vehicle.accelerate(45);
    }
}
