package com.SirMTG.FizzyDrinksRemastered.item.Drinks;

import com.SirMTG.FizzyDrinksRemastered.item.DrinkItem;
import com.SirMTG.FizzyDrinksRemastered.item.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SpikedPumpkinSoda extends DrinkItem {

    public SpikedPumpkinSoda(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        if (entity instanceof Player player && !level.isClientSide) {
            stack.shrink(1);
            player.heal(6.0F);

            player.getInventory().add(new ItemStack(ModItems.SODA_BOTTLE.get()));
        }
        return stack;
    }

}
