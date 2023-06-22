package net.panther0706.pkm.creativetabs;


import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.panther0706.pkm.PKM;
import net.panther0706.pkm.items.PKMCraftingItems;
import net.panther0706.pkm.items.PKMWeapons;

@Mod.EventBusSubscriber(modid = PKM.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PKMCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PKM.MODID);

    public static final RegistryObject<CreativeModeTab> PKM_TAB = TABS.register("pkm_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.literal("Panther's Katana Mod"))
                    .icon(PKMCraftingItems.MAKESHIFT_KATANA_HANDLE.get()::getDefaultInstance)
                    .displayItems((displayParameters, displayOutput) -> {
                        displayOutput.accept(PKMCraftingItems.MAKESHIFT_KATANA_HANDLE.get());
                        displayOutput.accept(PKMCraftingItems.IRON_KATANA_HANDLE.get());
                        displayOutput.accept(PKMCraftingItems.KATANA_HANDLE.get());
                        displayOutput.accept(PKMCraftingItems.ALANITE_BAR.get());
                        displayOutput.accept(PKMCraftingItems.ALANITE_ORE.get());
                        displayOutput.accept(PKMCraftingItems.STARLIGHT_BAR.get());
                        displayOutput.accept(PKMCraftingItems.STARLIGHT_ORE.get());
                        displayOutput.accept(PKMWeapons.WOODEN_KATANA.get());
                        displayOutput.accept(PKMWeapons.STONE_KATANA.get());
                        displayOutput.accept(PKMWeapons.IRON_KATANA.get());
                        displayOutput.accept(PKMWeapons.DIAMOND_KATANA.get());
                        displayOutput.accept(PKMWeapons.NETHERITE_KATANA.get());
                        displayOutput.accept(PKMWeapons.ALANITE_KATANA.get());
                        displayOutput.accept(PKMWeapons.STARLIGHT.get());
                        displayOutput.accept(PKMWeapons.SCORCHED_EARTH.get());
                        displayOutput.accept(PKMWeapons.DRAGONS_BREATH.get());
                    })
                    .build()
    );


    public static void Register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
