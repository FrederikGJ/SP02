public class DieselCar extends AFuelCar
{
    private boolean hasFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kilometerPerLiter, boolean hasFilter)
    {
        super(registrationNumber, make, model, numberOfDoors, kilometerPerLiter);
        this.hasFilter = hasFilter;

    }

    @Override
    String getFuelType()
    {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee()
    {

        //int registrationFee - it is useful because some cars have particle filters and others do not.
        int registrationFee;
        //equalization tax
        int equalizationTax1 = 130;
        int equalizationTax2 = 1390;
        int equalizationTax3 = 1850;
        int equalizationTax4 = 2770;
        int equalizationTax5 = 15260;
        //tax for having no particle filter
        int noFilterTax = 1000;

        if(kilometrePerLiter >= 20 && kilometrePerLiter < 50)
        {
            registrationFee = 330 + equalizationTax1;
            if (hasParticleFilter() == true)
            {
                return registrationFee;
            }
            else
            {
                return registrationFee + noFilterTax;
            }

        }
        else if(kilometrePerLiter >= 15 && kilometrePerLiter < 20)
        {
            registrationFee = 1050 + equalizationTax2;
            if (hasParticleFilter() == true)
            {
                return registrationFee;
            }
            else
            {
                return registrationFee + noFilterTax;
            }


        }
        else if(kilometrePerLiter >= 10 && kilometrePerLiter < 15)
        {
            registrationFee = 2340 + equalizationTax3;
            if (hasParticleFilter() == true)
            {
                return registrationFee;
            }
            else
            {
                return registrationFee + noFilterTax;
            }
        }
        else if(kilometrePerLiter >= 5 && kilometrePerLiter < 10)
        {
            registrationFee = 5500 + equalizationTax4;
            if (hasParticleFilter() == true)
            {
                return registrationFee;
            }
            else
            {
                return registrationFee + noFilterTax;
            }
        }
        else
        {
            registrationFee = 10470 + equalizationTax5;
            if (hasParticleFilter() == true)
            {
                return registrationFee;
            }
            else
            {
                return registrationFee + noFilterTax;
            }
        }
    }

    public boolean hasParticleFilter()
    {
        return hasFilter;
    }

    @Override
    public String toString()
    {
        if(hasFilter == true)
        {
            return super.toString()+ "\n It is a diesel car with a particle filter.\n";
        }
        else
        {
            return super.toString()+ "\n It is a diesel car with no particle filter!\n";
        }

    }

}
