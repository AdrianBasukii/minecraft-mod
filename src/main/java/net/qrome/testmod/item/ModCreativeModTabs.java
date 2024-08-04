package net.qrome.testmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.qrome.testmod.TestMod;
import net.qrome.testmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MOD_ID);

//    public static final RegistryObject<CreativeModeTab> TEST_TAB = CREATIVE_MOD_TABS.register("test_tab",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack())
//                    .title(Component.translatable("creativetab.test_tab"))
//                    .displayItems((pParameters, pOutput) -> {
//
//                    })
//                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
