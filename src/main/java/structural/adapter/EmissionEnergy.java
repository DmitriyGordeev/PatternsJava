package structural.adapter;

public class EmissionEnergy {
    private float amount;
    private float heatRange;

    public EmissionEnergy(float amount, float heatRange) {
        this.amount = amount;
        this.heatRange = heatRange;
    }

    public float getAmount() {
        return amount;
    }

    public float getHeatRange() {
        return heatRange;
    }
}
