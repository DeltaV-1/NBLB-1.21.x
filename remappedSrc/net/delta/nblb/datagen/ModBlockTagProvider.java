package net.delta.nblb.datagen;

import net.delta.nblb.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_ANDESITE_WALL)
                .add(ModBlocks.POLISHED_DIORITE_WALL)
                .add(ModBlocks.POLISHED_GRANITE_WALL)
                .add(ModBlocks.SMOOTH_STONE_WALL)
                .add(ModBlocks.STONE_WALL)
                .add(ModBlocks.SMOOTH_STONE_STAIRS)
                .add(ModBlocks.CALCITE_STAIRS)
                .add(ModBlocks.CALCITE_SLAB)
                .add(ModBlocks.CALCITE_WALL)
                .add(ModBlocks.CHISELED_CALCITE)
                .add(ModBlocks.POLISHED_CALCITE)
                .add(ModBlocks.POLISHED_CALCITE_WALL)
                .add(ModBlocks.POLISHED_CALCITE_STAIRS)
                .add(ModBlocks.POLISHED_CALCITE_SLAB);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.POLISHED_ANDESITE_WALL)
                .add(ModBlocks.POLISHED_DIORITE_WALL)
                .add(ModBlocks.POLISHED_GRANITE_WALL)
                .add(ModBlocks.SMOOTH_STONE_WALL)
                .add(ModBlocks.STONE_WALL)
                .add(ModBlocks.CALCITE_WALL)
                .add(ModBlocks.POLISHED_CALCITE_WALL);
        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.SMOOTH_STONE_STAIRS)
                .add(ModBlocks.CALCITE_STAIRS)
                .add(ModBlocks.POLISHED_CALCITE_STAIRS);
        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.CALCITE_SLAB)
                .add(ModBlocks.POLISHED_CALCITE_SLAB);
    }
}
