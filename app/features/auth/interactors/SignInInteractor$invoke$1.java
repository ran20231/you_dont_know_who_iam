package com.forsale.app.features.auth.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SignInInteractor.kt */
@d(c = "com.forsale.app.features.auth.interactors.SignInInteractor", f = "SignInInteractor.kt", l = {19, 20, 22}, m = "invoke")
/* loaded from: classes2.dex */
public final class SignInInteractor$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f22733a;

    /* renamed from: b  reason: collision with root package name */
    Object f22734b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f22735c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SignInInteractor f22736d;

    /* renamed from: e  reason: collision with root package name */
    int f22737e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInInteractor$invoke$1(SignInInteractor signInInteractor, a<? super SignInInteractor$invoke$1> aVar) {
        super(aVar);
        this.f22736d = signInInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22735c = obj;
        this.f22737e |= Integer.MIN_VALUE;
        return this.f22736d.a(null, this);
    }
}
