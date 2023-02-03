package top.biannetwork.biantools;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Client_Initialize implements ClientModInitializer {
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());
    public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    @Override
    public void onInitializeClient() {
        Main.LOGGER.info("Biantools-Client");
        Registry.register(Registries.ITEM, new Identifier("biantools", "custom_item"), CUSTOM_ITEM);
        Registry.register(Registries.BLOCK, new Identifier("tutorial", "example_block"), EXAMPLE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("tutorial", "example_block"), new BlockItem(EXAMPLE_BLOCK, new FabricItemSettings()));
    }
}

