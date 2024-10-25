package com.forsale.app.features.offers;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import z3.h;
/* compiled from: OffersFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class b implements h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f33841c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f33842a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33843b;

    /* compiled from: OffersFragmentArgs.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Bundle bundle) {
            int i11;
            String str;
            o.i(bundle, "bundle");
            bundle.setClassLoader(b.class.getClassLoader());
            if (bundle.containsKey("categoryId")) {
                i11 = bundle.getInt("categoryId");
            } else {
                i11 = -1;
            }
            if (bundle.containsKey("offers_args")) {
                str = bundle.getString("offers_args");
            } else {
                str = null;
            }
            return new b(i11, str);
        }
    }

    public b() {
        this(0, null, 3, null);
    }

    public static final b fromBundle(Bundle bundle) {
        return f33841c.a(bundle);
    }

    public final int a() {
        return this.f33842a;
    }

    public final String b() {
        return this.f33843b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f33842a == bVar.f33842a && o.d(this.f33843b, bVar.f33843b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f33842a) * 31;
        String str = this.f33843b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        int i11 = this.f33842a;
        String str = this.f33843b;
        return "OffersFragmentArgs(categoryId=" + i11 + ", offersArgs=" + str + ")";
    }

    public b(int i11, String str) {
        this.f33842a = i11;
        this.f33843b = str;
    }

    public /* synthetic */ b(int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? -1 : i11, (i12 & 2) != 0 ? null : str);
    }
}
