package mod.kagic.items;

import mod.kagic.init.ModCreativeTabs;
import net.minecraft.item.Item;

public class ItemActiveGemShard extends Item {
	public ItemActiveGemShard() {
		super();
		this.setUnlocalizedName("active_gem_shard");
		this.setCreativeTab(ModCreativeTabs.CREATIVE_TAB_OTHER);
		this.setMaxStackSize(64);
	}
}
