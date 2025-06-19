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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CHISELED_CALCITE = registerBlock("chiseled_calcite",
            new Block(AbstractBlock.Settings.create().strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.15f).requiresTool()));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.15f).requiresTool()));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.15f).requiresTool()));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.15f).requiresTool()));
    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.15f).requiresTool()));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.15f).requiresTool()));
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(0.575f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(NBLB.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(NBLB.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
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
        });
    }
}
