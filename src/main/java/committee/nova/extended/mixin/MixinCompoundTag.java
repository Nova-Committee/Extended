package committee.nova.extended.mixin;

import committee.nova.extended.api.ExtendedCompoundTag;
import committee.nova.pollutive.util.*;
import committee.nova.util.Try;
import net.minecraft.nbt.*;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Optional;

@Mixin(CompoundTag.class)
public abstract class MixinCompoundTag implements ExtendedCompoundTag {
    @Shadow
    @Final
    private Map<String, Tag> tags;

    @Shadow
    @Nullable
    public abstract Tag put(String pKey, Tag pValue);

    @Shadow
    @Nullable
    public abstract Tag get(String pKey);

    @Shadow
    public abstract byte getTagType(String pKey);

    @Shadow
    public abstract boolean contains(String pKey, int pTagType);

    @Override
    public Optional<Tag> extended$getOptionalTag(String name) {
        return Optional.ofNullable(this.get(name));
    }

    @Override
    public OptionalByte extended$getOptionalByte(String name) {
        return this.contains(name, 99) ?
                Try.of(() -> OptionalByte.of(((NumericTag) this.tags.get(name)).getAsByte()))
                        .getOrElse(OptionalByte.empty()) :
                OptionalByte.empty();
    }

    @Override
    public OptionalByte extended$getStrictByte(String name) {
        return this.contains(name, 1) ?
                Try.of(() -> OptionalByte.of(((ByteTag) this.tags.get(name)).getAsByte()))
                        .getOrElse(OptionalByte.empty()) :
                OptionalByte.empty();
    }

    @Override
    public OptionalShort extended$getOptionalShort(String name) {
        return this.contains(name, 99) ?
                Try.of(() -> OptionalShort.of(((NumericTag) this.tags.get(name)).getAsShort()))
                        .getOrElse(OptionalShort.empty()) :
                OptionalShort.empty();
    }

    @Override
    public OptionalShort extended$getStrictShort(String name) {
        return this.contains(name, 2) ?
                Try.of(() -> OptionalShort.of(((ShortTag) this.tags.get(name)).getAsShort()))
                        .getOrElse(OptionalShort.empty()) :
                OptionalShort.empty();
    }

    @Override
    public OptionalInt extended$getOptionalInt(String name) {
        return this.contains(name, 99) ?
                Try.of(() -> OptionalInt.of(((NumericTag) this.tags.get(name)).getAsInt()))
                        .getOrElse(OptionalInt.empty()) :
                OptionalInt.empty();
    }

    @Override
    public OptionalInt extended$getStrictInt(String name) {
        return this.contains(name, 3) ?
                Try.of(() -> OptionalInt.of(((IntTag) this.tags.get(name)).getAsInt()))
                        .getOrElse(OptionalInt.empty()) :
                OptionalInt.empty();
    }

    @Override
    public OptionalLong extended$getOptionalLong(String name) {
        return this.contains(name, 99) ?
                Try.of(() -> OptionalLong.of(((NumericTag) this.tags.get(name)).getAsLong()))
                        .getOrElse(OptionalLong.empty()) :
                OptionalLong.empty();
    }

    @Override
    public OptionalLong extended$getStrictLong(String name) {
        return this.contains(name, 4) ?
                Try.of(() -> OptionalLong.of(((LongTag) this.tags.get(name)).getAsLong()))
                        .getOrElse(OptionalLong.empty()) :
                OptionalLong.empty();
    }

    @Override
    public OptionalFloat extended$getOptionalFloat(String name) {
        return this.contains(name, 99) ?
                Try.of(() -> OptionalFloat.of(((NumericTag) this.tags.get(name)).getAsFloat()))
                        .getOrElse(OptionalFloat.empty()) :
                OptionalFloat.empty();
    }

    @Override
    public OptionalFloat extended$getStrictFloat(String name) {
        return this.contains(name, 5) ?
                Try.of(() -> OptionalFloat.of(((FloatTag) this.tags.get(name)).getAsFloat()))
                        .getOrElse(OptionalFloat.empty()) :
                OptionalFloat.empty();
    }

    @Override
    public OptionalDouble extended$getOptionalDouble(String name) {
        return this.contains(name, 99) ?
                Try.of(() -> OptionalDouble.of(((NumericTag) this.tags.get(name)).getAsDouble()))
                        .getOrElse(OptionalDouble.empty()) :
                OptionalDouble.empty();
    }

    @Override
    public OptionalDouble extended$getStrictDouble(String name) {
        return this.contains(name, 6) ?
                Try.of(() -> OptionalDouble.of(((DoubleTag) this.tags.get(name)).getAsDouble()))
                        .getOrElse(OptionalDouble.empty()) :
                OptionalDouble.empty();
    }

    @Override
    public Optional<String> extended$getOptionalString(String name) {
        return this.contains(name, 8) ?
                Try.of(() -> (this.tags.get(name)).getAsString()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<byte[]> extended$getOptionalByteArray(String name) {
        return this.contains(name, 7) ?
                Try.of(() -> ((ByteArrayTag) this.tags.get(name)).getAsByteArray()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<int[]> extended$getOptionalIntArray(String name) {
        return this.contains(name, 11) ?
                Try.of(() -> ((IntArrayTag) this.tags.get(name)).getAsIntArray()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<long[]> extended$getOptionalLongArray(String name) {
        return this.contains(name, 12) ?
                Try.of(() -> ((LongArrayTag) this.tags.get(name)).getAsLongArray()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<CompoundTag> extended$getOptionalCompound(String name) {
        return this.contains(name, 10) ?
                Try.of(() -> (CompoundTag) this.tags.get(name)).toOptional() :
                Optional.empty();
    }

    @Override
    public CompoundTag extended$getOrCreateCompound(String name) {
        try {
            if (this.contains(name, 10)) return (CompoundTag) this.tags.get(name);
        } catch (ClassCastException ignored) {
        }
        final CompoundTag newTag = new CompoundTag();
        this.put(name, newTag);
        return newTag;
    }

    @Override
    public Optional<ListTag> extended$getOptionalList(String name, int type) {
        return this.getTagType(name) == 9 ?
                Try.of(() -> {
                    final ListTag list = (ListTag) this.tags.get(name);
                    if (!list.isEmpty() && list.getElementType() != type) return null;
                    return list;
                }).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<ListTag> extended$getOrCreateList(String name, int type) {
        try {
            if (this.getTagType(name) == 9) {
                final ListTag list = (ListTag) this.tags.get(name);
                if (!list.isEmpty() && list.getElementType() != type) return Optional.empty();
                return Optional.of(list);
            }
        } catch (ClassCastException ignored) {
        }
        return Optional.empty();
    }

    @Override
    public ListTag extended$getOrForceCreateList(String name, int type) {
        try {
            if (this.getTagType(name) == 9) {
                final ListTag list = (ListTag) this.tags.get(name);
                if (!list.isEmpty() && list.getElementType() != type) {
                    final ListTag newList = new ListTag();
                    this.tags.put(name, newList);
                    return newList;
                }
                return list;
            }
        } catch (ClassCastException ignored) {
        }
        final ListTag newTag = new ListTag();
        this.put(name, newTag);
        return newTag;
    }
}
