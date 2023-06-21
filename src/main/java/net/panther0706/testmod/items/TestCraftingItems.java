package net.panther0706.testmod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.panther0706.testmod.TestMod;

public class TestCraftingItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> ALANITE_BAR = ITEMS.register("alanite_bar",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALANITE_ORE = ITEMS.register("alanite_ore",
            () -> new Item(new Item.Properties()));


    //Tab icons
    public static final RegistryObject<Item> TERRARIA_TAB_ICON = ITEMS.register("terraria_tab_icon",
            () -> new Item(new Item.Properties()));

    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
