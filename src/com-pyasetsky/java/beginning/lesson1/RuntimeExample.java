package com.pyasetsky.java.beginning.lesson1;

import java.net.SocketPermission;

/**
 * Created by bpyasetsky on 26.03.2015.
 */
public class RuntimeExample {
    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println("Proceccors "+r.availableProcessors());
        System.out.println("Total memory "+r.totalMemory());
        System.out.println("Free memory "+r.freeMemory());
        System.out.println("Max memory "+r.maxMemory());

    }
}
