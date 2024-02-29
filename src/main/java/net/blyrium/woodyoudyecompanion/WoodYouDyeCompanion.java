package net.blyrium.woodyoudyecompanion;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WoodYouDyeCompanion implements ModInitializer {
	public static final String MOD_ID = "woodyoudyecompanion";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("More recipes added to 'Wood you Dye'");
	}
}