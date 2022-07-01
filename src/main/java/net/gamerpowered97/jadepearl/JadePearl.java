package net.gamerpowered97.jadepearl;

import net.fabricmc.api.ModInitializer;
import net.gamerpowered97.jadepearl.block.ModBlocks;
import net.gamerpowered97.jadepearl.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class JadePearl implements ModInitializer {
	public static final String MOD_ID = "jadepearl";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
