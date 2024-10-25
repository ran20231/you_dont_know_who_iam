package com.forsale.app.datalayer.network.responses;

import java.util.List;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: AddonsResponse.kt */
/* loaded from: classes2.dex */
public final class AddonsGroup {
    public static final int $stable = 8;
    @c("addons")
    private final List<Addon> addons;
    @c("background-color")
    private final String backgroundColor;
    @c("foreground-color")
    private final String foregroundColor;
    @c("media_required")
    private final boolean isMediaRequired;
    @c("subtitle")
    private final String subtitle;
    @c("title")
    private final String title;

    public AddonsGroup(String title, String subtitle, String backgroundColor, String foregroundColor, List<Addon> addons, boolean z11) {
        o.i(title, "title");
        o.i(subtitle, "subtitle");
        o.i(backgroundColor, "backgroundColor");
        o.i(foregroundColor, "foregroundColor");
        o.i(addons, "addons");
        this.title = title;
        this.subtitle = subtitle;
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
        this.addons = addons;
        this.isMediaRequired = z11;
    }

    public static /* synthetic */ AddonsGroup copy$default(AddonsGroup addonsGroup, String str, String str2, String str3, String str4, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addonsGroup.title;
        }
        if ((i11 & 2) != 0) {
            str2 = addonsGroup.subtitle;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = addonsGroup.backgroundColor;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            str4 = addonsGroup.foregroundColor;
        }
        String str7 = str4;
        List<Addon> list2 = list;
        if ((i11 & 16) != 0) {
            list2 = addonsGroup.addons;
        }
        List list3 = list2;
        if ((i11 & 32) != 0) {
            z11 = addonsGroup.isMediaRequired;
        }
        return addonsGroup.copy(str, str5, str6, str7, list3, z11);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.backgroundColor;
    }

    public final String component4() {
        return this.foregroundColor;
    }

    public final List<Addon> component5() {
        return this.addons;
    }

    public final boolean component6() {
        return this.isMediaRequired;
    }

    public final AddonsGroup copy(String title, String subtitle, String backgroundColor, String foregroundColor, List<Addon> addons, boolean z11) {
        o.i(title, "title");
        o.i(subtitle, "subtitle");
        o.i(backgroundColor, "backgroundColor");
        o.i(foregroundColor, "foregroundColor");
        o.i(addons, "addons");
        return new AddonsGroup(title, subtitle, backgroundColor, foregroundColor, addons, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddonsGroup)) {
            return false;
        }
        AddonsGroup addonsGroup = (AddonsGroup) obj;
        if (o.d(this.title, addonsGroup.title) && o.d(this.subtitle, addonsGroup.subtitle) && o.d(this.backgroundColor, addonsGroup.backgroundColor) && o.d(this.foregroundColor, addonsGroup.foregroundColor) && o.d(this.addons, addonsGroup.addons) && this.isMediaRequired == addonsGroup.isMediaRequired) {
            return true;
        }
        return false;
    }

    public final List<Addon> getAddons() {
        return this.addons;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31) + this.foregroundColor.hashCode()) * 31) + this.addons.hashCode()) * 31;
        boolean z11 = this.isMediaRequired;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public final boolean isMediaRequired() {
        return this.isMediaRequired;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.backgroundColor;
        String str4 = this.foregroundColor;
        List<Addon> list = this.addons;
        boolean z11 = this.isMediaRequired;
        return "AddonsGroup(title=" + str + ", subtitle=" + str2 + ", backgroundColor=" + str3 + ", foregroundColor=" + str4 + ", addons=" + list + ", isMediaRequired=" + z11 + ")";
    }
}
