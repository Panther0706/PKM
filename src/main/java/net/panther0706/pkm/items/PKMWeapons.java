package net.panther0706.pkm.items;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.panther0706.pkm.*;

public class PKMWeapons {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PKM.MODID);

    public static final RegistryObject<PKMStatusEffectKatana> WOODEN_KATANA = ITEMS.register("wooden_katana",
            () -> new PKMStatusEffectKatana(net.minecraft.world.item.Tiers.WOOD, 2, 1.5f, new Item.Properties()));

    public static final RegistryObject<PKMStatusEffectKatana> STONE_KATANA = ITEMS.register("stone_katana",
            () -> new PKMStatusEffectKatana(net.minecraft.world.item.Tiers.STONE, 2, 1.5f, new Item.Properties()));

    public static final RegistryObject<PKMStatusEffectKatana> IRON_KATANA = ITEMS.register("iron_katana",
            () -> new PKMStatusEffectKatana(net.minecraft.world.item.Tiers.IRON, 2, 1.5f, new Item.Properties()));

    public static final RegistryObject<PKMStatusEffectKatana> DIAMOND_KATANA = ITEMS.register("diamond_katana",
            () -> new PKMStatusEffectKatana(net.minecraft.world.item.Tiers.DIAMOND, 2, 1.5f, new Item.Properties()));

    public static final RegistryObject<PKMStatusEffectKatana> NETHERITE_KATANA = ITEMS.register("netherite_katana",
            () -> new PKMStatusEffectKatana(net.minecraft.world.item.Tiers.NETHERITE, 2, 1.5f, new Item.Properties()));

    public static final RegistryObject<PKMAlaniteKatana> ALANITE_KATANA = ITEMS.register("alanite_katana",
            () -> new PKMAlaniteKatana(Tiers.ALANITE_TIER, 2, 1.5f, new Item.Properties()));

    public static final RegistryObject<PKMStarlight> STARLIGHT = ITEMS.register("starlight",
            () -> new PKMStarlight(Tiers.STARLIGHT_TIER, 2, 1.5f, new Item.Properties()));

    public static final RegistryObject<PKMScorchedEarth> SCORCHED_EARTH = ITEMS.register("scorched_earth",
            () -> new PKMScorchedEarth(Tiers.SCORCHED_EARTH_TIER, 2, 1.5f, new Item.Properties()));

    public static final RegistryObject<PKMDragonsBreath> DRAGONS_BREATH = ITEMS.register("dragons_breath",
            () -> new PKMDragonsBreath(Tiers.DRAGONS_BREATH_TIER, 2, 1.5f, new Item.Properties()));

    public static class Tiers {
        public static final Tier ALANITE_TIER = new ForgeTier(5, 3000, 10f, 5f, 15, null, () -> Ingredient.of(PKMCraftingItems.ALANITE_BAR.get()));
        public static final Tier STARLIGHT_TIER = new ForgeTier(6, 4500, 11f, 6f, 30, null, () -> Ingredient.of(PKMCraftingItems.STARLIGHT_BAR.get()));
        public static final Tier SCORCHED_EARTH_TIER = new ForgeTier(7, 6000, 12f, 7f, 50, null, () -> Ingredient.of(Items.BLAZE_ROD));
        public static final Tier DRAGONS_BREATH_TIER = new ForgeTier(8, 7500, 13f, 8f, 100, null, () -> Ingredient.of(Items.DRAGON_BREATH));
    }

    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
