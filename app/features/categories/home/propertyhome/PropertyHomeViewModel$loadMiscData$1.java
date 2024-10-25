package com.forsale.app.features.categories.home.propertyhome;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PropertyHomeViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel", f = "PropertyHomeViewModel.kt", l = {425, 425}, m = "loadMiscData")
/* loaded from: classes2.dex */
public final class PropertyHomeViewModel$loadMiscData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f24818a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f24819b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PropertyHomeViewModel f24820c;

    /* renamed from: d  reason: collision with root package name */
    int f24821d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyHomeViewModel$loadMiscData$1(PropertyHomeViewModel propertyHomeViewModel, zz.a<? super PropertyHomeViewModel$loadMiscData$1> aVar) {
        super(aVar);
        this.f24820c = propertyHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object J;
        this.f24819b = obj;
        this.f24821d |= Integer.MIN_VALUE;
        J = this.f24820c.J(this);
        return J;
    }
}
