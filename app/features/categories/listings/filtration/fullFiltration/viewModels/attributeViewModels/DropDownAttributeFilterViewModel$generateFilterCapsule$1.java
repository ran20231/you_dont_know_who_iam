package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropDownAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel", f = "DropDownAttributeFilterViewModel.kt", l = {82}, m = "generateFilterCapsule")
/* loaded from: classes2.dex */
public final class DropDownAttributeFilterViewModel$generateFilterCapsule$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29287a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29288b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DropDownAttributeFilterViewModel f29289c;

    /* renamed from: d  reason: collision with root package name */
    int f29290d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownAttributeFilterViewModel$generateFilterCapsule$1(DropDownAttributeFilterViewModel dropDownAttributeFilterViewModel, a<? super DropDownAttributeFilterViewModel$generateFilterCapsule$1> aVar) {
        super(aVar);
        this.f29289c = dropDownAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29288b = obj;
        this.f29290d |= Integer.MIN_VALUE;
        return this.f29289c.j(this);
    }
}
