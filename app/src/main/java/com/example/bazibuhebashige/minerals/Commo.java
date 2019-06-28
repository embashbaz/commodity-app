package com.example.bazibuhebashige.minerals;

public class Commo {

    public static String name;
    public static String description;
    public static String updatetime;
    public static String lastAvData;
    public static String id;
   public static String data;
   ;

    public Commo(String id,String data,String name,String description,
                 String refresh,String lastAv){

        this.name=name;
        this.description=description;
        this.updatetime=refresh;
        this.lastAvData=lastAv;
        this.id=id;
        this.data=data;

    }
}
