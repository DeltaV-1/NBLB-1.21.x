package net.delta.nblb.block;

import net.delta.nblb.NBLB;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;


public class ModBlocks {

    public static final Block CHISELED_CALCITE = registerBlock("chiseled_calcite",
            new Block(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "chiseled_calcite")))
                    .strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
            new Block(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "charcoal_block")))
                    .strength(5f, 6f).requiresTool().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            new Block(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "polished_calcite")))
                    .strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CHISELED_CALCITE_BRICKS = registerBlock("chiseled_calcite_bricks",
            new Block(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "chiseled_calcite_bricks")))
                    .strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "calcite_bricks")))
                    .strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "polished_andesite_wall")))
                    .strength(1.15f).requiresTool()));

    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "polished_diorite_wall")))
                    .strength(1.15f).requiresTool()));

    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "polished_granite_wall")))
                    .strength(1.15f).requiresTool()));

    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "smooth_stone_wall")))
                    .strength(1.15f).requiresTool()));

    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "stone_wall")))
                    .strength(1.15f).requiresTool()));

    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "calcite_wall")))
                    .strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            new WallBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "polished_calcite_wall")))
                    .strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "calcite_brick_wall")))
                    .strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "smooth_stone_stairs")))
                            .strength(1.15f).requiresTool()));

    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "calcite_stairs")))
                            .strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "polished_calcite_stairs")))
                            .strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "calcite_brick_stairs")))
                            .strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "calcite_slab")))
                    .strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "polished_calcite_slab")))
                    .strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "calcite_brick_slab")))
                    .strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "end_stone_slab")))
                    .strength(3f, 9f).requiresTool()));

    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "end_stone_stairs")))
                            .strength(3f, 9f).requiresTool()));

    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "end_stone_wall")))
                    .strength(3f, 9f).requiresTool()));



    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "red_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "orange_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "yellow_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "green_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "lime_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "cyan_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "light_blue_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "blue_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "brown_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "black_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "gray_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "light_gray_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "white_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "purple_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "pink_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "magenta_concrete_slab")))
                    .strength(1.8f).requiresTool()));
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "red_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "orange_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "yellow_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "lime_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "green_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "black_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "gray_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "light_gray_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "white_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "brown_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "blue_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "cyan_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "light_blue_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "purple_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "magenta_concrete_stairs")))
                            .strength(1.8f).requiresTool()));
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "pink_concrete_stairs")))
                            .strength(1.8f).requiresTool()));


    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "red_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "white_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "orange_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "magenta_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "light_blue_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "yellow_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "lime_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "green_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "pink_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "gray_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "light_gray_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "cyan_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "purple_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "blue_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "brown_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "black_concrete_wall")))
                    .strength(1.8f).requiresTool()));

    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "red_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "orange_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "yellow_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "green_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "lime_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "cyan_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "light_blue_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "blue_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "brown_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "black_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "gray_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "light_gray_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "white_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "purple_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "pink_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "magenta_terracotta_slab")))
                    .strength(1.25f).requiresTool()));
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "terracotta_slab")))
                    .strength(1.25f).requiresTool()));

    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "red_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "orange_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "yellow_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "lime_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "green_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "black_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "gray_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "light_gray_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "white_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "brown_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "blue_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "cyan_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "light_blue_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "purple_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "magenta_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "pink_terracotta_stairs")))
                            .strength(1.25f).requiresTool()));
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            new StairsBlock(Blocks.TERRACOTTA.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "terracotta_stairs")))
                            .strength(1.25f).requiresTool()));


    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "red_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "white_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "orange_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "magenta_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "light_blue_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "yellow_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "lime_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "green_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "pink_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "gray_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "light_gray_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "cyan_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "purple_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "blue_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "brown_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "black_terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "terracotta_wall")))
                    .strength(1.25f).requiresTool()));

    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "netherrack_wall")))
                    .sounds(BlockSoundGroup.NETHERRACK).strength(0.4f)));

    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            new StairsBlock(Blocks.NETHERRACK.getDefaultState(),
                    AbstractBlock.Settings.create().
                            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "netherrack_stairs")))
                            .strength(0.4f).sounds(BlockSoundGroup.NETHERRACK).requiresTool()));

    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "netherrack_slab")))
                    .strength(0.4f).sounds(BlockSoundGroup.NETHERRACK).requiresTool()));

    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    Block.Settings.create()
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "nether_brick_fence_gate")))
                            .strength(2.0f, 6.0f)
                            .sounds(BlockSoundGroup.NETHER_BRICKS)
                            .nonOpaque()
            ));
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    Block.Settings.create()
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "red_nether_brick_fence_gate")))
                            .strength(2.0f, 6.0f)
                            .sounds(BlockSoundGroup.NETHER_BRICKS)
                            .nonOpaque()
            ));
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(
                    Block.Settings.create()
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "red_nether_brick_fence")))
                            .strength(2.0f, 6.0f)
                            .sounds(BlockSoundGroup.NETHER_BRICKS)
                            .nonOpaque()
            ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(NBLB.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(NBLB.MOD_ID, name),
                new BlockItem(block, new Item.Settings().
                        registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(NBLB.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        NBLB.LOGGER.info("Registering Mod Blocks for " + NBLB.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Items.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_STAIRS);
            entries.addAfter(Items.SMOOTH_STONE_SLAB, ModBlocks.SMOOTH_STONE_WALL);
            entries.addAfter(Items.STONE_SLAB, ModBlocks.STONE_WALL);
            entries.addAfter(Items.POLISHED_ANDESITE_SLAB, ModBlocks.POLISHED_ANDESITE_WALL);
            entries.addAfter(Items.POLISHED_DIORITE_SLAB, ModBlocks.POLISHED_DIORITE_WALL);
            entries.addAfter(Items.POLISHED_GRANITE_SLAB, ModBlocks.POLISHED_GRANITE_WALL);
            entries.addAfter(Items.CHISELED_TUFF_BRICKS, Blocks.CALCITE);
            entries.addAfter(Items.CALCITE, ModBlocks.CALCITE_STAIRS);
            entries.addAfter(ModBlocks.CALCITE_STAIRS, ModBlocks.CALCITE_SLAB);
            entries.addAfter(ModBlocks.CALCITE_SLAB, ModBlocks.CALCITE_WALL);
            entries.addAfter(ModBlocks.CALCITE_WALL, ModBlocks.CHISELED_CALCITE);
            entries.addAfter(ModBlocks.CHISELED_CALCITE, ModBlocks.POLISHED_CALCITE);
            entries.addAfter(ModBlocks.POLISHED_CALCITE, ModBlocks.POLISHED_CALCITE_STAIRS);
            entries.addAfter(ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE_SLAB);
            entries.addAfter(ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE_WALL);
            entries.addAfter(ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.CALCITE_BRICKS);
            entries.addAfter(ModBlocks.CALCITE_BRICKS, ModBlocks.CALCITE_BRICK_STAIRS);
            entries.addAfter(ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICK_SLAB);
            entries.addAfter(ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICK_WALL);
            entries.addAfter(ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CHISELED_CALCITE_BRICKS);
            entries.addAfter(Blocks.END_STONE, ModBlocks.END_STONE_STAIRS);
            entries.addAfter(ModBlocks.END_STONE_STAIRS, ModBlocks.END_STONE_SLAB);
            entries.addAfter(ModBlocks.END_STONE_SLAB, ModBlocks.END_STONE_WALL);
            entries.addAfter(ModBlocks.END_STONE_SLAB, ModBlocks.END_STONE_WALL);
            entries.addAfter(Blocks.COAL_BLOCK, ModBlocks.CHARCOAL_BLOCK);
            entries.addAfter(Blocks.NETHERRACK, ModBlocks.NETHERRACK_STAIRS);
            entries.addAfter(ModBlocks.NETHERRACK_STAIRS, ModBlocks.NETHERRACK_SLAB);
            entries.addAfter(ModBlocks.NETHERRACK_SLAB, ModBlocks.NETHERRACK_WALL);
            entries.addAfter(Blocks.NETHER_BRICK_FENCE, ModBlocks.NETHER_BRICK_FENCE_GATE);
            entries.addAfter(Blocks.RED_NETHER_BRICK_WALL, ModBlocks.RED_NETHER_BRICK_FENCE);
            entries.addAfter(ModBlocks.RED_NETHER_BRICK_FENCE, ModBlocks.RED_NETHER_BRICK_FENCE_GATE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.addAfter(Blocks.RED_CONCRETE, ModBlocks.RED_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.RED_CONCRETE_STAIRS, ModBlocks.RED_CONCRETE_SLAB);
            entries.addAfter(Blocks.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.ORANGE_CONCRETE_STAIRS, ModBlocks.ORANGE_CONCRETE_SLAB);
            entries.addAfter(Blocks.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.YELLOW_CONCRETE_STAIRS, ModBlocks.YELLOW_CONCRETE_SLAB);
            entries.addAfter(Blocks.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.LIME_CONCRETE_STAIRS, ModBlocks.LIME_CONCRETE_SLAB);
            entries.addAfter(Blocks.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.GREEN_CONCRETE_STAIRS, ModBlocks.GREEN_CONCRETE_SLAB);
            entries.addAfter(Blocks.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.CYAN_CONCRETE_STAIRS, ModBlocks.CYAN_CONCRETE_SLAB);
            entries.addAfter(Blocks.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
            entries.addAfter(Blocks.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.BLUE_CONCRETE_STAIRS, ModBlocks.BLUE_CONCRETE_SLAB);
            entries.addAfter(Blocks.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.PURPLE_CONCRETE_STAIRS, ModBlocks.PURPLE_CONCRETE_SLAB);
            entries.addAfter(Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.PINK_CONCRETE_STAIRS, ModBlocks.PINK_CONCRETE_SLAB);
            entries.addAfter(Blocks.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.MAGENTA_CONCRETE_STAIRS, ModBlocks.MAGENTA_CONCRETE_SLAB);
            entries.addAfter(Blocks.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.BROWN_CONCRETE_STAIRS, ModBlocks.BROWN_CONCRETE_SLAB);
            entries.addAfter(Blocks.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.BLACK_CONCRETE_STAIRS, ModBlocks.BLACK_CONCRETE_SLAB);
            entries.addAfter(Blocks.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.WHITE_CONCRETE_STAIRS, ModBlocks.WHITE_CONCRETE_SLAB);
            entries.addAfter(Blocks.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.GRAY_CONCRETE_STAIRS, ModBlocks.GRAY_CONCRETE_SLAB);
            entries.addAfter(Blocks.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.WHITE_CONCRETE_SLAB, ModBlocks.WHITE_CONCRETE_WALL);
            entries.addAfter(ModBlocks.ORANGE_CONCRETE_SLAB, ModBlocks.ORANGE_CONCRETE_WALL);
            entries.addAfter(ModBlocks.MAGENTA_CONCRETE_SLAB, ModBlocks.MAGENTA_CONCRETE_WALL);
            entries.addAfter(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
            entries.addAfter(ModBlocks.YELLOW_CONCRETE_SLAB, ModBlocks.YELLOW_CONCRETE_WALL);
            entries.addAfter(ModBlocks.LIME_CONCRETE_SLAB, ModBlocks.LIME_CONCRETE_WALL);
            entries.addAfter(ModBlocks.GREEN_CONCRETE_SLAB, ModBlocks.GREEN_CONCRETE_WALL);
            entries.addAfter(ModBlocks.PINK_CONCRETE_SLAB, ModBlocks.PINK_CONCRETE_WALL);
            entries.addAfter(ModBlocks.GRAY_CONCRETE_SLAB, ModBlocks.GRAY_CONCRETE_WALL);
            entries.addAfter(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, ModBlocks.LIGHT_GRAY_CONCRETE_WALL);
            entries.addAfter(ModBlocks.CYAN_CONCRETE_SLAB, ModBlocks.CYAN_CONCRETE_WALL);
            entries.addAfter(ModBlocks.PURPLE_CONCRETE_SLAB, ModBlocks.PURPLE_CONCRETE_WALL);
            entries.addAfter(ModBlocks.BLUE_CONCRETE_SLAB, ModBlocks.BLUE_CONCRETE_WALL);
            entries.addAfter(ModBlocks.BROWN_CONCRETE_SLAB, ModBlocks.BROWN_CONCRETE_WALL);
            entries.addAfter(ModBlocks.BLACK_CONCRETE_SLAB, ModBlocks.BLACK_CONCRETE_WALL);
            entries.addAfter(ModBlocks.RED_CONCRETE_SLAB, ModBlocks.RED_CONCRETE_WALL);
            entries.addAfter(Blocks.RED_TERRACOTTA, ModBlocks.RED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.RED_TERRACOTTA_STAIRS, ModBlocks.RED_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.ORANGE_TERRACOTTA, ModBlocks.ORANGE_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.ORANGE_TERRACOTTA_STAIRS, ModBlocks.ORANGE_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.YELLOW_TERRACOTTA, ModBlocks.YELLOW_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.YELLOW_TERRACOTTA_STAIRS, ModBlocks.YELLOW_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.LIME_TERRACOTTA, ModBlocks.LIME_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.LIME_TERRACOTTA_STAIRS, ModBlocks.LIME_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.GREEN_TERRACOTTA, ModBlocks.GREEN_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.GREEN_TERRACOTTA_STAIRS, ModBlocks.GREEN_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.CYAN_TERRACOTTA, ModBlocks.CYAN_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.CYAN_TERRACOTTA_STAIRS, ModBlocks.CYAN_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.LIGHT_BLUE_TERRACOTTA, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.BLUE_TERRACOTTA, ModBlocks.BLUE_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.BLUE_TERRACOTTA_STAIRS, ModBlocks.BLUE_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.PURPLE_TERRACOTTA, ModBlocks.PURPLE_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.PURPLE_TERRACOTTA_STAIRS, ModBlocks.PURPLE_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.PINK_TERRACOTTA, ModBlocks.PINK_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.PINK_TERRACOTTA_STAIRS, ModBlocks.PINK_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.MAGENTA_TERRACOTTA, ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.MAGENTA_TERRACOTTA_STAIRS, ModBlocks.MAGENTA_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.BROWN_TERRACOTTA, ModBlocks.BROWN_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.BROWN_TERRACOTTA_STAIRS, ModBlocks.BROWN_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.BLACK_TERRACOTTA, ModBlocks.BLACK_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.BLACK_TERRACOTTA_STAIRS, ModBlocks.BLACK_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.WHITE_TERRACOTTA, ModBlocks.WHITE_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.WHITE_TERRACOTTA_STAIRS, ModBlocks.WHITE_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.GRAY_TERRACOTTA, ModBlocks.GRAY_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.GRAY_TERRACOTTA_STAIRS, ModBlocks.GRAY_TERRACOTTA_SLAB);
            entries.addAfter(Blocks.LIGHT_GRAY_TERRACOTTA, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.WHITE_TERRACOTTA_SLAB, ModBlocks.WHITE_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.ORANGE_TERRACOTTA_SLAB, ModBlocks.ORANGE_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.MAGENTA_TERRACOTTA_SLAB, ModBlocks.MAGENTA_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.YELLOW_TERRACOTTA_SLAB, ModBlocks.YELLOW_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.LIME_TERRACOTTA_SLAB, ModBlocks.LIME_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.GREEN_TERRACOTTA_SLAB, ModBlocks.GREEN_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.PINK_TERRACOTTA_SLAB, ModBlocks.PINK_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.GRAY_TERRACOTTA_SLAB, ModBlocks.GRAY_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.CYAN_TERRACOTTA_SLAB, ModBlocks.CYAN_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.PURPLE_TERRACOTTA_SLAB, ModBlocks.PURPLE_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.BLUE_TERRACOTTA_SLAB, ModBlocks.BLUE_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.BROWN_TERRACOTTA_SLAB, ModBlocks.BROWN_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.BLACK_TERRACOTTA_SLAB, ModBlocks.BLACK_TERRACOTTA_WALL);
            entries.addAfter(ModBlocks.RED_TERRACOTTA_SLAB, ModBlocks.RED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.TERRACOTTA_STAIRS, ModBlocks.TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.TERRACOTTA_SLAB, ModBlocks.TERRACOTTA_WALL);
        });
    }
}
