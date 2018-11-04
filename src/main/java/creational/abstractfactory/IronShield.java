package creational.abstractfactory;

public class IronShield extends Shield {

    private float reflectForce;

    public IronShield(float reflectForce, float defense, float durability) {
        super(defense, durability);
        this.reflectForce = reflectForce;
    }

    @Override
    public float reflect(float damage) {
        return reflectForce * defense * 0.01f * durability;
    }
}
