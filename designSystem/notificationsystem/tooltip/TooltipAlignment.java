package com.forsale.designSystem.notificationsystem.tooltip;

import a00.a;
import com.leanplum.messagetemplates.MessageTemplateConstants;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TooltipData.kt */
/* loaded from: classes3.dex */
public final class TooltipAlignment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TooltipAlignment[] $VALUES;
    public static final TooltipAlignment Bottom = new TooltipAlignment(MessageTemplateConstants.Args.HTML_ALIGN_BOTTOM, 0);
    public static final TooltipAlignment Top = new TooltipAlignment("Top", 1);
    public static final TooltipAlignment Left = new TooltipAlignment("Left", 2);
    public static final TooltipAlignment Right = new TooltipAlignment("Right", 3);

    private static final /* synthetic */ TooltipAlignment[] $values() {
        return new TooltipAlignment[]{Bottom, Top, Left, Right};
    }

    static {
        TooltipAlignment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TooltipAlignment(String str, int i11) {
    }

    public static a<TooltipAlignment> getEntries() {
        return $ENTRIES;
    }

    public static TooltipAlignment valueOf(String str) {
        return (TooltipAlignment) Enum.valueOf(TooltipAlignment.class, str);
    }

    public static TooltipAlignment[] values() {
        return (TooltipAlignment[]) $VALUES.clone();
    }
}
