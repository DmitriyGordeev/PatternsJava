package creational.abstractfactory;

public abstract class Shield {
    float defense;
    float durability;

    public Shield(float defense, float durability) {
        this.defense = defense;
        this.durability = durability;
    }

    public abstract float reflect(float damage);
}
