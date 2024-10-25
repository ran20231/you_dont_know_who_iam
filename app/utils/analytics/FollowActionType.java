package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class FollowActionType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ FollowActionType[] $VALUES;
    public static final FollowActionType USER_FOLLOWED = new FollowActionType("USER_FOLLOWED", 0, "UserFollowed");
    public static final FollowActionType USER_UNFOLLOWED = new FollowActionType("USER_UNFOLLOWED", 1, "UserUnfollowed");
    private final String value;

    private static final /* synthetic */ FollowActionType[] $values() {
        return new FollowActionType[]{USER_FOLLOWED, USER_UNFOLLOWED};
    }

    static {
        FollowActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private FollowActionType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<FollowActionType> getEntries() {
        return $ENTRIES;
    }

    public static FollowActionType valueOf(String str) {
        return (FollowActionType) Enum.valueOf(FollowActionType.class, str);
    }

    public static FollowActionType[] values() {
        return (FollowActionType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
