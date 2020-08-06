
package com.justamango.volcanicevolution.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import com.justamango.volcanicevolution.item.ItemVolcanicIngot;
import com.justamango.volcanicevolution.ElementsVolcanicevolutionMod;

@ElementsVolcanicevolutionMod.ModElement.Tag
public class TabVolcanicEvolution extends ElementsVolcanicevolutionMod.ModElement {
	public TabVolcanicEvolution(ElementsVolcanicevolutionMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabvolcanicevolution") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemVolcanicIngot.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
