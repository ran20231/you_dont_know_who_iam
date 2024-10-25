package com.forsale.app.features.welcome.loading;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: SplashFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class k implements z3.h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f37393c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f37394a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f37395b;

    /* compiled from: SplashFragmentArgs.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(Bundle bundle) {
            String str;
            boolean z11;
            o.i(bundle, "bundle");
            bundle.setClassLoader(k.class.getClassLoader());
            if (bundle.containsKey("deeplinkUrl")) {
                str = bundle.getString("deeplinkUrl");
            } else {
                str = null;
            }
            if (bundle.containsKey("hasBottomNavigation")) {
                z11 = bundle.getBoolean("hasBottomNavigation");
            } else {
                z11 = false;
            }
            return new k(str, z11);
        }
    }

    public k() {
        this(null, false, 3, null);
    }

    public static final k fromBundle(Bundle bundle) {
        return f37393c.a(bundle);
    }

    public final String a() {
        return this.f37394a;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("deeplinkUrl", this.f37394a);
        bundle.putBoolean("hasBottomNavigation", this.f37395b);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (o.d(this.f37394a, kVar.f37394a) && this.f37395b == kVar.f37395b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        String str = this.f37394a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        boolean z11 = this.f37395b;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        return i11 + i12;
    }

    public String toString() {
        String str = this.f37394a;
        boolean z11 = this.f37395b;
        return "SplashFragmentArgs(deeplinkUrl=" + str + ", hasBottomNavigation=" + z11 + ")";
    }

    public k(String str, boolean z11) {
        this.f37394a = str;
        this.f37395b = z11;
    }

    public /* synthetic */ k(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? false : z11);
    }
}
