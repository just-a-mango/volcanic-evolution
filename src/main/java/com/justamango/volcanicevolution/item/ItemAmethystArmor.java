
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
public class ItemAmethystArmor extends ElementsVolcanicevolutionMod.ModElement {
	@GameRegistry.ObjectHolder("volcanicevolution:amethystarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("volcanicevolution:amethystarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("volcanicevolution:amethystarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("volcanicevolution:amethystarmorboots")
	public static final Item boots = null;
	public ItemAmethystArmor(ElementsVolcanicevolutionMod instance) {
		super(instance, 60);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("AMETHYSTARMOR", "volcanicevolution:amethyst", 69, new int[]{9, 28, 23, 9}, 41,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("amethystarmorhelmet")
				.setRegistryName("amethystarmorhelmet").setCreativeTab(TabVolcanicEvolution.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("amethystarmorbody")
				.setRegistryName("amethystarmorbody").setCreativeTab(TabVolcanicEvolution.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("amethystarmorlegs")
				.setRegistryName("amethystarmorlegs").setCreativeTab(TabVolcanicEvolution.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("amethystarmorboots")
				.setRegistryName("amethystarmorboots").setCreativeTab(TabVolcanicEvolution.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("volcanicevolution:amethystarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("volcanicevolution:amethystarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("volcanicevolution:amethystarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("volcanicevolution:amethystarmorboots", "inventory"));
	}
}
