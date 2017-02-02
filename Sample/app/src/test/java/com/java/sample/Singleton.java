package com.java.sample;

class Singleton {
    private static Singleton instance = null;
    private static final Object obj = new Object();

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (obj) {
                if (instance == null) instance = new Singleton();
            }
        }
        return instance;
    }
}