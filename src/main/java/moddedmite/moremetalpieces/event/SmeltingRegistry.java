package moddedmite.moremetalpieces.event;

import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import moddedmite.moremetalpieces.item.MMPItems;
import moddedmite.rustedironcore.api.event.events.SmeltingRecipeRegisterEvent;

public class SmeltingRegistry {
    public static void run(SmeltingRecipeRegisterEvent event) {
        event.register(MMPItems.ALUMINIUM_PIECES, MMItems.aluminium_nugget);
        event.register(MMPItems.ADAMANTIUM_PIECES, MMItems.adamantium_nugget);
        event.register(MMPItems.MANGANESE_PIECES, MMItems.manganese_nugget);
        event.register(MMPItems.MIDAS_GOLD_PIECES, MMItems.midas_gold_nugget);
        event.register(MMPItems.PLATINUM_PIECES, MMItems.platinum_nugget);
        event.register(MMPItems.TIN_PIECES, MMItems.tin_nugget);
        event.register(MMPItems.TITANIUM_PIECES, MMItems.titanium_nugget);
    }
}
