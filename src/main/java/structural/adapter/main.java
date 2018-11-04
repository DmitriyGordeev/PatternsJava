package structural.adapter;

/**
 * Simple fun example of Adapter pattern usage
 * Trying to use RadioactiveOrb as power source for CarEngine
 * with EnergyAdapter
 */
public class main {
    public static void main(String[] args) {

        RadioactiveOrb orb = new RadioactiveOrb(10, 100);
        EmissionEnergy emissionEnergy = orb.emissionEnergy();
        ElectricEnergy electricEnergy = EnergyAdapter.transform(emissionEnergy);
        CarEngine engine = new CarEngine(electricEnergy);
        float rideRange = engine.range();
    }
}
