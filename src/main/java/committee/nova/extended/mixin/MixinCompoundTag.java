package committee.nova.extended.mixin;

import committee.nova.extended.api.ExtendedCompoundTag;
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
    public abstract boolean contains(String pKey, int pTagType);

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

    @Override
    public Optional<Tag> extended$getOptionalTag(String name) {
        return Optional.ofNullable(this.get(name));
    }

    @Override
    public Optional<Byte> extended$getOptionalByte(String name) {
        return this.contains(name, 99) ?
                Try.of(() -> ((NumericTag) this.tags.get(name)).getAsByte()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<Byte> extended$getStrictByte(String name) {
        return this.contains(name, 1) ?
                Try.of(() -> ((ByteTag) this.tags.get(name)).getAsByte()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<Short> extended$getOptionalShort(String name) {
        return this.contains(name, 99) ?
                Try.of(() -> ((NumericTag) this.tags.get(name)).getAsShort()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<Short> extended$getStrictShort(String name) {
        return this.contains(name, 2) ?
                Try.of(() -> ((ShortTag) this.tags.get(name)).getAsShort()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<Integer> extended$getOptionalInt(String name) {
        return this.contains(name, 99) ?
                Try.of(() -> ((NumericTag) this.tags.get(name)).getAsInt()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<Integer> extended$getStrictInt(String name) {
        return this.contains(name, 3) ?
                Try.of(() -> ((IntTag) this.tags.get(name)).getAsInt()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<Long> extended$getOptionalLong(String name) {
        return this.contains(name, 99) ?
                Try.of(() -> ((NumericTag) this.tags.get(name)).getAsLong()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<Long> extended$getStrictLong(String name) {
        return this.contains(name, 4) ?
                Try.of(() -> ((LongTag) this.tags.get(name)).getAsLong()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<Float> extended$getOptionalFloat(String name) {
        return this.contains(name, 99) ?
                Try.of(() -> ((NumericTag) this.tags.get(name)).getAsFloat()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<Float> extended$getStrictFloat(String name) {
        return this.contains(name, 5) ?
                Try.of(() -> ((FloatTag) this.tags.get(name)).getAsFloat()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<Double> extended$getOptionalDouble(String name) {
        return this.contains(name, 99) ?
                Try.of(() -> ((NumericTag) this.tags.get(name)).getAsDouble()).toOptional() :
                Optional.empty();
    }

    @Override
    public Optional<Double> extended$getStrictDouble(String name) {
        return this.contains(name, 6) ?
                Try.of(() -> ((DoubleTag) this.tags.get(name)).getAsDouble()).toOptional() :
                Optional.empty();
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
