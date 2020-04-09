
package net.mcreator.vanilla.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.vanilla.VanillaElements;

@VanillaElements.ModElement.Tag
public class WeebItem extends VanillaElements.ModElement {
	@ObjectHolder("vanilla:weeb")
	public static final Item block = null;
	public WeebItem(VanillaElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, VanillaElements.sounds.get(new ResourceLocation("vanilla:weeb")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("weeb");
		}
	}
}
