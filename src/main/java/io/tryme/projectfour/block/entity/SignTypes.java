package io.tryme.projectfour.block.entity;

import io.tryme.projectfour.mixin.SignTypeAccessor;
import net.minecraft.util.SignType;

public class SignTypes {
    public static final SignType REDWOOD =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("redwood"));

    public static final SignType WISTERIA =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("wisteria"));
}
