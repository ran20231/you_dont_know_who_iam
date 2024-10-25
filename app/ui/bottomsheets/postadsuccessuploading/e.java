package com.forsale.app.ui.bottomsheets.postadsuccessuploading;

import androidx.lifecycle.q0;
import com.forsale.app.utils.OneShotEventHandler;
import wz.p;
/* compiled from: PostAdUploadAdSuccessViewModel.kt */
/* loaded from: classes3.dex */
public final class e extends q0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f39054a;

    /* renamed from: b  reason: collision with root package name */
    private final OneShotEventHandler<p> f39055b = new OneShotEventHandler<>(null, 0, 3, null);

    /* compiled from: PostAdUploadAdSuccessViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        e a(boolean z11);
    }

    public e(boolean z11) {
        this.f39054a = z11;
    }

    public final OneShotEventHandler<p> e() {
        return this.f39055b;
    }

    public final boolean f() {
        return this.f39054a;
    }

    public final void g() {
        OneShotEventHandler.d(this.f39055b, null, 1, null);
    }
}
