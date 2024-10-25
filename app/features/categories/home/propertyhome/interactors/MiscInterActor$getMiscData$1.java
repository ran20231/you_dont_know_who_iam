package com.forsale.app.features.categories.home.propertyhome.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MiscInterActor.kt */
@d(c = "com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor", f = "MiscInterActor.kt", l = {19, 20}, m = "getMiscData")
/* loaded from: classes2.dex */
public final class MiscInterActor$getMiscData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25023a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f25024b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MiscInterActor f25025c;

    /* renamed from: d  reason: collision with root package name */
    int f25026d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiscInterActor$getMiscData$1(MiscInterActor miscInterActor, a<? super MiscInterActor$getMiscData$1> aVar) {
        super(aVar);
        this.f25025c = miscInterActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25024b = obj;
        this.f25026d |= Integer.MIN_VALUE;
        return this.f25025c.d(this);
    }
}
