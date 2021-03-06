package mod.kagic.entity.shardfusion;

import mod.kagic.entity.gem.GemCuts;
import mod.kagic.entity.gem.GemPlacements;
import mod.kagic.init.ModItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityHandBody extends EntityShardFusion {
	
	public EntityHandBody(World worldIn) {
		super(worldIn);
		this.setCutPlacement(GemCuts.SHARD, GemPlacements.BELLY);

		// Apply entity attributes.
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.6D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);
		this.droppedGemItem = ModItems.HANDBODY_GEM;
		this.droppedCrackedGemItem = ModItems.CRACKED_HANDBODY_GEM;
	}
}
