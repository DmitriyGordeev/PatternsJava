package structural.flyweight;

public class Sprite {
    int x;
    int y;
    SpriteType type;

    public Sprite(int x, int y, SpriteType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.draw();
        System.out.println("Sprite.draw()");
    }
}
