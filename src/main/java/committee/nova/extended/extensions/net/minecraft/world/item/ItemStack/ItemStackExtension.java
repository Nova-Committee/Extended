package committee.nova.extended.extensions.net.minecraft.world.item.ItemStack;

import committee.nova.extended.api.ExtendedItemStack;
import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;

import java.util.Optional;

@Extension
public class ItemStackExtension {
    public static Optional<CompoundTag> getOptionalTag(@This ItemStack $this) {
        return extended($this).extended$getOptionalTag();
    }

    private static ExtendedItemStack extended(ItemStack stack) {
        return (ExtendedItemStack) (Object) stack;
    }
}
