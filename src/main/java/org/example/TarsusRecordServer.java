package org.example;

import com.tarsus.lib.lib_decorator.ms.TarsusMsApplication;
import com.tarsus.lib.main_control.load_server.impl.Tarsus;
import org.example.components.CollectComponents;
import org.example.interfaces.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@TarsusMsApplication
public class TarsusRecordServer {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Tarsus tarsus = new Tarsus(TarsusRecordServer.class);
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