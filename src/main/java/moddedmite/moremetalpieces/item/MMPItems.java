package moddedmite.moremetalpieces.item;

import moddedmite.moremetalpieces.reference.ITFReference;
import moddedmite.moremetalpieces.registry.MMPRegistry;
import net.minecraft.Item;
import net.minecraft.Material;
import net.oilcake.mitelros.item.ItemPieces;
import net.xiaoyu233.fml.reload.utils.IdUtil;

public class MMPItems {

    //
//    public static final Item ADAMANTIUM_PIECES = new ItemPieces(nextId(), Materials.adamantium, "adamantium_pieces");
//    public static final Item ALUMINIUM_PIECES = new ItemPieces(nextId(), Materials.aluminium, "aluminium_pieces");
//    public static final Item MANGANESE_PIECES = new ItemPieces(nextId(), Materials.manganese, "manganese_pieces");
//    public static final Item MIDAS_GOLD_PIECES = new ItemPieces(nextId(), Materials.midas_gold, "midas_gold_pieces");
//    public static final Item PLATINUM_PIECES = new ItemPieces(nextId(), Materials.platinum, "platinum_pieces");
//    public static final Item TIN_PIECES = new ItemPieces(nextId(), Materials.tin, "tin_pieces");
//    public static final Item TITANIUM_PIECES = new ItemPieces(nextId(), Materials.titanium, "titanium_pieces");

    public static final Item ADAMANTIUM_PIECES = of("adamantium_pieces", ITFReference.orePieces(), ItemPieces::new);
    public static final Item ALUMINIUM_PIECES = of("aluminium_pieces", ITFReference.orePieces(), ItemPieces::new);
    public static final Item MANGANESE_PIECES = of("manganese_pieces", ITFReference.orePieces(), ItemPieces::new);
    public static final Item MIDAS_GOLD_PIECES = of("midas_gold_pieces", ITFReference.orePieces(), ItemPieces::new);
    public static final Item PLATINUM_PIECES = of("platinum_pieces", ITFReference.orePieces(), ItemPieces::new);
    public static final Item TIN_PIECES = of("tin_pieces", ITFReference.orePieces(), ItemPieces::new);
    public static final Item TITANIUM_PIECES = of("titanium_pieces", ITFReference.orePieces(), ItemPieces::new);

    private static Item of(String id, Material material, ItemFactory factory) {
        Item item = factory.create(nextId(id), material, id);
        MMPRegistry.ITEM.put(id, item);
        return item;
    }

    private static int nextId(String id) {
        return IdUtil.getNextItemID();
    }

    public static void bootstrap() {
    }

    @FunctionalInterface
    private interface ItemFactory {
        Item create(int id, Material material, String texture);
    }
}
