package net.fabricmc.emeraldtools;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.*;

public class EmeraldTools implements ModInitializer{
	
	
	public static final Item Pick = new EmeraldPickaxe(
			new EMERALD(),
			1,
			-2.8F,
			new Item.Settings().group(ItemGroup.TOOLS)
			);
	
	public static final Item Shovel = new EmeraldShovel(
			new EMERALD(),
			1.5F,
			-3.0F,
			new Item.Settings().group(ItemGroup.TOOLS)
			);
	
	public static final Item Axe = new EmeraldAxe(
			new EMERALD(),
			7,
			-3.2F,
			new Item.Settings().group(ItemGroup.TOOLS)
			);
	public static final Item Hoe = new EmeraldHoe(
			new EMERALD(),
			-1.0F,
			new Item.Settings().group(ItemGroup.TOOLS)
			);
	public static final Item Sword = new EmeraldSword(
			new EMERALD(),
			3,
			-2.4F,
			new Item.Settings().group(ItemGroup.TOOLS)
			);
	@Override
	public void onInitialize() {
		Registry.register(
				Registry.ITEM,
				new Identifier("emeraldtools:emerald_pickaxe"),
				Pick
				);
		Registry.register(
				Registry.ITEM,
				new Identifier("emeraldtools:emerald_shovel"),
				Shovel
				);
		Registry.register(
				Registry.ITEM,
				new Identifier("emeraldtools:emerald_axe"),
				Axe
				);
		Registry.register(
				Registry.ITEM,
				new Identifier("emeraldtools:emerald_hoe"),
				Hoe
				);
		Registry.register(
				Registry.ITEM,
				new Identifier("emeraldtools:emerald_sword"),
				Sword
				);
	}
}