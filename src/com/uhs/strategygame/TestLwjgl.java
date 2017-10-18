package com.uhs.strategygame;

import org.lwjgl.Version;
// this class contains a static method that is invoked to check if libwjgl is working correctly.
public class TestLwjgl{
    //static methods can be invoked without class instances
    public static void test() {
        //if libwjgl is working correctly then we should be able to get the version of the library
        System.out.println("LWJGL Version " + Version.getVersion() + " is working.");
    }

}
