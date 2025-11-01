package net.fabricmc.api;

public interface ModInitializer {
    default void onInitialize() {
        System.out.println("OptiLoader-Proof loaded: Fabric-like mod init running.");
    }
}
