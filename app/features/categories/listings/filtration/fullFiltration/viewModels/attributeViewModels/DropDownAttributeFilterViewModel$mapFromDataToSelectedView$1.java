package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropDownAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel", f = "DropDownAttributeFilterViewModel.kt", l = {74}, m = "mapFromDataToSelectedView")
/* loaded from: classes2.dex */
public final class DropDownAttributeFilterViewModel$mapFromDataToSelectedView$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29295a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29296b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DropDownAttributeFilterViewModel f29297c;

    /* renamed from: d  reason: collision with root package name */
    int f29298d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownAttributeFilterViewModel$mapFromDataToSelectedView$1(DropDownAttributeFilterViewModel dropDownAttributeFilterViewModel, a<? super DropDownAttributeFilterViewModel$mapFromDataToSelectedView$1> aVar) {
        super(aVar);
        this.f29297c = dropDownAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29296b = obj;
        this.f29298d |= Integer.MIN_VALUE;
        return this.f29297c.H(null, this);
    }
}
