public class BmwCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new BmwCar("Z4", "Red", "Conversible", 2, "90%");
    }
}
