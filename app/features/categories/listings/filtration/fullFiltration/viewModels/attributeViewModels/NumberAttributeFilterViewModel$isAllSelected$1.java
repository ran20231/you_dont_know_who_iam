package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NumberAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.NumberAttributeFilterViewModel", f = "NumberAttributeFilterViewModel.kt", l = {138}, m = "isAllSelected")
/* loaded from: classes2.dex */
public final class NumberAttributeFilterViewModel$isAllSelected$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29331a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29332b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NumberAttributeFilterViewModel f29333c;

    /* renamed from: d  reason: collision with root package name */
    int f29334d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberAttributeFilterViewModel$isAllSelected$1(NumberAttributeFilterViewModel numberAttributeFilterViewModel, a<? super NumberAttributeFilterViewModel$isAllSelected$1> aVar) {
        super(aVar);
        this.f29333c = numberAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29332b = obj;
        this.f29334d |= Integer.MIN_VALUE;
        return this.f29333c.A(null, this);
    }
}
