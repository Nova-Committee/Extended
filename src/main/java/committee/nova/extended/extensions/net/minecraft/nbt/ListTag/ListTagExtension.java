package committee.nova.extended.extensions.net.minecraft.nbt.ListTag;

import committee.nova.extended.api.ExtendedListTag;
import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

@SuppressWarnings("unused")
@Extension
public class ListTagExtension {
    @Extension
    public static Optional<Tag> getOptionalTag(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalTag(index);
    }

    @Extension
    public static byte getByte(@This ListTag $this, int index) {
        return extended($this).extended$getByte(index);
    }

    @Extension
    public static Optional<Byte> getOptionalByte(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalByte(index);
    }

    @Extension
    public static Optional<Byte> getStrictByte(@This ListTag $this, int index) {
        return extended($this).extended$getStrictByte(index);
    }

    @Extension
    public static Optional<Short> getOptionalShort(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalShort(index);
    }

    @Extension
    public static Optional<Short> getStrictShort(@This ListTag $this, int index) {
        return extended($this).extended$getStrictShort(index);
    }

    @Extension
    public static OptionalInt getOptionalInt(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalInt(index);
    }

    @Extension
    public static OptionalInt getStrictInt(@This ListTag $this, int index) {
        return extended($this).extended$getStrictInt(index);
    }

    @Extension
    public static long getLong(@This ListTag $this, int index) {
        return extended($this).extended$getLong(index);
    }

    @Extension
    public static OptionalLong getOptionalLong(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalLong(index);
    }

    @Extension
    public static OptionalLong getStrictLong(@This ListTag $this, int index) {
        return extended($this).extended$getStrictLong(index);
    }

    @Extension
    public static Optional<Float> getOptionalFloat(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalFloat(index);
    }

    @Extension
    public static Optional<Float> getStrictFloat(@This ListTag $this, int index) {
        return extended($this).extended$getStrictFloat(index);
    }

    @Extension
    public static OptionalDouble getOptionalDouble(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalDouble(index);
    }

    @Extension
    public static OptionalDouble getStrictDouble(@This ListTag $this, int index) {
        return extended($this).extended$getStrictDouble(index);
    }

    @Extension
    public static Optional<String> getOptionalString(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalString(index);
    }

    @Extension
    public static Optional<String> getStrictString(@This ListTag $this, int index) {
        return extended($this).extended$getStrictString(index);
    }

    @Extension
    public static byte[] getByteArray(@This ListTag $this, int index) {
        return extended($this).extended$getByteArray(index);
    }

    @Extension
    public static Optional<byte[]> getOptionalByteArray(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalByteArray(index);
    }

    @Extension
    public static Optional<int[]> getOptionalIntArray(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalIntArray(index);
    }

    @Extension
    public static Optional<long[]> getOptionalLongArray(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalLongArray(index);
    }

    @Extension
    public static Optional<CompoundTag> getOptionalCompound(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalCompound(index);
    }

    @Extension
    public static Optional<ListTag> getOptionalList(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalList(index);
    }

    @Extension
    public static Optional<ListTag> getOptionalList(@This ListTag $this, int index, int type) {
        return extended($this).extended$getOptionalList(index, type);
    }

    @Extension
    public static boolean getBoolean(@This ListTag $this, int index) {
        return extended($this).extended$getBoolean(index);
    }

    @Extension
    public static Optional<Boolean> getOptionalBoolean(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalBoolean(index);
    }

    private static ExtendedListTag extended(ListTag tag) {
        return (ExtendedListTag) tag;
    }

    // TODO: We can try to impl a type-safe ListTag
}
