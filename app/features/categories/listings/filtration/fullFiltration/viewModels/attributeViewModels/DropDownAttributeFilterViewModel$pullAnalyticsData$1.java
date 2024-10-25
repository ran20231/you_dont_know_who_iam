package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropDownAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel", f = "DropDownAttributeFilterViewModel.kt", l = {133}, m = "pullAnalyticsData")
/* loaded from: classes2.dex */
public final class DropDownAttributeFilterViewModel$pullAnalyticsData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29299a;

    /* renamed from: b  reason: collision with root package name */
    Object f29300b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29301c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ DropDownAttributeFilterViewModel f29302d;

    /* renamed from: e  reason: collision with root package name */
    int f29303e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownAttributeFilterViewModel$pullAnalyticsData$1(DropDownAttributeFilterViewModel dropDownAttributeFilterViewModel, a<? super DropDownAttributeFilterViewModel$pullAnalyticsData$1> aVar) {
        super(aVar);
        this.f29302d = dropDownAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29301c = obj;
        this.f29303e |= Integer.MIN_VALUE;
        return this.f29302d.N(this);
    }
}
