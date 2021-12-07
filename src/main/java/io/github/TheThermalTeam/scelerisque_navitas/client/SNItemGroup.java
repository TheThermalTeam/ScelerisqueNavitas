package io.github.TheThermalTeam.scelerisque_navitas.client;

import io.github.TheThermalTeam.scelerisque_navitas.common.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class SNItemGroup {
    public static final ItemGroup MainGroup = new ItemGroup("ScelerisqueNavitas")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.AMETHYST.get());
        }
    };
}
