package net.delta.nblb.datagen;

import net.delta.nblb.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.POLISHED_ANDESITE_WALL);
        addDrop(ModBlocks.POLISHED_DIORITE_WALL);
        addDrop(ModBlocks.POLISHED_GRANITE_WALL);
        addDrop(ModBlocks.SMOOTH_STONE_WALL);
        addDrop(ModBlocks.STONE_WALL);
        addDrop(ModBlocks.SMOOTH_STONE_STAIRS);
        addDrop(ModBlocks.CALCITE_STAIRS);
        addDrop(ModBlocks.CALCITE_SLAB);
        addDrop(ModBlocks.CALCITE_WALL);
        addDrop(ModBlocks.CHISELED_CALCITE);
        addDrop(ModBlocks.POLISHED_CALCITE);
        addDrop(ModBlocks.POLISHED_CALCITE_STAIRS);
        addDrop(ModBlocks.POLISHED_CALCITE_SLAB);
        addDrop(ModBlocks.POLISHED_CALCITE_WALL);
        addDrop(ModBlocks.END_STONE_SLAB);
        addDrop(ModBlocks.END_STONE_STAIRS);
        addDrop(ModBlocks.END_STONE_WALL);

    }

}
