package com.forsale.app.features.categories.home.propertyhome.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PropertyServicesInterActor.kt */
@d(c = "com.forsale.app.features.categories.home.propertyhome.interactors.PropertyServicesInterActor", f = "PropertyServicesInterActor.kt", l = {15}, m = "getCategories")
/* loaded from: classes2.dex */
public final class PropertyServicesInterActor$getCategories$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25030a;

    /* renamed from: b  reason: collision with root package name */
    Object f25031b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f25032c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PropertyServicesInterActor f25033d;

    /* renamed from: e  reason: collision with root package name */
    int f25034e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyServicesInterActor$getCategories$1(PropertyServicesInterActor propertyServicesInterActor, a<? super PropertyServicesInterActor$getCategories$1> aVar) {
        super(aVar);
        this.f25033d = propertyServicesInterActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25032c = obj;
        this.f25034e |= Integer.MIN_VALUE;
        return this.f25033d.a(null, this);
    }
}
