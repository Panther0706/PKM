package net.panther0706.testmod.creativetabs;


import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.panther0706.testmod.TestMod;
import net.panther0706.testmod.items.TestCraftingItems;
import net.panther0706.testmod.items.TestToolItems;
import net.panther0706.testmod.items.TestWeaponItems;

@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TestCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MODID);

    public static final RegistryObject<CreativeModeTab> TERRARIA_TAB = TABS.register("terraria_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("Terraria"))
                    .icon(TestCraftingItems.TERRARIA_TAB_ICON.get()::getDefaultInstance)
                    .displayItems((displayParameters, displayOutput) -> {
                        displayOutput.accept(TestCraftingItems.ALANITE_BAR.get());
                        displayOutput.accept(TestCraftingItems.ALANITE_ORE.get());
                        displayOutput.accept(TestWeaponItems.ALANITE_SWORD.get());
                        displayOutput.accept(TestToolItems.ALANITE_PICKAXE.get());
                        displayOutput.accept(TestToolItems.ALANITE_AXE.get());
                        displayOutput.accept(TestWeaponItems.STARLIGHT_SWORD.get());
                    })
                    .build()
    );

    public static void Register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
