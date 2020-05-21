package wkersh.firstmod.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import wkersh.firstmod.FirstMod;
import wkersh.firstmod.objects.blocks.CottonCrop;
import wkersh.firstmod.objects.blocks.Loom;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);
	
	public static final RegistryObject<Block> COBALT_ORE = BLOCKS.register("cobalt_ore", () -> new Block(Block.Properties.create(Material.ROCK)));
	
	public static final RegistryObject<Block> COTTON_CROP = BLOCKS.register("cotton_crop", () -> new CottonCrop(Block.Properties.from(Blocks.WHEAT)));
	
	public static final RegistryObject<Block> LOOM = BLOCKS.register("loom", () -> new Loom(Block.Properties.create(Material.WOOD)));
}
