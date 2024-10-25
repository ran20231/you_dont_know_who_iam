package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BooleanAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel", f = "BooleanAttributeFilterViewModel.kt", l = {FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD}, m = "pullAnalyticsData")
/* loaded from: classes2.dex */
public final class BooleanAttributeFilterViewModel$pullAnalyticsData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29266a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29267b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BooleanAttributeFilterViewModel f29268c;

    /* renamed from: d  reason: collision with root package name */
    int f29269d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BooleanAttributeFilterViewModel$pullAnalyticsData$1(BooleanAttributeFilterViewModel booleanAttributeFilterViewModel, a<? super BooleanAttributeFilterViewModel$pullAnalyticsData$1> aVar) {
        super(aVar);
        this.f29268c = booleanAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29267b = obj;
        this.f29269d |= Integer.MIN_VALUE;
        return this.f29268c.N(this);
    }
}
