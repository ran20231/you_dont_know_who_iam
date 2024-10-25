package com.forsale.adserver.adviews.baseViews.video;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d0;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import com.forsale.adserver.adviews.baseViews.g;
import com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes;
import com.forsale.adserver.datalayer.bannerdata.Screens;
import com.forsale.adserver.utils.AnalyticsEvents;
import com.forsale.adserver.utils.InitAnalytics;
import com.google.android.exoplayer2.c;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.ui.b;
import kotlin.jvm.internal.o;
import l8.e;
import lm.k;
import mm.g0;
import o8.d;
import wz.p;
/* compiled from: AdVideoPlayer.kt */
/* loaded from: classes2.dex */
public final class AdVideoPlayer extends b implements r, g {
    private m J;
    private float K;
    private Integer L;
    private ScreenBannerTypes M;
    private Screens N;
    private Integer O;
    private final ImageButton P;
    private final ImageButton Q;
    private ViewTreeObserver.OnScrollChangedListener R;

    /* compiled from: AdVideoPlayer.kt */
    /* loaded from: classes2.dex */
    public final class a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        private final g00.a<p> f20595a;

        /* renamed from: b */
        final /* synthetic */ AdVideoPlayer f20596b;

        public a(AdVideoPlayer adVideoPlayer, g00.a<p> clickAction) {
            o.i(clickAction, "clickAction");
            this.f20596b = adVideoPlayer;
            this.f20595a = clickAction;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e11) {
            o.i(e11, "e");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e11) {
            o.i(e11, "e");
            this.f20595a.invoke();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent event) {
            o.i(event, "event");
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdVideoPlayer(Context context) {
        super(context);
        o.i(context, "context");
        this.P = new ImageButton(getContext());
        this.Q = new ImageButton(getContext());
        b0();
    }

    private final void Y() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        this.Q.setLayoutParams(layoutParams);
        this.Q.setImageResource(e.f62281b);
        addView(this.Q);
    }

