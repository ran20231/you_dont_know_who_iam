package com.forsale.app.utils.analytics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: CommonListingsEventsKey.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final int f40020a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40021b;

    /* renamed from: c  reason: collision with root package name */
    private final String f40022c;

    /* renamed from: d  reason: collision with root package name */
    private final String f40023d;

    /* renamed from: e  reason: collision with root package name */
    private final String f40024e;

    /* renamed from: f  reason: collision with root package name */
    private final String f40025f;

    public i(int i11, String regionName, String categoryId, String categoryName, String categoryFullPath, String str) {
        o.i(regionName, "regionName");
        o.i(categoryId, "categoryId");
        o.i(categoryName, "categoryName");
        o.i(categoryFullPath, "categoryFullPath");
        this.f40020a = i11;
        this.f40021b = regionName;
        this.f40022c = categoryId;
        this.f40023d = categoryName;
        this.f40024e = categoryFullPath;
        this.f40025f = str;
    }

    public final String a() {
        return this.f40024e;
    }

    public final String b() {
        return this.f40022c;
    }

    public final String c() {
        return this.f40023d;
    }

    public final String d() {
        return this.f40025f;
    }

    public final int e() {
        return this.f40020a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f40020a == iVar.f40020a && o.d(this.f40021b, iVar.f40021b) && o.d(this.f40022c, iVar.f40022c) && o.d(this.f40023d, iVar.f40023d) && o.d(this.f40024e, iVar.f40024e) && o.d(this.f40025f, iVar.f40025f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f40021b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((Integer.hashCode(this.f40020a) * 31) + this.f40021b.hashCode()) * 31) + this.f40022c.hashCode()) * 31) + this.f40023d.hashCode()) * 31) + this.f40024e.hashCode()) * 31;
        String str = this.f40025f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        int i11 = this.f40020a;
        String str = this.f40021b;
        String str2 = this.f40022c;
        String str3 = this.f40023d;
        String str4 = this.f40024e;
        String str5 = this.f40025f;
        return "CommonListingsEventModel(regionId=" + i11 + ", regionName=" + str + ", categoryId=" + str2 + ", categoryName=" + str3 + ", categoryFullPath=" + str4 + ", districtFullPath=" + str5 + ")";
    }

    public /* synthetic */ i(int i11, String str, String str2, String str3, String str4, String str5, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, str4, (i12 & 32) != 0 ? null : str5);
    }
}
