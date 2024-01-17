public class BmwCar extends Car{
    public BmwCar(String model, String color, String type, int doors, String fuel) {
        super(model, color, type, doors, fuel);
    }

    @Override
    public String start() {
        return "BmwCar - START";
    }
}
