package com.forsale.app.features.search;

import com.forsale.app.features.search.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusFragment$registerObservers$1", f = "SearchFocusFragment.kt", l = {202}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchFocusFragment$registerObservers$1 extends SuspendLambda implements g00.l<zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36693a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchFocusFragment f36694b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchFocusFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<com.forsale.app.features.search.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchFocusFragment f36695a;

        a(SearchFocusFragment searchFocusFragment) {
            this.f36695a = searchFocusFragment;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(com.forsale.app.features.search.a aVar, zz.a<? super wz.p> aVar2) {
            if (aVar instanceof a.b) {
                this.f36695a.B().n1(u.f37022a);
                a.b bVar = (a.b) aVar;
                this.f36695a.s0(bVar.f());
                this.f36695a.o0(bVar.f(), bVar.g(), bVar.a(), bVar.b(), bVar.c(), bVar.e());
            } else if (aVar instanceof a.C0422a) {
                a.C0422a c0422a = (a.C0422a) aVar;
                this.f36695a.m0(c0422a.a(), c0422a.b());
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusFragment$registerObservers$1(SearchFocusFragment searchFocusFragment, zz.a<? super SearchFocusFragment$registerObservers$1> aVar) {
        super(1, aVar);
        this.f36694b = searchFocusFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(zz.a<?> aVar) {
        return new SearchFocusFragment$registerObservers$1(this.f36694b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36693a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            Flow<com.forsale.app.features.search.a> R0 = this.f36694b.B().R0();
            a aVar = new a(this.f36694b);
            this.f36693a = 1;
            if (R0.collect(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super wz.p> aVar) {
        return ((SearchFocusFragment$registerObservers$1) create(aVar)).invokeSuspend(wz.p.f75480a);
    }
}
