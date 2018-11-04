package structural.adapter;

public class EnergyAdapter {
    public static ElectricEnergy transform(EmissionEnergy emissionEnergy) {
        boolean magnetized = false;
        if(emissionEnergy.getHeatRange() > 100.0f) {
            magnetized = true;
        }

        return new ElectricEnergy(emissionEnergy.getAmount(), magnetized);
    }
}
