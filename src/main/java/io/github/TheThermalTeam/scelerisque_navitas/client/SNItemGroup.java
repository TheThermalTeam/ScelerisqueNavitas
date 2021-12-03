package io.github.TheThermalTeam.scelerisque_navitas.client;

import io.github.TheThermalTeam.scelerisque_navitas.common.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class SNItemGroup {
    public static final CreativeModeTab MainGroup = new CreativeModeTab("ScelerisqueNavitas")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.AMETHYST.get());
        }
    };
}
