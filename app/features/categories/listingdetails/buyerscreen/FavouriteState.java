package com.forsale.app.features.categories.listingdetails.buyerscreen;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FavouriteState.kt */
/* loaded from: classes2.dex */
public final class FavouriteState {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ FavouriteState[] $VALUES;
    public static final FavouriteState IS_FAVOURITE = new FavouriteState("IS_FAVOURITE", 0);
    public static final FavouriteState IS_NOT_FAVOURITE = new FavouriteState("IS_NOT_FAVOURITE", 1);
    public static final FavouriteState PENDING = new FavouriteState("PENDING", 2);

    private static final /* synthetic */ FavouriteState[] $values() {
        return new FavouriteState[]{IS_FAVOURITE, IS_NOT_FAVOURITE, PENDING};
    }

    static {
        FavouriteState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private FavouriteState(String str, int i11) {
    }

    public static a00.a<FavouriteState> getEntries() {
        return $ENTRIES;
    }

    public static FavouriteState valueOf(String str) {
        return (FavouriteState) Enum.valueOf(FavouriteState.class, str);
    }

    public static FavouriteState[] values() {
        return (FavouriteState[]) $VALUES.clone();
    }
}
