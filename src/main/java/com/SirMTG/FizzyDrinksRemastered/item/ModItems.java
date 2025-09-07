package com.SirMTG.FizzyDrinksRemastered.item;

import com.SirMTG.FizzyDrinksRemastered.FizzyDrinksRemastered;
import com.SirMTG.FizzyDrinksRemastered.item.Drinks.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FizzyDrinksRemastered.MODID);

    public static final RegistryObject<Item> CO2CAN = ITEMS.register("co2can", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARBONATED_WATER = ITEMS.register("carbonated_water", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SODA_BOTTLE = ITEMS.register("soda_bottle", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> APPLE_SODA = ITEMS.register("apple_soda", () -> new DrinkItem(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> ROOT_BEER = ITEMS.register("root_beer", () -> new RootBeer(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> COCOA_SODA = ITEMS.register("cocoa_soda", () -> new CocoaSoda(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> MUSHROOM_SODA = ITEMS.register("mushroom_soda", () -> new MushroomSoda(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLDEN_APPLE_SODA = ITEMS.register("golden_apple_soda", () -> new GoldenAppleSoda(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> CREAM_PUMPKIN_SODA = ITEMS.register("cream_pumpkin_soda", () -> new CreamPumpkinSoda(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> DIAMOND_SODA = ITEMS.register("diamond_soda", () -> new DiamondSoda(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SLURM = ITEMS.register("slurm", () -> new Slurm(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> PUMPKIN_SODA = ITEMS.register("pumpkin_soda", () -> new PumpkinSoda(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SPIKED_PUMPKIN_SODA = ITEMS.register("spiked_pumpkin_soda", () -> new SpikedPumpkinSoda(new Item.Properties().stacksTo(16)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
