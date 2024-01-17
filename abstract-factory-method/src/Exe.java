public class Exe {
    public static void main(String[] args) {
        CarFactory bmwFactory = new BmwCarFactory();
        Car bmwCar = bmwFactory.createCar();
        System.out.println(bmwCar);
        System.out.println(bmwCar.start());

        System.out.println();

        CarFactory mercedesFactory = new MercedesCarFactory();
        Car mercedesCar = mercedesFactory.createCar();
        System.out.println(mercedesCar);
        System.out.println(mercedesCar.start());
    }
}