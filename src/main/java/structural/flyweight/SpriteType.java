package structural.flyweight;

public class SpriteType {

    String name;
    String color;

    public SpriteType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void draw() {
        System.out.println("SpriteType.draw() : typename = " + this.name);
    }

}
