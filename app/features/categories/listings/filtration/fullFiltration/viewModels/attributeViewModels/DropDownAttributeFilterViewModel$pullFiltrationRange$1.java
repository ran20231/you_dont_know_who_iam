package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import l8.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropDownAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel", f = "DropDownAttributeFilterViewModel.kt", l = {53, a.f62266c}, m = "pullFiltrationRange")
/* loaded from: classes2.dex */
public final class DropDownAttributeFilterViewModel$pullFiltrationRange$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29304a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29305b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DropDownAttributeFilterViewModel f29306c;

    /* renamed from: d  reason: collision with root package name */
    int f29307d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownAttributeFilterViewModel$pullFiltrationRange$1(DropDownAttributeFilterViewModel dropDownAttributeFilterViewModel, zz.a<? super DropDownAttributeFilterViewModel$pullFiltrationRange$1> aVar) {
        super(aVar);
        this.f29306c = dropDownAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29305b = obj;
        this.f29307d |= Integer.MIN_VALUE;
        return this.f29306c.S(this);
    }
}
