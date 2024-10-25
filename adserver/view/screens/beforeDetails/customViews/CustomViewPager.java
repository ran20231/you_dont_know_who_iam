package com.forsale.adserver.view.screens.beforeDetails.customViews;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.o;
/* compiled from: CustomViewPager.kt */
/* loaded from: classes2.dex */
public final class CustomViewPager extends ViewPager implements ViewPager.k {
    private int A0;
    private boolean B0;
    private boolean C0;
    private float D0;

    /* renamed from: z0  reason: collision with root package name */
    private float f21109z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.i(context, "context");
        this.B0 = true;
        this.D0 = 0.7f;
        setClipChildren(false);
        setClipToPadding(false);
        setOverScrollMode(2);
        U(false, this);
        setOffscreenPageLimit(3);
        Resources resources = context.getResources();
        o.h(resources, "getResources(...)");
        int Y = Y(resources, 30);
        this.A0 = Y;
        setPadding(Y, Y, Y, Y);
    }

    public final int Y(Resources resource, int i11) {
        o.i(resource, "resource");
        return (int) TypedValue.applyDimension(1, i11, resource.getDisplayMetrics());
    }

    @Override // androidx.viewpager.widget.ViewPager.k
    public void a(View page, float f11) {
        boolean z11;
        o.i(page, "page");
        int i11 = this.A0;
        if (i11 > 0 && this.B0) {
            page.setPadding(i11 / 3, i11 / 3, i11 / 3, i11 / 3);
            boolean z12 = false;
            if (this.f21109z0 == 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && f11 > 0.0f && f11 < 1.0f) {
                this.f21109z0 = f11;
            }
            float f12 = f11 - this.f21109z0;
            float abs = Math.abs(f12);
            if (f12 > -1.0f && f12 < 1.0f) {
                if (f12 == 0.0f) {
                    z12 = true;
                }
                if (z12) {
                    float f13 = 1;
                    page.setScaleX(this.f21109z0 + f13);
                    page.setScaleY(f13 + this.f21109z0);
                    page.setAlpha(1.0f);
                    return;
                }
                float f14 = 1;
                float f15 = f14 - abs;
                page.setScaleX((this.f21109z0 * f15) + f14);
                page.setScaleY(f14 + (this.f21109z0 * f15));
                if (this.C0) {
                    page.setAlpha(Math.max(this.D0, f15));
                }
            } else if (this.C0) {
                page.setAlpha(this.D0);
            }
        }
    }

    public final void setAnimationEnabled(boolean z11) {
        this.B0 = z11;
    }

    public final void setFadeEnabled(boolean z11) {
        this.C0 = z11;
    }

    public final void setFadeFactor(float f11) {
        this.D0 = f11;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setPageMargin(int i11) {
        this.A0 = i11;
        setPadding(i11, i11, i11, i11);
    }
}
