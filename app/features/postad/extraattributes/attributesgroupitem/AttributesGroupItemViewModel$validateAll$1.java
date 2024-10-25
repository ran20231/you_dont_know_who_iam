package com.forsale.app.features.postad.extraattributes.attributesgroupitem;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributesGroupItemViewModel.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItemViewModel", f = "AttributesGroupItemViewModel.kt", l = {39, 61, 82, 86, 95}, m = "validateAll")
/* loaded from: classes2.dex */
public final class AttributesGroupItemViewModel$validateAll$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f35203a;

    /* renamed from: b  reason: collision with root package name */
    Object f35204b;

    /* renamed from: c  reason: collision with root package name */
    Object f35205c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f35206d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AttributesGroupItemViewModel f35207e;

    /* renamed from: f  reason: collision with root package name */
    int f35208f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributesGroupItemViewModel$validateAll$1(AttributesGroupItemViewModel attributesGroupItemViewModel, a<? super AttributesGroupItemViewModel$validateAll$1> aVar) {
        super(aVar);
        this.f35207e = attributesGroupItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f35206d = obj;
        this.f35208f |= Integer.MIN_VALUE;
        return this.f35207e.m(this);
    }
}
