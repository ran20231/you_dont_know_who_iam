package com.forsale.app.ui.bottomsheets.postadsuccessuploading;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import z3.h;
/* compiled from: PostAdUploadAdSuccessBottomSheetArgs.kt */
/* loaded from: classes3.dex */
public final class b implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39052b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f39053a;

    /* compiled from: PostAdUploadAdSuccessBottomSheetArgs.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Bundle bundle) {
            boolean z11;
            o.i(bundle, "bundle");
            bundle.setClassLoader(b.class.getClassLoader());
            if (bundle.containsKey("media_upload_failed")) {
                z11 = bundle.getBoolean("media_upload_failed");
            } else {
                z11 = false;
            }
            return new b(z11);
        }
    }

    public b() {
        this(false, 1, null);
    }

    public static final b fromBundle(Bundle bundle) {
        return f39052b.a(bundle);
    }

    public final boolean a() {
        return this.f39053a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.f39053a == ((b) obj).f39053a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        boolean z11 = this.f39053a;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public String toString() {
        boolean z11 = this.f39053a;
        return "PostAdUploadAdSuccessBottomSheetArgs(mediaUploadFailed=" + z11 + ")";
    }

    public b(boolean z11) {
        this.f39053a = z11;
    }

    public /* synthetic */ b(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
