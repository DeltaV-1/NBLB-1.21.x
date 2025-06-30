package net.delta.nblb;

import net.delta.nblb.block.ModBlocks;
import net.delta.nblb.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NBLB implements ModInitializer {
	public static final String MOD_ID = "nblb";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistryEvents.BUILD.register((builder, context) -> {
			builder.add(ModBlocks.CHARCOAL_BLOCK, 800);
		});
	}
}