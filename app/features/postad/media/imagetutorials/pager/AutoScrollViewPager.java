package com.forsale.app.features.postad.media.imagetutorials.pager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: AutoScrollViewPager.kt */
/* loaded from: classes2.dex */
public final class AutoScrollViewPager extends ViewPager {
    public static final b H0 = new b(null);
    public static final int I0 = 8;
    private int A0;
    private boolean B0;
    private double C0;
    private double D0;
    private a E0;
    private af.a F0;
    private int G0;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f35997z0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollViewPager.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<AutoScrollViewPager> f35998a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AutoScrollViewPager autoScrollViewPager) {
            super(Looper.getMainLooper());
            o.i(autoScrollViewPager, "autoScrollViewPager");
            this.f35998a = new WeakReference<>(autoScrollViewPager);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            boolean z11;
            af.a aVar;
            af.a aVar2;
            o.i(msg, "msg");
            super.handleMessage(msg);
            Integer valueOf = Integer.valueOf(msg.what);
            boolean z12 = true;
            if (valueOf.intValue() == -13) {
                z11 = true;
            } else {
                z11 = false;
            }
            AutoScrollViewPager autoScrollViewPager = null;
            if (!z11) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.intValue();
                AutoScrollViewPager autoScrollViewPager2 = this.f35998a.get();
                if (autoScrollViewPager2 != null) {
                    aVar = autoScrollViewPager2.F0;
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    z12 = false;
                }
                if (z12) {
                    autoScrollViewPager = autoScrollViewPager2;
                }
                if (autoScrollViewPager != null) {
                    af.a aVar3 = autoScrollViewPager.F0;
                    o.f(aVar3);
                    aVar3.a(autoScrollViewPager.C0);
                    autoScrollViewPager.e0();
                    af.a aVar4 = autoScrollViewPager.F0;
                    o.f(aVar4);
                    aVar4.a(autoScrollViewPager.D0);
                    int i11 = autoScrollViewPager.A0;
                    o.f(autoScrollViewPager.F0);
                    autoScrollViewPager.f0(i11 + aVar2.getDuration());
                }
            }
        }
    }

    /* compiled from: AutoScrollViewPager.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.i(context, "context");
        o.i(attributeSet, "attributeSet");
        this.A0 = 10000;
        this.B0 = true;
        this.C0 = 1.0d;
        this.D0 = 1.0d;
        this.E0 = new a(this);
        this.G0 = 1;
        g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0() {
        int i11;
        int i12;
        int currentItem = getCurrentItem();
        androidx.viewpager.widget.a adapter = getAdapter();
        if (adapter != null) {
            i11 = adapter.d();
        } else {
            i11 = -100;
        }
        if (i11 <= 1) {
            return;
        }
        if (this.G0 == 0) {
            i12 = currentItem - 1;
        } else {
            i12 = currentItem + 1;
        }
        if (i12 < 0 && this.f35997z0) {
            R(i11 - 1, this.B0);
        } else if (i12 == i11 && this.f35997z0) {
            R(0, this.B0);
        } else {
            R(i12, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(long j11) {
        this.E0.removeMessages(-13);
        this.E0.sendEmptyMessageDelayed(-13, j11);
    }

    private final void g0() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("j");
            Field declaredField2 = ViewPager.class.getDeclaredField("x0");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            Context context = getContext();
            o.h(context, "getContext(...)");
            Object obj = declaredField2.get(null);
            o.g(obj, "null cannot be cast to non-null type android.view.animation.Interpolator");
            af.a aVar = new af.a(context, (Interpolator) obj);
            this.F0 = aVar;
            declaredField.set(this, aVar);
        } catch (IllegalStateException | NoSuchFieldException unused) {
        }
    }

    public final void h0() {
        af.a aVar = this.F0;
        if (aVar != null) {
            f0((long) (this.A0 + ((aVar.getDuration() / this.C0) * this.D0)));
        }
    }
}
