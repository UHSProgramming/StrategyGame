package com.uhs.strategygame;
import org.lwjgl.*;
import org.lwjgl.Version;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWWindowFocusCallback;
import org.lwjgl.system.MemoryUtil;
// this class contains a static method that is invoked to check if libwjgl is working correctly.
public class TestLwjgl{
    public long windowHandle; // handle to the window
    //a handle is a value handed to library functions so to reference some thing managed by the library and not your code
    //static methods can be invoked without class instances
    public void test() {
        //if libwjgl is working correctly then we should be able to get the version of the library
        System.out.println("LWJGL Version " + Version.getVersion() + " is working.");
        //get version doesn't throw any exceptions, it this doesn't work it should be a compilation error.
        GLFWErrorCallback.createPrint(System.out).set(); // has all errors printed to stdout
        if (!GLFW.glfwInit() ) { // initializes the glfw subsystem, returns false on error
            throw new IllegalStateException("glfw failed to initialize"); // state exceptions should stop the program'
        }
        //set GLFW to use default options
        GLFW.glfwDefaultWindowHints();
        //GLFW is configure with this function
        /*
            glfw has it's own booleans, this is pretty common for shim libraries
         */
        GLFW.glfwWindowHint(GLFW.GLFW_VISIBLE, GLFW.GLFW_TRUE);
        GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE, GLFW.GLFW_TRUE);
        //creates the window, 100x100 in size, giving null to screen
        windowHandle = GLFW.glfwCreateWindow(100,100,"StrategyGame Test Window",MemoryUtil.NULL,MemoryUtil.NULL);
        /*
            lwjgl also has it's own NULL
         */
        if (windowHandle == MemoryUtil.NULL) { //check for failure to create a new window
            throw new IllegalStateException("unable to create a libwjgl window");
        }
        GLFW.glfwSetKeyCallback(windowHandle,new keyCallBack());
    }

}
