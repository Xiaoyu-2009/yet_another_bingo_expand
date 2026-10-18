package dev.xiaoyu.yet_another_bingo_expand;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YetAnotherBingoExpand implements ModInitializer {
	public static final String MOD_ID = "yet_another_bingo_expand";
	public static final String MODID = MOD_ID;
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}