package com.forsale.app.features.search;

import com.forsale.app.datalayer.repositories.TrendsRepository;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchViewModel$loadAndHandleTrendingAsync$1", f = "SearchViewModel.kt", l = {274}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchViewModel$loadAndHandleTrendingAsync$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super Throwable>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36878a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchViewModel f36879b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f36880c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchViewModel$loadAndHandleTrendingAsync$1$1", f = "SearchViewModel.kt", l = {275}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.search.SearchViewModel$loadAndHandleTrendingAsync$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.l<zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36881a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchViewModel f36882b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SearchViewModel searchViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(1, aVar);
            this.f36882b = searchViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(zz.a<?> aVar) {
            return new AnonymousClass1(this.f36882b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            TrendsRepository trendsRepository;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f36881a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                trendsRepository = this.f36882b.f36837p0;
                this.f36881a = 1;
                if (trendsRepository.getTrends(this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.l
        public final Object invoke(zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$loadAndHandleTrendingAsync$1(SearchViewModel searchViewModel, boolean z11, zz.a<? super SearchViewModel$loadAndHandleTrendingAsync$1> aVar) {
        super(2, aVar);
        this.f36879b = searchViewModel;
        this.f36880c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchViewModel$loadAndHandleTrendingAsync$1(this.f36879b, this.f36880c, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r1 == false) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r9.f36878a
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.f.b(r10)
            goto L54
        Lf:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L17:
            kotlin.f.b(r10)
            com.forsale.app.features.search.SearchViewModel r10 = r9.f36879b
            boolean r1 = r9.f36880c
            if (r1 != 0) goto L42
            kotlinx.coroutines.flow.Flow r3 = r10.p1()
            r4 = 0
            r5 = 0
            r7 = 3
            r8 = 0
            androidx.lifecycle.LiveData r1 = androidx.lifecycle.FlowLiveDataConversions.c(r3, r4, r5, r7, r8)
            java.lang.Object r1 = r1.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            r3 = 0
            if (r1 == 0) goto L3f
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3d
            goto L3f
        L3d:
            r1 = r3
            goto L40
        L3f:
            r1 = r2
        L40:
            if (r1 != 0) goto L43
        L42:
            r3 = r2
        L43:
            com.forsale.app.features.search.SearchViewModel$loadAndHandleTrendingAsync$1$1 r1 = new com.forsale.app.features.search.SearchViewModel$loadAndHandleTrendingAsync$1$1
            com.forsale.app.features.search.SearchViewModel r4 = r9.f36879b
            r5 = 0
            r1.<init>(r4, r5)
            r9.f36878a = r2
            java.lang.Object r10 = com.forsale.app.features.search.SearchViewModel.V0(r10, r3, r1, r9)
            if (r10 != r0) goto L54
            return r0
        L54:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.SearchViewModel$loadAndHandleTrendingAsync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super Throwable> aVar) {
        return ((SearchViewModel$loadAndHandleTrendingAsync$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
