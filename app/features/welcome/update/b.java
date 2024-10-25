package com.forsale.app.features.welcome.update;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.r0;
import z3.n;
/* compiled from: AppStatusFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0427b f37419a = new C0427b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppStatusFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final String f37420a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f37421b;

        /* renamed from: c  reason: collision with root package name */
        private final int f37422c;

        public a() {
            this(null, false, 3, null);
        }

        @Override // z3.n
        public int a() {
            return this.f37422c;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("deeplinkUrl", this.f37420a);
            bundle.putBoolean("hasBottomNavigation", this.f37421b);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (o.d(this.f37420a, aVar.f37420a) && this.f37421b == aVar.f37421b) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            String str = this.f37420a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = hashCode * 31;
            boolean z11 = this.f37421b;
            int i12 = z11;
            if (z11 != 0) {
                i12 = 1;
            }
            return i11 + i12;
        }

        public String toString() {
            String str = this.f37420a;
            boolean z11 = this.f37421b;
            return "ActionAppStatusFragmentToLoadingFragment(deeplinkUrl=" + str + ", hasBottomNavigation=" + z11 + ")";
        }

        public a(String str, boolean z11) {
            this.f37420a = str;
            this.f37421b = z11;
            this.f37422c = r0.f69946j;
        }

        public /* synthetic */ a(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? false : z11);
        }
    }

    /* compiled from: AppStatusFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.welcome.update.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0427b {
        private C0427b() {
        }

        public /* synthetic */ C0427b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ n b(C0427b c0427b, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            return c0427b.a(str, z11);
        }

        public final n a(String str, boolean z11) {
            return new a(str, z11);
        }
    }
}
