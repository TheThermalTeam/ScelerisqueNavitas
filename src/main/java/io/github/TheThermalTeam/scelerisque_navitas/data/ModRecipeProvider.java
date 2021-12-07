package io.github.TheThermalTeam.scelerisque_navitas.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }


        //ShapedRecipeBuilder.shaped(ModItems.AMETHYST_COIN.get()).define('T',ModItems.AMETHYST.get()).pattern("").pattern("T").pattern("").
}
