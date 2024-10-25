package com.forsale.app.features.categories.home.propertyhome;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PropertyHomeViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel", f = "PropertyHomeViewModel.kt", l = {217, 219, 221, 234, 237}, m = "loadForSaleRealty")
/* loaded from: classes2.dex */
public final class PropertyHomeViewModel$loadForSaleRealty$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f24809a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f24810b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PropertyHomeViewModel f24811c;

    /* renamed from: d  reason: collision with root package name */
    int f24812d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyHomeViewModel$loadForSaleRealty$1(PropertyHomeViewModel propertyHomeViewModel, zz.a<? super PropertyHomeViewModel$loadForSaleRealty$1> aVar) {
        super(aVar);
        this.f24811c = propertyHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object H;
        this.f24810b = obj;
        this.f24812d |= Integer.MIN_VALUE;
        H = this.f24811c.H(this);
        return H;
    }
}
