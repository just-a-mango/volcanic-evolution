
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
public class ItemBlack_VolcanicArmor extends ElementsVolcanicevolutionMod.ModElement {
	@GameRegistry.ObjectHolder("volcanicevolution:black_volcanicarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("volcanicevolution:black_volcanicarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("volcanicevolution:black_volcanicarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("volcanicevolution:black_volcanicarmorboots")
	public static final Item boots = null;
	public ItemBlack_VolcanicArmor(ElementsVolcanicevolutionMod instance) {
		super(instance, 87);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BLACK_VOLCANICARMOR", "volcanicevolution:blackvolcanic", 150,
				new int[]{20, 60, 50, 20}, 90,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("black_volcanicarmorhelmet")
				.setRegistryName("black_volcanicarmorhelmet").setCreativeTab(TabVolcanicEvolution.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("black_volcanicarmorbody")
				.setRegistryName("black_volcanicarmorbody").setCreativeTab(TabVolcanicEvolution.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("black_volcanicarmorlegs")
				.setRegistryName("black_volcanicarmorlegs").setCreativeTab(TabVolcanicEvolution.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("black_volcanicarmorboots")
				.setRegistryName("black_volcanicarmorboots").setCreativeTab(TabVolcanicEvolution.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("volcanicevolution:black_volcanicarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("volcanicevolution:black_volcanicarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("volcanicevolution:black_volcanicarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("volcanicevolution:black_volcanicarmorboots", "inventory"));
	}
}
