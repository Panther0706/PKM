package net.panther0706.testmod.items;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.panther0706.testmod.TestMod;

public class TestToolItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<PickaxeItem> ALANITE_PICKAXE = ITEMS.register("alanite_pickaxe",
            () -> new PickaxeItem(TestWeaponItems.Tiers.ALANITE, 3, 2f, new Item.Properties()));
    public static final RegistryObject<AxeItem> ALANITE_AXE = ITEMS.register("alanite_axe",
            () -> new AxeItem(TestWeaponItems.Tiers.ALANITE, 7, 0.5f, new Item.Properties()));

    public static class Tiers {
        public static final Tier ALANITE = new ForgeTier(5, 3000, 10f, 5f, 13, null, () -> Ingredient.of(TestCraftingItems.ALANITE_BAR.get()));
    }

    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
