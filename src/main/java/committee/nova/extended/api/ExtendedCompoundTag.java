package committee.nova.extended.api;

import committee.nova.pollutive.util.*;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;

import java.util.Optional;

public interface ExtendedCompoundTag {
    Optional<Tag> extended$getOptionalTag(String name);

    OptionalByte extended$getOptionalByte(String name);

    OptionalByte extended$getStrictByte(String name);

    OptionalShort extended$getOptionalShort(String name);

    OptionalShort extended$getStrictShort(String name);

    OptionalInt extended$getOptionalInt(String name);

    OptionalInt extended$getStrictInt(String name);

    OptionalLong extended$getOptionalLong(String name);

    OptionalLong extended$getStrictLong(String name);

    OptionalFloat extended$getOptionalFloat(String name);

    OptionalFloat extended$getStrictFloat(String name);

    OptionalDouble extended$getOptionalDouble(String name);

    OptionalDouble extended$getStrictDouble(String name);

    Optional<String> extended$getOptionalString(String name);

    Optional<byte[]> extended$getOptionalByteArray(String name);

    Optional<int[]> extended$getOptionalIntArray(String name);

    Optional<long[]> extended$getOptionalLongArray(String name);

    Optional<CompoundTag> extended$getOptionalCompound(String name);

    CompoundTag extended$getOrCreateCompound(String name);

    Optional<ListTag> extended$getOptionalList(String name, int type);

    Optional<ListTag> extended$getOrCreateList(String name, int type);

    ListTag extended$getOrForceCreateList(String name, int type);

    default Optional<Boolean> extended$getOptionalBoolean(String name) {
        return extended$getOptionalByte(name).boxed().map(b -> b != 0);
    }
}
