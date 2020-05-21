package wkersh.firstmod.init;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import wkersh.firstmod.FirstMod;
import wkersh.firstmod.util.enums.ModArmorMaterials;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, FirstMod.MOD_ID);
	
	// Items
	public static final RegistryObject<Item> COBALT = ITEMS.register("cobalt", 
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> WOOL_DENIM = ITEMS.register("wool_denim", 
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> COTTON = ITEMS.register("cotton", 
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> COTTON_SEED = ITEMS.register("cotton_seed", 
			() -> new BlockItem(BlockInit.COTTON_CROP.get(), new Item.Properties().group(ItemGroup.MISC)));
	
	// Tools
	public static final RegistryObject<SwordItem> COBALT_SWORD = ITEMS.register("cobalt_sword", 
			() -> new SwordItem(ModItemTier.COBALT, 8, 2.0F, new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<PickaxeItem> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", 
			() -> new PickaxeItem(ModItemTier.COBALT, 5, 2.0F, new Item.Properties().group(ItemGroup.TOOLS)));
	
	
	public static final RegistryObject<SwordItem> PALLADIUM_SWORD = ITEMS.register("palladium_sword", 
			() -> new SwordItem(ModItemTier.COBALT, 8, 2.0F, new Item.Properties().group(ItemGroup.COMBAT)));
	
	// Armor
	public static final RegistryObject<Item> COBALT_BOOTS = ITEMS.register("cobalt_boots", () -> new ArmorItem(ModArmorMaterials.COBALT, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings", () -> new ArmorItem(ModArmorMaterials.COBALT, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate", () -> new ArmorItem(ModArmorMaterials.COBALT, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> COBALT_HELMET = ITEMS.register("cobalt_helmet", () -> new ArmorItem(ModArmorMaterials.COBALT, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
	
	
	
	public enum ModItemTier implements IItemTier
	{
		COBALT(4, 1800, 13.0F, 8.0F, 25, () -> {
			return Ingredient.fromItems(ItemInit.COBALT.get());
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
}
