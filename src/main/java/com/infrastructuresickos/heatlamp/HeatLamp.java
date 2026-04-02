package com.infrastructuresickos.heatlamp;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(HeatLamp.MOD_ID)
public class HeatLamp {
    public static final String MOD_ID = "heat_lamp";
    private static final Logger LOGGER = LogManager.getLogger();

    public HeatLamp() {
        LOGGER.info("Heat Lamp mod loaded.");
    }
}
