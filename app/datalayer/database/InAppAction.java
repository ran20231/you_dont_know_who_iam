package com.forsale.app.datalayer.database;

import a00.a;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InAppAction.kt */
/* loaded from: classes2.dex */
public final class InAppAction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InAppAction[] $VALUES;
    @c("save")
    public static final InAppAction SAVE = new InAppAction("SAVE", 0, "save");
    @c("delete")
    public static final InAppAction DELETE = new InAppAction("DELETE", 1, "delete");

    private static final /* synthetic */ InAppAction[] $values() {
        return new InAppAction[]{SAVE, DELETE};
    }

    static {
        InAppAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private InAppAction(String str, int i11, String str2) {
    }

    public static a<InAppAction> getEntries() {
        return $ENTRIES;
    }

    public static InAppAction valueOf(String str) {
        return (InAppAction) Enum.valueOf(InAppAction.class, str);
    }

    public static InAppAction[] values() {
        return (InAppAction[]) $VALUES.clone();
    }
}
