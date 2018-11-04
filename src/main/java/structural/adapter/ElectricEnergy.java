package structural.adapter;

public class ElectricEnergy {
    private float amount;
    private boolean magnetized;

    public ElectricEnergy(float amount, boolean magnetized) {
        this.amount = amount;
        this.magnetized = magnetized;
    }

    public float getAmount() {
        return amount;
    }

    public boolean getMagnetized() {
        return magnetized;
    }
}
