public class ElectricCar extends ACar
{
    protected int batteryCapacityKWH;
    protected int maxRange;


    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int maxRange, int batteryCapacity)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKWH = batteryCapacity;
        this.maxRange = maxRange;
    }

    @Override
    public int getRegistrationFee()
    {
        int convertedToKMl = (int)(100/(getWhPrKm()/91.25));
        if(convertedToKMl >= 20 && convertedToKMl < 50)
        {
            return 330;
        }
        else if(convertedToKMl >= 15 && convertedToKMl < 20)
        {
            return 1050;
        }
        else if(convertedToKMl >= 10 && convertedToKMl < 15)
        {
            return 2340;
        }
        else if(convertedToKMl >= 5 && convertedToKMl < 10)
        {
            return 5500;
        }
        else
        {
            return 10470;
        }
    }


    public int getBatteryCapacityKWh(int batteryCapacity)
    {
       return batteryCapacity;
    }

    public int getMaxRangeKm(int maxRange)
    {
        return maxRange;
    }

    public int getWhPrKm()
    {
        int whPrKm = (batteryCapacityKWH*1000)/maxRange;
        //We TypeCast the double to an integer because we want to return an integer.
        return whPrKm;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n This is an electric car." +
                "\n It has a battery capacity of: " + batteryCapacityKWH + " kWh." +
                "It has a maximum range of: " + maxRange + " km.";
    }

}
