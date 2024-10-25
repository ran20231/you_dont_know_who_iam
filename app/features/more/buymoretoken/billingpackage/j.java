package com.forsale.app.features.more.buymoretoken.billingpackage;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: PaymentBottomSheetArgs.kt */
/* loaded from: classes2.dex */
public final class j implements z3.h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f31799c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f31800a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31801b;

    /* compiled from: PaymentBottomSheetArgs.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(Bundle bundle) {
            boolean z11;
            String str;
            o.i(bundle, "bundle");
            bundle.setClassLoader(j.class.getClassLoader());
            if (bundle.containsKey("from_plf")) {
                z11 = bundle.getBoolean("from_plf");
            } else {
                z11 = false;
            }
            if (bundle.containsKey("plf_intention")) {
                str = bundle.getString("plf_intention");
            } else {
                str = null;
            }
            return new j(z11, str);
        }
    }

    public j() {
        this(false, null, 3, null);
    }

    public static final j fromBundle(Bundle bundle) {
        return f31799c.a(bundle);
    }

    public final boolean a() {
        return this.f31800a;
    }

    public final String b() {
        return this.f31801b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f31800a == jVar.f31800a && o.d(this.f31801b, jVar.f31801b)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        int hashCode;
        boolean z11 = this.f31800a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        String str = this.f31801b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i11 + hashCode;
    }

    public String toString() {
        boolean z11 = this.f31800a;
        String str = this.f31801b;
        return "PaymentBottomSheetArgs(fromPlf=" + z11 + ", plfIntention=" + str + ")";
    }

    public j(boolean z11, String str) {
        this.f31800a = z11;
        this.f31801b = str;
    }

    public /* synthetic */ j(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str);
    }
}
