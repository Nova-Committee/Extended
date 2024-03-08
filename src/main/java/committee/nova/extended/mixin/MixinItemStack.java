package committee.nova.extended.mixin;

import committee.nova.extended.api.ExtendedItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import javax.annotation.Nullable;
import java.util.Optional;

@Mixin(ItemStack.class)
public abstract class MixinItemStack implements ExtendedItemStack {
    @Shadow
    @Nullable
    public abstract CompoundTag getTag();

    @Override
    public Optional<CompoundTag> extended$getOptionalTag() {
        return Optional.ofNullable(getTag());
    }
}
