package moddedmite.moremetalpieces.event;

import com.google.common.eventbus.Subscribe;
import moddedmite.moremetalpieces.registry.ItemRegistry;
import moddedmite.rustedironcore.api.event.Handlers;
import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;

public class EventListenerRegistry {
    public static void register() {
        Handlers.PropertiesRegistry.register(PropertyRegistry::run);
        Handlers.Smelting.register(SmeltingRegistry::run);
    }

    @Subscribe
    public void onItemRegistry(ItemRegistryEvent event) {
        new ItemRegistry(event).run();
    }
}
