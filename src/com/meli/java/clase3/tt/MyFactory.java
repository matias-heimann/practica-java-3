package com.meli.java.clase3.tt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MyFactory {
    public static Object getInstance(String objName) {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(new File("MyFactory.properties")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        try {
            Class<?> c = Class.forName(properties.getProperty(objName));
            Constructor<?> cons = c.getConstructor();
            Object object = cons.newInstance();
            return object;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }
}
