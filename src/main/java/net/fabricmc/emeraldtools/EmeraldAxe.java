package net.fabricmc.emeraldtools;

import net.minecraft.item.Item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.item.AxeItem;



public class EmeraldAxe extends AxeItem{
	public EmeraldAxe(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings)
	{
		super(material, attackDamage, attackSpeed,settings);
	}
}
