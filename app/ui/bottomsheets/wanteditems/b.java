package com.forsale.app.ui.bottomsheets.wanteditems;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.r0;
import z3.n;
/* compiled from: AddWantedItemBottomSheetDirections.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0442b f39284a = new C0442b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AddWantedItemBottomSheetDirections.kt */
    /* loaded from: classes3.dex */
    public static final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f39285a;

        /* renamed from: b  reason: collision with root package name */
        private final int f39286b;

        public a() {
            this(false, 1, null);
        }

        @Override // z3.n
        public int a() {
            return this.f39286b;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("categoryAllowUploadOnly", this.f39285a);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f39285a == ((a) obj).f39285a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            boolean z11 = this.f39285a;
            if (z11) {
                return 1;
            }
            return z11 ? 1 : 0;
        }

        public String toString() {
            boolean z11 = this.f39285a;
            return "ActionAddWantedItemBottomSheetToCategorySelectionFragment(categoryAllowUploadOnly=" + z11 + ")";
        }

        public a(boolean z11) {
            this.f39285a = z11;
            this.f39286b = r0.f69894f;
        }

        public /* synthetic */ a(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11);
        }
    }

    /* compiled from: AddWantedItemBottomSheetDirections.kt */
    /* renamed from: com.forsale.app.ui.bottomsheets.wanteditems.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0442b {
        private C0442b() {
        }

        public /* synthetic */ C0442b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ n b(C0442b c0442b, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return c0442b.a(z11);
        }

        public final n a(boolean z11) {
            return new a(z11);
        }
    }
}
