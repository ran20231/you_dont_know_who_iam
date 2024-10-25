package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import l8.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NumberAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.NumberAttributeFilterViewModel", f = "NumberAttributeFilterViewModel.kt", l = {a.f62266c}, m = "pullFiltrationRange")
/* loaded from: classes2.dex */
public final class NumberAttributeFilterViewModel$pullFiltrationRange$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f29344a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NumberAttributeFilterViewModel f29345b;

    /* renamed from: c  reason: collision with root package name */
    int f29346c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberAttributeFilterViewModel$pullFiltrationRange$1(NumberAttributeFilterViewModel numberAttributeFilterViewModel, zz.a<? super NumberAttributeFilterViewModel$pullFiltrationRange$1> aVar) {
        super(aVar);
        this.f29345b = numberAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29344a = obj;
        this.f29346c |= Integer.MIN_VALUE;
        return this.f29345b.S(this);
    }
}
