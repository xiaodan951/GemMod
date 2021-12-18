package net.xiaodan951.gemmod.item.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.xiaodan951.gemmod.Utils;
import net.xiaodan951.gemmod.group.ModGroup;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new ArmorItem(GemmodArmorMaterial.OBSIDIAN, EquipmentSlotType.HEAD, new Item.Properties().group(ModGroup.GemmodWeapons)));
    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", () -> new ArmorItem(GemmodArmorMaterial.OBSIDIAN, EquipmentSlotType.CHEST, new Item.Properties().group(ModGroup.GemmodWeapons)));
    public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", () -> new ArmorItem(GemmodArmorMaterial.OBSIDIAN, EquipmentSlotType.LEGS, new Item.Properties().group(ModGroup.GemmodWeapons)));
    public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", () -> new ArmorItem(GemmodArmorMaterial.OBSIDIAN, EquipmentSlotType.FEET, new Item.Properties().group(ModGroup.GemmodWeapons)));

}
