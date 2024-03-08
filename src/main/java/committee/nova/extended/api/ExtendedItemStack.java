package committee.nova.extended.api;

import net.minecraft.nbt.CompoundTag;

import java.util.Optional;

public interface ExtendedItemStack {
    Optional<CompoundTag> extended$getOptionalTag();
}
