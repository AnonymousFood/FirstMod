package wkersh.firstmod.init;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import wkersh.firstmod.FirstMod;
import wkersh.firstmod.objects.blocks.Loom;
import wkersh.firstmod.tileentity.LoomTileEntity;

public class TileEntityInit {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(
			ForgeRegistries.TILE_ENTITIES, FirstMod.MOD_ID);
	
	public static final RegistryObject<TileEntityType<LoomTileEntity>> LOOM = TILE_ENTITY_TYPES.register("loom", () ->
	TileEntityType.Builder.create(LoomTileEntity::new, BlockInit.LOOM.get())
			.build(null)
			);
}
