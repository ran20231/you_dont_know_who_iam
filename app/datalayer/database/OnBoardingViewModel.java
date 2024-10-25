package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import up.c;
/* compiled from: OnBoardingViewModel.kt */
@Serializable
/* loaded from: classes2.dex */
public final class OnBoardingViewModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    @c("adv_details_swiping_enabled")
    private final int advDetailsSwipingEnabled;

    /* compiled from: OnBoardingViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnBoardingViewModel> serializer() {
            return OnBoardingViewModel$$serializer.INSTANCE;
        }
    }

    public OnBoardingViewModel(int i11) {
        this.advDetailsSwipingEnabled = i11;
    }

    public static /* synthetic */ OnBoardingViewModel copy$default(OnBoardingViewModel onBoardingViewModel, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = onBoardingViewModel.advDetailsSwipingEnabled;
        }
        return onBoardingViewModel.copy(i11);
    }

    public final int component1() {
        return this.advDetailsSwipingEnabled;
    }

    public final OnBoardingViewModel copy(int i11) {
        return new OnBoardingViewModel(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OnBoardingViewModel) && this.advDetailsSwipingEnabled == ((OnBoardingViewModel) obj).advDetailsSwipingEnabled) {
            return true;
        }
        return false;
    }

    public final int getAdvDetailsSwipingEnabled() {
        return this.advDetailsSwipingEnabled;
    }

    public int hashCode() {
        return Integer.hashCode(this.advDetailsSwipingEnabled);
    }

    public String toString() {
        int i11 = this.advDetailsSwipingEnabled;
        return "OnBoardingViewModel(advDetailsSwipingEnabled=" + i11 + ")";
    }

    public /* synthetic */ OnBoardingViewModel(int i11, int i12, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i11 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 1, OnBoardingViewModel$$serializer.INSTANCE.getDescriptor());
        }
        this.advDetailsSwipingEnabled = i12;
    }
}
