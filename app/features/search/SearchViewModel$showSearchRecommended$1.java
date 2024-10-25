package com.forsale.app.features.search;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchViewModel", f = "SearchViewModel.kt", l = {FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD}, m = "showSearchRecommended")
/* loaded from: classes2.dex */
public final class SearchViewModel$showSearchRecommended$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f36902a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchViewModel f36903b;

    /* renamed from: c  reason: collision with root package name */
    int f36904c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$showSearchRecommended$1(SearchViewModel searchViewModel, zz.a<? super SearchViewModel$showSearchRecommended$1> aVar) {
        super(aVar);
        this.f36903b = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object O1;
        this.f36902a = obj;
        this.f36904c |= Integer.MIN_VALUE;
        O1 = this.f36903b.O1(this);
        return O1;
    }
}
