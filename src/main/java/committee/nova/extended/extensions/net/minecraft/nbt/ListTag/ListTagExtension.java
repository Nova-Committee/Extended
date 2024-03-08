package committee.nova.extended.extensions.net.minecraft.nbt.ListTag;

import committee.nova.extended.api.ExtendedListTag;
import committee.nova.pollutive.util.*;
import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;

import java.util.Optional;

@SuppressWarnings("unused")
@Extension
public class ListTagExtension {

    public static Optional<Tag> getOptionalTag(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalTag(index);
    }


    public static byte getByte(@This ListTag $this, int index) {
        return extended($this).extended$getByte(index);
    }


    public static OptionalByte getOptionalByte(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalByte(index);
    }


    public static OptionalByte getStrictByte(@This ListTag $this, int index) {
        return extended($this).extended$getStrictByte(index);
    }


    public static OptionalShort getOptionalShort(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalShort(index);
    }


    public static OptionalShort getStrictShort(@This ListTag $this, int index) {
        return extended($this).extended$getStrictShort(index);
    }


    public static OptionalInt getOptionalInt(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalInt(index);
    }


    public static OptionalInt getStrictInt(@This ListTag $this, int index) {
        return extended($this).extended$getStrictInt(index);
    }


    public static long getLong(@This ListTag $this, int index) {
        return extended($this).extended$getLong(index);
    }


    public static OptionalLong getOptionalLong(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalLong(index);
    }


    public static OptionalLong getStrictLong(@This ListTag $this, int index) {
        return extended($this).extended$getStrictLong(index);
    }


    public static OptionalFloat getOptionalFloat(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalFloat(index);
    }


    public static OptionalFloat getStrictFloat(@This ListTag $this, int index) {
        return extended($this).extended$getStrictFloat(index);
    }


    public static OptionalDouble getOptionalDouble(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalDouble(index);
    }


    public static OptionalDouble getStrictDouble(@This ListTag $this, int index) {
        return extended($this).extended$getStrictDouble(index);
    }


    public static Optional<String> getOptionalString(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalString(index);
    }


    public static Optional<String> getStrictString(@This ListTag $this, int index) {
        return extended($this).extended$getStrictString(index);
    }


    public static byte[] getByteArray(@This ListTag $this, int index) {
        return extended($this).extended$getByteArray(index);
    }


    public static Optional<byte[]> getOptionalByteArray(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalByteArray(index);
    }


    public static Optional<int[]> getOptionalIntArray(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalIntArray(index);
    }


    public static Optional<long[]> getOptionalLongArray(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalLongArray(index);
    }


    public static Optional<CompoundTag> getOptionalCompound(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalCompound(index);
    }


    public static Optional<ListTag> getOptionalList(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalList(index);
    }


    public static Optional<ListTag> getOptionalList(@This ListTag $this, int index, int type) {
        return extended($this).extended$getOptionalList(index, type);
    }


    public static boolean getBoolean(@This ListTag $this, int index) {
        return extended($this).extended$getBoolean(index);
    }


    public static Optional<Boolean> getOptionalBoolean(@This ListTag $this, int index) {
        return extended($this).extended$getOptionalBoolean(index);
    }

    private static ExtendedListTag extended(ListTag tag) {
        return (ExtendedListTag) tag;
    }
}
