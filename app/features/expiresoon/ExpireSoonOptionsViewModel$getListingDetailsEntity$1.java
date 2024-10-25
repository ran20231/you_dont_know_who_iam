package com.forsale.app.features.expiresoon;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonOptionsViewModel.kt */
@d(c = "com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel", f = "ExpireSoonOptionsViewModel.kt", l = {78}, m = "getListingDetailsEntity")
/* loaded from: classes2.dex */
public final class ExpireSoonOptionsViewModel$getListingDetailsEntity$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f31278a;

    /* renamed from: b  reason: collision with root package name */
    Object f31279b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f31280c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ExpireSoonOptionsViewModel f31281d;

    /* renamed from: e  reason: collision with root package name */
    int f31282e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonOptionsViewModel$getListingDetailsEntity$1(ExpireSoonOptionsViewModel expireSoonOptionsViewModel, zz.a<? super ExpireSoonOptionsViewModel$getListingDetailsEntity$1> aVar) {
        super(aVar);
        this.f31281d = expireSoonOptionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object K0;
        this.f31280c = obj;
        this.f31282e |= Integer.MIN_VALUE;
        K0 = this.f31281d.K0(this);
        return K0;
    }
}
