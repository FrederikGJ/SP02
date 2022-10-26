public abstract class ACar implements Car
{
    protected String registrationNumber;
    protected final String make;
    protected final String model;
    protected final int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors)
    {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber()
    {
        return null;
    }

    @Override
    public String getMake()
    {
        return null;
    }

    @Override
    public String getModel()
    {
        return null;
    }

    @Override
    public int getNumberOfDoors()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return "This car has the registration number: " + registrationNumber +
                " and the make: " + make +
                " the model is: " + model +
                " the car has " + numberOfDoors + " doors.";
    }
}
