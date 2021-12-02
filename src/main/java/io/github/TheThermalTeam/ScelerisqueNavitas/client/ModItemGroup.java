package io.github.TheThermalTeam.ScelerisqueNavitas.client;

import io.github.TheThermalTeam.ScelerisqueNavitas.common.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class ModItemGroup {
    public static final CreativeModeTab MyGroup = new CreativeModeTab("ScelerisqueNavitas")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.AMETHYST.get());
        }
    };
}
