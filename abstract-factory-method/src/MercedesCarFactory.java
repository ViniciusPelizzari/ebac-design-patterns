public class MercedesCarFactory  implements CarFactory{
    @Override
    public Car createCar() {
        return new MercedesCar("AMG", "White", "SUV", 4, "100%");
    }
}
