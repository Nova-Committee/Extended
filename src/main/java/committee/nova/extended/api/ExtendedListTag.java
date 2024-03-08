package committee.nova.extended.api;

import committee.nova.pollutive.util.*;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;

import java.util.Optional;

public interface ExtendedListTag {
    Optional<CompoundTag> extended$getOptionalCompound(int index);

    Optional<ListTag> extended$getOptionalList(int index);

    Optional<ListTag> extended$getOptionalList(int index, int type);

    byte extended$getByte(int index);

    OptionalByte extended$getOptionalByte(int index);

    OptionalByte extended$getStrictByte(int index);

    OptionalShort extended$getOptionalShort(int index);

    OptionalShort extended$getStrictShort(int index);

    OptionalInt extended$getOptionalInt(int index);

    OptionalInt extended$getStrictInt(int index);

    long extended$getLong(int index);

    OptionalLong extended$getOptionalLong(int index);

    OptionalLong extended$getStrictLong(int index);

    OptionalFloat extended$getOptionalFloat(int index);

    OptionalFloat extended$getStrictFloat(int index);

    OptionalDouble extended$getOptionalDouble(int index);

    OptionalDouble extended$getStrictDouble(int index);

    Optional<String> extended$getOptionalString(int index);

    Optional<String> extended$getStrictString(int index);

    byte[] extended$getByteArray(int index);

    Optional<byte[]> extended$getOptionalByteArray(int index);

    Optional<int[]> extended$getOptionalIntArray(int index);

    Optional<long[]> extended$getOptionalLongArray(int index);

    Optional<Tag> extended$getOptionalTag(int index);

    default boolean extended$getBoolean(int index) {
        return extended$getByte(index) != 0;
    }

    default Optional<Boolean> extended$getOptionalBoolean(int index) {
        return extended$getOptionalByte(index).map(b -> b != 0);
    }
}
