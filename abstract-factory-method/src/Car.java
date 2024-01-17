public abstract class Car {

    private String model;
    private String color;
    private String type;
    private int doors;
    private String fuel;

    public Car(String model, String color, String type, int doors, String fuel) {
        this.model = model;
        this.color = color;
        this.type = type;
        this.doors = doors;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", tipe='" + type + '\'' +
                ", doors=" + doors +
                ", fuel='" + fuel + '\'' +
                '}';
    }

    public abstract String start();
}
