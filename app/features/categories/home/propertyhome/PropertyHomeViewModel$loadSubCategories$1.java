package com.forsale.app.features.categories.home.propertyhome;

import com.google.logging.type.LogSeverity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PropertyHomeViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel", f = "PropertyHomeViewModel.kt", l = {194, 196, 198, LogSeverity.INFO_VALUE, 210}, m = "loadSubCategories")
/* loaded from: classes2.dex */
public final class PropertyHomeViewModel$loadSubCategories$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f24835a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f24836b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PropertyHomeViewModel f24837c;

    /* renamed from: d  reason: collision with root package name */
    int f24838d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyHomeViewModel$loadSubCategories$1(PropertyHomeViewModel propertyHomeViewModel, zz.a<? super PropertyHomeViewModel$loadSubCategories$1> aVar) {
        super(aVar);
        this.f24837c = propertyHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object M;
        this.f24836b = obj;
        this.f24838d |= Integer.MIN_VALUE;
        M = this.f24837c.M(this);
        return M;
    }
}
