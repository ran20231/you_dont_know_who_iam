package com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AlertActionTypes.kt */
/* loaded from: classes3.dex */
public final class AlertActionTypes {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AlertActionTypes[] $VALUES;
    public static final AlertActionTypes NO_ACTIONS = new AlertActionTypes("NO_ACTIONS", 0);
    public static final AlertActionTypes ONE_ACTION = new AlertActionTypes("ONE_ACTION", 1);
    public static final AlertActionTypes TWO_ACTIONS = new AlertActionTypes("TWO_ACTIONS", 2);

    private static final /* synthetic */ AlertActionTypes[] $values() {
        return new AlertActionTypes[]{NO_ACTIONS, ONE_ACTION, TWO_ACTIONS};
    }

    static {
        AlertActionTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AlertActionTypes(String str, int i11) {
    }

    public static a<AlertActionTypes> getEntries() {
        return $ENTRIES;
    }

    public static AlertActionTypes valueOf(String str) {
        return (AlertActionTypes) Enum.valueOf(AlertActionTypes.class, str);
    }

    public static AlertActionTypes[] values() {
        return (AlertActionTypes[]) $VALUES.clone();
    }
}
