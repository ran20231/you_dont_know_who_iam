package com.forsale.app.features.categories.home;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContinueBrowsingRepository.kt */
@d(c = "com.forsale.app.features.categories.home.ContinueBrowsingRepository", f = "ContinueBrowsingRepository.kt", l = {22}, m = "getContinueBrowsingIfCategoryActive")
/* loaded from: classes2.dex */
public final class ContinueBrowsingRepository$getContinueBrowsingIfCategoryActive$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f23320a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f23321b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ContinueBrowsingRepository f23322c;

    /* renamed from: d  reason: collision with root package name */
    int f23323d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinueBrowsingRepository$getContinueBrowsingIfCategoryActive$1(ContinueBrowsingRepository continueBrowsingRepository, a<? super ContinueBrowsingRepository$getContinueBrowsingIfCategoryActive$1> aVar) {
        super(aVar);
        this.f23322c = continueBrowsingRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c11;
        this.f23321b = obj;
        this.f23323d |= Integer.MIN_VALUE;
        c11 = this.f23322c.c(null, this);
        return c11;
    }
}
