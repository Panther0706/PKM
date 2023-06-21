package net.panther0706.testmod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.panther0706.testmod.creativetabs.TestCreativeTabs;
import net.panther0706.testmod.items.TestCraftingItems;
import net.panther0706.testmod.items.TestToolItems;
import net.panther0706.testmod.items.TestWeaponItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TestMod.MODID)
public class TestMod
{
    public static final String MODID = "testmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TestMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        TestCraftingItems.Register(modEventBus);
        TestCreativeTabs.Register(modEventBus);
        TestWeaponItems.Register(modEventBus);
        TestToolItems.Register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(TestCraftingItems.ALANITE_BAR);
            event.accept(TestCraftingItems.ALANITE_ORE);
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(TestWeaponItems.ALANITE_SWORD);
            event.accept(TestWeaponItems.STARLIGHT_SWORD);
        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(TestToolItems.ALANITE_PICKAXE);
            event.accept(TestToolItems.ALANITE_AXE);
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
