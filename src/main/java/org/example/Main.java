package org.example;

import com.tarsus.lib.lib_decorator.ms.TarsusMsApplication;
import com.tarsus.lib.main_control.load_server.impl.Tarsus;
import org.example.interfaces.*;

import java.lang.reflect.InvocationTargetException;

@TarsusMsApplication
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Tarsus tarsus = new Tarsus(Main.class);
        tarsus.LoadInterFace(new Class[]{
                PlanImpl.class,
                CacheImpl.class,
                RecordImpl.class,
                ShareImpl.class,
                UserImpl.class,
                WordImpl.class
        });
        tarsus.LoadStruct();
        tarsus.LoadServer();
    }
}