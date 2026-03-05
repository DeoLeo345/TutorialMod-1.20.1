package com.deoleo.tutorial.item;

import com.deoleo.tutorial.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ICE_ETHER = registerItem("ice_ether", new Item(new Item.Settings()));
    public static final Item RAW_ICE_ETHER = registerItem("raw_ice_ether", new Item(new Item.Settings()));//给写掉落物做准备
    public static final Item CARDBOARD = registerItem("material/cardboard", new Item(new Item.Settings()));



    public static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), new Identifier(TutorialMod.MOD_ID, id)), item);
    }

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, id), item);
    }


    //下面的函数是上面物品创建注册函数的替代品，没有用，可以注释掉
//    public static Item register(String id, Item item) {
//        return register(new Identifier(TutorialMod.MOD_ID,id), item);
//    }
//
//    public static Item register(Identifier id, Item item) {
//        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
//    }
//
//    public static Item register(RegistryKey<Item> key, Item item) {
//        if (item instanceof BlockItem) {
//            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
//        }
//
//        return Registry.register(Registries.ITEM, key, item);
//    }




    //下面函数是一种把创建注册好的物品加入到原版物品栏的方法，因为我新建了一个mod专用的物品栏，所以可以注释掉
//    private static void addItemToItemGroup(FabricItemGroupEntries entries) {
//        entries.add(ICE_ETHER);
//        entries.add(RAW_ICE_ETHER);
//    }
//
//    private static void addItemToItemGroup2(FabricItemGroupEntries entries) {
//        entries.add(CARDBOARD);
//    }

    public static void registerItems() {
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemToItemGroup);
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToItemGroup2);
    }
}
