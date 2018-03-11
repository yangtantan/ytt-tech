package com.ytt.tech.tool.annotion;

import java.lang.reflect.Field;

/**
 * @author ytt
 *
 */

public class AnnotionDemo {


    public static void main(String[] args) throws ClassNotFoundException {


        getFruitParam("com.ytt.tech.tool.annotion.Apple");

    }

    public static void getFruitParam(String classFullPath) throws ClassNotFoundException {

        Class<?> aClass = Class.forName(classFullPath);

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {


            if (declaredField.isAnnotationPresent(FruitColor.class)) {

                FruitColor fruitColor = declaredField.getAnnotation(FruitColor.class);
                System.out.println(" fruit color value : " +fruitColor.fruitColor());
            }
            if (declaredField.isAnnotationPresent(FruitName.class)) {

                FruitName fruitName = declaredField.getAnnotation(FruitName.class);
                System.out.println(" fruit name is :" + fruitName.value());
            }
            if (declaredField.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider annotation = declaredField.getAnnotation(FruitProvider.class);
                System.out.println(String.format(" fruit provider is : id = %s ,user = %s; address = %s"
                ,annotation.id(),annotation.user(),annotation.address()
                ) );
            }


        }


    }
}
