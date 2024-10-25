package com.forsale.app.features.categories.listingdetails.buyerctas;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: CTAsVisibility.kt */
/* loaded from: classes2.dex */
public final class CTAsVisibility implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f25512a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f25513b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f25514c;

    public CTAsVisibility() {
        this(null, null, null, 7, null);
    }

    public final Boolean a() {
        return this.f25512a;
    }

    public final Boolean b() {
        return this.f25514c;
    }

    public final Boolean c() {
        return this.f25513b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTAsVisibility)) {
            return false;
        }
        CTAsVisibility cTAsVisibility = (CTAsVisibility) obj;
        if (o.d(this.f25512a, cTAsVisibility.f25512a) && o.d(this.f25513b, cTAsVisibility.f25513b) && o.d(this.f25514c, cTAsVisibility.f25514c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Boolean bool = this.f25512a;
        int i11 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i12 = hashCode * 31;
        Boolean bool2 = this.f25513b;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Boolean bool3 = this.f25514c;
        if (bool3 != null) {
            i11 = bool3.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        Boolean bool = this.f25512a;
        Boolean bool2 = this.f25513b;
        Boolean bool3 = this.f25514c;
        return "CTAsVisibility(isCallButtonEnabled=" + bool + ", isWhatsappEnabled=" + bool2 + ", isChatEnabled=" + bool3 + ")";
    }

    public CTAsVisibility(Boolean bool, Boolean bool2, Boolean bool3) {
        this.f25512a = bool;
        this.f25513b = bool2;
        this.f25514c = bool3;
    }

    public /* synthetic */ CTAsVisibility(Boolean bool, Boolean bool2, Boolean bool3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Boolean.TRUE : bool, (i11 & 2) != 0 ? Boolean.TRUE : bool2, (i11 & 4) != 0 ? Boolean.TRUE : bool3);
    }
}