    private final void Z() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        this.P.setLayoutParams(layoutParams);
        this.P.setImageResource(e.f62282c);
        this.P.setOnClickListener(new d(this));
        addView(this.P);
    }

    public static final void a0(AdVideoPlayer this$0, View view) {
        o.i(this$0, "this$0");
        this$0.k0();
    }

    private final void b0() {
        Z();
        Y();
        getViewTreeObserver().addOnScrollChangedListener(new o8.a(this));
        if (getContext() instanceof s) {
            Context context = getContext();
            o.g(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            ((s) context).getLifecycle().a(this);
        }
        setUseController(false);
        setOnTouchListener(new o8.b(new GestureDetector(getContext(), new a(this, new g00.a<p>() { // from class: com.forsale.adserver.adviews.baseViews.video.AdVideoPlayer$initView$gestureDetector$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AdVideoPlayer.this.k0();
            }
        }))));
    }

    public static final void c0(AdVideoPlayer this$0) {
        o.i(this$0, "this$0");
        this$0.j0(this$0.h0(this$0));
    }

    public static final boolean d0(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        o.i(gestureDetector, "$gestureDetector");
        if (gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public static final void f0(g00.a onClicked, View view) {
        o.i(onClicked, "$onClicked");
        onClicked.invoke();
    }

    private final boolean g0() {
        m mVar = this.J;
        if (mVar == null) {
            o.w("player");
            mVar = null;
        }
        if (mVar.J() == 0.0f) {
            return true;
        }
        return false;
    }

    private final boolean h0(View view) {
        int i11;
        if (view == null || !view.isShown()) {
            return false;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        Context context = view.getContext();
        if (context instanceof androidx.appcompat.app.d) {
            androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) context;
            if (dVar.getSupportActionBar() != null) {
                androidx.appcompat.app.a supportActionBar = dVar.getSupportActionBar();
                o.f(supportActionBar);
                i11 = supportActionBar.j();
                Rect rect2 = new Rect(rect.left, rect.top + i11, rect.right, rect.bottom);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int i12 = iArr[0];
                int i13 = iArr[1];
                return rect2.contains(new Rect(i12, i13, view.getWidth() + i12, view.getHeight() + i13));
            }
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getActionBar() != null) {
                ActionBar actionBar = activity.getActionBar();
                o.f(actionBar);
                i11 = actionBar.getHeight();
                Rect rect22 = new Rect(rect.left, rect.top + i11, rect.right, rect.bottom);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                int i122 = iArr2[0];
                int i132 = iArr2[1];
                return rect22.contains(new Rect(i122, i132, view.getWidth() + i122, view.getHeight() + i132));
            }
        }
        i11 = 0;
        Rect rect222 = new Rect(rect.left, rect.top + i11, rect.right, rect.bottom);
        int[] iArr22 = new int[2];
        view.getLocationInWindow(iArr22);
        int i1222 = iArr22[0];
        int i1322 = iArr22[1];
        return rect222.contains(new Rect(i1222, i1322, view.getWidth() + i1222, view.getHeight() + i1322));
    }

    private final void i0(boolean z11) {
        String str = null;
        m mVar = null;
        if (z11) {
            this.P.setImageResource(e.f62282c);
            m mVar2 = this.J;
            if (mVar2 == null) {
                o.w("player");
            } else {
                mVar = mVar2;
            }
            mVar.P(0.0f);
            return;
        }
        this.P.setImageResource(e.f62284e);
        m mVar3 = this.J;
        if (mVar3 == null) {
            o.w("player");
            mVar3 = null;
        }
        mVar3.P(this.K);
        Integer num = this.L;
        if (num != null) {
            int intValue = num.intValue();
            InitAnalytics.a aVar = InitAnalytics.f20835a;
            String value = AnalyticsEvents.BANNER_ACTION_VIDEO_UNMUTED.getValue();
            Screens screens = this.N;
            if (screens != null) {
                str = screens.name();
            }
            aVar.n(new g9.a(value, null, null, Integer.valueOf(intValue), this.O, null, null, "VIDEO", str, 102, null));
        }
    }

    private final void j0(boolean z11) {
        m mVar = this.J;
        if (mVar == null) {
            o.w("player");
            mVar = null;
        }
        mVar.setPlayWhenReady(z11);
    }

    public final void k0() {
        i0(!g0());
    }

    @Override // com.forsale.adserver.adviews.baseViews.g
    public void a(ViewTreeObserver.OnScrollChangedListener onScroll) {
        o.i(onScroll, "onScroll");
        this.R = onScroll;
    }

    public final void e0(String url, int i11, ScreenBannerTypes screenBannerTypes, Screens screens, Integer num, g00.a<p> onClicked) {
        o.i(url, "url");
        o.i(onClicked, "onClicked");
        m b11 = c.b(getContext());
        o.h(b11, "newSimpleInstance(...)");
        this.J = b11;
        m mVar = null;
        if (b11 == null) {
            o.w("player");
            b11 = null;
        }
        setPlayer(b11);
        setMediaSource(url);
        m mVar2 = this.J;
        if (mVar2 == null) {
            o.w("player");
            mVar2 = null;
        }
        mVar2.setPlayWhenReady(h0(this));
        m mVar3 = this.J;
        if (mVar3 == null) {
            o.w("player");
        } else {
            mVar = mVar3;
        }
        this.K = mVar.J();
        this.L = Integer.valueOf(i11);
        this.M = screenBannerTypes;
        this.N = screens;
        this.O = num;
        i0(true);
        this.Q.setOnClickListener(new o8.c(onClicked));
    }

    public final Integer getBannerId() {
        return this.L;
    }

    public final Screens getBannerScreen() {
        return this.N;
    }

    public final ScreenBannerTypes getBannerType() {
        return this.M;
    }

    public final Integer getCategoryId() {
        return this.O;
    }

    public final ViewTreeObserver.OnScrollChangedListener getOnScrollListener() {
        return this.R;
    }

    @d0(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        m mVar = this.J;
        m mVar2 = null;
        if (mVar == null) {
            o.w("player");
            mVar = null;
        }
        mVar.stop();
        m mVar3 = this.J;
        if (mVar3 == null) {
            o.w("player");
        } else {
            mVar2 = mVar3;
        }
        mVar2.release();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.R;
        if (onScrollChangedListener != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(onScrollChangedListener);
            sb2.append(" is removed");
            getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
        super.onDetachedFromWindow();
    }

    @d0(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        m mVar = this.J;
        if (mVar == null) {
            o.w("player");
            mVar = null;
        }
        mVar.setPlayWhenReady(false);
    }

    public final void setBannerId(Integer num) {
        this.L = num;
    }

    public final void setBannerScreen(Screens screens) {
        this.N = screens;
    }

    public final void setBannerType(ScreenBannerTypes screenBannerTypes) {
        this.M = screenBannerTypes;
    }

    public final void setCategoryId(Integer num) {
        this.O = num;
    }

    public final void setMediaSource(String url) {
        o.i(url, "url");
        j a11 = new j.b(new k(getContext(), g0.K(getContext(), "AdsServer"))).a(Uri.parse(url));
        m mVar = this.J;
        m mVar2 = null;
        if (mVar == null) {
            o.w("player");
            mVar = null;
        }
        mVar.prepare(a11);
        m mVar3 = this.J;
        if (mVar3 == null) {
            o.w("player");
        } else {
            mVar2 = mVar3;
        }
        mVar2.setPlayWhenReady(true);
        mVar2.setRepeatMode(1);
        setResizeMode(4);
    }

    public final void setOnScrollListener(ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.R = onScrollChangedListener;
    }
}
