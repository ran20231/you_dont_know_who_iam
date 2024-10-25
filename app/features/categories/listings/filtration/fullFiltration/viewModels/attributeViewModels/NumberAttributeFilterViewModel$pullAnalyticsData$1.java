package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NumberAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.NumberAttributeFilterViewModel", f = "NumberAttributeFilterViewModel.kt", l = {145}, m = "pullAnalyticsData")
/* loaded from: classes2.dex */
public final class NumberAttributeFilterViewModel$pullAnalyticsData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29339a;

    /* renamed from: b  reason: collision with root package name */
    Object f29340b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29341c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ NumberAttributeFilterViewModel f29342d;

    /* renamed from: e  reason: collision with root package name */
    int f29343e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberAttributeFilterViewModel$pullAnalyticsData$1(NumberAttributeFilterViewModel numberAttributeFilterViewModel, a<? super NumberAttributeFilterViewModel$pullAnalyticsData$1> aVar) {
        super(aVar);
        this.f29342d = numberAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29341c = obj;
        this.f29343e |= Integer.MIN_VALUE;
        return this.f29342d.N(this);
    }
}
