package com.modforge.writeaminecraftpaper1;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WriteAMinecraftPaper1Mod implements ClientModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger("write-a-minecraft-paper-1-moz1zf1t");

    @Override
    public void onInitializeClient() {
        try {
            // Minimal, compilation-safe client initializer.
            // No server-side or gameplay logic is registered here.
            LOGGER.info("Initialized client mod stub.");
        } catch (Throwable t) {
            LOGGER.error("Failed during client initialization", t);
        }
    }
}
