package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BooleanAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel", f = "BooleanAttributeFilterViewModel.kt", l = {68}, m = "pullFiltrationRange")
/* loaded from: classes2.dex */
public final class BooleanAttributeFilterViewModel$pullFiltrationRange$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29270a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29271b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BooleanAttributeFilterViewModel f29272c;

    /* renamed from: d  reason: collision with root package name */
    int f29273d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BooleanAttributeFilterViewModel$pullFiltrationRange$1(BooleanAttributeFilterViewModel booleanAttributeFilterViewModel, a<? super BooleanAttributeFilterViewModel$pullFiltrationRange$1> aVar) {
        super(aVar);
        this.f29272c = booleanAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29271b = obj;
        this.f29273d |= Integer.MIN_VALUE;
        return this.f29272c.S(this);
    }
}
