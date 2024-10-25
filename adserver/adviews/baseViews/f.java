package com.forsale.adserver.adviews.baseViews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_AdViewContainer.java */
/* loaded from: classes2.dex */
public abstract class f extends FrameLayout implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ViewComponentManager f20592a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f20593b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    @Override // mx.b
    public final Object F() {
        return d().F();
    }

    public final ViewComponentManager d() {
        if (this.f20592a == null) {
            this.f20592a = f();
        }
        return this.f20592a;
    }

    protected ViewComponentManager f() {
        return new ViewComponentManager(this, false);
    }

    protected void g() {
        if (!this.f20593b) {
            this.f20593b = true;
            ((d) F()).a((AdViewContainer) mx.d.a(this));
        }
    }
}
