package committee.nova.extended.mixin;

import committee.nova.extended.api.ExtendedListTag;
import net.minecraft.nbt.*;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

import java.util.*;

@Mixin(ListTag.class)
public abstract class MixinListTag implements ExtendedListTag {
    @Shadow
    public abstract Tag get(int index);

    @Shadow
    @Final
    private List<Tag> list;

    @Override
    public Optional<CompoundTag> extended$getOptionalCompound(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() == 10) return Optional.of((CompoundTag) tag);
        }
        return Optional.empty();
    }

    @Override
    public Optional<ListTag> extended$getOptionalList(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() == 9) return Optional.of((ListTag) tag);
        }
        return Optional.empty();
    }

    @Override
    public Optional<ListTag> extended$getOptionalList(int index, int type) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() != 9) return Optional.empty();
            final ListTag listTag = (ListTag) tag;
            if (listTag.getElementType() == type) return Optional.of(listTag);
        }
        return Optional.empty();
    }

    @Override
    public byte extended$getByte(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() == 1) return ((ByteTag) tag).getAsByte();
        }
        return 0;
    }

    @Override
    public Optional<Byte> extended$getOptionalByte(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (extended$isNumeric(tag.getId())) return Optional.of(((NumericTag) tag).getAsByte());
        }
        return Optional.empty();
    }

    @Override
    public Optional<Byte> extended$getStrictByte(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() == 1) return Optional.of(((ByteTag) tag).getAsByte());
        }
        return Optional.empty();
    }

    @Override
    public Optional<Short> extended$getOptionalShort(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (extended$isNumeric(tag.getId())) return Optional.of(((NumericTag) tag).getAsShort());
        }
        return Optional.empty();
    }

    @Override
    public Optional<Short> extended$getStrictShort(int index) {
        if (index >= 0 && index < this.list.size()) {
            Tag tag = this.list.get(index);
            if (tag.getId() == 2) return Optional.of(((ShortTag) tag).getAsShort());
        }
        return Optional.empty();
    }

    @Override
    public OptionalInt extended$getOptionalInt(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (extended$isNumeric(tag.getId())) return OptionalInt.of(((NumericTag) tag).getAsInt());
        }
        return OptionalInt.empty();
    }

    @Override
    public OptionalInt extended$getStrictInt(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() == 3) return OptionalInt.of(((IntTag) tag).getAsInt());
        }
        return OptionalInt.empty();
    }

    @Override
    public long extended$getLong(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() == 4) return ((LongTag) tag).getAsLong();
        }
        return 0L;
    }

    @Override
    public OptionalLong extended$getOptionalLong(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (extended$isNumeric(tag.getId())) return OptionalLong.of(((NumericTag) tag).getAsLong());
        }
        return OptionalLong.empty();
    }

    @Override
    public OptionalLong extended$getStrictLong(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() == 4) return OptionalLong.of(((LongTag) tag).getAsLong());
        }
        return OptionalLong.empty();
    }

    @Override
    public byte[] extended$getByteArray(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() == 7) return ((ByteArrayTag) tag).getAsByteArray();
        }
        return new byte[0];
    }

    @Override
    public Optional<byte[]> extended$getOptionalByteArray(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() == 7) return Optional.of(((ByteArrayTag) tag).getAsByteArray());
        }
        return Optional.empty();
    }

    @Override
    public Optional<int[]> extended$getOptionalIntArray(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() == 11) return Optional.of(((IntArrayTag) tag).getAsIntArray());
        }
        return Optional.empty();
    }

    @Override
    public Optional<long[]> extended$getOptionalLongArray(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() == 12) return Optional.of(((LongArrayTag) tag).getAsLongArray());
        }
        return Optional.empty();
    }

    @Override
    public Optional<Float> extended$getOptionalFloat(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (extended$isNumeric(tag.getId())) return Optional.of(((NumericTag) tag).getAsFloat());
        }
        return Optional.empty();
    }

    @Override
    public Optional<Float> extended$getStrictFloat(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() == 5) return Optional.of(((FloatTag) tag).getAsFloat());
        }
        return Optional.empty();
    }

    @Override
    public OptionalDouble extended$getOptionalDouble(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (extended$isNumeric(tag.getId())) return OptionalDouble.of(((NumericTag) tag).getAsDouble());
        }
        return OptionalDouble.empty();
    }

    @Override
    public OptionalDouble extended$getStrictDouble(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() == 6) return OptionalDouble.of(((DoubleTag) tag).getAsDouble());
        }
        return OptionalDouble.empty();
    }

    @Override
    public Optional<String> extended$getOptionalString(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            return Optional.of(tag.getId() == 8 ? tag.getAsString() : tag.toString());
        }
        return Optional.empty();
    }

    @Override
    public Optional<String> extended$getStrictString(int index) {
        if (index >= 0 && index < this.list.size()) {
            final Tag tag = this.list.get(index);
            if (tag.getId() != 8) return Optional.empty();
            return Optional.of(tag.getAsString());
        }
        return Optional.empty();
    }

    @Override
    public Optional<Tag> extended$getOptionalTag(int index) {
        return Optional.ofNullable(this.get(index));
    }

    @Unique
    private static boolean extended$isNumeric(int i) {
        return i > 0 && i < 7;
    }
}
