import java.util.ArrayList;

public class FleetOfCars
{

    ArrayList<Car> allCars = new ArrayList<>();

    public void addCar(Car e)
    {
        allCars.add(e);
    }

    @Override
    public String toString() {
        String results = "";
        for(Car c : allCars) {
            results += c.toString();
        }
        return results;
    }

    public int TotalRegistrationFeeForFleet()
    {
        int i = 0;
        for (Car c : allCars)
        {
            i += c.getRegistrationFee();

        }
        return i;

    }
}

