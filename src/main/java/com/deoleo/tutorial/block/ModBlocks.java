package com.deoleo.tutorial.block;

import com.deoleo.tutorial.TutorialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


//    public static final Block DRIPSTONE_BLOCK = register(
//            "dripstone_block",
//            new Block(
//                    AbstractBlock.Settings.create()
//                            .mapColor(MapColor.TERRACOTTA_BROWN)
//                            .instrument(Instrument.BASEDRUM)
//                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
//                            .requiresTool()
//                            .strength(1.5F, 1.0F)
//            )
//    );

//    public static final Block ICE_ETHER_BLOCK = register(
//            "ice_ether_block.json",
//            new Block(
//                    AbstractBlock.Settings.copy(Blocks.STONE)
//            )
//    );

    public static final Block ICE_ETHER_BLOCK = register(
            "ice_ether_block",
            new Block(
                    AbstractBlock.Settings.copy(Blocks.STONE)
            )
    );


    public static final Block RAW_ICE_ETHER_BLOCK = register(
            "raw_ice_ether_block",
            new Block(
                    AbstractBlock.Settings.create().strength(0.2f, 0.2f)
            )
    );

    public static final Block ICE_ETHER_ORE = register(
            "ice_ether_ore",
            new Block(
                    AbstractBlock.Settings.create().strength(3.0f, 3.0f)
            )
    );



    public static Block register(String id, Block block) {
        registerBlockItems(id, block);//因为block方块的注册额外需要注册为物品，所以这里调用了一个下面准备好的注册为物品的函数，本质上还是原版自带的Registry.register
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, id), block);
    }

    public static void registerBlockItems(String id, Block block) {
        Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {

    }
}
