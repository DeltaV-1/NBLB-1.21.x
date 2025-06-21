package net.delta.nblb.datagen;

import net.delta.nblb.block.ModBlocks;
import net.delta.nblb.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', Items.POLISHED_ANDESITE)
                        .criterion(hasItem(Items.POLISHED_ANDESITE), conditionsFromItem(Items.POLISHED_ANDESITE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', Items.POLISHED_DIORITE)
                        .criterion(hasItem(Items.POLISHED_DIORITE), conditionsFromItem(Items.POLISHED_DIORITE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', Items.POLISHED_GRANITE)
                        .criterion(hasItem(Items.POLISHED_GRANITE), conditionsFromItem(Items.POLISHED_GRANITE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.SMOOTH_STONE_WALL, 6)  // <- sets output count
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Items.SMOOTH_STONE)
                        .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.STONE_WALL, 6)  // <- sets output count
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Items.STONE)
                        .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_WALL, 6)  // <- sets output count
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Items.CALCITE)
                        .criterion(hasItem(Items.CALCITE), conditionsFromItem(Items.CALCITE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_WALL, 6)  // <- sets output count
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', ModBlocks.POLISHED_CALCITE)
                        .criterion(hasItem(ModBlocks.POLISHED_CALCITE), conditionsFromItem(ModBlocks.POLISHED_CALCITE))
                        .offerTo(recipeExporter);


                createShaped(RecipeCategory.MISC, ModBlocks.SMOOTH_STONE_STAIRS, 4)  // <- sets output count
                        .pattern("S  ")
                        .pattern("SS ")
                        .pattern("SSS")
                        .input('S', Items.SMOOTH_STONE)
                        .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                        .offerTo(recipeExporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of("nblb", "smooth_stone_stairs_left")));
                createShaped(RecipeCategory.MISC, ModBlocks.SMOOTH_STONE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Items.SMOOTH_STONE)
                        .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                        .offerTo(recipeExporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of("nblb", "smooth_stone_stairs_right")));
                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_STAIRS, 4)  // <- sets output count
                        .pattern("S  ")
                        .pattern("SS ")
                        .pattern("SSS")
                        .input('S', Items.CALCITE)
                        .criterion(hasItem(Items.CALCITE), conditionsFromItem(Items.CALCITE))
                        .offerTo(recipeExporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of("nblb", "calcite_stairs_left")));
                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Items.CALCITE)
                        .criterion(hasItem(Items.CALCITE), conditionsFromItem(Items.CALCITE))
                        .offerTo(recipeExporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of("nblb", "calcite_stairs_right")));


                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_SLAB, 4)  // <- sets output count
                        .pattern("SSS")
                        .input('S', Items.CALCITE)
                        .criterion(hasItem(Items.CALCITE), conditionsFromItem(Items.CALCITE))
                        .offerTo(recipeExporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of("nblb", "calcite_slab")));

                createShaped(RecipeCategory.MISC, ModBlocks.CHISELED_CALCITE, 1)  // <- sets output count
                        .pattern("S")
                        .pattern("S")
                        .input('S', ModBlocks.CALCITE_SLAB)
                        .criterion(hasItem(ModBlocks.CALCITE_SLAB), conditionsFromItem(ModBlocks.CALCITE_SLAB))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE, 4)  // <- sets output count
                        .pattern("SS")
                        .pattern("SS")
                        .input('S', Blocks.CALCITE)
                        .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_SLAB, 6)  // <- sets output count
                        .pattern("SSS")
                        .input('S', ModBlocks.POLISHED_CALCITE)
                        .criterion(hasItem(ModBlocks.POLISHED_CALCITE), conditionsFromItem(ModBlocks.POLISHED_CALCITE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_STAIRS, 4)  // <- sets output count
                        .pattern("S  ")
                        .pattern("SS ")
                        .pattern("SSS")
                        .input('S', ModBlocks.POLISHED_CALCITE)
                        .criterion(hasItem(ModBlocks.POLISHED_CALCITE), conditionsFromItem(ModBlocks.POLISHED_CALCITE))
                        .offerTo(recipeExporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of("nblb", "polished_calcite_stairs_left")));
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', ModBlocks.POLISHED_CALCITE)
                        .criterion(hasItem(ModBlocks.POLISHED_CALCITE), conditionsFromItem(ModBlocks.POLISHED_CALCITE))
                        .offerTo(recipeExporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of("nblb", "polished_calcite_stairs_right")));

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.SMOOTH_STONE_STAIRS, Items.SMOOTH_STONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.STONE_WALL, Items.STONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_WALL, Items.ANDESITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_WALL, Items.DIORITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_WALL, Items.GRANITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_SLAB, Items.CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_STAIRS, Items.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_WALL, Items.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CHISELED_CALCITE, Items.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE, Items.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_SLAB, Items.CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_STAIRS, Items.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_WALL, Items.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE, 1);

            }
        };
    }

    @Override
    public String getName() {
        return "NBLB Recipes";
    }
}
