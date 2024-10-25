package com.forsale.app.features.search;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.forsale.app.features.search.SearchFocusViewModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusFragment$ObserveUiState$1", f = "SearchFocusFragment.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchFocusFragment$ObserveUiState$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36657a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchFocusFragment f36658b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchFocusFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusFragment$ObserveUiState$1$1", f = "SearchFocusFragment.kt", l = {191}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.search.SearchFocusFragment$ObserveUiState$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchFocusFragment f36660b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SearchFocusFragment.kt */
        /* renamed from: com.forsale.app.features.search.SearchFocusFragment$ObserveUiState$1$1$a */
        /* loaded from: classes2.dex */
        public static final class a implements FlowCollector<SearchFocusViewModel.c> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SearchFocusFragment f36661a;

            a(SearchFocusFragment searchFocusFragment) {
                this.f36661a = searchFocusFragment;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(SearchFocusViewModel.c cVar, zz.a<? super wz.p> aVar) {
                if (kotlin.jvm.internal.o.d(cVar, d0.f36982a)) {
                    this.f36661a.p0();
                }
                return wz.p.f75480a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SearchFocusFragment searchFocusFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f36660b = searchFocusFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f36660b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f36659a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                Flow<SearchFocusViewModel.c> S0 = this.f36660b.B().S0();
                a aVar = new a(this.f36660b);
                this.f36659a = 1;
                if (S0.collect(aVar, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusFragment$ObserveUiState$1(SearchFocusFragment searchFocusFragment, zz.a<? super SearchFocusFragment$ObserveUiState$1> aVar) {
        super(2, aVar);
        this.f36658b = searchFocusFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusFragment$ObserveUiState$1(this.f36658b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36657a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            Lifecycle lifecycle = this.f36658b.getLifecycle();
            kotlin.jvm.internal.o.h(lifecycle, "<get-lifecycle>(...)");
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f36658b, null);
            this.f36657a = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusFragment$ObserveUiState$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
