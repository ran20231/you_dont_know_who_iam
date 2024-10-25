package com.forsale.app.ui.bottomsheets.logout.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LogoutInteractor.kt */
@d(c = "com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor", f = "LogoutInteractor.kt", l = {28, 29, 30}, m = "logoutFromAllDevices")
/* loaded from: classes3.dex */
public final class LogoutInteractor$logoutFromAllDevices$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f38933a;

    /* renamed from: b  reason: collision with root package name */
    Object f38934b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f38935c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LogoutInteractor f38936d;

    /* renamed from: e  reason: collision with root package name */
    int f38937e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutInteractor$logoutFromAllDevices$1(LogoutInteractor logoutInteractor, a<? super LogoutInteractor$logoutFromAllDevices$1> aVar) {
        super(aVar);
        this.f38936d = logoutInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e11;
        this.f38935c = obj;
        this.f38937e |= Integer.MIN_VALUE;
        e11 = this.f38936d.e(this);
        return e11;
    }
}
