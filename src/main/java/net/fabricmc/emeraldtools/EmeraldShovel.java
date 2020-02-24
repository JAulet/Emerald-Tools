package net.fabricmc.emeraldtools;

import net.minecraft.item.Item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ShovelItem;



public class EmeraldShovel extends ShovelItem{
	public EmeraldShovel(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings)
	{
		super(material, attackDamage, attackSpeed,settings);
	}
}
