
package com.justamango.volcanicevolution.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.Block;

import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

import com.justamango.volcanicevolution.procedure.ProcedureVolcanicTNTRedstoneOn;
import com.justamango.volcanicevolution.creativetab.TabVolcanicEvolution;
import com.justamango.volcanicevolution.ElementsVolcanicevolutionMod;

@ElementsVolcanicevolutionMod.ModElement.Tag
public class BlockVolcanicTNT extends ElementsVolcanicevolutionMod.ModElement {
	@GameRegistry.ObjectHolder("volcanicevolution:volcanictnt")
	public static final Block block = null;
	public BlockVolcanicTNT(ElementsVolcanicevolutionMod instance) {
		super(instance, 96);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("volcanictnt"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("volcanicevolution:volcanictnt", "inventory"));
	}
	public static class BlockCustom extends BlockFalling {
		public BlockCustom() {
			super(Material.TNT);
			setUnlocalizedName("volcanictnt");
			setSoundType(SoundType.GLASS);
			setHardness(1.5F);
			setResistance(15F);
			setLightLevel(0.1F);
			setLightOpacity(255);
			setCreativeTab(TabVolcanicEvolution.tab);
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("Kadaboooom...");
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			if (world.isBlockIndirectlyGettingPowered(new BlockPos(x, y, z)) > 0) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureVolcanicTNTRedstoneOn.executeProcedure($_dependencies);
				}
			} else {
			}
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
			super.randomDisplayTick(state, world, pos, random);
			EntityPlayer entity = Minecraft.getMinecraft().player;
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			int i = x;
			int j = y;
			int k = z;
			if (true)
				for (int l = 0; l < 4; ++l) {
					double d0 = (i + 0.5) + (random.nextFloat() - 0.5) * 0.5D * 20;
					double d1 = ((j + 0.7) + (random.nextFloat() - 0.5) * 0.5D) + 0.5;
					double d2 = (k + 0.5) + (random.nextFloat() - 0.5) * 0.5D * 20;
					world.spawnParticle(EnumParticleTypes.CRIT, d0, d1, d2, 0, 0, 0);
				}
		}
	}
}
