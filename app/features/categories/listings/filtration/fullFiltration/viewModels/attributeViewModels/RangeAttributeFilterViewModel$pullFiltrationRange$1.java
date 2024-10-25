package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RangeAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel", f = "RangeAttributeFilterViewModel.kt", l = {73}, m = "pullFiltrationRange")
/* loaded from: classes2.dex */
public final class RangeAttributeFilterViewModel$pullFiltrationRange$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29380a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29381b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ RangeAttributeFilterViewModel f29382c;

    /* renamed from: d  reason: collision with root package name */
    int f29383d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeAttributeFilterViewModel$pullFiltrationRange$1(RangeAttributeFilterViewModel rangeAttributeFilterViewModel, a<? super RangeAttributeFilterViewModel$pullFiltrationRange$1> aVar) {
        super(aVar);
        this.f29382c = rangeAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29381b = obj;
        this.f29383d |= Integer.MIN_VALUE;
        return this.f29382c.S(this);
    }
}
