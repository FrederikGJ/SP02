public class Main
{
     public static FleetOfCars carFleet = new FleetOfCars();


    public static ElectricCar car1 = new ElectricCar("5857HJ", "Tesla", "Model S", 5, 600,75);
    public static ElectricCar car2 = new ElectricCar("8436TG","Audi","Etron", 5, 500, 60);
    public static ElectricCar car3 = new ElectricCar("4656UT","Volvo", "P8 ReCharge", 5, 1000, 80);

    public static GasolineCar car4 = new GasolineCar("4279TG", "Mazda", "323F", 5,19);
    public static GasolineCar car5 = new GasolineCar("6545YB","Subaru","Imprezza WRX", 5, 16);
    public static GasolineCar car6 = new GasolineCar("3485OK", "Honda", "Civic", 3, 13);

    public static DieselCar car7 = new DieselCar("1354RS", "Seat", "Leon", 5, 30,true);
    public static DieselCar car8 = new DieselCar("8065TR", "Mercedes", "E220 Avantgarde", 5, 25, true);
    public static DieselCar car9 = new DieselCar("8744DR", "Opel", "Astra",5, 30, false);



    public static void main(String[] args)
    {
        carFleet.addCar(car1);
        carFleet.addCar(car2);
        carFleet.addCar(car3);


        carFleet.addCar(car4);
        carFleet.addCar(car5);
        carFleet.addCar(car6);

        carFleet.addCar(car7);
        carFleet.addCar(car8);
        carFleet.addCar(car9);


        System.out.println(carFleet.toString());

        System.out.println();

        System.out.println(carFleet.TotalRegistrationFeeForFleet());
    }
}