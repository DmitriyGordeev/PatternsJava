package structural.proxy;

public class Enemy {
    float health;
    public Enemy() {
        this.health = 100.0f;
    }

    public boolean takeDamage(float damage) {
        this.health -= damage;
        if(this.health < 0) {
            this.health = 0;
            return false;
        }

        return true;
    }
}
