package net.delta.nblb.datagen;

import net.delta.nblb.block.ModBlocks;
import net.delta.nblb.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.item.ItemConvertible;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_WALL)
                .pattern("PPP")
                .pattern("PPP")
                .input('P', Items.POLISHED_ANDESITE)
                .criterion(hasItem(Items.POLISHED_ANDESITE), conditionsFromItem(Items.POLISHED_ANDESITE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_WALL)
                .pattern("PPP")
                .pattern("PPP")
                .input('P', Items.POLISHED_DIORITE)
                .criterion(hasItem(Items.POLISHED_DIORITE), conditionsFromItem(Items.POLISHED_DIORITE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_WALL)
                .pattern("PPP")
                .pattern("PPP")
                .input('P', Items.POLISHED_GRANITE)
                .criterion(hasItem(Items.POLISHED_GRANITE), conditionsFromItem(Items.POLISHED_GRANITE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SMOOTH_STONE_WALL)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', Items.SMOOTH_STONE)
                .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STONE_WALL)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .offerTo(recipeExporter);
    }
}
