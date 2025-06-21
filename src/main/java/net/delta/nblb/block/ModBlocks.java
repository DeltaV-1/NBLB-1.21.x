package net.delta.nblb.block;

import net.delta.nblb.NBLB;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
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

    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            new Block(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "polished_calcite")))
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

    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "calcite_slab")))
                    .strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            new SlabBlock(AbstractBlock.Settings.create().
                    registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(NBLB.MOD_ID, "polished_calcite_slab")))
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
            entries.addAfter(Blocks.END_STONE, ModBlocks.END_STONE_STAIRS);
            entries.addAfter(ModBlocks.END_STONE_STAIRS, ModBlocks.END_STONE_SLAB);
            entries.addAfter(ModBlocks.END_STONE_SLAB, ModBlocks.END_STONE_WALL);
        });
    }
}
