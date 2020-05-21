package wkersh.firstmod.init;


import wkersh.firstmod.FirstMod;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;


public class ItemInitOld 
{
/*
	// Items
	public static final Item cobalt = null;
	public static final Item wool_denim = null;
	
	// Tools
	public static final Item cobalt_sword = null;
	public static final Item cobalt_pickaxe = null;
	public static final Item cobalt_axe = null;
	public static final Item cobalt_shovel = null;
	public static final Item cobalt_hoe = null;
	
	// Armor
	public static final Item jeans = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) 
	{
		// Items
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("cobalt"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("wool_denim"));
		
		// Tools
		event.getRegistry().register(new SwordItem(ModItemTier.COBALT, 8, 2.0F, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("cobalt_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.COBALT, 5, 2.0F, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("cobalt_pickaxe"));
		
		// Armor
		event.getRegistry().register(new ArmorItem(ArmorMaterial.LEATHER, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("jeans"));
		
	}
	
	public enum ModItemTier implements IItemTier
	{
		COBALT(4, 1800, 13.0F, 8.0F, 25, () -> {
			return Ingredient.fromItems(ItemInitOld.cobalt);
		});
		
		private final int harvestLevel, maxUses, enchantability;
		private final float attackDamage, efficiency;
		private final LazyValue<Ingredient> repairMaterial;
		
		
		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}


		@Override
		public int getMaxUses() {
			return maxUses;
		}


		@Override
		public float getEfficiency() {
			return efficiency;
		}


		@Override
		public float getAttackDamage() {
			return attackDamage;
		}


		@Override
		public int getHarvestLevel() {
			return harvestLevel;
		}


		@Override
		public int getEnchantability() {
			return enchantability;
		}


		@Override
		public Ingredient getRepairMaterial() {
			return repairMaterial.getValue();
		}
	}
	*/
}
