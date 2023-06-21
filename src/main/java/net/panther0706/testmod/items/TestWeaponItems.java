package net.panther0706.testmod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.panther0706.testmod.TestMod;

public class TestWeaponItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    //Allanite
    public static final RegistryObject<SwordItem> ALANITE_SWORD = ITEMS.register("alanite_sword",
            () -> new SwordItem(Tiers.ALANITE, 5, 1, new Item.Properties()));

    //Starlight
    public static final RegistryObject<SwordItem> STARLIGHT_SWORD = ITEMS.register("starlight_sword",
            () -> new SwordItem(Tiers.STARLIGHT, 6, 1.5f, new Item.Properties()));

    public static class Tiers {
        public static final Tier ALANITE = new ForgeTier(5, 3000, 10f, 5f, 15, null, () -> Ingredient.of(TestCraftingItems.ALANITE_BAR.get()));
        public static final Tier STARLIGHT = new ForgeTier(6, 4500, 11f, 6f, 30, null, () -> Ingredient.of(TestCraftingItems.ALANITE_BAR.get()));
    }

    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
