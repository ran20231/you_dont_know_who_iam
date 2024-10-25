package com.forsale.app.features.postad;

import com.forsale.app.datalayer.network.responses.Addon;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: PostAdDialog.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final PostAdDialogs f35598a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f35599b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f35600c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Addon> f35601d;

    public f(PostAdDialogs dialogType, boolean z11, Integer num, List<Addon> list) {
        o.i(dialogType, "dialogType");
        this.f35598a = dialogType;
        this.f35599b = z11;
        this.f35600c = num;
        this.f35601d = list;
    }

    public final PostAdDialogs a() {
        return this.f35598a;
    }

    public final Integer b() {
        return this.f35600c;
    }

    public final List<Addon> c() {
        return this.f35601d;
    }

    public final boolean d() {
        return this.f35599b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f35598a == fVar.f35598a && this.f35599b == fVar.f35599b && o.d(this.f35600c, fVar.f35600c) && o.d(this.f35601d, fVar.f35601d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f35598a.hashCode() * 31;
        boolean z11 = this.f35599b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        Integer num = this.f35600c;
        int i13 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i14 = (i12 + hashCode) * 31;
        List<Addon> list = this.f35601d;
        if (list != null) {
            i13 = list.hashCode();
        }
        return i14 + i13;
    }

    public String toString() {
        PostAdDialogs postAdDialogs = this.f35598a;
        boolean z11 = this.f35599b;
        Integer num = this.f35600c;
        List<Addon> list = this.f35601d;
        return "PostAdDialog(dialogType=" + postAdDialogs + ", isVideoFailed=" + z11 + ", listingId=" + num + ", rejectedAddons=" + list + ")";
    }
}
