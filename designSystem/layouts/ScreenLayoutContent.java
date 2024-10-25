package com.forsale.designSystem.layouts;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScreenLayout.kt */
/* loaded from: classes3.dex */
final class ScreenLayoutContent {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ScreenLayoutContent[] $VALUES;
    public static final ScreenLayoutContent TopBar = new ScreenLayoutContent("TopBar", 0);
    public static final ScreenLayoutContent MainContent = new ScreenLayoutContent("MainContent", 1);
    public static final ScreenLayoutContent Snackbar = new ScreenLayoutContent("Snackbar", 2);
    public static final ScreenLayoutContent Fab = new ScreenLayoutContent("Fab", 3);
    public static final ScreenLayoutContent BottomBar = new ScreenLayoutContent("BottomBar", 4);

    private static final /* synthetic */ ScreenLayoutContent[] $values() {
        return new ScreenLayoutContent[]{TopBar, MainContent, Snackbar, Fab, BottomBar};
    }

    static {
        ScreenLayoutContent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ScreenLayoutContent(String str, int i11) {
    }

    public static a00.a<ScreenLayoutContent> getEntries() {
        return $ENTRIES;
    }

    public static ScreenLayoutContent valueOf(String str) {
        return (ScreenLayoutContent) Enum.valueOf(ScreenLayoutContent.class, str);
    }

    public static ScreenLayoutContent[] values() {
        return (ScreenLayoutContent[]) $VALUES.clone();
    }
}
