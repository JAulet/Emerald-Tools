package net.fabricmc.emeraldtools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;



public class EMERALD implements ToolMaterial{
	
	public EMERALD()
	{
	}
	public int getDurability()
	{
		return 2048;
	}
	public float getMiningSpeed()
	{
		return 12;
	}
	public float getAttackDamage()
	{
		return 7;
	}
	public int getMiningLevel()
	{
		return 3;
	}
	public int getEnchantability()
	{
		return 22;
	}
	public Ingredient getRepairIngredient()
	{
		return Ingredient.ofItems(Items.EMERALD);
	}
}
