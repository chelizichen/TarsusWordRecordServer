package org.example.components;

import org.example.interfaces.CacheImpl;
import org.example.interfaces.UserImpl;

import java.io.IOException;

public class CollectComponents {
    public static UserImpl userServer = new UserImpl();
    public static CacheImpl cacheServer = new CacheImpl();
    public static DataComponents dataComponents;

    static {
        try {
            dataComponents = new DataComponents();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
