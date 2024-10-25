package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet;

import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import wz.p;
/* compiled from: RangeFilterBottomSheet.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet$onViewCreated$1", f = "RangeFilterBottomSheet.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RangeFilterBottomSheet$onViewCreated$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29918a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ RangeFilterBottomSheet f29919b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RangeFilterBottomSheet.kt */
    @d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet$onViewCreated$1$1", f = "RangeFilterBottomSheet.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<RangeFilterViewModel.a, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f29920a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f29921b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RangeFilterBottomSheet f29922c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RangeFilterBottomSheet rangeFilterBottomSheet, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f29922c = rangeFilterBottomSheet;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(RangeFilterViewModel.a aVar, zz.a<? super p> aVar2) {
            return ((AnonymousClass1) create(aVar, aVar2)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29922c, aVar);
            anonymousClass1.f29921b = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
            r4 = r3.f29922c.f29902g;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                kotlin.coroutines.intrinsics.a.f()
                int r0 = r3.f29920a
                if (r0 != 0) goto L46
                kotlin.f.b(r4)
                java.lang.Object r4 = r3.f29921b
                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel$a r4 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel.a) r4
                boolean r0 = r4 instanceof com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel.a.C0333a
                if (r0 == 0) goto L29
                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet r0 = r3.f29922c
                g00.l r0 = com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet.B(r0)
                if (r0 == 0) goto L23
                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel$a$a r4 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel.a.C0333a) r4
                fc.c r4 = r4.a()
                r0.invoke(r4)
            L23:
                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet r4 = r3.f29922c
                r4.dismiss()
                goto L43
            L29:
                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel$a$b r0 = com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel.a.b.f29935a
                boolean r4 = kotlin.jvm.internal.o.d(r4, r0)
                if (r4 == 0) goto L43
                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet r4 = r3.f29922c
                g00.l r4 = com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet.B(r4)
                if (r4 == 0) goto L43
                fc.c$b r0 = new fc.c$b
                r1 = 2
                r2 = 0
                r0.<init>(r2, r2, r1, r2)
                r4.invoke(r0)
            L43:
                wz.p r4 = wz.p.f75480a
                return r4
            L46:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet$onViewCreated$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeFilterBottomSheet$onViewCreated$1(RangeFilterBottomSheet rangeFilterBottomSheet, zz.a<? super RangeFilterBottomSheet$onViewCreated$1> aVar) {
        super(1, aVar);
        this.f29919b = rangeFilterBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new RangeFilterBottomSheet$onViewCreated$1(this.f29919b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        RangeFilterViewModel H;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f29918a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            H = this.f29919b.H();
            MutableSharedFlow<RangeFilterViewModel.a> x02 = H.x0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29919b, null);
            this.f29918a = 1;
            if (FlowKt.collectLatest(x02, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((RangeFilterBottomSheet$onViewCreated$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
