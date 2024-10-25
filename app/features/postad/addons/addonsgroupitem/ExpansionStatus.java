package com.forsale.app.features.postad.addons.addonsgroupitem;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExpansionStatus.kt */
/* loaded from: classes2.dex */
public final class ExpansionStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ExpansionStatus[] $VALUES;
    public static final ExpansionStatus NON = new ExpansionStatus("NON", 0);
    public static final ExpansionStatus EXPANDED = new ExpansionStatus("EXPANDED", 1);
    public static final ExpansionStatus COLLAPSED = new ExpansionStatus("COLLAPSED", 2);

    private static final /* synthetic */ ExpansionStatus[] $values() {
        return new ExpansionStatus[]{NON, EXPANDED, COLLAPSED};
    }

    static {
        ExpansionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ExpansionStatus(String str, int i11) {
    }

    public static a<ExpansionStatus> getEntries() {
        return $ENTRIES;
    }

    public static ExpansionStatus valueOf(String str) {
        return (ExpansionStatus) Enum.valueOf(ExpansionStatus.class, str);
    }

    public static ExpansionStatus[] values() {
        return (ExpansionStatus[]) $VALUES.clone();
    }
}
