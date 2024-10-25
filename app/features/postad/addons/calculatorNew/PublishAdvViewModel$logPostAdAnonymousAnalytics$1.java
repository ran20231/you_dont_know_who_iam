package com.forsale.app.features.postad.addons.calculatorNew;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PublishAdvViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel", f = "PublishAdvViewModel.kt", l = {278, 280}, m = "logPostAdAnonymousAnalytics")
/* loaded from: classes2.dex */
public final class PublishAdvViewModel$logPostAdAnonymousAnalytics$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f34655a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f34656b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PublishAdvViewModel f34657c;

    /* renamed from: d  reason: collision with root package name */
    int f34658d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishAdvViewModel$logPostAdAnonymousAnalytics$1(PublishAdvViewModel publishAdvViewModel, zz.a<? super PublishAdvViewModel$logPostAdAnonymousAnalytics$1> aVar) {
        super(aVar);
        this.f34657c = publishAdvViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b02;
        this.f34656b = obj;
        this.f34658d |= Integer.MIN_VALUE;
        b02 = this.f34657c.b0(this);
        return b02;
    }
}
