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
                createShaped(RecipeCategory.MISC, ModBlocks.END_STONE_WALL, 6)  // <- sets output count
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.END_STONE)
                        .criterion(hasItem(Blocks.END_STONE), conditionsFromItem(Blocks.END_STONE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_WALL, 6)  // <- sets output count
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', ModBlocks.CALCITE_BRICKS)
                        .criterion(hasItem(ModBlocks.CALCITE_BRICKS), conditionsFromItem(ModBlocks.CALCITE_BRICKS))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.SMOOTH_STONE_STAIRS, 4)  // <- sets output count
                        .pattern("S  ")
                        .pattern("SS ")
                        .pattern("SSS")
                        .input('S', Items.SMOOTH_STONE)
                        .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.NETHERRACK_STAIRS, 4)
                        .pattern("S  ")
                        .pattern("SS ")
                        .pattern("SSS")
                        .input('S', Items.NETHERRACK)
                        .criterion(hasItem(Items.NETHERRACK), conditionsFromItem(Items.NETHERRACK))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_STAIRS, 4)  // <- sets output count
                        .pattern("S  ")
                        .pattern("SS ")
                        .pattern("SSS")
                        .input('S', Items.CALCITE)
                        .criterion(hasItem(Items.CALCITE), conditionsFromItem(Items.CALCITE))
                        .offerTo(recipeExporter);


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
                createShaped(RecipeCategory.MISC, ModBlocks.CHISELED_CALCITE_BRICKS, 1)  // <- sets output count
                        .pattern("S")
                        .pattern("S")
                        .input('S', ModBlocks.CALCITE_BRICK_SLAB)
                        .criterion(hasItem(ModBlocks.CALCITE_BRICK_SLAB), conditionsFromItem(ModBlocks.CALCITE_BRICK_SLAB))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE, 4)  // <- sets output count
                        .pattern("SS")
                        .pattern("SS")
                        .input('S', Blocks.CALCITE)
                        .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_BRICKS, 4)  // <- sets output count
                        .pattern("SS")
                        .pattern("SS")
                        .input('S', ModBlocks.POLISHED_CALCITE)
                        .criterion(hasItem(ModBlocks.POLISHED_CALCITE), conditionsFromItem(ModBlocks.POLISHED_CALCITE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_SLAB, 6)  // <- sets output count
                        .pattern("SSS")
                        .input('S', ModBlocks.POLISHED_CALCITE)
                        .criterion(hasItem(ModBlocks.POLISHED_CALCITE), conditionsFromItem(ModBlocks.POLISHED_CALCITE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.END_STONE_SLAB, 6)  // <- sets output count
                        .pattern("SSS")
                        .input('S', Blocks.END_STONE)
                        .criterion(hasItem(Blocks.END_STONE), conditionsFromItem(Blocks.END_STONE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_SLAB, 6)  // <- sets output count
                        .pattern("SSS")
                        .input('S', ModBlocks.CALCITE_BRICKS)
                        .criterion(hasItem(ModBlocks.CALCITE_BRICKS), conditionsFromItem(ModBlocks.CALCITE_BRICKS))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_STAIRS, 4)  // <- sets output count
                        .pattern("S  ")
                        .pattern("SS ")
                        .pattern("SSS")
                        .input('S', ModBlocks.POLISHED_CALCITE)
                        .criterion(hasItem(ModBlocks.POLISHED_CALCITE), conditionsFromItem(ModBlocks.POLISHED_CALCITE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_STAIRS, 4)  // <- sets output count
                        .pattern("S  ")
                        .pattern("SS ")
                        .pattern("SSS")
                        .input('S', ModBlocks.CALCITE_BRICKS)
                        .criterion(hasItem(ModBlocks.CALCITE_BRICKS), conditionsFromItem(ModBlocks.CALCITE_BRICKS))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.END_STONE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.END_STONE)
                        .criterion(hasItem(Blocks.END_STONE), conditionsFromItem(Blocks.END_STONE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.RED_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.RED_CONCRETE)
                        .criterion(hasItem(Blocks.RED_CONCRETE), conditionsFromItem(Blocks.RED_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.ORANGE_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.ORANGE_CONCRETE)
                        .criterion(hasItem(Blocks.ORANGE_CONCRETE), conditionsFromItem(Blocks.ORANGE_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.YELLOW_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.YELLOW_CONCRETE)
                        .criterion(hasItem(Blocks.YELLOW_CONCRETE), conditionsFromItem(Blocks.YELLOW_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIME_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.LIME_CONCRETE)
                        .criterion(hasItem(Blocks.LIME_CONCRETE), conditionsFromItem(Blocks.LIME_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.GREEN_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.GREEN_CONCRETE)
                        .criterion(hasItem(Blocks.GREEN_CONCRETE), conditionsFromItem(Blocks.GREEN_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CYAN_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.CYAN_CONCRETE)
                        .criterion(hasItem(Blocks.CYAN_CONCRETE), conditionsFromItem(Blocks.CYAN_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.LIGHT_BLUE_CONCRETE)
                        .criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE), conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BLUE_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.BLUE_CONCRETE)
                        .criterion(hasItem(Blocks.BLUE_CONCRETE), conditionsFromItem(Blocks.BLUE_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PURPLE_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.PURPLE_CONCRETE)
                        .criterion(hasItem(Blocks.PURPLE_CONCRETE), conditionsFromItem(Blocks.PURPLE_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.MAGENTA_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.MAGENTA_CONCRETE)
                        .criterion(hasItem(Blocks.MAGENTA_CONCRETE), conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PINK_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.PINK_CONCRETE)
                        .criterion(hasItem(Blocks.PINK_CONCRETE), conditionsFromItem(Blocks.PINK_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BROWN_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.BROWN_CONCRETE)
                        .criterion(hasItem(Blocks.BROWN_CONCRETE), conditionsFromItem(Blocks.BROWN_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.WHITE_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.WHITE_CONCRETE)
                        .criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BLACK_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.BLACK_CONCRETE)
                        .criterion(hasItem(Blocks.BLACK_CONCRETE), conditionsFromItem(Blocks.BLACK_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.GRAY_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.GRAY_CONCRETE)
                        .criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.LIGHT_GRAY_CONCRETE)
                        .criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE), conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.RED_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.RED_CONCRETE)
                        .criterion(hasItem(Blocks.RED_CONCRETE), conditionsFromItem(Blocks.RED_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.ORANGE_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.ORANGE_CONCRETE)
                        .criterion(hasItem(Blocks.ORANGE_CONCRETE), conditionsFromItem(Blocks.ORANGE_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.YELLOW_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.YELLOW_CONCRETE)
                        .criterion(hasItem(Blocks.YELLOW_CONCRETE), conditionsFromItem(Blocks.YELLOW_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIME_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.LIME_CONCRETE)
                        .criterion(hasItem(Blocks.LIME_CONCRETE), conditionsFromItem(Blocks.LIME_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.GREEN_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.GREEN_CONCRETE)
                        .criterion(hasItem(Blocks.GREEN_CONCRETE), conditionsFromItem(Blocks.GREEN_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CYAN_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.CYAN_CONCRETE)
                        .criterion(hasItem(Blocks.CYAN_CONCRETE), conditionsFromItem(Blocks.CYAN_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BLUE_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.BLUE_CONCRETE)
                        .criterion(hasItem(Blocks.BLUE_CONCRETE), conditionsFromItem(Blocks.BLUE_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.LIGHT_BLUE_CONCRETE)
                        .criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE), conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PURPLE_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.PURPLE_CONCRETE)
                        .criterion(hasItem(Blocks.PURPLE_CONCRETE), conditionsFromItem(Blocks.PURPLE_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.MAGENTA_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.MAGENTA_CONCRETE)
                        .criterion(hasItem(Blocks.MAGENTA_CONCRETE), conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PINK_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.PINK_CONCRETE)
                        .criterion(hasItem(Blocks.PINK_CONCRETE), conditionsFromItem(Blocks.PINK_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BROWN_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.BROWN_CONCRETE)
                        .criterion(hasItem(Blocks.BROWN_CONCRETE), conditionsFromItem(Blocks.BROWN_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.WHITE_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.WHITE_CONCRETE)
                        .criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BLACK_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.BLACK_CONCRETE)
                        .criterion(hasItem(Blocks.BLACK_CONCRETE), conditionsFromItem(Blocks.BLACK_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.GRAY_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.GRAY_CONCRETE)
                        .criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.LIGHT_GRAY_CONCRETE)
                        .criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE), conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.WHITE_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.WHITE_CONCRETE)
                        .criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.ORANGE_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.ORANGE_CONCRETE)
                        .criterion(hasItem(Blocks.ORANGE_CONCRETE), conditionsFromItem(Blocks.ORANGE_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.MAGENTA_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.MAGENTA_CONCRETE)
                        .criterion(hasItem(Blocks.MAGENTA_CONCRETE), conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.LIGHT_BLUE_CONCRETE)
                        .criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE), conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.YELLOW_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.YELLOW_CONCRETE)
                        .criterion(hasItem(Blocks.YELLOW_CONCRETE), conditionsFromItem(Blocks.YELLOW_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.LIME_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.LIME_CONCRETE)
                        .criterion(hasItem(Blocks.LIME_CONCRETE), conditionsFromItem(Blocks.LIME_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.GREEN_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.GREEN_CONCRETE)
                        .criterion(hasItem(Blocks.GREEN_CONCRETE), conditionsFromItem(Blocks.GREEN_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.PINK_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.PINK_CONCRETE)
                        .criterion(hasItem(Blocks.PINK_CONCRETE), conditionsFromItem(Blocks.PINK_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.GRAY_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.GRAY_CONCRETE)
                        .criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.LIGHT_GRAY_CONCRETE)
                        .criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE), conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.CYAN_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.CYAN_CONCRETE)
                        .criterion(hasItem(Blocks.CYAN_CONCRETE), conditionsFromItem(Blocks.CYAN_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.PURPLE_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.PURPLE_CONCRETE)
                        .criterion(hasItem(Blocks.PURPLE_CONCRETE), conditionsFromItem(Blocks.PURPLE_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.BLUE_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.BLUE_CONCRETE)
                        .criterion(hasItem(Blocks.BLUE_CONCRETE), conditionsFromItem(Blocks.BLUE_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.BROWN_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.BROWN_CONCRETE)
                        .criterion(hasItem(Blocks.BROWN_CONCRETE), conditionsFromItem(Blocks.BROWN_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.BLACK_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.BLACK_CONCRETE)
                        .criterion(hasItem(Blocks.BLACK_CONCRETE), conditionsFromItem(Blocks.BLACK_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.RED_CONCRETE_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.RED_CONCRETE)
                        .criterion(hasItem(Blocks.RED_CONCRETE), conditionsFromItem(Blocks.RED_CONCRETE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.RED_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.RED_TERRACOTTA)
                        .criterion(hasItem(Blocks.RED_TERRACOTTA), conditionsFromItem(Blocks.RED_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.ORANGE_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.ORANGE_TERRACOTTA)
                        .criterion(hasItem(Blocks.ORANGE_TERRACOTTA), conditionsFromItem(Blocks.ORANGE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.YELLOW_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.YELLOW_TERRACOTTA)
                        .criterion(hasItem(Blocks.YELLOW_TERRACOTTA), conditionsFromItem(Blocks.YELLOW_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIME_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.LIME_TERRACOTTA)
                        .criterion(hasItem(Blocks.LIME_TERRACOTTA), conditionsFromItem(Blocks.LIME_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.GREEN_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.GREEN_TERRACOTTA)
                        .criterion(hasItem(Blocks.GREEN_TERRACOTTA), conditionsFromItem(Blocks.GREEN_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CYAN_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.CYAN_TERRACOTTA)
                        .criterion(hasItem(Blocks.CYAN_TERRACOTTA), conditionsFromItem(Blocks.CYAN_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.LIGHT_BLUE_TERRACOTTA)
                        .criterion(hasItem(Blocks.LIGHT_BLUE_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_BLUE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BLUE_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.BLUE_TERRACOTTA)
                        .criterion(hasItem(Blocks.BLUE_TERRACOTTA), conditionsFromItem(Blocks.BLUE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PURPLE_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.PURPLE_TERRACOTTA)
                        .criterion(hasItem(Blocks.PURPLE_TERRACOTTA), conditionsFromItem(Blocks.PURPLE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.MAGENTA_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.MAGENTA_TERRACOTTA)
                        .criterion(hasItem(Blocks.MAGENTA_TERRACOTTA), conditionsFromItem(Blocks.MAGENTA_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PINK_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.PINK_TERRACOTTA)
                        .criterion(hasItem(Blocks.PINK_TERRACOTTA), conditionsFromItem(Blocks.PINK_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BROWN_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.BROWN_TERRACOTTA)
                        .criterion(hasItem(Blocks.BROWN_TERRACOTTA), conditionsFromItem(Blocks.BROWN_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.WHITE_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.WHITE_TERRACOTTA)
                        .criterion(hasItem(Blocks.WHITE_TERRACOTTA), conditionsFromItem(Blocks.WHITE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BLACK_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.BLACK_TERRACOTTA)
                        .criterion(hasItem(Blocks.BLACK_TERRACOTTA), conditionsFromItem(Blocks.BLACK_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.GRAY_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.GRAY_TERRACOTTA)
                        .criterion(hasItem(Blocks.GRAY_TERRACOTTA), conditionsFromItem(Blocks.GRAY_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, 4)  // <- sets output count
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.LIGHT_GRAY_TERRACOTTA)
                        .criterion(hasItem(Blocks.LIGHT_GRAY_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_GRAY_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.TERRACOTTA_STAIRS, 4)
                        .pattern("  S")
                        .pattern(" SS")
                        .pattern("SSS")
                        .input('S', Blocks.TERRACOTTA)
                        .criterion(hasItem(Blocks.TERRACOTTA), conditionsFromItem(Blocks.TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.RED_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.RED_TERRACOTTA)
                        .criterion(hasItem(Blocks.RED_TERRACOTTA), conditionsFromItem(Blocks.RED_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.ORANGE_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.ORANGE_TERRACOTTA)
                        .criterion(hasItem(Blocks.ORANGE_TERRACOTTA), conditionsFromItem(Blocks.ORANGE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.YELLOW_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.YELLOW_TERRACOTTA)
                        .criterion(hasItem(Blocks.YELLOW_TERRACOTTA), conditionsFromItem(Blocks.YELLOW_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIME_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.LIME_TERRACOTTA)
                        .criterion(hasItem(Blocks.LIME_TERRACOTTA), conditionsFromItem(Blocks.LIME_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.GREEN_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.GREEN_TERRACOTTA)
                        .criterion(hasItem(Blocks.GREEN_TERRACOTTA), conditionsFromItem(Blocks.GREEN_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CYAN_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.CYAN_TERRACOTTA)
                        .criterion(hasItem(Blocks.CYAN_TERRACOTTA), conditionsFromItem(Blocks.CYAN_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BLUE_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.BLUE_TERRACOTTA)
                        .criterion(hasItem(Blocks.BLUE_TERRACOTTA), conditionsFromItem(Blocks.BLUE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.LIGHT_BLUE_TERRACOTTA)
                        .criterion(hasItem(Blocks.LIGHT_BLUE_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_BLUE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PURPLE_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.PURPLE_TERRACOTTA)
                        .criterion(hasItem(Blocks.PURPLE_TERRACOTTA), conditionsFromItem(Blocks.PURPLE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.MAGENTA_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.MAGENTA_TERRACOTTA)
                        .criterion(hasItem(Blocks.MAGENTA_TERRACOTTA), conditionsFromItem(Blocks.MAGENTA_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PINK_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.PINK_TERRACOTTA)
                        .criterion(hasItem(Blocks.PINK_TERRACOTTA), conditionsFromItem(Blocks.PINK_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BROWN_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.BROWN_TERRACOTTA)
                        .criterion(hasItem(Blocks.BROWN_TERRACOTTA), conditionsFromItem(Blocks.BROWN_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.WHITE_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.WHITE_TERRACOTTA)
                        .criterion(hasItem(Blocks.WHITE_TERRACOTTA), conditionsFromItem(Blocks.WHITE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BLACK_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.BLACK_TERRACOTTA)
                        .criterion(hasItem(Blocks.BLACK_TERRACOTTA), conditionsFromItem(Blocks.BLACK_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.GRAY_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.GRAY_TERRACOTTA)
                        .criterion(hasItem(Blocks.GRAY_TERRACOTTA), conditionsFromItem(Blocks.GRAY_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.LIGHT_GRAY_TERRACOTTA)
                        .criterion(hasItem(Blocks.LIGHT_GRAY_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_GRAY_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.TERRACOTTA_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.TERRACOTTA)
                        .criterion(hasItem(Blocks.TERRACOTTA), conditionsFromItem(Blocks.TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.WHITE_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.WHITE_TERRACOTTA)
                        .criterion(hasItem(Blocks.WHITE_TERRACOTTA), conditionsFromItem(Blocks.WHITE_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.ORANGE_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.ORANGE_TERRACOTTA)
                        .criterion(hasItem(Blocks.ORANGE_TERRACOTTA), conditionsFromItem(Blocks.ORANGE_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.MAGENTA_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.MAGENTA_TERRACOTTA)
                        .criterion(hasItem(Blocks.MAGENTA_TERRACOTTA), conditionsFromItem(Blocks.MAGENTA_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.LIGHT_BLUE_TERRACOTTA)
                        .criterion(hasItem(Blocks.LIGHT_BLUE_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_BLUE_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.YELLOW_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.YELLOW_TERRACOTTA)
                        .criterion(hasItem(Blocks.YELLOW_TERRACOTTA), conditionsFromItem(Blocks.YELLOW_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.LIME_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.LIME_TERRACOTTA)
                        .criterion(hasItem(Blocks.LIME_TERRACOTTA), conditionsFromItem(Blocks.LIME_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.GREEN_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.GREEN_TERRACOTTA)
                        .criterion(hasItem(Blocks.GREEN_TERRACOTTA), conditionsFromItem(Blocks.GREEN_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.PINK_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.PINK_TERRACOTTA)
                        .criterion(hasItem(Blocks.PINK_TERRACOTTA), conditionsFromItem(Blocks.PINK_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.GRAY_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.GRAY_TERRACOTTA)
                        .criterion(hasItem(Blocks.GRAY_TERRACOTTA), conditionsFromItem(Blocks.GRAY_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.LIGHT_GRAY_TERRACOTTA)
                        .criterion(hasItem(Blocks.LIGHT_GRAY_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_GRAY_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.CYAN_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.CYAN_TERRACOTTA)
                        .criterion(hasItem(Blocks.CYAN_TERRACOTTA), conditionsFromItem(Blocks.CYAN_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.PURPLE_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.PURPLE_TERRACOTTA)
                        .criterion(hasItem(Blocks.PURPLE_TERRACOTTA), conditionsFromItem(Blocks.PURPLE_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.BLUE_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.BLUE_TERRACOTTA)
                        .criterion(hasItem(Blocks.BLUE_TERRACOTTA), conditionsFromItem(Blocks.BLUE_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.BROWN_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.BROWN_TERRACOTTA)
                        .criterion(hasItem(Blocks.BROWN_TERRACOTTA), conditionsFromItem(Blocks.BROWN_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.BLACK_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.BLACK_TERRACOTTA)
                        .criterion(hasItem(Blocks.BLACK_TERRACOTTA), conditionsFromItem(Blocks.BLACK_TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.RED_TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.RED_TERRACOTTA)
                        .criterion(hasItem(Blocks.RED_TERRACOTTA), conditionsFromItem(Blocks.RED_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.TERRACOTTA_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.TERRACOTTA)
                        .criterion(hasItem(Blocks.TERRACOTTA), conditionsFromItem(Blocks.TERRACOTTA))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.NETHERRACK_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.NETHERRACK)
                        .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.NETHERRACK_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.NETHERRACK)
                        .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICKS, 4)
                        .pattern("SS")
                        .pattern("SS")
                        .input('S', Blocks.POLISHED_BASALT)
                        .criterion(hasItem(Blocks.POLISHED_BASALT), conditionsFromItem(Blocks.POLISHED_BASALT))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BASALT_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.BASALT)
                        .criterion(hasItem(Blocks.BASALT), conditionsFromItem(Blocks.BASALT))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.SMOOTH_BASALT)
                        .criterion(hasItem(Blocks.SMOOTH_BASALT), conditionsFromItem(Blocks.SMOOTH_BASALT))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_SLAB, 6)
                        .pattern("SSS")
                        .input('S', Blocks.POLISHED_BASALT)
                        .criterion(hasItem(Blocks.POLISHED_BASALT), conditionsFromItem(Blocks.POLISHED_BASALT))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICK_SLAB, 6)
                        .pattern("SSS")
                        .input('S', ModBlocks.POLISHED_BASALT_BRICKS)
                        .criterion(hasItem(ModBlocks.POLISHED_BASALT_BRICKS), conditionsFromItem(ModBlocks.POLISHED_BASALT_BRICKS))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.BASALT_STAIRS, 4)
                        .pattern("S  ")
                        .pattern("SS ")
                        .pattern("SSS")
                        .input('S', Blocks.BASALT)
                        .criterion(hasItem(Blocks.BASALT), conditionsFromItem(Blocks.BASALT))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_STAIRS, 4)
                        .pattern("S  ")
                        .pattern("SS ")
                        .pattern("SSS")
                        .input('S', Blocks.SMOOTH_BASALT)
                        .criterion(hasItem(Blocks.SMOOTH_BASALT), conditionsFromItem(Blocks.SMOOTH_BASALT))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_STAIRS, 4)
                        .pattern("S  ")
                        .pattern("SS ")
                        .pattern("SSS")
                        .input('S', Blocks.POLISHED_BASALT)
                        .criterion(hasItem(Blocks.POLISHED_BASALT), conditionsFromItem(Blocks.POLISHED_BASALT))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICK_STAIRS, 4)
                        .pattern("S  ")
                        .pattern("SS ")
                        .pattern("SSS")
                        .input('S', ModBlocks.POLISHED_BASALT_BRICKS)
                        .criterion(hasItem(ModBlocks.POLISHED_BASALT_BRICKS), conditionsFromItem(ModBlocks.POLISHED_BASALT_BRICKS))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.BASALT_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.BASALT)
                        .criterion(hasItem(Blocks.BASALT), conditionsFromItem(Blocks.BASALT))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.SMOOTH_BASALT)
                        .criterion(hasItem(Blocks.SMOOTH_BASALT), conditionsFromItem(Blocks.SMOOTH_BASALT))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.POLISHED_BASALT)
                        .criterion(hasItem(Blocks.POLISHED_BASALT), conditionsFromItem(Blocks.POLISHED_BASALT))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICK_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', ModBlocks.POLISHED_BASALT_BRICKS)
                        .criterion(hasItem(ModBlocks.POLISHED_BASALT_BRICKS), conditionsFromItem(ModBlocks.POLISHED_BASALT_BRICKS))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, ModBlocks.CHARCOAL_BLOCK, 1)
                        .pattern("SSS")
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Items.CHARCOAL)
                        .criterion(hasItem(Items.CHARCOAL), conditionsFromItem(Items.CHARCOAL))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, Items.CHARCOAL, 9)
                        .pattern("S")
                        .input('S', ModBlocks.CHARCOAL_BLOCK)
                        .criterion(hasItem(ModBlocks.CHARCOAL_BLOCK), conditionsFromItem(ModBlocks.CHARCOAL_BLOCK))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.NETHER_BRICK_FENCE_GATE, 2)
                        .pattern("SPS")
                        .pattern("SPS")
                        .input('S', Items.NETHER_BRICK)
                        .input('P', Blocks.NETHER_BRICKS)
                        .criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS))
                        .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.RED_NETHER_BRICK_FENCE_GATE, 2)
                        .pattern("SPS")
                        .pattern("SPS")
                        .input('S', Items.NETHER_BRICK)
                        .input('P', Blocks.RED_NETHER_BRICKS)
                        .criterion(hasItem(Blocks.RED_NETHER_BRICKS), conditionsFromItem(Blocks.RED_NETHER_BRICKS))
                        .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.MISC, ModBlocks.RED_NETHER_BRICK_FENCE, 6)
                        .pattern("SPS")
                        .pattern("SPS")
                        .input('S', Blocks.RED_NETHER_BRICKS)
                        .input('P', Items.NETHER_BRICK)
                        .criterion(hasItem(Blocks.RED_NETHER_BRICKS), conditionsFromItem(Blocks.RED_NETHER_BRICKS))
                        .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                        .offerTo(recipeExporter);



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
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CHISELED_CALCITE_BRICKS, Items.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE, 1);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE, Items.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_SLAB, Items.CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_STAIRS, Items.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_WALL, Items.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE, 1);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.END_STONE_SLAB, Blocks.END_STONE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.END_STONE_STAIRS, Blocks.END_STONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.END_STONE_WALL, Blocks.END_STONE, 1);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICKS, Blocks.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_STAIRS, Blocks.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.POLISHED_CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_WALL, Blocks.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.POLISHED_CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_SLAB, Blocks.CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.POLISHED_CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.TERRACOTTA_STAIRS, Blocks.TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA, 2);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK, 1);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.NETHER_BRICK_FENCE_GATE, Blocks.NETHER_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.RED_NETHER_BRICK_FENCE_GATE, Blocks.RED_NETHER_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.RED_NETHER_BRICK_FENCE, Blocks.RED_NETHER_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, Blocks.NETHER_BRICK_FENCE, Blocks.NETHER_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BASALT_STAIRS, Blocks.BASALT, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BASALT_SLAB, Blocks.BASALT, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BASALT_WALL, Blocks.BASALT, 1);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT, 1);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_STAIRS, Blocks.BASALT, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_SLAB, Blocks.BASALT, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_WALL, Blocks.BASALT, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_STAIRS, Blocks.POLISHED_BASALT, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_SLAB, Blocks.POLISHED_BASALT, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_WALL, Blocks.POLISHED_BASALT, 1);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICKS, Blocks.BASALT, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICKS, Blocks.POLISHED_BASALT, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICK_STAIRS, Blocks.BASALT, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICK_STAIRS, ModBlocks.POLISHED_BASALT_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICK_SLAB, ModBlocks.POLISHED_BASALT_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICK_WALL, ModBlocks.POLISHED_BASALT_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICK_SLAB, Blocks.BASALT, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICK_WALL, Blocks.BASALT, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICK_STAIRS, Blocks.POLISHED_BASALT, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICK_SLAB, Blocks.POLISHED_BASALT, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_BASALT_BRICK_WALL, Blocks.POLISHED_BASALT, 1);

            }
        };
    }

    @Override
    public String getName() {
        return "NBLB Recipes";
    }
}
