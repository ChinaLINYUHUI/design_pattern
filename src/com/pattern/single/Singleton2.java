package com.pattern.single;

public class Singleton2 {
    private Singleton2(){

    }
    private static volatile Singleton2 singleton2;
    public static Singleton2 getSingleton2(){
        if(singleton2==null){
            synchronized (Singleton2.class){
                if(singleton2==null){
                    singleton2=new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
