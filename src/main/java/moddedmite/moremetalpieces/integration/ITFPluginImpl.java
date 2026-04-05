package moddedmite.moremetalpieces.integration;

import com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks;
import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import moddedmite.moremetalpieces.item.MMPItems;
import net.oilcake.mitelros.api.ITFPlugin;
import net.oilcake.mitelros.api.ITFRegistry;

public class ITFPluginImpl implements ITFPlugin {
    @Override
    public void register(ITFRegistry registry) {
        // override drops
        registry.registerOrePiece(MMBlocks.oreAdamantium, MMPItems.ADAMANTIUM_PIECES.itemID);
        registry.registerOrePiece(MMBlocks.oreAluminium, MMPItems.ALUMINIUM_PIECES.itemID);
        registry.registerOrePiece(MMBlocks.oreManganese, MMPItems.MANGANESE_PIECES.itemID);
        registry.registerOrePiece(MMBlocks.oreMidas_Gold, MMPItems.MIDAS_GOLD_PIECES.itemID);
        registry.registerOrePiece(MMBlocks.orePlatinum, MMPItems.PLATINUM_PIECES.itemID);
        registry.registerOrePiece(MMBlocks.oreTin, MMPItems.TIN_PIECES.itemID);
        registry.registerOrePiece(MMBlocks.oreTitanium, MMPItems.TITANIUM_PIECES.itemID);

        // stronger metals are harder to smelt
        registry.registerSmeltingSpeedModifier(MMPItems.ALUMINIUM_PIECES, 4);
        registry.registerSmeltingSpeedModifier(MMPItems.ADAMANTIUM_PIECES, 2);
        registry.registerSmeltingSpeedModifier(MMPItems.MANGANESE_PIECES, 4);
        registry.registerSmeltingSpeedModifier(MMPItems.MIDAS_GOLD_PIECES, 2);
        registry.registerSmeltingSpeedModifier(MMPItems.PLATINUM_PIECES, 2);
        registry.registerSmeltingSpeedModifier(MMPItems.TIN_PIECES, 4);
        registry.registerSmeltingSpeedModifier(MMPItems.TITANIUM_PIECES, 2);

        // melting enchantment
        registry.registerOreMelting(MMBlocks.oreAdamantium, MMItems.adamantiumNugget.itemID);
        registry.registerOreMelting(MMBlocks.oreAluminium, MMItems.aluminium_nugget.itemID);
        registry.registerOreMelting(MMBlocks.oreManganese, MMItems.manganese_nugget.itemID);
        registry.registerOreMelting(MMBlocks.oreMidas_Gold, MMItems.midas_gold_nugget.itemID);
        registry.registerOreMelting(MMBlocks.orePlatinum, MMItems.platinum_nugget.itemID);
        registry.registerOreMelting(MMBlocks.oreTin, MMItems.tin_nugget.itemID);
        registry.registerOreMelting(MMBlocks.oreTitanium, MMItems.titanium_nugget.itemID);

        registry.registerOreMeltingSilkTouch(MMBlocks.oreAdamantium, MMItems.adamantium_ingot.itemID);
        registry.registerOreMeltingSilkTouch(MMBlocks.oreAluminium, MMItems.aluminium_ingot.itemID);
        registry.registerOreMeltingSilkTouch(MMBlocks.oreManganese, MMItems.manganese_ingot.itemID);
        registry.registerOreMeltingSilkTouch(MMBlocks.oreMidas_Gold, MMItems.midas_gold_ingot.itemID);
        registry.registerOreMeltingSilkTouch(MMBlocks.orePlatinum, MMItems.platinum_ingot.itemID);
        registry.registerOreMeltingSilkTouch(MMBlocks.oreTin, MMItems.tin_ingot.itemID);
        registry.registerOreMeltingSilkTouch(MMBlocks.oreTitanium, MMItems.titanium_ingot.itemID);
    }
}
