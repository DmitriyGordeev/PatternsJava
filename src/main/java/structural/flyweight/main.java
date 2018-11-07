package structural.flyweight;

public class main {
    public static void main(String[] args) {

        SpriteType pine = SpriteFactory.getTreeType("ball", "green");
        Sprite sprite = new Sprite(0, 0, pine);

        sprite.draw();
    }
}
