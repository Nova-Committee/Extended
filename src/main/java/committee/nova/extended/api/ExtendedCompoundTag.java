package committee.nova.extended.api;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;

import java.util.Optional;

public interface ExtendedCompoundTag {
    Optional<Tag> extended$getOptionalTag(String name);

    Optional<Byte> extended$getOptionalByte(String name);

    Optional<Byte> extended$getStrictByte(String name);

    Optional<Short> extended$getOptionalShort(String name);

    Optional<Short> extended$getStrictShort(String name);

    Optional<Integer> extended$getOptionalInt(String name);

    Optional<Integer> extended$getStrictInt(String name);

    Optional<Long> extended$getOptionalLong(String name);

    Optional<Long> extended$getStrictLong(String name);

    Optional<Float> extended$getOptionalFloat(String name);

    Optional<Float> extended$getStrictFloat(String name);

    Optional<Double> extended$getOptionalDouble(String name);

    Optional<Double> extended$getStrictDouble(String name);

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
        return extended$getOptionalByte(name).map(b -> b != 0);
    }
}
