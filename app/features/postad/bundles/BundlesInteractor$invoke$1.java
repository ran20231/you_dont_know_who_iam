package com.forsale.app.features.postad.bundles;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BundlesInteractor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.BundlesInteractor", f = "BundlesInteractor.kt", l = {15}, m = "invoke")
/* loaded from: classes2.dex */
public final class BundlesInteractor$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f34811a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BundlesInteractor f34812b;

    /* renamed from: c  reason: collision with root package name */
    int f34813c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlesInteractor$invoke$1(BundlesInteractor bundlesInteractor, zz.a<? super BundlesInteractor$invoke$1> aVar) {
        super(aVar);
        this.f34812b = bundlesInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f34811a = obj;
        this.f34813c |= Integer.MIN_VALUE;
        return this.f34812b.a(0, null, this);
    }
}
