package com.SirMTG.FizzyDrinksRemastered.item;

import com.SirMTG.FizzyDrinksRemastered.FizzyDrinksRemastered;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FizzyDrinksRemastered.MODID);

    public static final RegistryObject<CreativeModeTab> FIZZY_DRINKS_TAB = CREATIVE_TAB.register("fizzy_drinks_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.SLURM.get()))
            .title(Component.translatable("creativetab.fizzy_drinks_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.SLURM.get());
                output.accept(ModItems.DIAMOND_SODA.get());
                output.accept(ModItems.APPLE_SODA.get());
                output.accept(ModItems.COCOA_SODA.get());
                output.accept(ModItems.CREAM_PUMPKIN_SODA.get());
                output.accept(ModItems.GOLDEN_APPLE_SODA.get());
                output.accept(ModItems.MUSHROOM_SODA.get());
                output.accept(ModItems.PUMPKIN_SODA.get());
                output.accept(ModItems.ROOT_BEER.get());
                output.accept(ModItems.SPIKED_PUMPKIN_SODA.get());
                output.accept(ModItems.CARBONATED_WATER.get());
                output.accept(ModItems.CO2CAN.get());
                output.accept(ModItems.SODA_BOTTLE.get());
                output.accept(ModItems.FILLED_SODA_BOTTLE.get());




            }).build());


    public static void register(IEventBus bus) {
        CREATIVE_TAB.register(bus);
    }
}