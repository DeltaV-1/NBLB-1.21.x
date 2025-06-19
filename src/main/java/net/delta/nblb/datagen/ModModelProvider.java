package net.delta.nblb.datagen;

import net.delta.nblb.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import com.google.gson.JsonElement;
import java.util.function.BiConsumer;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createSingletonBlockState(
                        ModBlocks.CHISELED_CALCITE,
                        Models.CUBE_BOTTOM_TOP.upload(
                                ModBlocks.CHISELED_CALCITE,
                                TextureMap.of(TextureKey.SIDE, Identifier.of("nblb", "block/chiseled_calcite_side"))
                                        .put(TextureKey.TOP, Identifier.of("nblb", "block/chiseled_calcite_top"))
                                        .put(TextureKey.BOTTOM, Identifier.of("nblb", "block/chiseled_calcite_top")),
                                blockStateModelGenerator.modelCollector
                        )
                )
        );


        BlockStateModelGenerator.BlockTexturePool polishedAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        BlockStateModelGenerator.BlockTexturePool polishedDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        BlockStateModelGenerator.BlockTexturePool polishedGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        BlockStateModelGenerator.BlockTexturePool smoothStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool stonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        BlockStateModelGenerator.BlockTexturePool calcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE);
        BlockStateModelGenerator.BlockTexturePool polishedCalcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_CALCITE);

        polishedAndesitePool.wall(ModBlocks.POLISHED_ANDESITE_WALL);
        polishedDioritePool.wall(ModBlocks.POLISHED_DIORITE_WALL);
        polishedGranitePool.wall(ModBlocks.POLISHED_GRANITE_WALL);
        smoothStonePool.wall(ModBlocks.SMOOTH_STONE_WALL);
        smoothStonePool.stairs(ModBlocks.SMOOTH_STONE_STAIRS);
        stonePool.wall(ModBlocks.STONE_WALL);
        calcitePool.stairs(ModBlocks.CALCITE_STAIRS);
        calcitePool.slab(ModBlocks.CALCITE_SLAB);
        calcitePool.wall(ModBlocks.CALCITE_WALL);
        polishedCalcitePool.stairs(ModBlocks.POLISHED_CALCITE_STAIRS);
        polishedCalcitePool.slab(ModBlocks.POLISHED_CALCITE_SLAB);
        polishedCalcitePool.wall(ModBlocks.POLISHED_CALCITE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
