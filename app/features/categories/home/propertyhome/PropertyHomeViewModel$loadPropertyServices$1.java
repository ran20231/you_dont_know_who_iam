package com.forsale.app.features.categories.home.propertyhome;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PropertyHomeViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel", f = "PropertyHomeViewModel.kt", l = {315, 317, 319, 322, 326, 330}, m = "loadPropertyServices")
/* loaded from: classes2.dex */
public final class PropertyHomeViewModel$loadPropertyServices$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f24822a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f24823b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PropertyHomeViewModel f24824c;

    /* renamed from: d  reason: collision with root package name */
    int f24825d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyHomeViewModel$loadPropertyServices$1(PropertyHomeViewModel propertyHomeViewModel, zz.a<? super PropertyHomeViewModel$loadPropertyServices$1> aVar) {
        super(aVar);
        this.f24824c = propertyHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object K;
        this.f24823b = obj;
        this.f24825d |= Integer.MIN_VALUE;
        K = this.f24824c.K(this);
        return K;
    }
}
