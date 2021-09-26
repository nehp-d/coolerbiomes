
package net.mcreator.coolerbiomes.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.coolerbiomes.block.MossBlock;
import net.mcreator.coolerbiomes.CoolerBiomesModElements;

@CoolerBiomesModElements.ModElement.Tag
public class NatureTabItemGroup extends CoolerBiomesModElements.ModElement {
	public NatureTabItemGroup(CoolerBiomesModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnature_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MossBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
