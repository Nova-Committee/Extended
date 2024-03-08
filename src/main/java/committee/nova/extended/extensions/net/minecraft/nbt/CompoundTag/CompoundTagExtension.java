package committee.nova.extended.extensions.net.minecraft.nbt.CompoundTag;

import committee.nova.extended.api.ExtendedCompoundTag;
import committee.nova.pollutive.util.*;
import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;

import java.util.Optional;

@SuppressWarnings("unused")
@Extension
public class CompoundTagExtension {
    @Extension
    public static Optional<Tag> getOptionalTag(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalTag(name);
    }

    @Extension
    public static OptionalByte getOptionalByte(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalByte(name);
    }

    @Extension
    public static OptionalByte getStrictByte(@This CompoundTag $this, String name) {
        return extended($this).extended$getStrictByte(name);
    }

    @Extension
    public static OptionalShort getOptionalShort(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalShort(name);
    }

    @Extension
    public static OptionalShort getStrictShort(@This CompoundTag $this, String name) {
        return extended($this).extended$getStrictShort(name);
    }

    @Extension
    public static OptionalInt getOptionalInt(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalInt(name);
    }

    @Extension
    public static OptionalInt getStrictInt(@This CompoundTag $this, String name) {
        return extended($this).extended$getStrictInt(name);
    }

    @Extension
    public static OptionalLong getOptionalLong(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalLong(name);
    }

    @Extension
    public static OptionalLong getStrictLong(@This CompoundTag $this, String name) {
        return extended($this).extended$getStrictLong(name);
    }

    @Extension
    public static OptionalFloat getOptionalFloat(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalFloat(name);
    }

    @Extension
    public static OptionalFloat getStrictFloat(@This CompoundTag $this, String name) {
        return extended($this).extended$getStrictFloat(name);
    }

    @Extension
    public static OptionalDouble getOptionalDouble(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalDouble(name);
    }

    @Extension
    public static OptionalDouble getStrictDouble(@This CompoundTag $this, String name) {
        return extended($this).extended$getStrictDouble(name);
    }

    @Extension
    public static Optional<String> getOptionalString(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalString(name);
    }

    @Extension
    public static Optional<byte[]> getOptionalByteArray(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalByteArray(name);
    }

    @Extension
    public static Optional<int[]> getOptionalIntArray(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalIntArray(name);
    }

    @Extension
    public static Optional<long[]> getOptionalLongArray(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalLongArray(name);
    }

    @Extension
    public static Optional<CompoundTag> getOptionalCompound(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalCompound(name);
    }

    @Extension
    public static CompoundTag getOrCreateCompound(@This CompoundTag $this, String name) {
        return extended($this).extended$getOrCreateCompound(name);
    }

    @Extension
    public static Optional<ListTag> getOptionalList(@This CompoundTag $this, String name, int type) {
        return extended($this).extended$getOptionalList(name, type);
    }

    @Extension
    public static Optional<ListTag> getOrCreateList(@This CompoundTag $this, String name, int type) {
        return extended($this).extended$getOrCreateList(name, type);
    }

    @Extension
    public static ListTag getOrForceCreateList(@This CompoundTag $this, String name, int type) {
        return extended($this).extended$getOrForceCreateList(name, type);
    }

    @Extension
    public static Optional<Boolean> getOptionalBoolean(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalBoolean(name);
    }

    private static ExtendedCompoundTag extended(CompoundTag tag) {
        return (ExtendedCompoundTag) tag;
    }
}