package moddedmite.moremetalpieces.mixins.item;

import com.moddedmite.mitemod.MoreMetals.material.Materials;
import net.minecraft.ItemIngot;
import net.minecraft.ItemNugget;
import net.minecraft.Material;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemNugget.class)
public class ItemNuggetMixin extends ItemIngot {
    protected ItemNuggetMixin(int id, Material material) {
        super(id, material);
    }

    @Inject(at = @At("RETURN"), method = "<init>(ILnet/minecraft/Material;)V")
    private void injectXP(int id, Material material, CallbackInfo callbackInfo) {
            if (material == Materials.tin || material == Materials.manganese) {
            setXPReward(1);
        } else if (material == Materials.platinum || material == Materials.aluminium) {
            setXPReward(4);
        } else if (material == Materials.titanium) {
            setXPReward(7);
        } else if (material == Materials.adamantium) {
            setXPReward(10);
        } else if (material == Materials.midas_gold) {
            setXPReward(15);
        }
    }
}
