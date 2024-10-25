package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet;

import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import wz.p;
/* compiled from: HorizontalFilterBottomSheet.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$onViewCreated$1", f = "HorizontalFilterBottomSheet.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HorizontalFilterBottomSheet$onViewCreated$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29669a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HorizontalFilterBottomSheet f29670b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HorizontalFilterBottomSheet.kt */
    @d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$onViewCreated$1$1", f = "HorizontalFilterBottomSheet.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<HorizontalFilterViewModel.a, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f29671a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f29672b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HorizontalFilterBottomSheet f29673c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HorizontalFilterBottomSheet horizontalFilterBottomSheet, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f29673c = horizontalFilterBottomSheet;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(HorizontalFilterViewModel.a aVar, zz.a<? super p> aVar2) {
            return ((AnonymousClass1) create(aVar, aVar2)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29673c, aVar);
            anonymousClass1.f29672b = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
            r5 = r4.f29673c.f29637g;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.a.f()
                int r0 = r4.f29671a
                if (r0 != 0) goto L4a
                kotlin.f.b(r5)
                java.lang.Object r5 = r4.f29672b
                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$a r5 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel.a) r5
                boolean r0 = r5 instanceof com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel.a.C0329a
                if (r0 == 0) goto L29
                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet r0 = r4.f29673c
                g00.l r0 = com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet.A(r0)
                if (r0 == 0) goto L23
                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$a$a r5 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel.a.C0329a) r5
                fc.c r5 = r5.a()
                r0.invoke(r5)
            L23:
                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet r5 = r4.f29673c
                r5.dismiss()
                goto L47
            L29:
                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$a$b r0 = com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel.a.b.f29690a
                boolean r5 = kotlin.jvm.internal.o.d(r5, r0)
                if (r5 == 0) goto L47
                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet r5 = r4.f29673c
                g00.l r5 = com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet.A(r5)
                if (r5 == 0) goto L47
                fc.c$a r0 = new fc.c$a
                java.util.List r1 = kotlin.collections.p.n()
                r2 = 2
                r3 = 0
                r0.<init>(r1, r3, r2, r3)
                r5.invoke(r0)
            L47:
                wz.p r5 = wz.p.f75480a
                return r5
            L4a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$onViewCreated$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalFilterBottomSheet$onViewCreated$1(HorizontalFilterBottomSheet horizontalFilterBottomSheet, zz.a<? super HorizontalFilterBottomSheet$onViewCreated$1> aVar) {
        super(1, aVar);
        this.f29670b = horizontalFilterBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new HorizontalFilterBottomSheet$onViewCreated$1(this.f29670b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f29669a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<HorizontalFilterViewModel.a> B0 = this.f29670b.G().B0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29670b, null);
            this.f29669a = 1;
            if (FlowKt.collectLatest(B0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((HorizontalFilterBottomSheet$onViewCreated$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
