package net.greatcow.createsimplecoins.item;

import net.greatcow.createsimplecoins.Create_Simple_Coins;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Create_Simple_Coins.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATE_SIMPLE_COINS_TAB = CREATIVE_MODE_TABS.register("create_simple_coins_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MEGA_COIN.get()))
                    .title(Component.translatable("creativetab.create_simple_coins_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.COPPER_COIN.get());
                        pOutput.accept(ModItems.IRON_COIN.get());
                        pOutput.accept(ModItems.GOLD_COIN.get());
                        pOutput.accept(ModItems.DIAMOND_COIN.get());
                        pOutput.accept(ModItems.NETHERITE_COIN.get());




                        pOutput.accept(ModItems.DEFECTIVE_COPPER_COIN.get());
                        pOutput.accept(ModItems.DEFECTIVE_IRON_COIN.get());
                        pOutput.accept(ModItems.DEFECTIVE_GOLD_COIN.get());
                        pOutput.accept(ModItems.DEFECTIVE_DIAMOND_COIN.get());
                        pOutput.accept(ModItems.DEFECTIVE_NETHERITE_COIN.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
