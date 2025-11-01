package com.optloader.core;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class OptiLoaderCore implements ModInitializer {

    @Override
    public void onInitialize() {
        System.out.println("[OptiLoader] Fake Fabric environment loaded!");
        System.out.println("[OptiLoader] All mods will think Fabric API is present.");
    }

    public static void init() {
        FabricLoader.getInstance(); // fake loader initialize
        new OptiLoaderCore().onInitialize();
    }
}
