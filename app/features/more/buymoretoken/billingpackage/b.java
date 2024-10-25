package com.forsale.app.features.more.buymoretoken.billingpackage;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.r0;
import z3.n;
/* compiled from: BillingPackageFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0348b f31770a = new C0348b(null);

    /* compiled from: BillingPackageFragmentDirections.kt */
    /* loaded from: classes2.dex */
    private static final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f31771a;

        /* renamed from: b  reason: collision with root package name */
        private final String f31772b;

        /* renamed from: c  reason: collision with root package name */
        private final int f31773c;

        public a() {
            this(false, null, 3, null);
        }

        @Override // z3.n
        public int a() {
            return this.f31773c;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("from_plf", this.f31771a);
            bundle.putString("plf_intention", this.f31772b);
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
            if (this.f31771a == aVar.f31771a && o.d(this.f31772b, aVar.f31772b)) {
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
            boolean z11 = this.f31771a;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int i11 = r02 * 31;
            String str = this.f31772b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return i11 + hashCode;
        }

        public String toString() {
            boolean z11 = this.f31771a;
            String str = this.f31772b;
            return "ActionBillingPackageFragmentToPaymentBottomSheet(fromPlf=" + z11 + ", plfIntention=" + str + ")";
        }

        public a(boolean z11, String str) {
            this.f31771a = z11;
            this.f31772b = str;
            this.f31773c = r0.f69959k;
        }

        public /* synthetic */ a(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: BillingPackageFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.more.buymoretoken.billingpackage.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0348b {
        private C0348b() {
        }

        public /* synthetic */ C0348b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(boolean z11, String str) {
            return new a(z11, str);
        }
    }
}
