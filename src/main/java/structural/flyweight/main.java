package structural.flyweight;

public class main {
    public static void main(String[] args) {

        SpriteType matt = SpriteFactory.getTreeType("matt", "green");
        Sprite spriteBall = new Sprite(0, 0, matt);
        Sprite spriteBox  = new Sprite(10, 10, matt);

        spriteBall.draw();
        spriteBox.draw();
    }
}
