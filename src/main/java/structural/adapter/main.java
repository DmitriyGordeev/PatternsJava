package structural.adapter;

public class main {
    public static void main(String[] args) {
        RadioactiveOrb orb = new RadioactiveOrb(10, 100);
        EmissionEnergy emissionEnergy = orb.emissionEnergy();
        ElectricEnergy electricEnergy = EnergyAdapter.transform(emissionEnergy);
        CarEngine engine = new CarEngine(electricEnergy);
        float rideRange = engine.range();
    }
}
