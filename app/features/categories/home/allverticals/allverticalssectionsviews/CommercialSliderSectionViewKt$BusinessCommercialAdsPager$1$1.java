package com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews;

import com.google.accompanist.pager.PagerState;
import g00.p;
import j0.k0;
import j0.n1;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommercialSliderSectionView.kt */
@d(c = "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommercialSliderSectionViewKt$BusinessCommercialAdsPager$1$1", f = "CommercialSliderSectionView.kt", l = {87, 96, 98}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CommercialSliderSectionViewKt$BusinessCommercialAdsPager$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f23521a;

    /* renamed from: b  reason: collision with root package name */
    int f23522b;

    /* renamed from: c  reason: collision with root package name */
    int f23523c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PagerState f23524d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f23525e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f23526f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ n1<Boolean> f23527g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ k0<Integer> f23528h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialSliderSectionViewKt$BusinessCommercialAdsPager$1$1(PagerState pagerState, int i11, int i12, n1<Boolean> n1Var, k0<Integer> k0Var, a<? super CommercialSliderSectionViewKt$BusinessCommercialAdsPager$1$1> aVar) {
        super(2, aVar);
        this.f23524d = pagerState;
        this.f23525e = i11;
        this.f23526f = i12;
        this.f23527g = n1Var;
        this.f23528h = k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new CommercialSliderSectionViewKt$BusinessCommercialAdsPager$1$1(this.f23524d, this.f23525e, this.f23526f, this.f23527g, this.f23528h, aVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0058 -> B:13:0x0030). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008c -> B:37:0x00a0). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r13.f23523c
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1b:
            int r1 = r13.f23522b
            java.lang.Object r6 = r13.f23521a
            j0.k0 r6 = (j0.k0) r6
            kotlin.f.b(r14)
            r14 = r13
            goto La0
        L27:
            kotlin.f.b(r14)
            r14 = r13
            goto L3d
        L2c:
            kotlin.f.b(r14)
            r14 = r13
        L30:
            r14.f23521a = r2
            r14.f23523c = r5
            r6 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r6, r14)
            if (r1 != r0) goto L3d
            return r0
        L3d:
            com.google.accompanist.pager.PagerState r6 = r14.f23524d
            int r1 = r14.f23525e
            int r7 = r14.f23526f
            j0.n1<java.lang.Boolean> r8 = r14.f23527g
            j0.k0<java.lang.Integer> r12 = r14.f23528h
            int r9 = r6.k()
            int r9 = com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommercialSliderSectionViewKt.o(r1, r7, r9)
            int r10 = r6.k()
            int r10 = r10 + r5
            boolean r8 = com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommercialSliderSectionViewKt.n(r8)
            if (r8 != 0) goto L30
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.a.d(r10)
            r8.intValue()
            if (r10 >= r7) goto L65
            r7 = r5
            goto L66
        L65:
            r7 = 0
        L66:
            if (r7 == 0) goto L69
            goto L6a
        L69:
            r8 = r2
        L6a:
            if (r8 == 0) goto L71
            int r1 = r8.intValue()
            goto L74
        L71:
            int r9 = r9 + r1
            int r9 = r9 + r5
            r1 = r9
        L74:
            int r7 = r6.k()
            if (r1 <= r7) goto L8e
            r8 = 0
            r10 = 2
            r11 = 0
            r14.f23521a = r12
            r14.f23522b = r1
            r14.f23523c = r4
            r7 = r1
            r9 = r14
            java.lang.Object r6 = com.google.accompanist.pager.PagerState.j(r6, r7, r8, r9, r10, r11)
            if (r6 != r0) goto L8c
            return r0
        L8c:
            r6 = r12
            goto La0
        L8e:
            r8 = 0
            r10 = 2
            r11 = 0
            r14.f23521a = r12
            r14.f23522b = r1
            r14.f23523c = r3
            r7 = r1
            r9 = r14
            java.lang.Object r6 = com.google.accompanist.pager.PagerState.x(r6, r7, r8, r9, r10, r11)
            if (r6 != r0) goto L8c
            return r0
        La0:
            com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommercialSliderSectionViewKt.m(r6, r1)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommercialSliderSectionViewKt$BusinessCommercialAdsPager$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((CommercialSliderSectionViewKt$BusinessCommercialAdsPager$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
