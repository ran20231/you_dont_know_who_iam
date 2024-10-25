package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FollowState.kt */
/* loaded from: classes2.dex */
public final class FollowState {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ FollowState[] $VALUES;
    public static final a Companion;
    public static final FollowState IS_FOLLOWING = new FollowState("IS_FOLLOWING", 0);
    public static final FollowState IS_NOT_FOLLOWING = new FollowState("IS_NOT_FOLLOWING", 1);
    public static final FollowState PENDING = new FollowState("PENDING", 2);

    /* compiled from: FollowState.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FollowState a(boolean z11) {
            if (z11) {
                return FollowState.IS_FOLLOWING;
            }
            if (!z11) {
                return FollowState.IS_NOT_FOLLOWING;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private static final /* synthetic */ FollowState[] $values() {
        return new FollowState[]{IS_FOLLOWING, IS_NOT_FOLLOWING, PENDING};
    }

    static {
        FollowState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private FollowState(String str, int i11) {
    }

    public static a00.a<FollowState> getEntries() {
        return $ENTRIES;
    }

    public static FollowState valueOf(String str) {
        return (FollowState) Enum.valueOf(FollowState.class, str);
    }

    public static FollowState[] values() {
        return (FollowState[]) $VALUES.clone();
    }
}
