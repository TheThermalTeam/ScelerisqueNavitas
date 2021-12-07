package io.github.TheThermalTeam.scelerisque_navitas.common.block;

import io.github.TheThermalTeam.scelerisque_navitas.SN;
import io.github.TheThermalTeam.scelerisque_navitas.client.SNItemGroup;
import io.github.TheThermalTeam.scelerisque_navitas.common.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, SN.MODID);

    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(10.0f,15.0f).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()),
            SNItemGroup.MainGroup);

    /*public static final void testing() {
        AMETHYST_ORE.get().
    }*/

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, ItemGroup tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, ItemGroup tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(tab)));
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(SNItemGroup.MainGroup)));
    }

    public static void register (IEventBus bus) {
        BLOCKS.register(bus);
    }
}
