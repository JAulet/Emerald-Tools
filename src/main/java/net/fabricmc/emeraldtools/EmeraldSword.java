package net.fabricmc.emeraldtools;

import net.minecraft.item.Item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.item.SwordItem;



public class EmeraldSword extends SwordItem{
	public EmeraldSword(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings)
	{
		super(material, attackDamage, attackSpeed,settings);
	}
}
