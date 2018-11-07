package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SpriteFactory {

    // Те данные, которые могут быть одинаковыми
    // для разных объектов, выносим в отдельное место, например сюда
    static Map<String, SpriteType> treeTypes = new HashMap<>();

    public static SpriteType getTreeType(String name, String color) {
        SpriteType result = treeTypes.get(name);
        if (result == null) {
            result = new SpriteType(name, color);
            treeTypes.put(name, result);
        }
        return result;
    }


}
