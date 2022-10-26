public class GasolineCar extends AFuelCar
{
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kilometerPerLiter)
    {
        super(registrationNumber, make, model, numberOfDoors, kilometerPerLiter);
    }

    @Override
    String getFuelType()
    {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee()
    {
        if(kilometrePerLiter >= 20 && kilometrePerLiter < 50)
        {
            return 330;
        }
        else if(kilometrePerLiter >= 15 && kilometrePerLiter < 20)
        {
            return 1050;
        }
        else if(kilometrePerLiter >= 10 && kilometrePerLiter < 15)
        {
            return 2340;
        }
        else if(kilometrePerLiter >= 5 && kilometrePerLiter < 10)
        {
            return 5500;
        }
        else
        {
            return 10470;
        }
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n It is a gasoline car.\n";
    }
}
