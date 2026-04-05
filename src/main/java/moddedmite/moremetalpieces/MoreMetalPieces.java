package moddedmite.moremetalpieces;

import moddedmite.moremetalpieces.event.EventListenerRegistry;
import net.fabricmc.api.ModInitializer;
import net.xiaoyu233.fml.ModResourceManager;
import net.xiaoyu233.fml.reload.event.MITEEvents;

public class MoreMetalPieces implements ModInitializer {
    public static final String MOD_ID = "moremetalpieces";

    @Override
    public void onInitialize() {
        ModResourceManager.addResourcePackDomain(MOD_ID);
        EventListenerRegistry.register();
        MITEEvents.MITE_EVENT_BUS.register(new EventListenerRegistry());
    }
}