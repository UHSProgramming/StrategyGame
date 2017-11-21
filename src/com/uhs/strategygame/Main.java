package com.uhs.strategygame;

import org.lwjgl.glfw.GLFW;

public class Main {
    //entry point into program, right now it just checks to see if your environment is set up correctly
    public static void main(String[] args){
        //tests if the java runtime in general is working
        System.out.println("Hello, UHS programming!");
        //gets the version of the runtime
        System.out.println("This Program is running on Java version: " + System.getProperty("java.version"));
        //tests to see if libjwgl is working
        TestLwjgl t = new TestLwjgl() ;
        t.test();
        while (true) {
            GLFW.glfwPollEvents();
        }
    }
    /* output should look something like
    Hello, UHS programming!
    This Program is running on Java version: 9
    LWJGL Version 3.1.3 SNAPSHOT is working.

    Process finished with exit code 0
     */
}
