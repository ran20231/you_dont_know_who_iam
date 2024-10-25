package com.forsale.app.features.banners;

import aa.c1;
import androidx.lifecycle.s;
import com.forsale.adserver.adviews.baseViews.AdViewContainer;
import com.forsale.app.features.banners.BannerItem;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import m9.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BannerItem.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$2", f = "BannerItem.kt", l = {74, 81, 90, 99, 115}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BannerItem$ViewHolder$bindView$1$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23227a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BannerItem f23228b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c1 f23229c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BannerItem.ViewHolder f23230d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerItem.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c1 f23231a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannerItem.ViewHolder f23232b;

        a(c1 c1Var, BannerItem.ViewHolder viewHolder) {
            this.f23231a = c1Var;
            this.f23232b = viewHolder;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            s sVar;
            AdViewContainer adViewContainer = this.f23231a.O;
            sVar = this.f23232b.f23208b;
            adViewContainer.H(sVar);
            adViewContainer.E(c.g.f63242a);
            BannerItem.ViewHolder.j(this.f23232b, 224, null, null, 6, null);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerItem.kt */
    /* loaded from: classes2.dex */
    public static final class b implements FlowCollector<wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BannerItem f23233a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1 f23234b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BannerItem.ViewHolder f23235c;

        b(BannerItem bannerItem, c1 c1Var, BannerItem.ViewHolder viewHolder) {
            this.f23233a = bannerItem;
            this.f23234b = c1Var;
            this.f23235c = viewHolder;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            s sVar;
            Integer c11 = this.f23233a.w().c();
            if (c11 != null) {
                c1 c1Var = this.f23234b;
                BannerItem bannerItem = this.f23233a;
                BannerItem.ViewHolder viewHolder = this.f23235c;
                int intValue = c11.intValue();
                AdViewContainer adViewContainer = c1Var.O;
                sVar = viewHolder.f23208b;
                adViewContainer.H(sVar);
                adViewContainer.E(new c.C0739c(intValue, bannerItem.w().f()));
                BannerItem.ViewHolder.j(viewHolder, 128, kotlin.coroutines.jvm.internal.a.d(12), null, 4, null);
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerItem.kt */
    /* loaded from: classes2.dex */
    public static final class c implements FlowCollector<wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BannerItem f23236a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1 f23237b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BannerItem.ViewHolder f23238c;

        c(BannerItem bannerItem, c1 c1Var, BannerItem.ViewHolder viewHolder) {
            this.f23236a = bannerItem;
            this.f23237b = c1Var;
            this.f23238c = viewHolder;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            s sVar;
            Integer c11 = this.f23236a.w().c();
            if (c11 != null) {
                c1 c1Var = this.f23237b;
                BannerItem bannerItem = this.f23236a;
                BannerItem.ViewHolder viewHolder = this.f23238c;
                int intValue = c11.intValue();
                AdViewContainer adViewContainer = c1Var.O;
                sVar = viewHolder.f23208b;
                adViewContainer.H(sVar);
                adViewContainer.E(new c.a(intValue, bannerItem.w().f()));
                BannerItem.ViewHolder.j(viewHolder, 128, kotlin.coroutines.jvm.internal.a.d(12), null, 4, null);
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerItem.kt */
    /* loaded from: classes2.dex */
    public static final class d implements FlowCollector<wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BannerItem f23239a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1 f23240b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BannerItem.ViewHolder f23241c;

        d(BannerItem bannerItem, c1 c1Var, BannerItem.ViewHolder viewHolder) {
            this.f23239a = bannerItem;
            this.f23240b = c1Var;
            this.f23241c = viewHolder;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            s sVar;
            if (this.f23239a.w().c() != null && this.f23239a.w().a() != null) {
                AdViewContainer adViewContainer = this.f23240b.O;
                sVar = this.f23241c.f23208b;
                adViewContainer.H(sVar);
                adViewContainer.E(new c.e(this.f23239a.w().c().intValue(), this.f23239a.w().f(), this.f23239a.w().a().intValue(), true));
                this.f23241c.i(256, kotlin.coroutines.jvm.internal.a.d(8), kotlin.coroutines.jvm.internal.a.d(8));
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerItem.kt */
    /* loaded from: classes2.dex */
    public static final class e implements FlowCollector<wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BannerItem f23242a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1 f23243b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BannerItem.ViewHolder f23244c;

        e(BannerItem bannerItem, c1 c1Var, BannerItem.ViewHolder viewHolder) {
            this.f23242a = bannerItem;
            this.f23243b = c1Var;
            this.f23244c = viewHolder;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            s sVar;
            Integer c11 = this.f23242a.w().c();
            if (c11 != null) {
                c1 c1Var = this.f23243b;
                BannerItem.ViewHolder viewHolder = this.f23244c;
                int intValue = c11.intValue();
                AdViewContainer adViewContainer = c1Var.O;
                sVar = viewHolder.f23208b;
                adViewContainer.H(sVar);
                adViewContainer.E(new c.f(intValue));
                BannerItem.ViewHolder.j(viewHolder, 56, kotlin.coroutines.jvm.internal.a.d(8), null, 4, null);
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerItem$ViewHolder$bindView$1$2(BannerItem bannerItem, c1 c1Var, BannerItem.ViewHolder viewHolder, zz.a<? super BannerItem$ViewHolder$bindView$1$2> aVar) {
        super(2, aVar);
        this.f23228b = bannerItem;
        this.f23229c = c1Var;
        this.f23230d = viewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BannerItem$ViewHolder$bindView$1$2(this.f23228b, this.f23229c, this.f23230d, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r9.f23227a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L35
            if (r1 == r6) goto L31
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L29
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            kotlin.f.b(r10)
            goto Ld6
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            kotlin.f.b(r10)
            goto Lb6
        L29:
            kotlin.f.b(r10)
            goto L96
        L2d:
            kotlin.f.b(r10)
            goto L76
        L31:
            kotlin.f.b(r10)
            goto L56
        L35:
            kotlin.f.b(r10)
            com.forsale.app.features.banners.BannerItem r10 = r9.f23228b
            na.a r10 = r10.w()
            com.forsale.app.utils.OneShotEventHandler r10 = r10.i()
            if (r10 == 0) goto L56
            com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$2$a r1 = new com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$2$a
            aa.c1 r7 = r9.f23229c
            com.forsale.app.features.banners.BannerItem$ViewHolder r8 = r9.f23230d
            r1.<init>(r7, r8)
            r9.f23227a = r6
            java.lang.Object r10 = r10.e(r1, r9)
            if (r10 != r0) goto L56
            return r0
        L56:
            com.forsale.app.features.banners.BannerItem r10 = r9.f23228b
            na.a r10 = r10.w()
            com.forsale.app.utils.OneShotEventHandler r10 = r10.e()
            if (r10 == 0) goto L76
            com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$2$b r1 = new com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$2$b
            com.forsale.app.features.banners.BannerItem r6 = r9.f23228b
            aa.c1 r7 = r9.f23229c
            com.forsale.app.features.banners.BannerItem$ViewHolder r8 = r9.f23230d
            r1.<init>(r6, r7, r8)
            r9.f23227a = r5
            java.lang.Object r10 = r10.e(r1, r9)
            if (r10 != r0) goto L76
            return r0
        L76:
            com.forsale.app.features.banners.BannerItem r10 = r9.f23228b
            na.a r10 = r10.w()
            com.forsale.app.utils.OneShotEventHandler r10 = r10.d()
            if (r10 == 0) goto L96
            com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$2$c r1 = new com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$2$c
            com.forsale.app.features.banners.BannerItem r5 = r9.f23228b
            aa.c1 r6 = r9.f23229c
            com.forsale.app.features.banners.BannerItem$ViewHolder r7 = r9.f23230d
            r1.<init>(r5, r6, r7)
            r9.f23227a = r4
            java.lang.Object r10 = r10.e(r1, r9)
            if (r10 != r0) goto L96
            return r0
        L96:
            com.forsale.app.features.banners.BannerItem r10 = r9.f23228b
            na.a r10 = r10.w()
            com.forsale.app.utils.OneShotEventHandler r10 = r10.g()
            if (r10 == 0) goto Lb6
            com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$2$d r1 = new com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$2$d
            com.forsale.app.features.banners.BannerItem r4 = r9.f23228b
            aa.c1 r5 = r9.f23229c
            com.forsale.app.features.banners.BannerItem$ViewHolder r6 = r9.f23230d
            r1.<init>(r4, r5, r6)
            r9.f23227a = r3
            java.lang.Object r10 = r10.e(r1, r9)
            if (r10 != r0) goto Lb6
            return r0
        Lb6:
            com.forsale.app.features.banners.BannerItem r10 = r9.f23228b
            na.a r10 = r10.w()
            com.forsale.app.utils.OneShotEventHandler r10 = r10.h()
            if (r10 == 0) goto Ld6
            com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$2$e r1 = new com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$2$e
            com.forsale.app.features.banners.BannerItem r3 = r9.f23228b
            aa.c1 r4 = r9.f23229c
            com.forsale.app.features.banners.BannerItem$ViewHolder r5 = r9.f23230d
            r1.<init>(r3, r4, r5)
            r9.f23227a = r2
            java.lang.Object r10 = r10.e(r1, r9)
            if (r10 != r0) goto Ld6
            return r0
        Ld6:
            wz.p r10 = wz.p.f75480a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BannerItem$ViewHolder$bindView$1$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
