package com.forsale.app.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.DecelerateInterpolator;
/* compiled from: RevealAnimationUtil.kt */
/* loaded from: classes3.dex */
public final class RevealAnimationUtilKt {

    /* compiled from: RevealAnimationUtil.kt */
    /* loaded from: classes3.dex */
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f39639a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g00.a<wz.p> f39640b;

        a(View view, g00.a<wz.p> aVar) {
            this.f39639a = view;
            this.f39640b = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.o.i(animation, "animation");
            super.onAnimationEnd(animation);
            this.f39639a.setVisibility(8);
            this.f39640b.invoke();
        }
    }

    /* compiled from: RevealAnimationUtil.kt */
    /* loaded from: classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f39641a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f39642b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f39643c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g00.a<wz.p> f39644d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g00.a<wz.p> f39645e;

        /* compiled from: RevealAnimationUtil.kt */
        /* loaded from: classes3.dex */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g00.a<wz.p> f39646a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g00.a<wz.p> f39647b;

            a(g00.a<wz.p> aVar, g00.a<wz.p> aVar2) {
                this.f39646a = aVar;
                this.f39647b = aVar2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                kotlin.jvm.internal.o.i(animation, "animation");
                super.onAnimationEnd(animation);
                this.f39646a.invoke();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                kotlin.jvm.internal.o.i(animation, "animation");
                super.onAnimationStart(animation);
                this.f39647b.invoke();
            }
        }

        b(int i11, int i12, long j11, g00.a<wz.p> aVar, g00.a<wz.p> aVar2) {
            this.f39641a = i11;
            this.f39642b = i12;
            this.f39643c = j11;
            this.f39644d = aVar;
            this.f39645e = aVar2;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            kotlin.jvm.internal.o.i(v11, "v");
            v11.removeOnLayoutChangeListener(this);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(v11, this.f39641a, this.f39642b, 0.0f, (int) Math.hypot(i13, i14));
            long j11 = this.f39643c;
            g00.a<wz.p> aVar = this.f39644d;
            g00.a<wz.p> aVar2 = this.f39645e;
            createCircularReveal.setInterpolator(new DecelerateInterpolator(1.2f));
            createCircularReveal.setDuration(j11);
            createCircularReveal.addListener(new a(aVar, aVar2));
            createCircularReveal.start();
        }
    }

    public static final void a(View view, int i11, int i12, g00.a<wz.p> block) {
        kotlin.jvm.internal.o.i(view, "<this>");
        kotlin.jvm.internal.o.i(block, "block");
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i11, i12, (float) Math.hypot(view.getWidth(), view.getHeight()), 0.0f);
        createCircularReveal.setDuration(500L);
        createCircularReveal.setInterpolator(new DecelerateInterpolator(1.0f));
        createCircularReveal.addListener(new a(view, block));
        createCircularReveal.start();
    }

    public static final void b(View view, int i11, int i12, long j11, g00.a<wz.p> onAnimationStart, g00.a<wz.p> onAnimationEnd) {
        kotlin.jvm.internal.o.i(view, "<this>");
        kotlin.jvm.internal.o.i(onAnimationStart, "onAnimationStart");
        kotlin.jvm.internal.o.i(onAnimationEnd, "onAnimationEnd");
        view.addOnLayoutChangeListener(new b(i11, i12, j11, onAnimationEnd, onAnimationStart));
    }

    public static /* synthetic */ void c(View view, int i11, int i12, long j11, g00.a aVar, g00.a aVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = view.getLeft();
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            aVar = new g00.a<wz.p>() { // from class: com.forsale.app.utils.RevealAnimationUtilKt$startCircularReveal$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }
            };
        }
        g00.a aVar3 = aVar;
        if ((i13 & 16) != 0) {
            aVar2 = new g00.a<wz.p>() { // from class: com.forsale.app.utils.RevealAnimationUtilKt$startCircularReveal$2
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }
            };
        }
        b(view, i14, i12, j11, aVar3, aVar2);
    }
}
