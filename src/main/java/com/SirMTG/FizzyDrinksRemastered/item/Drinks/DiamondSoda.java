package com.SirMTG.FizzyDrinksRemastered.item.Drinks;

import com.SirMTG.FizzyDrinksRemastered.item.DrinkItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class DiamondSoda extends DrinkItem {

    public DiamondSoda(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        if (entity instanceof Player player && !level.isClientSide) {
            stack.shrink(1);
            player.heal(20.0F);

            player.getInventory().add(new ItemStack(Items.GLASS_BOTTLE));
        }
        return stack;
    }

}
