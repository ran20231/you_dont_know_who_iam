package com.forsale.app.features.categories.listingdetails.buyerctas;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BuyerCTAsState.kt */
/* loaded from: classes2.dex */
public final class BuyerCTAsState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BuyerCTAsState[] $VALUES;
    public static final BuyerCTAsState CHAT_ACTION_STICKY = new BuyerCTAsState("CHAT_ACTION_STICKY", 0);
    public static final BuyerCTAsState CHAT_ACTION = new BuyerCTAsState("CHAT_ACTION", 1);

    private static final /* synthetic */ BuyerCTAsState[] $values() {
        return new BuyerCTAsState[]{CHAT_ACTION_STICKY, CHAT_ACTION};
    }

    static {
        BuyerCTAsState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BuyerCTAsState(String str, int i11) {
    }

    public static a<BuyerCTAsState> getEntries() {
        return $ENTRIES;
    }

    public static BuyerCTAsState valueOf(String str) {
        return (BuyerCTAsState) Enum.valueOf(BuyerCTAsState.class, str);
    }

    public static BuyerCTAsState[] values() {
        return (BuyerCTAsState[]) $VALUES.clone();
    }
}
