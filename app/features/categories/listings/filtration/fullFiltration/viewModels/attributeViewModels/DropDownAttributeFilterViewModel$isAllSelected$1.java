package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropDownAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel", f = "DropDownAttributeFilterViewModel.kt", l = {90}, m = "isAllSelected")
/* loaded from: classes2.dex */
public final class DropDownAttributeFilterViewModel$isAllSelected$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29291a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29292b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DropDownAttributeFilterViewModel f29293c;

    /* renamed from: d  reason: collision with root package name */
    int f29294d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownAttributeFilterViewModel$isAllSelected$1(DropDownAttributeFilterViewModel dropDownAttributeFilterViewModel, a<? super DropDownAttributeFilterViewModel$isAllSelected$1> aVar) {
        super(aVar);
        this.f29293c = dropDownAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29292b = obj;
        this.f29294d |= Integer.MIN_VALUE;
        return this.f29293c.A(null, this);
    }
}
