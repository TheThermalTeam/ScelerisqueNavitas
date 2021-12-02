package io.github.TheThermalTeam.ScelerisqueNavitas.common.block;

import io.github.TheThermalTeam.ScelerisqueNavitas.SN;
import io.github.TheThermalTeam.ScelerisqueNavitas.client.ModItemGroup;
import io.github.TheThermalTeam.ScelerisqueNavitas.common.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, SN.MODID);

    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
            () -> new Block(ABlock.Properties.create(Material.STONE).harvestLevel(2).harvestTool(/*PICKAXE*/).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ModItemGroup.MyGroup)));
    }

    public static void register (IEventBus bus) {
        BLOCKS.register(bus);
    }
}
