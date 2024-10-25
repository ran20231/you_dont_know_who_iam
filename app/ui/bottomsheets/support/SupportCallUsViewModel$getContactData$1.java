package com.forsale.app.ui.bottomsheets.support;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SupportCallUsViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.support.SupportCallUsViewModel", f = "SupportCallUsViewModel.kt", l = {38}, m = "getContactData")
/* loaded from: classes3.dex */
public final class SupportCallUsViewModel$getContactData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f39128a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SupportCallUsViewModel f39129b;

    /* renamed from: c  reason: collision with root package name */
    int f39130c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportCallUsViewModel$getContactData$1(SupportCallUsViewModel supportCallUsViewModel, zz.a<? super SupportCallUsViewModel$getContactData$1> aVar) {
        super(aVar);
        this.f39129b = supportCallUsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39128a = obj;
        this.f39130c |= Integer.MIN_VALUE;
        return this.f39129b.w0(this);
    }
}
