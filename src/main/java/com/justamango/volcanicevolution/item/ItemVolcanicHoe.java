
package com.justamango.volcanicevolution.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

import com.justamango.volcanicevolution.creativetab.TabVolcanicEvolution;
import com.justamango.volcanicevolution.ElementsVolcanicevolutionMod;

@ElementsVolcanicevolutionMod.ModElement.Tag
public class ItemVolcanicHoe extends ElementsVolcanicevolutionMod.ModElement {
	@GameRegistry.ObjectHolder("volcanicevolution:volcanichoe")
	public static final Item block = null;
	public ItemVolcanicHoe(ElementsVolcanicevolutionMod instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("VOLCANICHOE", 17, 4920, 22f, 0f, 118)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 17);
				return ret.keySet();
			}
		}.setUnlocalizedName("volcanichoe").setRegistryName("volcanichoe").setCreativeTab(TabVolcanicEvolution.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("volcanicevolution:volcanichoe", "inventory"));
	}
}
