package net.panther0706.pkm.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.panther0706.pkm.PKM;

public class PKMCraftingItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PKM.MODID);

    public static final RegistryObject<Item> MAKESHIFT_KATANA_HANDLE = ITEMS.register("makeshift_katana_handle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_KATANA_HANDLE = ITEMS.register("iron_katana_handle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KATANA_HANDLE = ITEMS.register("katana_handle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALANITE_BAR = ITEMS.register("alanite_bar",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALANITE_ORE = ITEMS.register("alanite_ore",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STARLIGHT_BAR = ITEMS.register("starlight_bar",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STARLIGHT_ORE = ITEMS.register("starlight_ore",
            () -> new Item(new Item.Properties()));

    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
