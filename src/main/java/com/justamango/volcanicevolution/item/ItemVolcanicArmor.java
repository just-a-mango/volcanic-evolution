
package com.justamango.volcanicevolution.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import com.justamango.volcanicevolution.creativetab.TabVolcanicEvolution;
import com.justamango.volcanicevolution.ElementsVolcanicevolutionMod;

@ElementsVolcanicevolutionMod.ModElement.Tag
public class ItemVolcanicArmor extends ElementsVolcanicevolutionMod.ModElement {
	@GameRegistry.ObjectHolder("volcanicevolution:volcanicarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("volcanicevolution:volcanicarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("volcanicevolution:volcanicarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("volcanicevolution:volcanicarmorboots")
	public static final Item boots = null;
	public ItemVolcanicArmor(ElementsVolcanicevolutionMod instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("VOLCANICARMOR", "volcanicevolution:volcanic", 126, new int[]{17, 50, 42, 17}, 76,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("volcanicarmorhelmet")
				.setRegistryName("volcanicarmorhelmet").setCreativeTab(TabVolcanicEvolution.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("volcanicarmorbody")
				.setRegistryName("volcanicarmorbody").setCreativeTab(TabVolcanicEvolution.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("volcanicarmorlegs")
				.setRegistryName("volcanicarmorlegs").setCreativeTab(TabVolcanicEvolution.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("volcanicarmorboots")
				.setRegistryName("volcanicarmorboots").setCreativeTab(TabVolcanicEvolution.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("volcanicevolution:volcanicarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("volcanicevolution:volcanicarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("volcanicevolution:volcanicarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("volcanicevolution:volcanicarmorboots", "inventory"));
	}
}
