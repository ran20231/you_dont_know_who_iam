package com.forsale.adserver.adviews.baseViews.image;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.forsale.adserver.adviews.baseViews.g;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.o;
import l8.e;
/* compiled from: AdImageView.kt */
/* loaded from: classes2.dex */
public final class AdImageView extends ImageView implements g {

    /* renamed from: a  reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f20594a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdImageView(Context context) {
        super(context);
        o.i(context, "context");
        b();
    }

    private final void b() {
        setScaleType(ImageView.ScaleType.FIT_XY);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.forsale.adserver.adviews.baseViews.g
    public void a(ViewTreeObserver.OnScrollChangedListener onScroll) {
        o.i(onScroll, "onScroll");
        this.f20594a = onScroll;
    }

    public final void c(String str) {
        boolean z11;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return;
        }
        Picasso.h().l(str).e().l(e.f62280a).d(e.f62280a).g(this);
    }

    public final ViewTreeObserver.OnScrollChangedListener getOnScrollListener() {
        return this.f20594a;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f20594a;
        if (onScrollChangedListener != null) {
            getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
        super.onDetachedFromWindow();
    }

    public final void setOnScrollListener(ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f20594a = onScrollChangedListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        o.i(context, "context");
        o.i(attrs, "attrs");
        b();
    }
}
