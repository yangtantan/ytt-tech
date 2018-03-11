package com.ytt.tech.tool.annotion;

/**
 *
 */
public class Apple {

    @FruitColor(fruitColor = FruitColor.Color.blue)
    String fruitColor;

    @FruitName(value = "this is apple")
    String fruitName;

    @FruitProvider(id = 1,user = "ytt",address = "中南海")
    String provider;

}
