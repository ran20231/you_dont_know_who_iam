package com.forsale.app.datalayer.network.responses.listingdetails;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: OtherStatus.kt */
/* loaded from: classes2.dex */
public final class OtherStatus {
    public static final int $stable = 0;
    @c("icon")
    private final String icon;
    @c("text")
    private final String text;

    public OtherStatus(String icon, String text) {
        o.i(icon, "icon");
        o.i(text, "text");
        this.icon = icon;
        this.text = text;
    }

    public static /* synthetic */ OtherStatus copy$default(OtherStatus otherStatus, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = otherStatus.icon;
        }
        if ((i11 & 2) != 0) {
            str2 = otherStatus.text;
        }
        return otherStatus.copy(str, str2);
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.text;
    }

    public final OtherStatus copy(String icon, String text) {
        o.i(icon, "icon");
        o.i(text, "text");
        return new OtherStatus(icon, text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtherStatus)) {
            return false;
        }
        OtherStatus otherStatus = (OtherStatus) obj;
        if (o.d(this.icon, otherStatus.icon) && o.d(this.text, otherStatus.text)) {
            return true;
        }
        return false;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.icon.hashCode() * 31) + this.text.hashCode();
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.text;
        return "OtherStatus(icon=" + str + ", text=" + str2 + ")";
    }
}
