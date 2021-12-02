package io.github.TheThermalTeam.ScelerisqueNavitas.common.item;


import io.github.TheThermalTeam.ScelerisqueNavitas.SN;
import io.github.TheThermalTeam.ScelerisqueNavitas.client.ModItemGroup;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SN.MODID);

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().tab(ModItemGroup.MyGroup)));

    public static final RegistryObject<Item> AMETHYST_COIN = ITEMS.register("amethyst_coin",
            () -> new Item(new Item.Properties().tab(ModItemGroup.MyGroup)));
    
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
