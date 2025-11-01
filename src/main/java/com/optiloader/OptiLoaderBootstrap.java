package com.optiloader;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@Mod("optiloader-proof")
@OnlyIn(Dist.CLIENT)
public class OptiLoaderBootstrap {
    public OptiLoaderBootstrap() {
        System.out.println("[OptiLoader] Initialized successfully inside OptiFine environment!");
    }
}
