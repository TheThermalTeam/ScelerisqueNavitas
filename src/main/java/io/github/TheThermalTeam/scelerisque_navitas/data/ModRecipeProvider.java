package io.github.TheThermalTeam.scelerisque_navitas.data;

import io.github.TheThermalTeam.scelerisque_navitas.common.block.ModBlocks;
import io.github.TheThermalTeam.scelerisque_navitas.common.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> finished) {
        ShapedRecipeBuilder.shaped(ModItems.AMETHYST_COIN.get()).define('T',ModItems.AMETHYST.get()).pattern("").pattern("T").pattern("").

    }
}
