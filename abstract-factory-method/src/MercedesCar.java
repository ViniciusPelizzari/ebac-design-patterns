public class MercedesCar extends Car {

    public MercedesCar(String model, String color, String type, int doors, String fuel) {
        super(model, color, type, doors, fuel);
    }

    @Override
    public String start() {
        return "MercedesCar - START";
    }
}
