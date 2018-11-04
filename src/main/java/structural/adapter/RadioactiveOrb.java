package structural.adapter;

public class RadioactiveOrb {

    float mass;
    float energy;

    public RadioactiveOrb(float mass, float energy) {
        this.mass = mass;
        this.energy = energy;
    }

    public EmissionEnergy emissionEnergy() {
        return new EmissionEnergy(energy, mass * 100);
    }
}
