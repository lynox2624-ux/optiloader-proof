package net.fabricmc.loader.api;

public class FabricLoader {

    private static final FabricLoader INSTANCE = new FabricLoader();

    public static FabricLoader getInstance() {
        return INSTANCE;
    }

    public boolean isModLoaded(String modId) {
        // Sab mods ke liye true return karega
        return true;
    }

    public String getGameDirectory() {
        return System.getProperty("user.dir");
    }

    public Object getModContainer(String modId) {
        return null;
    }

    public String getEnvironmentType() {
        return "CLIENT";
    }
}
