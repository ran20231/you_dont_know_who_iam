package com.forsale.app.datalayer.network.responses.listingdetails;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ExtraStatusNote.kt */
/* loaded from: classes2.dex */
public final class ExtraStatusNote {
    public static final int $stable = 0;
    @c("icon")
    private final String icon;
    @c("text")
    private final String text;

    public ExtraStatusNote(String str, String str2) {
        this.icon = str;
        this.text = str2;
    }

    public static /* synthetic */ ExtraStatusNote copy$default(ExtraStatusNote extraStatusNote, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = extraStatusNote.icon;
        }
        if ((i11 & 2) != 0) {
            str2 = extraStatusNote.text;
        }
        return extraStatusNote.copy(str, str2);
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.text;
    }

    public final ExtraStatusNote copy(String str, String str2) {
        return new ExtraStatusNote(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraStatusNote)) {
            return false;
        }
        ExtraStatusNote extraStatusNote = (ExtraStatusNote) obj;
        if (o.d(this.icon, extraStatusNote.icon) && o.d(this.text, extraStatusNote.text)) {
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
        int hashCode;
        String str = this.icon;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        String str2 = this.text;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.text;
        return "ExtraStatusNote(icon=" + str + ", text=" + str2 + ")";
    }
}
