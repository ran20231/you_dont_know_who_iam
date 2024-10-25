package com.forsale.app.interactors;

import com.forsale.app.datalayer.database.TrendEntity;
import com.forsale.app.datalayer.repositories.TrendsRepository;
import com.forsale.app.utils.itemutils.TextHolder;
import dj.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import wz.p;
import zz.a;
/* compiled from: GetTrendTitleInteractor.kt */
/* loaded from: classes2.dex */
public final class GetTrendTitleInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final TrendsRepository f37458a;

    /* renamed from: b  reason: collision with root package name */
    private final i f37459b;

    public GetTrendTitleInteractor(TrendsRepository trendsRepository) {
        o.i(trendsRepository, "trendsRepository");
        this.f37458a = trendsRepository;
        this.f37459b = i.f54287a.invoke();
    }

    public final Flow<TextHolder> b() {
        final Flow<TrendEntity> titleAsFlow = this.f37458a.getTitleAsFlow();
        return new Flow<TextHolder>() { // from class: com.forsale.app.interactors.GetTrendTitleInteractor$invoke$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.interactors.GetTrendTitleInteractor$invoke$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f37462a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ GetTrendTitleInteractor f37463b;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.interactors.GetTrendTitleInteractor$invoke$$inlined$map$1$2", f = "GetTrendTitleInteractor.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.interactors.GetTrendTitleInteractor$invoke$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f37464a;

                    /* renamed from: b  reason: collision with root package name */
                    int f37465b;

                    public AnonymousClass1(a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f37464a = obj;
                        this.f37465b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, GetTrendTitleInteractor getTrendTitleInteractor) {
                    this.f37462a = flowCollector;
                    this.f37463b = getTrendTitleInteractor;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r12, zz.a r13) {
                    /*
                        r11 = this;
                        boolean r0 = r13 instanceof com.forsale.app.interactors.GetTrendTitleInteractor$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r13
                        com.forsale.app.interactors.GetTrendTitleInteractor$invoke$$inlined$map$1$2$1 r0 = (com.forsale.app.interactors.GetTrendTitleInteractor$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f37465b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f37465b = r1
                        goto L18
                    L13:
                        com.forsale.app.interactors.GetTrendTitleInteractor$invoke$$inlined$map$1$2$1 r0 = new com.forsale.app.interactors.GetTrendTitleInteractor$invoke$$inlined$map$1$2$1
                        r0.<init>(r13)
                    L18:
                        java.lang.Object r13 = r0.f37464a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f37465b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r13)
                        goto L76
                    L29:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r13)
                        throw r12
                    L31:
                        kotlin.f.b(r13)
                        kotlinx.coroutines.flow.FlowCollector r13 = r11.f37462a
                        com.forsale.app.datalayer.database.TrendEntity r12 = (com.forsale.app.datalayer.database.TrendEntity) r12
                        if (r12 == 0) goto L52
                        com.forsale.app.utils.itemutils.TextHolder r2 = new com.forsale.app.utils.itemutils.TextHolder
                        r5 = 0
                        com.forsale.app.utils.itemutils.TextHolder$LocalizedText r6 = new com.forsale.app.utils.itemutils.TextHolder$LocalizedText
                        java.lang.String r4 = r12.getAr()
                        java.lang.String r12 = r12.getEn()
                        r6.<init>(r4, r12)
                        r7 = 0
                        r8 = 5
                        r9 = 0
                        r4 = r2
                        r4.<init>(r5, r6, r7, r8, r9)
                        goto L6d
                    L52:
                        com.forsale.app.interactors.GetTrendTitleInteractor r12 = r11.f37463b
                        dj.i r12 = com.forsale.app.interactors.GetTrendTitleInteractor.a(r12)
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.String r4 = "TrendTitle is null from DB"
                        r2.<init>(r4)
                        r12.f(r2)
                        com.forsale.app.utils.itemutils.TextHolder r2 = new com.forsale.app.utils.itemutils.TextHolder
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r9 = 7
                        r10 = 0
                        r5 = r2
                        r5.<init>(r6, r7, r8, r9, r10)
                    L6d:
                        r0.f37465b = r3
                        java.lang.Object r12 = r13.emit(r2, r0)
                        if (r12 != r1) goto L76
                        return r1
                    L76:
                        wz.p r12 = wz.p.f75480a
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.interactors.GetTrendTitleInteractor$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super TextHolder> flowCollector, a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
    }
}
