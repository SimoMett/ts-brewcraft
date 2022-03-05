package com.trufflez.tsbrewcraft.item;

import com.trufflez.tsbrewcraft.TsBrewcraft;
import com.trufflez.tsbrewcraft.block.TsBlocks;
import com.trufflez.tsbrewcraft.item.custom.DrinkItem;
import com.trufflez.tsbrewcraft.item.custom.MaltovCocktail;
import com.trufflez.tsbrewcraft.item.custom.TsItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TsItems {
    public static final Item BARLEY;
    public static final Item PALE_MALT;
    public static final Item DARK_MALT;
    public static final Item HOPS;
    public static final Item RICE;
    public static final Item STEAMED_RICE;
    public static final Item MOLDY_RICE;
    public static final Item GRAPES;
    public static final Item GRAPE_SEEDS;
    public static final Item CORN;
    public static final Item AGAVE;
    
    public static final Item BEER;
    public static final Item WHEAT_BEER;
    public static final Item MALT_LIQUOR;
    public static final Item LAMBIC;
    public static final Item SAKE;
    public static final Item RED_WINE;
    public static final Item WHITE_WINE;
    public static final Item ROSE;
    public static final Item CHAMPAGNE;
    
    public static final Item RUM;
    public static final Item TEQUILA;
    public static final Item VODKA;
    public static final Item BRANDY;
    public static final Item WHISKEY;
    public static final Item BOURBON;
    public static final Item SHOCHU;
    public static final Item MOONSHINE;
    
    public static final Item VINEGAR;
    public static final Item CRAPPY_BEER;
    public static final Item CRAPPY_WINE;
    public static final Item STRANGE_WINE;
    
    public static final Item BEER_BOTTLE;
    public static final Item WINE_BOTTLE;
    public static final Item CORK;
    public static final Item CROWN_CAP;
    public static final Item MUSELET;
    public static final Item WINE_THIEF;

    public static final Item MALTOV_COCKTAIL;
    
    //private static BlockItem blockItem(Block block) { return new BlockItem(block, new FabricItemSettings().group(TsItemGroups.MAIN)); }

    private static Item register(String id, Item item) { return Registry.register(Registry.ITEM, new Identifier(TsBrewcraft.MOD_ID, id), item); }

    //private static BlockItem register(String id, BlockItem blockItem) { return Registry.register(Registry.ITEM, new Identifier(TsBrewcraft.MOD_ID, id), blockItem); }
    
    static {
        BARLEY = register("barley", new BlockItem(TsBlocks.BARLEY, new FabricItemSettings().group(TsItemGroups.MAIN)));
        PALE_MALT = register("pale_malt", new Item(new FabricItemSettings().group(TsItemGroups.MAIN)));
        DARK_MALT = register("dark_malt", new Item(new FabricItemSettings().group(TsItemGroups.MAIN)));
        HOPS = register("hops", new Item(new FabricItemSettings().group(TsItemGroups.MAIN)));
        RICE = register("rice", new BlockItem(TsBlocks.RICE, new FabricItemSettings().group(TsItemGroups.MAIN)));
        STEAMED_RICE = register("steamed_rice", new Item(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.STEAMED_RICE)));
        MOLDY_RICE = register("moldy_rice", new Item(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.MOLDY_RICE)));
        GRAPES = register("grapes", new Item(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.GRAPES)));
        GRAPE_SEEDS = register("grape_seeds", new Item(new FabricItemSettings().group(TsItemGroups.MAIN)));
        CORN = register("corn", new Item(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.CORN)));
        AGAVE = register("agave", new Item(new FabricItemSettings().group(TsItemGroups.MAIN)));
        
        BEER = register("beer", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.BEER)));
        WHEAT_BEER = register("wheat_beer", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.WHEAT_BEER)));
        MALT_LIQUOR = register("malt_liquor", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.MALT_LIQUOR)));
        LAMBIC = register("lambic", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.LAMBIC)));
        SAKE = register("sake", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.SAKE)));
        RED_WINE = register("red_wine", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.RED_WINE)));
        WHITE_WINE = register("white_wine", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.WHITE_WINE)));
        ROSE = register("rose", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.ROSE)));
        CHAMPAGNE = register("champagne", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.CHAMPAGNE)));
        RUM = register("rum", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.RUM)));
        TEQUILA = register("tequila", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.TEQUILA)));
        VODKA = register("vodka", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.VODKA)));
        BRANDY = register("brandy", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.BRANDY)));
        WHISKEY = register("whiskey", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.WHISKEY)));
        BOURBON = register("bourbon", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.BOURBON)));
        SHOCHU = register("shochu", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.SHOCHU)));
        MOONSHINE = register("moonshine", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.MOONSHINE)));
        
        VINEGAR = register("vinegar", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.VINEGAR)));
        CRAPPY_BEER = register("crappy_beer", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.CRAPPY_BEER)));
        CRAPPY_WINE = register("crappy_wine", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.CRAPPY_WINE)));
        STRANGE_WINE = register("strange_wine", new DrinkItem(new FabricItemSettings().group(TsItemGroups.MAIN).food(TsFoodComponents.STRANGE_WINE)));
        
        BEER_BOTTLE = register("beer_bottle", new Item(new FabricItemSettings().group(TsItemGroups.MAIN)));
        WINE_BOTTLE = register("wine_bottle", new Item(new FabricItemSettings().group(TsItemGroups.MAIN)));
        CORK = register("cork", new Item(new FabricItemSettings().group(TsItemGroups.MAIN)));
        CROWN_CAP = register("crown_cap", new Item(new FabricItemSettings().group(TsItemGroups.MAIN)));
        MUSELET = register("muselet", new Item(new FabricItemSettings().group(TsItemGroups.MAIN)));
        WINE_THIEF = register("wine_thief", new Item(new FabricItemSettings().group(TsItemGroups.MAIN)));
        
        MALTOV_COCKTAIL = register("maltov_cocktail", new MaltovCocktail(new FabricItemSettings().group(TsItemGroups.MAIN)));
    }
    
    public static void init() {
        TsBrewcraft.LOGGER.debug("Registering items");
    }
}