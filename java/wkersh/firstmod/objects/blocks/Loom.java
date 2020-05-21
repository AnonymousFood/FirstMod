package wkersh.firstmod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import wkersh.firstmod.init.TileEntityInit;

public class Loom extends Block {

	public Loom(final Properties properties) {
		super(properties);
	}
	
	@Override
	public boolean hasTileEntity(final BlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(final BlockState state, final IBlockReader world) {
		return TileEntityInit.LOOM.get().create();
	}

}
