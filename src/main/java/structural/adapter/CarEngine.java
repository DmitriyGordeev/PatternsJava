package structural.adapter;

public class CarEngine {

    float power;

    CarEngine(ElectricEnergy electricEnergy) {
        this.power = electricEnergy.getAmount() + (electricEnergy.getMagnetized() == true ? 1000.0f : 0.0f);
    }

    public float range() {
        return this.power * 800.0f / 1000.0f;
    }
}
