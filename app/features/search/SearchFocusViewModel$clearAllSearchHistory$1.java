package com.forsale.app.features.search;

import com.forsale.app.datalayer.repositories.SearchHistoryRepository;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel$clearAllSearchHistory$1", f = "SearchFocusViewModel.kt", l = {434}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchFocusViewModel$clearAllSearchHistory$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36733a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchFocusViewModel f36734b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusViewModel$clearAllSearchHistory$1(SearchFocusViewModel searchFocusViewModel, zz.a<? super SearchFocusViewModel$clearAllSearchHistory$1> aVar) {
        super(2, aVar);
        this.f36734b = searchFocusViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusViewModel$clearAllSearchHistory$1(this.f36734b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        SearchHistoryRepository searchHistoryRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36733a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            searchHistoryRepository = this.f36734b.f36705p0;
            this.f36733a = 1;
            if (searchHistoryRepository.deleteAll(this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusViewModel$clearAllSearchHistory$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
