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

    public static Optional<Tag> getOptionalTag(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalTag(name);
    }


    public static OptionalByte getOptionalByte(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalByte(name);
    }


    public static OptionalByte getStrictByte(@This CompoundTag $this, String name) {
        return extended($this).extended$getStrictByte(name);
    }


    public static OptionalShort getOptionalShort(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalShort(name);
    }


    public static OptionalShort getStrictShort(@This CompoundTag $this, String name) {
        return extended($this).extended$getStrictShort(name);
    }


    public static OptionalInt getOptionalInt(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalInt(name);
    }


    public static OptionalInt getStrictInt(@This CompoundTag $this, String name) {
        return extended($this).extended$getStrictInt(name);
    }


    public static OptionalLong getOptionalLong(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalLong(name);
    }


    public static OptionalLong getStrictLong(@This CompoundTag $this, String name) {
        return extended($this).extended$getStrictLong(name);
    }


    public static OptionalFloat getOptionalFloat(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalFloat(name);
    }


    public static OptionalFloat getStrictFloat(@This CompoundTag $this, String name) {
        return extended($this).extended$getStrictFloat(name);
    }


    public static OptionalDouble getOptionalDouble(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalDouble(name);
    }


    public static OptionalDouble getStrictDouble(@This CompoundTag $this, String name) {
        return extended($this).extended$getStrictDouble(name);
    }


    public static Optional<String> getOptionalString(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalString(name);
    }


    public static Optional<byte[]> getOptionalByteArray(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalByteArray(name);
    }


    public static Optional<int[]> getOptionalIntArray(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalIntArray(name);
    }


    public static Optional<long[]> getOptionalLongArray(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalLongArray(name);
    }


    public static Optional<CompoundTag> getOptionalCompound(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalCompound(name);
    }


    public static CompoundTag getOrCreateCompound(@This CompoundTag $this, String name) {
        return extended($this).extended$getOrCreateCompound(name);
    }


    public static Optional<ListTag> getOptionalList(@This CompoundTag $this, String name, int type) {
        return extended($this).extended$getOptionalList(name, type);
    }


    public static Optional<ListTag> getOrCreateList(@This CompoundTag $this, String name, int type) {
        return extended($this).extended$getOrCreateList(name, type);
    }


    public static ListTag getOrForceCreateList(@This CompoundTag $this, String name, int type) {
        return extended($this).extended$getOrForceCreateList(name, type);
    }


    public static Optional<Boolean> getOptionalBoolean(@This CompoundTag $this, String name) {
        return extended($this).extended$getOptionalBoolean(name);
    }

    private static ExtendedCompoundTag extended(CompoundTag tag) {
        return (ExtendedCompoundTag) tag;
    }
}