package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NumberAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.NumberAttributeFilterViewModel", f = "NumberAttributeFilterViewModel.kt", l = {86}, m = "generateFilterCapsule")
/* loaded from: classes2.dex */
public final class NumberAttributeFilterViewModel$generateFilterCapsule$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29327a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29328b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NumberAttributeFilterViewModel f29329c;

    /* renamed from: d  reason: collision with root package name */
    int f29330d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberAttributeFilterViewModel$generateFilterCapsule$1(NumberAttributeFilterViewModel numberAttributeFilterViewModel, a<? super NumberAttributeFilterViewModel$generateFilterCapsule$1> aVar) {
        super(aVar);
        this.f29329c = numberAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29328b = obj;
        this.f29330d |= Integer.MIN_VALUE;
        return this.f29329c.j(this);
    }
}
