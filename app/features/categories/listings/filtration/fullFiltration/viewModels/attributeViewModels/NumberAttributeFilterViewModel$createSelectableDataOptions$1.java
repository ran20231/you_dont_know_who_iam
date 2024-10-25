package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NumberAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.NumberAttributeFilterViewModel", f = "NumberAttributeFilterViewModel.kt", l = {130, 131}, m = "createSelectableDataOptions")
/* loaded from: classes2.dex */
public final class NumberAttributeFilterViewModel$createSelectableDataOptions$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29321a;

    /* renamed from: b  reason: collision with root package name */
    Object f29322b;

    /* renamed from: c  reason: collision with root package name */
    boolean f29323c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f29324d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ NumberAttributeFilterViewModel f29325e;

    /* renamed from: f  reason: collision with root package name */
    int f29326f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberAttributeFilterViewModel$createSelectableDataOptions$1(NumberAttributeFilterViewModel numberAttributeFilterViewModel, a<? super NumberAttributeFilterViewModel$createSelectableDataOptions$1> aVar) {
        super(aVar);
        this.f29325e = numberAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c02;
        this.f29324d = obj;
        this.f29326f |= Integer.MIN_VALUE;
        c02 = this.f29325e.c0(null, false, this);
        return c02;
    }
}
