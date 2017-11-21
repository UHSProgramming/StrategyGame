package com.uhs.strategygame;

import org.lwjgl.glfw.GLFWKeyCallbackI;

public class keyCallBack implements GLFWKeyCallbackI {

    public void invoke(long window, int key, int scancode, int action, int mods) {
        System.out.print("A Key Has Been Pressed \n");
    }
    public void callback(long args) {

    }
    public String getSignature() {

        return null;
    }

    public long address() {
        return 0;
    }
}
