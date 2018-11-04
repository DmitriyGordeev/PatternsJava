package structural.adapter;

/**
 * Simple fun example of Adapter pattern usage
 * Trying to use RadioactiveOrb as power source for CarEngine
 * with EnergyAdapter
 */
public class main {
    public static void main(String[] args) {

        RadioactiveOrb orb = new RadioactiveOrb(10, 100);
        EnergyAdapter adapter = new EnergyAdapter(orb);
        ElectricEnergy electricEnergy = adapter.transformEnergyNature();
        CarEngine engine = new CarEngine(electricEnergy);
        float rideRange = engine.range();
    }
}
