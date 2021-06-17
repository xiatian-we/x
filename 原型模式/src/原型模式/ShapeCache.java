package ԭ��ģʽ;

import java.util.HashMap;

public class ShapeCache {
	private static HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // ��ÿ��ˮ�����������ݿ��ѯ����������ˮ����shapeMap.put(shapeKey, shape);
    public static void loadCache() {
        Apple apple = new Apple();
        apple.setId("1");
        shapeMap.put(apple.getId(),apple);

        Banana banana = new Banana();
        banana.setId("2");
        shapeMap.put(banana.getId(),banana);

        Orange orange = new Orange();
        orange.setId("3");
        shapeMap.put(orange.getId(),orange);
    }
}
