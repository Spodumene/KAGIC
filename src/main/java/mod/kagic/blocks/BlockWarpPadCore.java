package mod.kagic.blocks;

import mod.kagic.client.gui.KTGUIProxy;
import mod.kagic.init.KAGIC;
import mod.kagic.init.ModCreativeTabs;
import mod.kagic.init.ModItems;
import mod.kagic.tileentity.TileEntityWarpPadCore;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockWarpPadCore extends Block implements ITileEntityProvider {
	public BlockWarpPadCore() {
		super(Material.ROCK);
		this.setUnlocalizedName("warp_pad_core");
		this.setCreativeTab(ModCreativeTabs.CREATIVE_TAB_OTHER);
		
		this.setResistance(4);
		this.setHardness(0.8f);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityWarpPadCore();
	}

	private TileEntityWarpPadCore getTE(World world, BlockPos pos) {
		return (TileEntityWarpPadCore) world.getTileEntity(pos);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (worldIn.isRemote) {
			ItemStack heldItem = playerIn.getHeldItem(hand);
			
			if (heldItem.getItem() == ModItems.GEM_STAFF) {
				TileEntityWarpPadCore entityPad = this.getTE(worldIn, pos);
				entityPad.validateWarpPad();
				if (entityPad.isValidPad()) {
					playerIn.openGui(KAGIC.instance, KTGUIProxy.GUIWARPPADID, worldIn, pos.getX(), pos.getY(), pos.getZ());
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		((TileEntityWarpPadCore) world.getTileEntity(pos)).destroy();
		super.breakBlock(world, pos, state);
	}
}
