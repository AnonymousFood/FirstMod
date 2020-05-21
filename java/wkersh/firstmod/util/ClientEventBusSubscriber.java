package wkersh.firstmod.util;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import wkersh.firstmod.FirstMod;
import wkersh.firstmod.init.BlockInit;

@Mod.EventBusSubscriber(modid = FirstMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientStartup(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(BlockInit.COTTON_CROP.get(), RenderType.getCutout());
	}
}
