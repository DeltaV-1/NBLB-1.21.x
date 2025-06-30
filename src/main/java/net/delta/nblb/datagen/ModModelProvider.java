package net.delta.nblb.datagen;

import net.delta.nblb.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.util.Identifier;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSingleton(
                ModBlocks.CHISELED_CALCITE,
                TexturedModel.CUBE_BOTTOM_TOP
        );


        BlockStateModelGenerator.BlockTexturePool polishedAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        BlockStateModelGenerator.BlockTexturePool polishedDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        BlockStateModelGenerator.BlockTexturePool polishedGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        BlockStateModelGenerator.BlockTexturePool smoothStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool stonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        BlockStateModelGenerator.BlockTexturePool calcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE);
        BlockStateModelGenerator.BlockTexturePool polishedCalcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_CALCITE);
        BlockStateModelGenerator.BlockTexturePool charcoalBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHARCOAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool chiseledCalciteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHISELED_CALCITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool endStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE);
        BlockStateModelGenerator.BlockTexturePool calciteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CALCITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool redConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool orangeConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool yellowConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool limeConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool greenConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cyanConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool lightBlueConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool blueConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool purpleConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool magentaConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool pinkConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool brownConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool whiteConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool grayConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool lightGrayConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool blackConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool redTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool orangeTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool yellowTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool limeTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool greenTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool cyanTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool lightBlueTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool blueTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool purpleTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool magentaTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool pinkTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool brownTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool whiteTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool grayTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool lightGrayTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool blackTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool netherrackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERRACK);
        BlockStateModelGenerator.BlockTexturePool netherBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool redNetherBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_NETHER_BRICKS);


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
        endStonePool.wall(ModBlocks.END_STONE_WALL);
        endStonePool.stairs(ModBlocks.END_STONE_STAIRS);
        endStonePool.slab(ModBlocks.END_STONE_SLAB);
        calciteBrickPool.slab(ModBlocks.CALCITE_BRICK_SLAB);
        calciteBrickPool.stairs(ModBlocks.CALCITE_BRICK_STAIRS);
        calciteBrickPool.wall(ModBlocks.CALCITE_BRICK_WALL);
        redConcretePool.slab(ModBlocks.RED_CONCRETE_SLAB);
        redConcretePool.stairs(ModBlocks.RED_CONCRETE_STAIRS);
        orangeConcretePool.slab(ModBlocks.ORANGE_CONCRETE_SLAB);
        orangeConcretePool.stairs(ModBlocks.ORANGE_CONCRETE_STAIRS);
        yellowConcretePool.slab(ModBlocks.YELLOW_CONCRETE_SLAB);
        yellowConcretePool.stairs(ModBlocks.YELLOW_CONCRETE_STAIRS);
        limeConcretePool.slab(ModBlocks.LIME_CONCRETE_SLAB);
        limeConcretePool.stairs(ModBlocks.LIME_CONCRETE_STAIRS);
        greenConcretePool.slab(ModBlocks.GREEN_CONCRETE_SLAB);
        greenConcretePool.stairs(ModBlocks.GREEN_CONCRETE_STAIRS);
        cyanConcretePool.slab(ModBlocks.CYAN_CONCRETE_SLAB);
        cyanConcretePool.stairs(ModBlocks.CYAN_CONCRETE_STAIRS);
        lightBlueConcretePool.slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        lightBlueConcretePool.stairs(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        blueConcretePool.slab(ModBlocks.BLUE_CONCRETE_SLAB);
        blueConcretePool.stairs(ModBlocks.BLUE_CONCRETE_STAIRS);
        purpleConcretePool.slab(ModBlocks.PURPLE_CONCRETE_SLAB);
        purpleConcretePool.stairs(ModBlocks.PURPLE_CONCRETE_STAIRS);
        magentaConcretePool.slab(ModBlocks.MAGENTA_CONCRETE_SLAB);
        magentaConcretePool.stairs(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        pinkConcretePool.slab(ModBlocks.PINK_CONCRETE_SLAB);
        pinkConcretePool.stairs(ModBlocks.PINK_CONCRETE_STAIRS);
        brownConcretePool.slab(ModBlocks.BROWN_CONCRETE_SLAB);
        brownConcretePool.stairs(ModBlocks.BROWN_CONCRETE_STAIRS);
        whiteConcretePool.slab(ModBlocks.WHITE_CONCRETE_SLAB);
        whiteConcretePool.stairs(ModBlocks.WHITE_CONCRETE_STAIRS);
        lightGrayConcretePool.slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        lightGrayConcretePool.stairs(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        grayConcretePool.slab(ModBlocks.GRAY_CONCRETE_SLAB);
        grayConcretePool.stairs(ModBlocks.GRAY_CONCRETE_STAIRS);
        blackConcretePool.slab(ModBlocks.BLACK_CONCRETE_SLAB);
        blackConcretePool.stairs(ModBlocks.BLACK_CONCRETE_STAIRS);
        whiteConcretePool.wall(ModBlocks.WHITE_CONCRETE_WALL);
        orangeConcretePool.wall(ModBlocks.ORANGE_CONCRETE_WALL);
        magentaConcretePool.wall(ModBlocks.MAGENTA_CONCRETE_WALL);
        lightBlueConcretePool.wall(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
        yellowConcretePool.wall(ModBlocks.YELLOW_CONCRETE_WALL);
        limeConcretePool.wall(ModBlocks.LIME_CONCRETE_WALL);
        greenConcretePool.wall(ModBlocks.GREEN_CONCRETE_WALL);
        pinkConcretePool.wall(ModBlocks.PINK_CONCRETE_WALL);
        grayConcretePool.wall(ModBlocks.GRAY_CONCRETE_WALL);
        lightGrayConcretePool.wall(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);
        cyanConcretePool.wall(ModBlocks.CYAN_CONCRETE_WALL);
        purpleConcretePool.wall(ModBlocks.PURPLE_CONCRETE_WALL);
        blueConcretePool.wall(ModBlocks.BLUE_CONCRETE_WALL);
        brownConcretePool.wall(ModBlocks.BROWN_CONCRETE_WALL);
        blackConcretePool.wall(ModBlocks.BLACK_CONCRETE_WALL);
        redConcretePool.wall(ModBlocks.RED_CONCRETE_WALL);
        redTerracottaPool.slab(ModBlocks.RED_TERRACOTTA_SLAB);
        redTerracottaPool.stairs(ModBlocks.RED_TERRACOTTA_STAIRS);
        orangeTerracottaPool.slab(ModBlocks.ORANGE_TERRACOTTA_SLAB);
        orangeTerracottaPool.stairs(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        yellowTerracottaPool.slab(ModBlocks.YELLOW_TERRACOTTA_SLAB);
        yellowTerracottaPool.stairs(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        limeTerracottaPool.slab(ModBlocks.LIME_TERRACOTTA_SLAB);
        limeTerracottaPool.stairs(ModBlocks.LIME_TERRACOTTA_STAIRS);
        greenTerracottaPool.slab(ModBlocks.GREEN_TERRACOTTA_SLAB);
        greenTerracottaPool.stairs(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        cyanTerracottaPool.slab(ModBlocks.CYAN_TERRACOTTA_SLAB);
        cyanTerracottaPool.stairs(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        lightBlueTerracottaPool.slab(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        lightBlueTerracottaPool.stairs(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        blueTerracottaPool.slab(ModBlocks.BLUE_TERRACOTTA_SLAB);
        blueTerracottaPool.stairs(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        purpleTerracottaPool.slab(ModBlocks.PURPLE_TERRACOTTA_SLAB);
        purpleTerracottaPool.stairs(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        magentaTerracottaPool.slab(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
        magentaTerracottaPool.stairs(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        pinkTerracottaPool.slab(ModBlocks.PINK_TERRACOTTA_SLAB);
        pinkTerracottaPool.stairs(ModBlocks.PINK_TERRACOTTA_STAIRS);
        brownTerracottaPool.slab(ModBlocks.BROWN_TERRACOTTA_SLAB);
        brownTerracottaPool.stairs(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        whiteTerracottaPool.slab(ModBlocks.WHITE_TERRACOTTA_SLAB);
        whiteTerracottaPool.stairs(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        lightGrayTerracottaPool.slab(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        lightGrayTerracottaPool.stairs(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        grayTerracottaPool.slab(ModBlocks.GRAY_TERRACOTTA_SLAB);
        grayTerracottaPool.stairs(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        blackTerracottaPool.slab(ModBlocks.BLACK_TERRACOTTA_SLAB);
        blackTerracottaPool.stairs(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        whiteTerracottaPool.wall(ModBlocks.WHITE_TERRACOTTA_WALL);
        orangeTerracottaPool.wall(ModBlocks.ORANGE_TERRACOTTA_WALL);
        magentaTerracottaPool.wall(ModBlocks.MAGENTA_TERRACOTTA_WALL);
        lightBlueTerracottaPool.wall(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        yellowTerracottaPool.wall(ModBlocks.YELLOW_TERRACOTTA_WALL);
        limeTerracottaPool.wall(ModBlocks.LIME_TERRACOTTA_WALL);
        greenTerracottaPool.wall(ModBlocks.GREEN_TERRACOTTA_WALL);
        pinkTerracottaPool.wall(ModBlocks.PINK_TERRACOTTA_WALL);
        grayTerracottaPool.wall(ModBlocks.GRAY_TERRACOTTA_WALL);
        lightGrayTerracottaPool.wall(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        cyanTerracottaPool.wall(ModBlocks.CYAN_TERRACOTTA_WALL);
        purpleTerracottaPool.wall(ModBlocks.PURPLE_TERRACOTTA_WALL);
        blueTerracottaPool.wall(ModBlocks.BLUE_TERRACOTTA_WALL);
        brownTerracottaPool.wall(ModBlocks.BROWN_TERRACOTTA_WALL);
        blackTerracottaPool.wall(ModBlocks.BLACK_TERRACOTTA_WALL);
        redTerracottaPool.wall(ModBlocks.RED_TERRACOTTA_WALL);
        terracottaPool.wall(ModBlocks.TERRACOTTA_WALL);
        terracottaPool.slab(ModBlocks.TERRACOTTA_SLAB);
        terracottaPool.stairs(ModBlocks.TERRACOTTA_STAIRS);
        netherrackPool.stairs(ModBlocks.NETHERRACK_STAIRS);
        netherrackPool.slab(ModBlocks.NETHERRACK_SLAB);
        netherrackPool.wall(ModBlocks.NETHERRACK_WALL);
        redNetherBrickPool.fence(ModBlocks.RED_NETHER_BRICK_FENCE);
        redNetherBrickPool.fenceGate(ModBlocks.RED_NETHER_BRICK_FENCE_GATE);
        netherBrickPool.fenceGate(ModBlocks.NETHER_BRICK_FENCE_GATE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
