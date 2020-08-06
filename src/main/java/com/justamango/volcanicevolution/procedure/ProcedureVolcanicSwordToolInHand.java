package com.justamango.volcanicevolution.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Enchantments;

import java.util.Map;

import com.justamango.volcanicevolution.ElementsVolcanicevolutionMod;

@ElementsVolcanicevolutionMod.ModElement.Tag
public class ProcedureVolcanicSwordToolInHand extends ElementsVolcanicevolutionMod.ModElement {
	public ProcedureVolcanicSwordToolInHand(ElementsVolcanicevolutionMod instance) {
		super(instance, 69);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure VolcanicSwordToolInHand!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.FIRE_ASPECT, (int) 5);
		((itemstack)).addEnchantment(Enchantments.POWER, (int) 4);
		((itemstack)).addEnchantment(Enchantments.SHARPNESS, (int) 5);
		((itemstack)).addEnchantment(Enchantments.FLAME, (int) 4);
		((itemstack)).addEnchantment(Enchantments.KNOCKBACK, (int) 3);
	}
}
