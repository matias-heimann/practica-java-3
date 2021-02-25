package com.meli.java.clase3.tt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MyFactory {
    public static Sorter getInstance(String objName) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties properties = new Properties();

        properties.load(new FileInputStream(new File("MyFactory.properties")));

        Class<?> c = Class.forName(properties.getProperty(objName));
        Constructor<?> cons = c.getConstructor();
        Object object = cons.newInstance();
        return (Sorter) object;
    }
}
