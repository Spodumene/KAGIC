package mod.kagic.items;

import mod.kagic.init.ModCreativeTabs;
import net.minecraft.item.Item;

public class ItemInactiveGemBase extends Item {
	public ItemInactiveGemBase() {
		super();
		this.setUnlocalizedName("inactive_gem_base");
		this.setCreativeTab(ModCreativeTabs.CREATIVE_TAB_OTHER);
		this.setMaxStackSize(16);
	}
}
