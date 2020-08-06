
package com.justamango.volcanicevolution.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

import com.justamango.volcanicevolution.creativetab.TabVolcanicEvolution;
import com.justamango.volcanicevolution.ElementsVolcanicevolutionMod;

@ElementsVolcanicevolutionMod.ModElement.Tag
public class ItemBlack_VolcanicShovel extends ElementsVolcanicevolutionMod.ModElement {
	@GameRegistry.ObjectHolder("volcanicevolution:black_volcanicshovel")
	public static final Item block = null;
	public ItemBlack_VolcanicShovel(ElementsVolcanicevolutionMod instance) {
		super(instance, 80);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("BLACK_VOLCANICSHOVEL", 20, 6280, 24f, 16f, 140)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 20);
				return ret.keySet();
			}
		}.setUnlocalizedName("black_volcanicshovel").setRegistryName("black_volcanicshovel").setCreativeTab(TabVolcanicEvolution.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("volcanicevolution:black_volcanicshovel", "inventory"));
	}
}
