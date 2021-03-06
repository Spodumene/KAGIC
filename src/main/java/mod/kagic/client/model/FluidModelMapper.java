package mod.kagic.client.model;

import mod.kagic.init.KAGIC;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FluidModelMapper extends StateMapperBase {
	private final ModelResourceLocation FLUID_MODEL;

	public FluidModelMapper(Fluid fluid) {
		KAGIC.logger.info("Fluid name is " + fluid.getName());
		this.FLUID_MODEL = new ModelResourceLocation(KAGIC.MODID.toLowerCase() + ":kagicfluids", fluid.getName());
	}
	
	@Override
	protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
		return this.FLUID_MODEL;
	}
}
