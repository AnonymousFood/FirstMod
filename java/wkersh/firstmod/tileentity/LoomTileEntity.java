package wkersh.firstmod.tileentity;

import javax.annotation.Nonnull;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.items.ItemStackHandler;
import wkersh.firstmod.init.ItemInit;
import wkersh.firstmod.init.TileEntityInit;

public class LoomTileEntity extends TileEntity implements ITickableTileEntity {
	
	public int tick;
	boolean initialized = false;
	public static final int INPUT_SLOT = 0;
	public static final int OUTPUT_SLOT = 1;
	
	private static final String INVENTORY_TAG = "inventory";
	private static final String LOOM_TIME_LEFT_TAG = "loomTimeLeft";
	private static final String MAX_LOOM_TIME_TAG = "loomTimeLeft";
	
	public final ItemStackHandler inventory = new ItemStackHandler(3) {
		@Override
		public boolean isItemValid(final int slot, @Nonnull final ItemStack stack) {
			switch (slot) {
				case INPUT_SLOT:
					return isInput(stack);
				case OUTPUT_SLOT:
					return isOutput(stack);
				default:
					return false;
			}
		}
		
		private boolean isInput(ItemStack stack) {
			if(stack.getItem() == Item.getItemById(35)) {
				return true;
			}
			return false;
		}

		private boolean isOutput(ItemStack stack) {
			if(stack.getItem() == ItemInit.WOOL_DENIM.get()) {
				return true;
			}
			return false;

		}

		@Override
		protected void onContentsChanged(final int slot) {
			super.onContentsChanged(slot);
			// Mark the tile entity as having changed whenever its inventory changes.
			// "markDirty" tells vanilla that the chunk containing the tile entity has
			// changed and means the game will save the chunk to disk later.
			LoomTileEntity.this.markDirty();
		}
	};

	public LoomTileEntity(final TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
	}
	
	public LoomTileEntity() {
		this(TileEntityInit.LOOM.get());
	}
	
	@Override
	public void tick() {
		if(!initialized) {
			init();
		}
		tick++;
		if(tick == 40) {
			tick = 0;
			execute();
			System.out.println("tick " + tick);
		} 
 	}

	private void execute() {

	}

	private void init() {
		initialized = true;
		tick = 0;
	}
	
	@Override
	public void read(CompoundNBT nbt) {
		
	}
	
	@Override
	public CompoundNBT write(CompoundNBT nbt) {
		return nbt;
		
	}
	
	

}
