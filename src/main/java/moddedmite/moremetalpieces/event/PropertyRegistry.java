package moddedmite.moremetalpieces.event;

import moddedmite.moremetalpieces.item.MMPItems;
import moddedmite.rustedironcore.property.ItemProperties;

public class PropertyRegistry {
    public static void run() {
        ItemProperties.HeatLevelRequired.register(MMPItems.ALUMINIUM_PIECES, 2);
        ItemProperties.HeatLevelRequired.register(MMPItems.ADAMANTIUM_PIECES, 4);
        ItemProperties.HeatLevelRequired.register(MMPItems.MANGANESE_PIECES, 2);
        ItemProperties.HeatLevelRequired.register(MMPItems.MIDAS_GOLD_PIECES, 4);
        ItemProperties.HeatLevelRequired.register(MMPItems.PLATINUM_PIECES, 3);
        ItemProperties.HeatLevelRequired.register(MMPItems.TIN_PIECES, 2);
        ItemProperties.HeatLevelRequired.register(MMPItems.TITANIUM_PIECES, 4);
    }
}
