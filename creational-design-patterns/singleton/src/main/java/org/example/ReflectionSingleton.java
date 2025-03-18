package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingleton {

    public static void main(String[] args) {
        EagerInitializedSingleton firstInstance = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton secondInstance = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                secondInstance = (EagerInitializedSingleton) constructor.newInstance();
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        /* EagerInitializedSingleton firstInstance = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton secondInstance = EagerInitializedSingleton.getInstance(); */
        
        System.out.println(firstInstance.hashCode());
        System.out.println(secondInstance.hashCode());
    }
}
