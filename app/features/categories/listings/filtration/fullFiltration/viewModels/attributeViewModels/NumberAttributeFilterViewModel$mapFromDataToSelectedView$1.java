package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NumberAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.NumberAttributeFilterViewModel", f = "NumberAttributeFilterViewModel.kt", l = {78}, m = "mapFromDataToSelectedView")
/* loaded from: classes2.dex */
public final class NumberAttributeFilterViewModel$mapFromDataToSelectedView$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29335a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29336b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NumberAttributeFilterViewModel f29337c;

    /* renamed from: d  reason: collision with root package name */
    int f29338d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberAttributeFilterViewModel$mapFromDataToSelectedView$1(NumberAttributeFilterViewModel numberAttributeFilterViewModel, a<? super NumberAttributeFilterViewModel$mapFromDataToSelectedView$1> aVar) {
        super(aVar);
        this.f29337c = numberAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29336b = obj;
        this.f29338d |= Integer.MIN_VALUE;
        return this.f29337c.H(null, this);
    }
}
