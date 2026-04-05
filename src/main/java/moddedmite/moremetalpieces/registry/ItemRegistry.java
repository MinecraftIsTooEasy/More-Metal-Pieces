package moddedmite.moremetalpieces.registry;

import huix.glacier.api.extension.creativetab.GlacierCreativeTabs;
import moddedmite.moremetalpieces.MoreMetalPieces;
import moddedmite.moremetalpieces.item.MMPItems;
import net.minecraft.CreativeTabs;
import net.minecraft.Item;
import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;

public class ItemRegistry {
    public static final CreativeTabs MMP_ITEM = new GlacierCreativeTabs("moremetalpieces.item") {
        @Override
        public int getTabIconItemIndex() {
            return MMPItems.TITANIUM_PIECES.itemID;
        }
    };

    private final ItemRegistryEvent event;

    public ItemRegistry(ItemRegistryEvent event) {
        this.event = event;
    }

    public void run() {
        MMPItems.bootstrap();
        MMPRegistry.ITEM.forEach(this::register);
    }

    private void register(String id, Item item) {
        String texture = MoreMetalPieces.MOD_ID + ":" + id;
        this.event.register(MoreMetalPieces.MOD_ID, texture, id, item, MMP_ITEM);
    }
}
