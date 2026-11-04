package com.enderdevelopment.aternosserveropener;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AternosServerOpener implements ModInitializer {
    public static final String MOD_ID = "aternosserveropener";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Aternos Server Opener initialized");
    }
}