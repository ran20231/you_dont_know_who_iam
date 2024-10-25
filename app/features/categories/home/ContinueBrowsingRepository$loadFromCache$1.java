package com.forsale.app.features.categories.home;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContinueBrowsingRepository.kt */
@d(c = "com.forsale.app.features.categories.home.ContinueBrowsingRepository", f = "ContinueBrowsingRepository.kt", l = {16, 17}, m = "loadFromCache")
/* loaded from: classes2.dex */
public final class ContinueBrowsingRepository$loadFromCache$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f23324a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f23325b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ContinueBrowsingRepository f23326c;

    /* renamed from: d  reason: collision with root package name */
    int f23327d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinueBrowsingRepository$loadFromCache$1(ContinueBrowsingRepository continueBrowsingRepository, a<? super ContinueBrowsingRepository$loadFromCache$1> aVar) {
        super(aVar);
        this.f23326c = continueBrowsingRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23325b = obj;
        this.f23327d |= Integer.MIN_VALUE;
        return this.f23326c.d(this);
    }
}
