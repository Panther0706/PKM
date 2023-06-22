package net.panther0706.pkm;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.panther0706.pkm.creativetabs.PKMCreativeTabs;
import net.panther0706.pkm.items.PKMCraftingItems;
import net.panther0706.pkm.items.PKMWeapons;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PKM.MODID)
public class PKM
{
    public static final String MODID = "pkm";
    private static final Logger LOGGER = LogUtils.getLogger();

    public PKM()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        PKMCraftingItems.Register(modEventBus);
        PKMCreativeTabs.Register(modEventBus);
        PKMWeapons.Register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            //Katanas
            //Katana Handle
            event.getEntries().putAfter(Items.STICK.getDefaultInstance(),
                    PKMCraftingItems.KATANA_HANDLE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //Iron Katana Handle
            event.getEntries().putAfter(Items.STICK.getDefaultInstance(),
                    PKMCraftingItems.IRON_KATANA_HANDLE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //Makeshift Katana Handle
            event.getEntries().putAfter(Items.STICK.getDefaultInstance(),
                    PKMCraftingItems.MAKESHIFT_KATANA_HANDLE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //Starlight Bar
            event.getEntries().putAfter(Items.NETHERITE_INGOT.getDefaultInstance(),
                    PKMCraftingItems.STARLIGHT_BAR.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //Starlight Ore
            event.getEntries().putAfter(Items.NETHERITE_INGOT.getDefaultInstance(),
                    PKMCraftingItems.STARLIGHT_ORE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //Alanite Bar
            event.getEntries().putAfter(Items.NETHERITE_INGOT.getDefaultInstance(),
                    PKMCraftingItems.ALANITE_BAR.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //Alanite Ore
            event.getEntries().putAfter(Items.NETHERITE_INGOT.getDefaultInstance(),
                    PKMCraftingItems.ALANITE_ORE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            //Katanas
            //Wooden Katana
            event.getEntries().putAfter(Items.WOODEN_SWORD.getDefaultInstance(),
                    PKMWeapons.WOODEN_KATANA.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //Stone Katana
            event.getEntries().putAfter(Items.STONE_SWORD.getDefaultInstance(),
                    PKMWeapons.STONE_KATANA.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //Iron Katana
            event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(),
                    PKMWeapons.IRON_KATANA.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //Diamond Katana
            event.getEntries().putAfter(Items.DIAMOND_SWORD.getDefaultInstance(),
                    PKMWeapons.DIAMOND_KATANA.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //Dragons Breath
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PKMWeapons.DRAGONS_BREATH.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //Scorched Earth
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PKMWeapons.SCORCHED_EARTH.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //Starlight
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PKMWeapons.STARLIGHT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //Alanite Katana
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PKMWeapons.ALANITE_KATANA.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //Netherite Katana
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PKMWeapons.NETHERITE_KATANA.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
