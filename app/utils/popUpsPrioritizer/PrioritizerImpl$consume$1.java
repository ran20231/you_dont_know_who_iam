package com.forsale.app.utils.popUpsPrioritizer;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Prioritizer.kt */
@d(c = "com.forsale.app.utils.popUpsPrioritizer.PrioritizerImpl", f = "Prioritizer.kt", l = {55, 56}, m = "consume")
/* loaded from: classes3.dex */
public final class PrioritizerImpl$consume$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f40393a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PrioritizerImpl f40394b;

    /* renamed from: c  reason: collision with root package name */
    int f40395c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrioritizerImpl$consume$1(PrioritizerImpl prioritizerImpl, zz.a<? super PrioritizerImpl$consume$1> aVar) {
        super(aVar);
        this.f40394b = prioritizerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h11;
        this.f40393a = obj;
        this.f40395c |= Integer.MIN_VALUE;
        h11 = this.f40394b.h(this);
        return h11;
    }
}
