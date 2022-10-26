public abstract class AFuelCar extends ACar
{

    protected int kilometrePerLiter;


    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kilometerPerLiter)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.kilometrePerLiter = kilometerPerLiter;
    }

    abstract String getFuelType();

    int kmPrLitre()
    {
        return kilometrePerLiter;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n This car can go " + kilometrePerLiter + " kilometres pr liter fuel";
    }
}
