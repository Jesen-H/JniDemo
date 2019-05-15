package com.hjq.jni;

public class myJni {

    static {
        System.loadLibrary("JniTest");
    }

    public static native String sayHello();
}
