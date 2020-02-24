package net.fabricmc.emeraldtools;

import net.minecraft.item.Item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.item.PickaxeItem;



public class EmeraldPickaxe extends PickaxeItem{
	public EmeraldPickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings)
	{
		super(material, attackDamage, attackSpeed,settings);
	}
}
