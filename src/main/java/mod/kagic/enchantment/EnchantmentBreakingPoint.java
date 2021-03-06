package mod.kagic.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentBreakingPoint extends Enchantment {
	public EnchantmentBreakingPoint() {
		super(Rarity.RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[]{EntityEquipmentSlot.HEAD, EntityEquipmentSlot.CHEST, EntityEquipmentSlot.LEGS, EntityEquipmentSlot.FEET});
		this.setRegistryName(new ResourceLocation("kagic:breaking_point"));
		this.setName("breaking_point.name");
	}
	@Override
	public boolean isAllowedOnBooks() {
		return true;
	}
	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return 1 + (enchantmentLevel - 1) * 10;
	}
	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return this.getMinEnchantability(enchantmentLevel) + 15;
	}
	@Override
	public int getMaxLevel() {
		return 1;
	}
}
