package io.github.TheThermalTeam.scelerisque_navitas.common.item;


import io.github.TheThermalTeam.scelerisque_navitas.SN;
import io.github.TheThermalTeam.scelerisque_navitas.client.SNItemGroup;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SN.MODID);

    public static final RegistryObject<Item> AMETHYST = registerItem("amethyst",
            SNItemGroup.MainGroup);

    public static final RegistryObject<Item> AMETHYST_COIN = registerItem("amethyst_coin",
            SNItemGroup.MainGroup);

    private static <T extends Item> RegistryObject<T> registerItem(String name, CreativeModeTab tab) {
        RegistryObject<T> toReturn = (RegistryObject<T>) ITEMS.register(name,
                () -> new Item(new Item.Properties().tab(tab)));
        return toReturn;
    }
    
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
