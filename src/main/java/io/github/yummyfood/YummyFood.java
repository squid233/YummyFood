package io.github.yummyfood;

import io.github.yummyfood.itemGroup.ItemGroups;
import io.github.yummyfood.util.*;
import net.fabricmc.api.ModInitializer;

public class YummyFood implements ModInitializer {
	public static final String MODID = "yummyfood";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("The mod is initialized!");
		new ModItems();
		new ModBlocks();
		new ItemGroups();
	}
}
