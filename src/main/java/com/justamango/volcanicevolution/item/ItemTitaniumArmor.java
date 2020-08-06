
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
public class ItemTitaniumArmor extends ElementsVolcanicevolutionMod.ModElement {
	@GameRegistry.ObjectHolder("volcanicevolution:titaniumarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("volcanicevolution:titaniumarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("volcanicevolution:titaniumarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("volcanicevolution:titaniumarmorboots")
	public static final Item boots = null;
	public ItemTitaniumArmor(ElementsVolcanicevolutionMod instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TITANIUMARMOR", "volcanicevolution:titanium", 96, new int[]{13, 38, 32, 13}, 58,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("titaniumarmorhelmet")
				.setRegistryName("titaniumarmorhelmet").setCreativeTab(TabVolcanicEvolution.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("titaniumarmorbody")
				.setRegistryName("titaniumarmorbody").setCreativeTab(TabVolcanicEvolution.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("titaniumarmorlegs")
				.setRegistryName("titaniumarmorlegs").setCreativeTab(TabVolcanicEvolution.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("titaniumarmorboots")
				.setRegistryName("titaniumarmorboots").setCreativeTab(TabVolcanicEvolution.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("volcanicevolution:titaniumarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("volcanicevolution:titaniumarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("volcanicevolution:titaniumarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("volcanicevolution:titaniumarmorboots", "inventory"));
	}
}
