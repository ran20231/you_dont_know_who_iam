package com.forsale.app.features.categories.home.propertyhome.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HotZoneInterActor.kt */
@d(c = "com.forsale.app.features.categories.home.propertyhome.interactors.HotZoneInterActor", f = "HotZoneInterActor.kt", l = {28}, m = "getCategoryShufflingFactor")
/* loaded from: classes2.dex */
public final class HotZoneInterActor$getCategoryShufflingFactor$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f25016a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HotZoneInterActor f25017b;

    /* renamed from: c  reason: collision with root package name */
    int f25018c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotZoneInterActor$getCategoryShufflingFactor$1(HotZoneInterActor hotZoneInterActor, a<? super HotZoneInterActor$getCategoryShufflingFactor$1> aVar) {
        super(aVar);
        this.f25017b = hotZoneInterActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25016a = obj;
        this.f25018c |= Integer.MIN_VALUE;
        return this.f25017b.a(0, this);
    }
}
