package structural.adapter;

public class EnergyAdapter {

    RadioactiveOrb orb;

    public EnergyAdapter(RadioactiveOrb orb) {
        this.orb = orb;
    }

    public ElectricEnergy transformEnergyNature() {
        EmissionEnergy energyPortion = orb.emissionEnergy();
        boolean magnetized = (energyPortion.getHeatRange() > 100.0f);
        ElectricEnergy electricEnergy = new ElectricEnergy(energyPortion.getAmount(), magnetized);
        return electricEnergy;
    }

}
