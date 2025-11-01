package com.optiloader;

public class OptiLoaderBootstrap {

    public static void init() {
        System.out.println("[OptiLoader-Proof] Bootstrap initialized successfully!");
    }

    static {
        System.out.println("[OptiLoader-Proof] Static block: Loader bootstrap running!");
        init();
    }
}
