package com.forsale.adserver.view.screens.offersScreen;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CategoryTab.kt */
/* loaded from: classes2.dex */
public final class CategoryTab {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CategoryTab[] $VALUES;
    public static final CategoryTab ALL = new CategoryTab("ALL", 0, -1);
    public static final CategoryTab FEATURED = new CategoryTab("FEATURED", 1, -2);

    /* renamed from: id  reason: collision with root package name */
    private final int f21395id;

    private static final /* synthetic */ CategoryTab[] $values() {
        return new CategoryTab[]{ALL, FEATURED};
    }

    static {
        CategoryTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CategoryTab(String str, int i11, int i12) {
        this.f21395id = i12;
    }

    public static a<CategoryTab> getEntries() {
        return $ENTRIES;
    }

    public static CategoryTab valueOf(String str) {
        return (CategoryTab) Enum.valueOf(CategoryTab.class, str);
    }

    public static CategoryTab[] values() {
        return (CategoryTab[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f21395id;
    }
}
