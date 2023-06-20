package net.panther0706.testmod.items.crafting;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.panther0706.testmod.TestMod;

public class TestCraftingItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> ALANITE = ITEMS.register("alanite",
            () -> new Item(new Item.Properties()));

    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
